package AutomationFramework;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("welcome");
		String exePath = "G:\\Softwares\\download for selenium\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		System.out.println("welcome1");
		driver.get("https://www.google.com");
		 String actualTitle = "";
		 
		 actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		 driver.close();
		 System.exit(0);

	}

}
