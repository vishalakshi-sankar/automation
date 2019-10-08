package AutomationFramework;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class exceptiontest {

	public static void main(String[] args) {
	
		System.out.println(1);
        System.out.println(2);
      
      //arithmetic exception handling  
        /* 
         try {
			System.out.println(3/0);
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(" Arimetic exception");
		}
        catch (NullPointerException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(" null pointer exception");
			System.out.println(e.getMessage());
		}
        catch(Exception e) {
        	System.out.println(e.getMessage());
        }
        
        */
        
//Input mismatch	

/*
 Scanner sc=new Scanner(System.in);
 


try {
	int nextInt = sc.nextInt();
	System.out.println(nextInt);
} catch (InputMismatchException e) {
	// TODO Auto-generated catch block
	//e.printStackTrace();
	System.out.println(e.getMessage());
}

*/


	//Number Format Exception
		/*
		  String as="1000asv";
		 
				int parseInt;
				try {
					parseInt = Integer.parseInt(as);
					System.out.println(parseInt);
				} catch (NumberFormatException e) {
					// TODO Auto-generated catch block
					//e.printStackTrace();
					System.out.println(e.getMessage());
				}
				
		*/	
		
	//to identify the number of space and lower case and upper case
				String a1= "Welcome To 123";
				
				int up=0;
				int lo=0;
				int sp=0;
				
				for(int i = 0;i<a1.length();i++) {
				if(a1.charAt(i)>='A' && a1.charAt(i)<='Z')
				{
					up++;
					
				}
				if(a1.charAt(i)>='a' && a1.charAt(i)<='z')
				{
					lo++;
					
				}
			
				
				
				if(a1.charAt(i)==' ')
				{
					sp++;
					
				}
				}
				System.out.println(lo);
				System.out.println(up);
				System.out.println(sp);
				
			
				
				
			
 System.out.println(4);
	}}
