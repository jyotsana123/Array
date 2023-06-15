import java.util.Arrays;
import java.util.Collections;

public class SecondLargestValue2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer a[] = {4,5,6,7,8,2,1,0,5,6,9};
		Arrays.sort(a, Collections.reverseOrder());
//		for(int s :a)
//		{
//			System.out.println(s);
//		}
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=a[i+1])
			{
				System.out.println(a[i+1]);
				break;
			}
		}

	}

}
