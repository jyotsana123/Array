
public class MultiDimensionalArrayMinValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[][] = {{2,4,1},{0,6,7},{8,9,3}};
		int min = a[0][0];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(a[i][j]<min)
				{
					min = a[i][j];
					System.out.println(a[i][j]);
				}
			}
		}
		
		System.out.println(min);

	}

}
