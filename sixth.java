import java.util.Scanner;
public class sixth
{
	public static void main(String []args)
	{
		int n;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		if(n%4==0)
		{
			if(n%400==0)
			{
				if(n%100==0)
				{
					System.out.println("Yes");
				}
				else
				{
					System.out.println("No");
				}
			}
			else
			{
				System.out.println("Yes");
			}
		}
		else
		{
			System.out.println("No");
		}
	}
}