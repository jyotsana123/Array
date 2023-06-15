import java.util.Arrays;
import java.util.Collections;

public class SecondLargestValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer a[] = {4,5,6,7,8,2,1,0,5,6,9,9,9,9,9,9,8,8,8,8};
		int temp;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					temp = a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
			if(a[i]!=a[i+1])
			{
				System.out.println("Second largest value is: "+a[i+1]);
				break;
			}
		}
		
		

	}

}
