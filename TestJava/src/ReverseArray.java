
public class ReverseArray {

	public static void main(String[] args) {
		
		int[] a = {1,2,3,4,5};
		
		int i = 0;
		int j= a.length-1;
		
		while(i<j) {
			
			int tmp = a[i];
			a[i] = a[j];
			a[j] = tmp;
			
			i++;
			j--;
		}
		for(int z=0;z<a.length;z++) {
			System.out.println(a[z]);
		}
	}
}
