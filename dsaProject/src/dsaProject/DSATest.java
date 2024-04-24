package dsaProject;

import java.util.Arrays;
import java.util.Comparator;

public class DSATest {

	public static void main(String[] args) {
		
		 int a[] = {10,3,5,6,2};
	    
		 int minVal = a[0];
		 
		 for(int a1 : a) {
			 
			 if(a1<minVal) {
				 minVal = a1;
			 }
		 }
		 //////////////////////////////////////////////////////////////////////
		 System.out.println("Lowest value: " + minVal);
		
//		 First, get Stream from Arrays using Arrays.stream() method
//		 Convert primitive integers into Integer objects using Stream.boxed() method
//		 Sort Integer objects in descending-order using Comparator.reverseOrder() inside Stream.sorted() method
//		 As integer Arrays sorted in descending-order, 2nd element in the Arrays will be the second largest number
//		 We will skip first number which is the largest number using Stream.skip() method
//		 Stream.findFirst() method will return 2nd largest number in the Arrays
//		 Finally, we will print 2nd largest number to the console
		 
		 int low = Arrays.stream(a).distinct().sorted().findFirst().orElse(0);
		 System.out.println(low);
		 
		 int secondLargestNumber = Arrays
					.stream(a)
					.boxed()
					.sorted(Comparator.reverseOrder())
					.skip(1)
					.findFirst()
					.get();
		 
		 System.out.println(secondLargestNumber);
//////////////////////////////////////////////////////////////////////
	}

}
