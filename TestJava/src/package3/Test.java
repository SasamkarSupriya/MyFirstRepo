package package3;

import java.util.Arrays;
import java.util.Optional;

public class Test {

	public static void main(String[] args) {
		
//		[2:23 PM] N, Krishnan
//		Stream API Practical Question:
//
//		------------------------------
//
//		Question: Implement the requirement using Java 8 code for the below integer array using single Stream API statement:
//		 
//		Integer[] nums = {-6,2,-4,3,-5,1,-6,2,-4,3,-5,1}; // Source for Stream
//		 
//		Requirements:
//
//		1. remove duplicates
//
//		2. Square all the numbers
//
//		3. Sort it in ascending order
//
//		4. find greater than 20
//
//		5. find how many greater than 20 is there
//
//		6. Print the count of how many greater than 20 is there
//		 
//		Conditions:
//
//		7. condition is you have to implement requirements 1 to 5 altogether(in the same order of requirements) using only one stream() method in the first statement.
//
//		8. second statement is for Print
//
//		9. totally 2 statements are allowed
//
//		10. only 2 minutes allowed totally for solving this
//
//		11. you can use IDE/Notepad/Notepad++
		
		Integer[] nums = {-6,2,-4,3,-5,1,-6,2,-4,3,-5,1};
		
		Long i = Arrays.stream(nums).distinct().map(s->s*s).sorted().filter(a->a>20).count();
		System.out.println(i);
		
		//Optional class example
		 
		String[] str = new String[10]; // only 2 minutes time
		
		Optional<String> s = Optional.ofNullable(str[5]);
		
		if(s.isPresent()) {
		   String a =  s.toString();
		   a = a.toLowerCase();
		   System.out.println(a);
		    
		}
		else {
			System.out.println("message!!!");
		}
		
	}

}
