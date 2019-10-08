package AutomationFramework;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsHandling {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver",
				"G:\\Softwares\\download for selenium\\vishalakshi\\eclipse-workspace\\Learning1\\driver1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		WebElement element = driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']"));
		element.click();
		Thread.sleep(2000);
		Alert simplealert = driver.switchTo().alert();
		simplealert.accept();

		WebElement element1 = driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']"));
		element1.click();
		Thread.sleep(2000);
		Alert al = driver.switchTo().alert();
		al.dismiss();// cancel button

		driver.switchTo().defaultContent();

		element1.click();
		Thread.sleep(2000);
		al.accept();// ok button
		driver.switchTo().defaultContent();


		WebElement element2 = driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
		element2.click();
		Thread.sleep(2000);
		al.sendKeys("visha");
		al.accept();// ok button
	String text = al.getText();
 System.out.println(text);
		Thread.sleep(5000);

		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(
				"G:\\Softwares\\download for selenium\\vishalakshi\\eclipse-workspace\\Learning1\\ScreenShot\\test.png");
		FileUtils.copyFile(source, dest);

	}

}
