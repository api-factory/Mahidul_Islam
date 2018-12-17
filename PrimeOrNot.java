import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		//1// Prime or Not
		
				
				int a,flag=0;
				System.out.println("Enter The no : ");
				Scanner ss=new Scanner(System.in);
				a=ss.nextInt();
				for(int i=1;i<=a;i++)
				{
					if(a%i==0)
						flag++;
				}
				
				if(flag>2)
					System.out.println("No is not prime");
				else
					System.out.println("No is prime");

	}

}
