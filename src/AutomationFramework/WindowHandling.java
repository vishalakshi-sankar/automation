package AutomationFramework;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException, Throwable {

		System.setProperty("webdriver.chrome.driver",
				"G:\\Softwares\\download for selenium\\vishalakshi\\eclipse-workspace\\Learning1\\driver1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// System.out.println("welcome1");
		driver.get("https://www.google.com/");
		String id = driver.getWindowHandle();
		// String title2 = driver.getTitle();
		// System.out.println(title2);
		WebElement gmail = driver.findElement(By.xpath("//a[text()='Gmail']"));
		
		Actions ac = new Actions(driver);
		ac.contextClick(gmail).build().perform();
		Robot rc = new Robot();
		rc.keyPress(KeyEvent.VK_DOWN);
		rc.keyRelease(KeyEvent.VK_DOWN);

		rc.keyPress(KeyEvent.VK_ENTER);
		rc.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		WebElement image = driver.findElement(By.xpath("//a[text()='Images']"));

		ac.contextClick(image).build().perform();

		rc.keyPress(KeyEvent.VK_DOWN);
		rc.keyRelease(KeyEvent.VK_DOWN);

		rc.keyPress(KeyEvent.VK_ENTER);
		rc.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		WebElement icon = driver.findElement(By.xpath("//a[@title='Google apps']"));

		ac.contextClick(icon).build().perform();

		rc.keyPress(KeyEvent.VK_DOWN);
		rc.keyRelease(KeyEvent.VK_DOWN);

		rc.keyPress(KeyEvent.VK_ENTER);
		rc.keyRelease(KeyEvent.VK_ENTER);

		Set<String> allid = driver.getWindowHandles();
		
		driver.getTitle();
		
		for (String x : allid) {
			
			String title = driver.switchTo().window(x).getTitle();
			System.out.println("Title is:"+title);
			
		}
		Thread.sleep(2000);
		String actualTitle = "Google Images";
		
		for (String x : allid) {
			if(driver.switchTo().window(x).getTitle().equals(actualTitle)) {
				break;
			}
		}

	}
}