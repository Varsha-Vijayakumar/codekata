import java.util.Scanner;
public class second
{
	public static void main(String[] args)
	{
		int n;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		if(n<0)
		{
			System.out.println("Invalid");
		}
		else if((n==0)|| (n%2==0))
		{
			System.out.println("Even");
		}
		else 
		{
			System.out.println("odd");
		}
	}
}