package POMDesign;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;



public class SignInPom {
	WebDriver driver;
	public SignInPom(WebDriver driver){
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
//---------------------------SignIn---------------------------
	@FindBy(id = "username")
	WebElement username;
	@FindBy(id = "password")
	WebElement password;
	@FindBy(css = "button[class='btn btn-warning my-2 my-sm-0")
	WebElement SignInLink;
//-------------------------------------------------------------
//-------------------------SIGN IN ACTIONS-----------------------------
	@Test(priority = 2)
	public void signInNew(String user,String pass ) {
		SignInLink.click();
		username.sendKeys(user);
		password.sendKeys(pass);
	}
}
//-------------------------------------------------------------