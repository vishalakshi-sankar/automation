package AutomationFramework;

public class LowerUpperCase {
	//to identify the number of space and lower case and upper case
	
	public static void main(String[] args) {
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
}

}
