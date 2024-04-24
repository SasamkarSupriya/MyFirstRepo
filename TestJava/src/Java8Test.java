import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Random;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8Test {

	public static void main(String[] args) {

		

		
		
	String str = "Supriya, Rahul, Ashwini, Supriya ";
		
	
	//Map<String, Long> map = Arrays.stream(str.split(", ")).collect((Collectors.groupingBy(s->s,Collectors.counting())));
	 
	Arrays.stream(str.split(", ")).filter(s->s.contains("S")).forEach(System.out::println);
	//System.out.println(list);
	
	List<Integer> list = new ArrayList<Integer>();
	list.add(5);
	list.add(6);
	list.add(3);
	list.add(3);
	list.add(9);
	list.add(10);
	list.add(9);
	list.add(5);
	
	//list.sort(null);
	System.out.println("lst : "+list);
	int count=0;
	
//	for(int i=0;i<=list.size();i++) {
//		count = 1;
//		for(int j=i+1;j<list.size();j++) {
//			if(list.get(i)==list.get(j)){
//				count++;
//			}else {
//				System.out.println(list.get(i)+" : "+count);
//				break;
//			}
//		}
////		System.out.println(list.get(i)+" :: "+ count);
//		
//	}
	
	String input = "egdelwonkavajniag";
	String dummy = "";	
	for(int i=0;i<input.length();i++) {		
		char c = input.charAt(i);		
		dummy = c + dummy;		
	}
	System.out.println(dummy);
	
	
	
	
	String a = "Make it reverse";

	Map<String, Long> ou = Stream.of(a.split("")).collect(Collectors.groupingBy(s->s, Collectors.counting()));
	
    System.out.println(ou);
    
    int[] arr = {1,2,2,4,5,8,2,3,4,7};
    
    
   int i =   Arrays.stream(arr).distinct().boxed().sorted(Collections.reverseOrder()).skip(1).findFirst().get();
    System.out.println(i);
	}

}
