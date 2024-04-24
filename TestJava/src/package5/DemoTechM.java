package package5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class DemoTechM {

	public static void main(String[] args) {
		
		
		String str = "Hello World";
		
     
		
	Map<String , Long> map = Arrays.stream(str.split("")).map(String::toLowerCase).collect(Collectors.groupingBy(s->s, LinkedHashMap::new, Collectors.counting()));
		
		
		System.out.println(map);
		
		
		List<Integer> list = Arrays.asList(45,60,60,80);
		
		//second highest
		//80,60,60,45,30
		
		Optional<Integer> i = list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();
		             
		             //list.stream().collect(Collectors.groupingBy(Collectors.), )
		
		System.out.println(i);
		
		List<Integer> list1 = Arrays.asList(2,6,1,9,5,4);		
		int i1 = list1.stream().reduce(Integer::max).get();
		int i2 = list1.stream().max((a,j)->a.compareTo(j)).get();
		Optional<Integer> i3 = list1.stream().sorted(Comparator.reverseOrder()).findFirst();
		System.out.println(i1+"  "+i2+"  "+i3);
		
		List l4 =list1.stream().sorted((b,c)->(b-c)).collect(Collectors.toList());
		System.out.println(l4);
	}

}
