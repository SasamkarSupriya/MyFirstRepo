import java.util.Arrays;

public class JavaTest {

	public static void main(String[] args) {

		SingletonObject obj = SingletonObject.getInstance();

		SingletonObject obj1 = SingletonObject.getInstance();

		if (obj == obj1) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		obj.msg();
		
System.out.println("-----------------------------------------------------------------------------------------------");
		/**
		 * Array in ascending order
		 */

		int[] arr = {1, 4, 7, 2, 1, 5 };
		int tmp = 0;

		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] > arr[j]) {

					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;

				}

			}
			System.out.println(arr[i]);
		}
		
System.out.println("----------------------------------------------------------------------------------------------");
		Arrays.stream(arr).sorted().forEach(System.out::println);

System.out.println("----------------------------------------------------------------------------------------------");

		/**
		 * Rotate array by n elements
		 */

		int[] a = new int[] { 1, 2, 3, 4, 5 };


		int store = a[0];
		for (int i = 1; i < a.length; i++) {
			a[i - 1] = a[i];
		}

		a[a.length - 1] = store;

		for (int a1 : a) {
			System.out.println(a1);
		}
	}
}
