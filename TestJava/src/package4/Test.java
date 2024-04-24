package package4;

import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {
	
		
    String s1 = new String("str");
    String s2 = new String("str");
    
    if(s1==s2) {
    System.out.println("yes");
    
	}
	else {
		System.out.println("no");
	}
    
    Stream<String> st = Stream.iterate("", (str) -> str + "x"); 

    System.out.println(st.limit(3).map(str -> str + "y"));

    
    
    
	}
}
