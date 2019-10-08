package AutomationFramework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class classpractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","G:\\Softwares\\download for selenium\\vishalakshi\\eclipse-workspace\\Learning1\\driver1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		//dropdown
		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));
		//select by visible text
		Select sd=new Select(day);
		sd.selectByVisibleText("6");
		//select by value
		Select sm=new Select(month);
		sm.selectByValue("5");
		//to get all options-to get the all options in dropdown
		List<WebElement> options = sm.getOptions();
		//if we directly print the webelemnt ,the ref will be displayed 
		System.out.println(options);
		
		for (WebElement x : options) {
			System.out.println(x.getText());
			
		}
		
		Select sy=new Select(year);
		//to get the selected option
				WebElement firstSelectedOption = sy.getFirstSelectedOption();
				String text = firstSelectedOption.getText();
				System.out.println("before selecting option"+text);
		//select by index
		sy.selectByIndex(5);
		WebElement firstSelectedOption1 = sy.getFirstSelectedOption();
		String text1 = firstSelectedOption1.getText();
		System.out.println("After selecting option"+text1);
		
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		WebElement multi = driver.findElement(By.id("multi-select"));
		Select multip=new Select(multi);
		boolean multiple = multip.isMultiple();
		if(multiple)
		{
			multip.selectByIndex(3);
			multip.selectByValue("Pennsylvania");
		}
			
	
		
		
		
		
		
		
		
		//radio buton
		WebElement r1 = driver.findElement(By.xpath("(//input[@name='sex'])[2]"));
		r1.click();
		
	
		
	}

}
