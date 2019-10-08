package AutomationFramework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","G:\\Softwares\\download for selenium\\vishalakshi\\eclipse-workspace\\Learning1\\driver1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//System.out.println("welcome1");
		driver.get("https://www.google.com/");
		
		//String sign="SIGN-ON";
	WebElement element1 = driver.findElement(By.name("q"));
   element1.sendKeys("amazon");
   /*
     //navigations
   		driver.navigate().refresh();
    
		driver.navigate().to("https://www.facebook.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.close();
		*/
	//automation practice table
   //printing all data:
		driver.navigate().to("https://www.toolsqa.com/automation-practice-table/");
		List<WebElement> findElement = driver.findElements(By.xpath("//table/tbody/tr/td"));
		for (WebElement data : findElement) {
			System.out.println(data.getText());}
	//rowwise		
		List<WebElement> findElement1 = driver.findElements(By.xpath("//table/tbody/tr[2]/td"));
			for (WebElement data1 : findElement1) {
				System.out.println(data1.getText());
			
		}
			
		}	
			
		}
