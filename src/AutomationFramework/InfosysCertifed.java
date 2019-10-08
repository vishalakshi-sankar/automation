package AutomationFramework;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InfosysCertifed {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","G:\\Softwares\\download for selenium\\vishalakshi\\eclipse-workspace\\Learning1\\driver1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//System.out.println("welcome1");
		driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.linkText("REGISTER")).click();
		TakesScreenshot ts=(TakesScreenshot) driver;
		File temp=ts.getScreenshotAs(OutputType.FILE);
		File des= new File("G:\\Softwares\\download for selenium\\vishalakshi\\eclipse-workspace\\Learning1\\ScreenShot\\test1.png");
		FileUtils.copyFile(temp, des);
		

	}

}
