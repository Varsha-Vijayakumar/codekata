import java.util.Scanner;
public class thirteen
{
	public static void main(String[] args)
	{
	int num,flag=0;
	Scanner s=new Scanner(System.in);
	num=s.nextInt();
        for(int i = 2; i <= num/2; ++i)
        {
            if(num % i == 0)
            {
                flag =1;
                break;
            }
        }
        if (flag==0)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}