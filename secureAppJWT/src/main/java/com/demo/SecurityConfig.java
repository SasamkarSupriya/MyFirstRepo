package com.demo;

import java.security.interfaces.RSAKey;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.oauth2.server.resource.OAuth2ResourceServerConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.oauth2.jwt.JwtDecoder;
import org.springframework.security.oauth2.jwt.JwtEncoder;
import org.springframework.security.oauth2.jwt.NimbusJwtDecoder;
import org.springframework.security.oauth2.jwt.NimbusJwtEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import com.nimbusds.jose.jwk.JWK;
import com.nimbusds.jose.jwk.JWKSet;
import com.nimbusds.jose.jwk.source.ImmutableJWKSet;
import com.nimbusds.jose.jwk.source.JWKSource;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

	 private final RsaKeyProperties rsaKeys;

	    public SecurityConfig(RsaKeyProperties rsaKeys) {
	        this.rsaKeys = rsaKeys;
	    }
	
	 @Bean
	    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		 return http
		            .csrf(csrf -> csrf.disable())
		            .authorizeRequests( auth -> auth
		                    .anyRequest().authenticated()
		            )
		            .oauth2ResourceServer(OAuth2ResourceServerConfigurer::jwt)
		            .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
		            .httpBasic(Customizer.withDefaults())
		            .build();
	    }
	 
	 @Bean
	 public InMemoryUserDetailsManager users() {
	     return new InMemoryUserDetailsManager(
	             User.withUsername("dvega")
	                     .password("{noop}password")
	                     .authorities("read")
	                     .build()
	     );
	 }
	 
	 @Bean
	 JwtDecoder jwtDecoder() {
	     return NimbusJwtDecoder.withPublicKey(rsaKeys.publicKey()).build();
	 }
	 
	 @Bean
	 JwtEncoder jwtEncoder() {
	     JWK jwk = new RSAKey.Builder(rsaKeys.publicKey()).privateKey(rsaKeys.privateKey()).build();
	     JWKSource<SecurityContext> jwks = new ImmutableJWKSet<>(new JWKSet(jwk));
	     return new NimbusJwtEncoder(jwks);
	 }

}
