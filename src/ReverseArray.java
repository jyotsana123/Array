
import java.util.Arrays;
import java.util.Collections;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {2,57,6,45,9,12,45,3};
		int start = 0;
		int end = a.length-1;
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
			System.out.print(a[i]+",");
		}
	}

}
