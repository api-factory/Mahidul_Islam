import java.util.Scanner;

public class PrintArrayElement {

	public static void main(String[] args) {
		//8//  print an array
				
				int x;
				
				System.out.println("Enter The no of array element : ");
				Scanner ss=new Scanner(System.in);
				x=ss.nextInt();
				int a[]=new int[x];
				System.out.println("Enter element of Array : ");
				for(int i=0;i<x;i++)
				{
				  a[i]=ss.nextInt();
				}
				
				for(int i=0;i<x;i++)
				{
				  System.out.println("a["+i+"] => "+a[i]);
				}
				

	}

}
