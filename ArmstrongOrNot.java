import java.util.Scanner;

public class ArmstrongOrNot {

	public static void main(String[] args) {
		//4.// Java Program to Check Armstrong Number

				
				int x,ln,rem,sum=0;
				
				System.out.println("Enter The no  : ");
				Scanner ss=new Scanner(System.in);
				x=ss.nextInt();
				int org=x;
				
				ln=(""+x).length();
				
				while(x!=0)
				{
					rem=x%10;
					sum+=Math.pow(rem, ln);
					x/=10;
				}
				
				if(org==sum)
					System.out.println(org+" is Armstrong Number");
				else
					System.out.println(org+" is Not a Armstrong Number");
				

	}

}
