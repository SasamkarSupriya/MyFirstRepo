import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalInt;

public class TestArray {
	
	

	public static void main(String[] args) {
		
		int[] a = {2,5,1,8,4,9,0,2,4,4,5};
		
		 int rd =0;;
			
			for(int i=1;i<a.length;i++) {
				
				if(a[rd]!=a[i]) {
					rd++;
					a[rd] = a[i];
		
				}
			}	
		
		for(int i=0;i<rd;i++) {
			System.out.print(a[i]+" ");
		}
		
		//Arrays.sort(a);
	
		
	}

}
