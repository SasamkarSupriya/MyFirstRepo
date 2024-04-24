import java.util.Arrays;
import java.util.Collections;

public class Test {
public static void main(String[] args) 
{
    
	int[] a = new int[5];
	
	a[0]=4;
	a[1]=4;
	a[2]=8;
	a[3]=6;
	a[4]=11;
	
	
	
	//Arrays.sort(a);
	
	int temp =0;
	
	for(int i=0;i<a.length;i++) {
		
		for(int j=i+1;j<a.length;j++) {
			
			
			
			if(a[i] > a[j]) {
			
			temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			
			
		}
      }
	
	}
	
	for(int ar:a) {
		System.out.println(ar);
	}
	
	System.out.println(" second higest:"+a[a.length-2]);
	
	
	int i = Arrays.stream(a).distinct().boxed().sorted(Collections.reverseOrder()).skip(1).findFirst().orElse(0);
	
	System.out.println(i);
  }
}