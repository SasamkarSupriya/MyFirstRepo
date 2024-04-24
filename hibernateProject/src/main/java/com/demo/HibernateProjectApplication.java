package com.demo;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;





@SpringBootApplication
public class HibernateProjectApplication {
	

	@SuppressWarnings("deprecation")
	public static void main(String[] args){
		SpringApplication.run(HibernateProjectApplication.class, args);
		
		User user = new User();	
		user.setPassword("pass");
		user.setUid(101);
		user.setUsername("sms");
	
		
		

	Configuration	con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(User.class);
	
    SessionFactory sf = con.buildSessionFactory();
    
    Session session = sf.openSession();
   
    Transaction tx = session.beginTransaction();
    
    session.save(user);
    
    tx.commit();
				
	}

}
