package Qualitest.Mobile;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import POMDesign.SignInPom;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SignIn {
	DataFormatter formatter = new DataFormatter();
	SignInPom land;
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

	@Test(dataProvider="driverTest")
	
	public void set(String userName,String password) throws InterruptedException{	
	//final String path = "C:/Users/mithun.gowda/Downloads/chromedriver_win32/chromedriver.exe";
	//System.setProperty("webdriver.chrome.driver",path);
	//WebDriver driver = new EdgeDriver();
		ExtentTest Test=extent.createTest("Sign-In");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://mobileworld.banyanpro.com/");
	driver.manage().window().maximize();
    land = new SignInPom(driver);
    land.signInNew(userName, password);
    driver.quit();
    
	
	
	}
	
	@DataProvider(name="driverTest")
	public Object[][] signInData() throws IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\mithun.gowda\\Downloads\\demoData.xlsx");
		//XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFWorkbook wb = new  XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);
		System.out.println(sheet);
		int rowCount = sheet.getPhysicalNumberOfRows();
		XSSFRow row = sheet.getRow(0);
		int colCount = row.getLastCellNum();
		Object data[][] = new Object[rowCount-1][colCount];
		for(int i=0;i<rowCount-1;i++)
		{
			row = sheet.getRow(i+1);
			for(int j=0;j<colCount;j++)
			{
				XSSFCell cell = row.getCell(j);
				data[i][j]=formatter.formatCellValue(cell);
				System.out.println(data[i][j]);		
			}
		}
		
		
		return data;
		
		
	}

}
