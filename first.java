import java.util.Scanner;
public class first
{
    public static void main(String[] args) 
    {
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        if(n > 0)
        {
            System.out.println(n+" is Positive");
        }
        else if(n < 0)
        {
            System.out.println(n+" is Negative");
        }
        else
        {
            System.out.println(n+" is zero ");
        }
    }
}