import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestChildParent {

	public static void main(String[] args) {

		ChildClass c = new ChildClass();

		c.sum(8);
		String a = c.see();
		System.out.println(a);

		String s = "Supriya Sasamkar";

		Map<String, Long> output = Arrays.stream(s.split(""))
				.collect(Collectors.groupingBy(ss -> ss, Collectors.counting()));

		Map<String, Long> output1 = Stream.of(s.split("")).map(ss -> ss.toLowerCase())
				.collect(Collectors.groupingBy(d -> d, Collectors.counting()));

		System.out.println(output1);
		System.out.println(output);
		

	}
	
	
	

}
