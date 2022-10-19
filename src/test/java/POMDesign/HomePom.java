package POMDesign;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;



public class HomePom {
	WebDriver driver;
	public HomePom(WebDriver driver){
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	

//-----------------------------HOME------------------------------
	//driver.findElement(By.id("navbarDropdown")).click();
	@FindBy(id="navbarDropdown")
	public
	WebElement LatestDropDown;

	
	
	//driver.findElement(By.linkText("Samsung")).click();
	@FindBy(linkText="Samsung")
	public
	WebElement SamsungOption;
	
	//driver.findElement(By.linkText("Lenovo")).click();
	@FindBy(linkText="Lenovo")
	public
	WebElement LenovoOption;
	
	//driver.findElement(By.linkText("Apple")).click();
	@FindBy(css="a[href$='#apple']")
	public
	WebElement AppleOption;
	
	@FindBy(css="div[id='samsung'] div[class='card '] img[class='card-img-top']")
	public
	WebElement SAMSUNGS21FE;
	
	@FindBy(css="body > section:nth-child(4) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > a:nth-child(3)")
	public
	WebElement SAMSUNGS21FEMoreDetails;
	
	@FindBy(css="body > section:nth-child(4) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2)")
	public
	WebElement SAMSUNGZFLIP3;
	
	@FindBy(css="body > section:nth-child(4) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > a:nth-child(3)")
	public
	WebElement SAMSUNGZFLIP3MoreDetails;
	
	
	@FindBy(css="div[id='samsung'] div:nth-child(1) div:nth-child(1) img:nth-child(1)")
	public
	WebElement SAMSUNGA13;
	
	@FindBy(css="body > section:nth-child(4) > div:nth-child(1) > div:nth-child(2) > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > a:nth-child(3)")
	public
	WebElement SAMSUNGA13MoreDetails;
	
	@FindBy(css="div[id='lenovo'] div:nth-child(1) div:nth-child(1) img:nth-child(1)")
	public
	WebElement LENOVOK13PRO;
	
	@FindBy(css="body > section:nth-child(4) > div:nth-child(1) > div:nth-child(5) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > a:nth-child(3)")
	public
	WebElement LENOVOK13PROMoreDetails ;
	
	@FindBy(css="body > section:nth-child(4) > div:nth-child(1) > div:nth-child(5) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2)")
	public
	WebElement  LENOVOLEGION2;
	
	@FindBy(css="body > section:nth-child(4) > div:nth-child(1) > div:nth-child(5) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > a:nth-child(3)")
	public
	WebElement  LENOVOLEGION2MoreDetails;
	
	@FindBy(css="body > section:nth-child(4) > div:nth-child(1) > div:nth-child(5) > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > a:nth-child(3)")
	public
	WebElement LENOVOA8MoreDetails ;
	
	@FindBy(css="body > section:nth-child(4) > div:nth-child(1) > div:nth-child(5) > div:nth-child(3) > div:nth-child(1) > div:nth-child(2)")
	public
	WebElement LENOVOA8;
	
	//Apple Locators
	@FindBy(css="div[id='apple'] div:nth-child(1) div:nth-child(1) img:nth-child(1)")
	public
	WebElement APPLEIPHONEXS ;
	
	@FindBy(css="body > section:nth-child(4) > div:nth-child(1) > div:nth-child(8) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > a:nth-child(3)")
	public
	WebElement  APPLEIPHONEXSMOREDETAILS;
	
	@FindBy(css="body > section:nth-child(4) > div:nth-child(1) > div:nth-child(8) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > h4:nth-child(1)")
	public
	WebElement APPLEIPHONE13 ;
	
	@FindBy(css="body > section:nth-child(4) > div:nth-child(1) > div:nth-child(8) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > a:nth-child(3)")
	public
	WebElement APPLEIPHONE13MoreXDetails;
	
	
	
	@FindBy(xpath="//body[1]/section[2]/div[1]/div[3]/div[3]/div[1]")
	public
	WebElement APPLEIPHONE12H ;
	
	@FindBy(css="body > section:nth-child(4) > div:nth-child(1) > div:nth-child(8) > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > a:nth-child(3)")
	public
	WebElement APPLEIPHONE12HMoreDetails ;
//---------------------------------------------------------------


}
