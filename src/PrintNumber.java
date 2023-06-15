
public class PrintNumber {

	//Write a Java Program to print numbers 1 to 100 without using any loop(for/while/do-while).
	
	public static void printNum(int num)
	{
		if(num<=100)
		{
			System.out.println(num);
			printNum(num+1); //Recursion is a process in which a function calls itself directly or indirectly is called recursion and the corresponding function is called a recursive function.
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int num=1;
		printNum(1);
	}

}
