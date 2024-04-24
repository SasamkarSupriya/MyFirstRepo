
public class MovesZeros {

	public static void main(String... args) {

		int nz = 0;
		int z = 0;

		int[] a = { 2, 5, 0, 3, 0, 6, 0, 6 };

		while (nz < a.length) {

			if (a[nz] != 0) {

				int temp = a[nz];
				a[nz] = a[z];
				a[z] = temp;

				nz++;
				z++;

			}

			else {
				nz++;
			}

		}

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}

	}

}
