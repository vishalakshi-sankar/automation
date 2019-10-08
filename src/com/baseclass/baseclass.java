package com.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverService;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class baseclass {
	public static WebDriver driver;
	public static void browserlaunch(String browser)
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
		System.setProperty("webdriver.chrome.driver",
				"G:\\Softwares\\download for selenium\\vishalakshi\\eclipse-workspace\\Learning1\\driver1\\chromedriver.exe");
		 driver = new ChromeDriver();
		}
		 else if(browser.equalsIgnoreCase("ie"))
		 {
				System.setProperty("webdriver.ie.driver",
						"G:\\Softwares\\download for selenium\\vishalakshi\\eclipse-workspace\\Learning1\\driver1\\IEDriverServer.exe");
				 driver = new InternetExplorerDriver();
		 }
		 else if(browser.equalsIgnoreCase("Firefox"))
		 {
				System.setProperty("webdriver.gecko.driver",
						"G:\\Softwares\\download for selenium\\vishalakshi\\eclipse-workspace\\Learning1\\driver1\\geckodriver.exe");
				 driver = new FirefoxDriver();
		 }
		 else
		 {System.out.println("invalid");
		 
		 }
		 
	}

}
