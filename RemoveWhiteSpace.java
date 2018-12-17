import java.util.Scanner;

public class RemoveWhiteSpace {

	public static void main(String[] args) {
		//7// Remove all whitespaces from String
		
				System.out.println("Enter The String : ");
				Scanner ss=new Scanner(System.in);
				String x=ss.nextLine();
				
				x=x.replaceAll("\\s", "");
				
				System.out.println("after Remove all whileSpaces : "+x);

	}

}
