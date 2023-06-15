
public class MinimumValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {3,7,9,1,0,4,6,2};
		int min = a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min = a[i];
			}
		}
		
		System.out.println(min);
	}

}
