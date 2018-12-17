import java.util.Arrays;
import java.util.Scanner;

public class LargestArrayElement {

	public static void main(String[] args) {
		//6// Largest element in array
				
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
				
				Arrays.sort(a);
				
				System.out.print("The Largest element is :"+a[x-1]);

	}

}
