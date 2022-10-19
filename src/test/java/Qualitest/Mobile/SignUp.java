package Qualitest.Mobile;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import POMDesign.SignUpPom;
import io.github.bonigarcia.wdm.WebDriverManager;



public class SignUp {
    
	SignUpPom land;
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
@Test(dataProvider = "signUpData"  )
    public void signUpPage(String fname, String sname, String email,String password,String dob,String phnum,   String sbio) {
	//final String path = "C:\\Users\\mithun.gowda\\Downloads\\chromedriver_win32\\chromedriver.exe";
	//System.setProperty("webdriver.chrome.driver",path);
    //WebDriver driver= new ChromeDriver();
	ExtentTest Test=extent.createTest("Sign-Up");
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    driver.get("https://mobileworld.banyanpro.com/");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    land = new SignUpPom(driver);
    land.signUpNew(fname, sname, email, password, dob, phnum, sbio);  
    
    Alert alert = driver.switchTo().alert();
    alert.accept(); 
    driver.quit();
    
    }



@DataProvider
public Object[][] signUpData() {
    Object [][] data = new Object [7][7];
    //------------FIRST NAME--------------//
    //Valid Cases 3 to 20 chatracters
    data [0][0]="Firstname";
    data [0][1]="Secondname";
    data [0][2]="first@gmail.com";
    data [0][3]="User123";
    data [0][4]="12/12/2022";
    data [0][5]="1234567890";
    data [0][6]="Test";
    
  /* //Invalid less than 3
    data [1][0]="Fi";
    data [1][1]="Secondname";
    data [1][2]="first@gmail.com";
    data [1][3]="User123";
    data [1][4]="12/12/2022";
    data [1][5]="1234567890";
    data [1][6]="Test";
    
  //Invalid more than 20
    data [2][0]="Firstnamefirstnamefirstname";
    data [2][1]="Secondname";
    data [2][2]="first@gmail.com";
    data [2][3]="User123";
    data [2][4]="12/12/2022";
    data [2][5]="1234567890";
    data [2][6]="Test";
    
  //Invalid only special characters
    data [3][0]="!@#$%";
    data [3][1]="Secondname";
    data [3][2]="first@gmail.com";
    data [3][3]="User123";
    data [3][4]="12/12/2022";
    data [3][5]="1234567890";
    data [3][6]="Test";
    
  //Invalid alpha-numeric
    data [4][0]="1A2b3Cd";
    data [4][1]="Secondname";
    data [4][2]="first@gmail.com";
    data [4][3]="User123";
    data [4][4]="12/12/2022";
    data [4][5]="1234567890";
    data [4][6]="Test";//
    
  //Invalid numeric
    data [5][0]="1234567";
    data [5][1]="Secondname";
    data [5][2]="first@gmail.com";
    data [5][3]="User123";
    data [5][4]="12/12/2022";
    data [5][5]="1234567890";
    data [5][6]="Test";
    
   //Invalid no-input
    data [6][0]="";
    data [6][1]="Secondname";
    data [6][2]="first@gmail.com";
    data [6][3]="User123";
    data [6][4]="12/12/2022";
    data [6][5]="1234567890";
    data [6][6]="Test";
    */
  //------------SECOND NAME--------------// 
  //Valid Cases 3 to 20 chatracters
    data [1][0]="Firstname";
    data [1][1]="Secondname";
    data [1][2]="first@gmail.com";
    data [1][3]="User123";
    data [1][4]="12/12/2022";
    data [1][5]="1234567890";
    data [1][6]="Test";
 /*  
  //Invalid less than 3
    data [8][0]="Firstname";
    data [8][1]="Se";
    data [8][2]="first@gmail.com";
    data [8][3]="User123";
    data [8][4]="12/12/2022";
    data [8][5]="1234567890";
    data [8][6]="Test";
    
  //Invalid more than 20
    data [9][0]="Firstname";
    data [9][1]="Se";
    data [9][2]="first@gmail.com";
    data [9][3]="User123";
    data [9][4]="12/12/2022";
    data [9][5]="1234567890";
    data [9][6]="Test";
    
    //Invalid only special characters
    data [10][0]="Firstname";
    data [10][1]="!@#$%";
    data [10][2]="first@gmail.com";
    data [10][3]="User123";
    data [10][4]="12/12/2022";
    data [10][5]="1234567890";
    data [10][6]="Test";
    
  //Invalid alpha-numeric
    data [11][0]="Firstname";
    data [11][1]="!@#$%";
    data [11][2]="first@gmail.com";
    data [11][3]="User123";
    data [11][4]="12/12/2022";
    data [11][5]="1234567890";
    data [11][6]="Test";
    
  //Invalid numeric
    data [12][0]="Firstname";
    data [12][1]="12345";
    data [12][2]="first@gmail.com";
    data [12][3]="User123";
    data [12][4]="12/12/2022";
    data [12][5]="1234567890";
    data [12][6]="Test";
    
  //Invalid no-input
    data [13][0]="Firstname";
    data [13][1]="";
    data [13][2]="first@gmail.com";
    data [13][3]="User123";
    data [13][4]="12/12/2022";
    data [13][5]="1234567890";
    data [13][6]="Test";
   */
    
  //------------EMAIL--------------// 
    //Valid Email
    data [2][0]="Firstname";
    data [2][1]="Secondname";
    data [2][2]="first@gmail.com";
    data [2][3]="User123";
    data [2][4]="12/12/2022";
    data [2][5]="1234567890";
    data [2][6]="Test";
  
    /*
    //Invalid Email without "@"
    data [15][0]="Firstname";
    data [15][1]="Secondname";
    data [15][2]="firstgmail.com";
    data [15][3]="User123";
    data [15][4]="12/12/2022";
    data [15][5]="1234567890";
    data [15][6]="Test";
    
  //Invalid Email not registered
    data [16][0]="Firstname";
    data [16][1]="Secondname";
    data [16][2]="123first@()gmail.com";
    data [16][3]="User123";
    data [16][4]="12/12/2022";
    data [16][5]="1234567890";
    data [16][6]="Test";
    
  //Invalid no Email
    data [17][0]="Firstname";
    data [17][1]="Secondname";
    data [17][2]="";
    data [17][3]="User123";
    data [17][4]="12/12/2022";
    data [17][5]="1234567890";
    data [17][6]="Test";
   */

  //------------PASSWORD--------------// 
  //Valid alpha-numeric password
    data [3][0]="Firstname";
    data [3][1]="Secondname";
    data [3][2]="first@gmail.com";
    data [3][3]="User123";
    data [3][4]="12/12/2022";
    data [3][5]="1234567890";
    data [3][6]="Test";
  /*
  //Invalid only numeric
    data [19][0]="Firstname";
    data [19][1]="Secondname";
    data [19][2]="first@gmail.com";
    data [19][3]="1234123";
    data [19][4]="12/12/2022";
    data [19][5]="1234567890";
    data [19][6]="Test";
  
  //Invalid only alphabets
    data [20][0]="Firstname";
    data [20][1]="Secondname";
    data [20][2]="first@gmail.com";
    data [20][3]="Abcdefg";
    data [20][4]="12/12/2022";
    data [20][5]="1234567890";
    data [20][6]="Test";
    
    //Invalid less than 3 alpha-numeric characters
    data [21][0]="Firstname";
    data [21][1]="Secondname";
    data [21][2]="first@gmail.com";
    data [21][3]="3A";
    data [21][4]="12/12/2022";
    data [21][5]="1234567890";
    data [21][6]="Test";
    
  //Invalid more than 10 alpha-numeric characters
    data [22][0]="Firstname";
    data [22][1]="Secondname";
    data [22][2]="first@gmail.com";
    data [22][3]="3A1a2s3d4d5d66f7f8f8gh8";
    data [22][4]="12/12/2022";
    data [22][5]="1234567890";
    data [22][6]="Test";
    
    //Invalid no input
    data [23][0]="Firstname";
    data [23][1]="Secondname";
    data [23][2]="first@gmail.com";
    data [23][3]="";
    data [23][4]="12/12/2022";
    data [23][5]="1234567890";
    data [23][6]="Test";
    */
    //------------Date of Birth--------------// 
  //Valid input
    data [4][0]="Firstname";
    data [4][1]="Secondname";
    data [4][2]="first@gmail.com";
    data [4][3]="User123";
    data [4][4]="12/12/2022";
    data [4][5]="1234567890";
    data [4][6]="Test";
   /* 
  //Invalid no input
    data [25][0]="Firstname";
    data [25][1]="Secondname";
    data [25][2]="first@gmail.com";
    data [25][3]="User123";
    data [25][4]="";
    data [25][5]="1234567890";
    data [25][6]="Test";
    */
  //------------Phone number--------------// 
    ///Valid input
    data [5][0]="Firstname";
    data [5][1]="Secondname";
    data [5][2]="first@gmail.com";
    data [5][3]="User123";
    data [5][4]="12/12/2022";
    data [5][5]="9123456780";
    data [5][6]="Test";
   /* 
  //Invalid more than 10 input characters
    data [27][0]="Firstname";
    data [27][1]="Secondname";
    data [27][2]="first@gmail.com";
    data [27][3]="User123";
    data [27][4]="12/12/2022";
    data [27][5]="9123456789012";
    data [27][6]="Test";
    
  //Invalid less than 10 input characters
    data [28][0]="Firstname";
    data [28][1]="Secondname";
    data [28][2]="first@gmail.com";
    data [28][3]="User123";
    data [28][4]="12/12/2022";
    data [28][5]="91";
    data [28][6]="Test";
    
    //Invalid no input characters
    data [28][0]="Firstname";
    data [28][1]="Secondname";
    data [28][2]="first@gmail.com";
    data [28][3]="User123";
    data [28][4]="12/12/2022";
    data [28][5]="";
    data [28][6]="Test";
    
  //Invalid alphabetic characters
    data [29][0]="Firstname";
    data [29][1]="Secondname";
    data [29][2]="first@gmail.com";
    data [29][3]="User123";
    data [29][4]="12/12/2022";
    data [29][5]="kzuGDcjha";
    data [29][6]="Test";
    
  //Invalid special characters
    data [30][0]="Firstname";
    data [30][1]="Secondname";
    data [30][2]="first@gmail.com";
    data [30][3]="User123";
    data [30][4]="12/12/2022";
    data [30][5]="!@#$%^&*()";
    data [30][6]="Test";
    */
  //------------Short bio--------------// 
    //Valid input
    data [6][0]="Firstname";
    data [6][1]="Secondname";
    data [6][2]="first@gmail.com";
    data [6][3]="User123";
    data [6][4]="12/12/2022";
    data [6][5]="9123456780";
    data [6][6]="Test";
    /*
    //Invalid no input
    data [32][0]="Firstname";
    data [32][1]="Secondname";
    data [32][2]="first@gmail.com";
    data [32][3]="User123";
    data [32][4]="12/12/2022";
    data [32][5]="9123456780";
    data [32][6]="";
    
  //Invalid more than 80 input characters
    data [33][0]="Firstname";
    data [33][1]="Secondname";
    data [33][2]="first@gmail.com";
    data [33][3]="User123";
    data [33][4]="12/12/2022";
    data [33][5]="9123456780";
    data [33][6]="Test Tipu Sultan’s birth date was 20th November in 1750. The birthplace of Tipu Sultan is Devanahalli in the rural district of Bengaluru which is located 33 km to the north of the city of Bengaluru. The real name of Tipu Sultan was Sultan Fateh Ali Sahab and he was named after the saint called Tipu Mastan Aulia in Arcot. Hyder Ali was the father of Tipu Sultan and he was the military officer who served the kingdom of Mysore and then became the de facto ruler of the province in 1761.";
    
    
    */
    return data;
    
}




}
