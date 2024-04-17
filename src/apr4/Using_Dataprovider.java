package apr4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Using_Dataprovider {
	WebDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	@DataProvider
	public Object supplydata()
	{
		Object login[][]= {{"Admin","Qedge123!@#"},{"Admi","Qedge123!@#"},{"Admin","Qedge123!@"},{"Admi","Qedge123!@"}};
		return login;
	}
	@Test(dataProvider = "supplydata")
	public void verify_login(String user,String pass)
	{
		driver.get("http:/orangehrm.qedgetech.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("txtUsername")).sendKeys(user);
		driver.findElement(By.name("txtPassword")).sendKeys(pass);
		driver.findElement(By.name("Submit")).click();
		String Expected = "dashboard";
		String Actual = driver.getCurrentUrl();
		if (Actual.contains(Expected)) 
		{
			Reporter.log("Login is Sucessfull"+Expected+"       "+Actual,true);
		} else
		{
			Reporter.log("Login is Failed"+Expected+"       "+Actual,true);
		}
		
}
	@AfterTest
	public void tearDown() 
	{
		driver.quit();
	}
}