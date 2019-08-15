import java.util.Scanner;
public class thrid
{
	public static void main(String []args)
	{
		char c;
		Scanner s=new Scanner(System.in);
		c=s.next().charAt(0);
		if((c>='a')&&(c<='z')||(c>='A')&&(c<='Z'))
		{
		if((c=='a')||(c=='e')||(c=='i')||(c=='o')||(c=='u'))
		{
			System.out.println("Vowel");
		}
		else if((c=='A')||(c=='E')||(c=='I')||(c=='O')||(c=='U'))
		{
			System.out.println("Vowel");
		}
		else
		{
			System.out.println("Consonant");
		}
		}
		else
		{
			System.out.println("Invalid");
		}
	}
}