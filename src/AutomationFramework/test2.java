package AutomationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String exePath = "G:\\Softwares\\download for selenium\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		//System.out.println("welcome1");
		driver.get("https://www.google.com/");
		//String sign="SIGN-ON";
		WebElement element = driver.findElement(By.xpath("//input[@type=\"text\"]"));
	    element.sendKeys("facebook");
	
		
		
		
		
		
		
	}

}
