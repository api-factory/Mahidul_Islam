import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class StringToDateConvert {

	public static void main(String[] args) {
		//9// Java Program to Convert String to Date
				
				String x;
				
				System.out.println("Enter The Date String ");
				Scanner ss=new Scanner(System.in);
				x=ss.next();
				
				SimpleDateFormat sdf=new SimpleDateFormat("dd-MMM-yyyy");
				try {
					Date dt= sdf.parse(x);
					
					System.out.println(dt);
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				

	}

}
