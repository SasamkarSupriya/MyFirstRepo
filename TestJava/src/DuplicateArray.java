import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DuplicateArray {

	//remove duplicate array
	public static int findduplicate(int[] a) {
		
         int rd = 0;
	     
	     for(int i=1;i<a.length;i++) {
	    	 
	    	 if(a[rd]!=a[i]) {
	    		 rd++;
	    		 a[rd]=a[i];
	    	 }
	     }
		return rd;
		
	}
	
	
	public static void main(String[] args) {
		
		int[] a = {1,1,2,3,4,5,5};
		
		//Arrays.sort(a);
		
		
		int r = findduplicate(a);
	     
		for(int i=0;i<=r;i++) {
			System.out.print(a[i]+ " ");
		}
		
		List list = Arrays.stream(a).distinct().boxed().collect(Collectors.toList());
		
		System.out.println(list);

	}

}
