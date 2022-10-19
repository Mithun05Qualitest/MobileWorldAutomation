package Qualitest.Mobile;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import POMDesign.HomePom;
import io.github.bonigarcia.wdm.WebDriverManager;


public class HomePage {
	WebDriver driver;
	HomePom land;
	
	
	ExtentReports extent;
	@BeforeTest
	public void config() {
		String path=System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter reporter=new ExtentSparkReporter(path); 
		reporter.config().setReportName("Automation test");
		reporter.config().setDocumentTitle("Test results");
		extent=new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Mithun");
		
	}


@Test
public void homePageNew() throws InterruptedException {
	ExtentTest Test=extent.createTest("HomeDefect");
	//setUp();
	// Latest DropDown
	WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
	    driver.get("https://mobileworld.banyanpro.com/");
	    driver.manage().window().maximize();
	    land=new HomePom(driver);
	land.LatestDropDown.click();
	Thread.sleep(2000);
	//Option Selects
	land.SamsungOption.click();
	Thread.sleep(2000);
	land.LatestDropDown.click();
	Thread.sleep(1000);
	land.LenovoOption.click();
	Thread.sleep(1000);
	land.LatestDropDown.click();
	Thread.sleep(1000);
	land.AppleOption.click();
	Thread.sleep(1000);
	driver.quit();
}
@Test
public void samsungtest() throws InterruptedException {
	ExtentTest Test=extent.createTest("Samsung Test");
	//Samsung Latest Mobiles
	WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
	driver.get("https://mobileworld.banyanpro.com/");
	driver.manage().window().maximize();
	land=new HomePom(driver);
	land.SAMSUNGS21FE.click();
	Thread.sleep(1000);
	land.SAMSUNGS21FEMoreDetails.click();
	Thread.sleep(1000);
	driver.navigate().back();
	
	land.SAMSUNGZFLIP3.click();
	Thread.sleep(1000);
	land.SAMSUNGZFLIP3MoreDetails.click();
	Thread.sleep(1000);
	driver.navigate().back();
	Thread.sleep(1000);
	
	land.SAMSUNGA13.click();
	Thread.sleep(1000);
	land.SAMSUNGA13MoreDetails.click();
	Thread.sleep(1000);
	driver.navigate().back();
	Thread.sleep(1000);
	
	driver.quit();
}	

@Test
public void lenovoTest() throws InterruptedException{
//Lenovo Latest Mobiles 
		ExtentTest Test=extent.createTest("Lenovo test");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	    driver.get("https://mobileworld.banyanpro.com/");
	    driver.manage().window().maximize();
	    land=new HomePom(driver);
		land.LENOVOK13PRO.click();
		Thread.sleep(1000);
		land.LENOVOK13PROMoreDetails.click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		land.LENOVOLEGION2.click();
		Thread.sleep(1000);
		land.LENOVOLEGION2MoreDetails.click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		
		land.LENOVOA8.click();
		Thread.sleep(1000);
		land.LENOVOA8MoreDetails.click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		
		driver.quit();
}

@Test
public void appletest() throws InterruptedException {
	ExtentTest Test=extent.createTest("Apple test");
//Apple Latest Mobiles
	WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
	driver.get("https://mobileworld.banyanpro.com/");
	driver.manage().window().maximize();
	land=new HomePom(driver);
	land.APPLEIPHONEXS.click();
	Thread.sleep(2000);
	land.APPLEIPHONEXSMOREDETAILS.click();
	Thread.sleep(2000);
	driver.navigate().back();

	Thread.sleep(2000);
	
	land.APPLEIPHONE13.click();
	Thread.sleep(2000);
	land.APPLEIPHONE13MoreXDetails.click();
	Thread.sleep(2000);
	land.APPLEIPHONE12H.click();
	Thread.sleep(2000);
	land.APPLEIPHONE12HMoreDetails.click();
	Thread.sleep(2000);
	driver.navigate().back();
	Thread.sleep(2000);
	
	driver.quit();
	}
@Test

public void lenovoDropDowndefect() throws InterruptedException {
	ExtentTest Test=extent.createTest("Lenovo Defect");
	WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
	driver.get("https://mobileworld.banyanpro.com/");
	driver.manage().window().maximize();
	land=new HomePom(driver);
	land.LatestDropDown.click();
	land.LenovoOption.click();
	Thread.sleep(5000);
	String url=driver.getCurrentUrl();
	Assert.assertEquals(url, "https://mobileworld.banyanpro.com/#lenovo");
	
		Thread.sleep(5000);
		driver.quit();
	}
@Test
public void appleIphone13MDdefect() throws InterruptedException {
	ExtentTest Test=extent.createTest("Apple Iphone 13 Defect");
	WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
	    driver.get("https://mobileworld.banyanpro.com/");
	    driver.manage().window().maximize();
	    land=new HomePom(driver);
	    Thread.sleep(2000);
	land.APPLEIPHONE13.click();
	land.APPLEIPHONE13MoreXDetails.click();
	Thread.sleep(5000);
	String url=driver.getCurrentUrl();
	System.out.println(url);
	Assert.assertEquals(url, "https://mobileworld.banyanpro.com/mobile.html");
	Thread.sleep(5000);
	driver.quit();
	
}
}
