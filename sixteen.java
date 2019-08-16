import java.util.Scanner;
public class sixteen
{
	public static void main(String[] args)
	{
		int n1,n2,i;
		Scanner s=new Scanner(System.in);
		n1=s.nextInt();
		n2=s.nextInt();
		n1++;
		while(n1<n2)
		{
		boolean flag=false;
			for(i = 2; i <= n1/2; ++i)
        		{
            			if(n1 % i == 0)
            			{
					flag=true;
					break;
            			}
        		}
		if(!flag)
			System.out.println(n1);
		++n1;
		}
	}
}