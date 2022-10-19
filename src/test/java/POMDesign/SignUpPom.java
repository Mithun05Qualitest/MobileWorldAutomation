
package POMDesign;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;



public class SignUpPom {
	WebDriver driver;
	public SignUpPom(WebDriver driver){
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
//---------------------------SignIn---------------------------
	
	
//-------------------------SignUp------------------------------
	@FindBy(css = "button[class='btn btn-warning my-2 my-sm-0")
	WebElement signUpButton;
	@FindBy(css = "a[href='signup.html']")
	WebElement signUpLink;
	@FindBy(id = "myName")
	WebElement firstName;
	@FindBy(css = "input[placeholder='Last Name']")
	WebElement lastName;
	@FindBy(css = "input[placeholder='Enter Email']")
	WebElement emailField;
	@FindBy(css = "input[placeholder='Password']")
	WebElement signUpPass;
	@FindBy(css = "input[type='date']")
	WebElement DOB;
	
	@FindBy(css = "div[class='col-md-2'] input[name='gender']")
	WebElement Gender;
	@FindBy(css = "input[placeholder='91XXXXXXXXXX']")
	WebElement PhoneNO;
	@FindBy(css = "textarea[placeholder='Short Bio']")
	WebElement Bio;
	@FindBy(css="body > div:nth-child(1) > div:nth-child(2) > form:nth-child(1) > div:nth-child(16) > div:nth-child(2) > button:nth-child(1)")
	WebElement Register;
	
	
//---------------------------------------------------------------
//------------------SIGN UP ACTIONS------------------------------
	@Test(priority = 1)
	public void signUpNew(String fname, String sname, String email,String password,String dob,String phnum,String sbio) {
		signUpButton.click();
		signUpLink.click();
		firstName.sendKeys(fname);
		lastName.sendKeys(sname);
		emailField.sendKeys(email);
		signUpPass.sendKeys(password);
		DOB.sendKeys(dob);
		Gender.click();
		PhoneNO.sendKeys(phnum);
		Bio.sendKeys(sbio);
		Register.click();
	}
}
//-----------------------------------------------------------------