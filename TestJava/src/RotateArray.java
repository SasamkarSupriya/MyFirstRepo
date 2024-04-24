
public class RotateArray {
	
	
	static void rotateONE(int[] a) {
		
		int last = a[0];
		
		for(int i=1;i<a.length;i++) {
			
			a[i-1] = a[i];
		}
		a[a.length-1] = last;
		
	}
	
	static void rotateNtimes(int[] a, int k) {
		
		k = k % a.length;
		
		//if k is negative value
		if(k<0) {
			k = k+a.length;
		}
		for(int i=1;i<=k;i++) {
			rotateONE(a);
		}
			
	}

	public static void main(String[] args) {
		
		int[] a = {1,2,3,4,5};

		//rotateONE(a);
		rotateNtimes(a,3);
		
		for(int a1 : a) {
			System.out.println(a1);
			
		}
	}

}
