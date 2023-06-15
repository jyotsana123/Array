import java.util.Arrays;
import java.util.Collections;

public class hi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Integer a[] = {3,4,5};
//		Arrays.sort(a, Collections.reverseOrder());
//		for(int i :a)
//		{
//			System.out.print(i);
//		}
		
		int a[]= {3,4,5};
		int start =0,end=a.length-1;
		while(start<end)
		{
			int temp=a[start];
			a[start]=a[end];
			a[end]=temp;
			
			start++;
			end--;
		}
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]);
		}
		
	}

}
