import java.util.Scanner;

public class PalindromeOrNot {

	public static void main(String[] args) {
		//2// Number Palindrome or not
		
				int a,org,rem,rev=0;
				System.out.println("Enter The no : ");
				Scanner ss=new Scanner(System.in);
				a=ss.nextInt();
				
				org=a;
				
				while(a!=0)
				{
					rem=a%10;
				    rev=rev*10+rem;
					a/=10;
				}
				
				if(rev==org)
					System.out.println("No. is Palindrome");
				else
					System.out.println("No. is not Palindrome");
				

	}

}
