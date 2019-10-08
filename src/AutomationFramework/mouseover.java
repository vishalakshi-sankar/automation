package AutomationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseover {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","G:\\Softwares\\download for selenium\\vishalakshi\\eclipse-workspace\\Learning1\\driver1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com");
		
	//mouse over
		Actions ac=new Actions(driver);
		Thread.sleep(3000);
		ac.moveToElement(driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]")));
		ac.build().perform();
	//frames	
		driver.get("http://demo.automationtesting.in/Frames.html");
		driver.switchTo().frame(driver.findElement(By.id("singleframe")));
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("hello");;
		driver.switchTo().defaultContent();
	//sroll down and up
		
		
		
		
		
		
		
		

}
}
