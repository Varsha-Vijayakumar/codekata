import java.util.Scanner;
public class nine
{
	public static void main(String []args)
	{
		int n,k,i,sum=0;
		int[] a=new int[50];
		Scanner s=new Scanner(System.in);
		n=s.nextInt();	
		k=s.nextInt();
		for(i=1;i<=n;i++)
		{
			a[i]=i;
			System.out.println(a[i]);
		}
		for(i=1;i<=k;i++)
		{
			sum=sum+a[i];
			
		}
		System.out.println(sum);
	}
}