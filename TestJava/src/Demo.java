
import java.util.StringJoiner;

public class Demo {

	public static void main(String[] args) {


		StringJoiner j = new StringJoiner("");
		
		
		String a = "HelloMyNameIsSupriya";

		String[] aa = a.split("");

		j.add(aa[0]);

		for (int i = 1; i < aa.length; i++) {

			if (aa[i].equals(aa[i].toUpperCase())) {

				j.add(" " + aa[i]);
			}

			else {
				j.add(aa[i]);
			}
		}

		System.out.println(j);
	}
}
