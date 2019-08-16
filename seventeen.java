import java.util.Scanner;
public class seventeen
{
	public static void main(String[] args)
	{
	int n,rem,sum=0,temp;
	Scanner s=new Scanner(System.in);
	n=s.nextInt();
	temp=n;
	while(n>0)
	{
		rem=n%10;
		n=n/10;
		sum=sum+(rem*rem*rem);
	}
	if(temp==sum)
	System.out.println("Yes");
	else
	System.out.println("No");
	}
}