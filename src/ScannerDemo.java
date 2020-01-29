import java.io.IOException;
import java.io.InputStream;
import java.util.*;
public class ScannerDemo {

	




	public static void main(String[] args) throws IOException  {
		           
		
		
		while(true){
				
			
			Scanner sc =new Scanner(System.in);
			System.out.println("Enter first number");
			int s2 = sc.nextInt();
			System.out.println("Enter second number");
			int s3 = sc.nextInt();
			System.out.println("sum is : " + (s2 + s3));
		
			
			System.out.println("Enter exit if you want to stop the the programm else continue : "); 
			Scanner sc2=new Scanner(System.in);
			String s4 = sc2.nextLine();
			System.out.println("You have entered: "+s4);
			if( s4.equals("exit"))
				{break;}}
		
	}

	

	

}
 