package AutomationFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage_FB_pom {
	
	public WebDriver driver;
	
	public Homepage_FB_pom(WebDriver localdriver) {
		this.driver=localdriver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(id="email")
	private WebElement email;
	@FindBy(id="pass")
	private WebElement password;
	
	@FindBy(xpath="//input[@value='Log In']")
	private WebElement login;

	public WebElement getEmail() {
		return email;
	}

	public void setEmail(WebElement email) {
		this.email = email;
	}

	public WebElement getLogin() {
		return login;
	}

	public void setLogin(WebElement login) {
		this.login = login;
	}
	
	
	

}
