package apr5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class VerifyTitle3 {
	WebDriver driver;
	@Test
	public void startTest()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com/");
		String Expected = "Goog";
		String Actual = driver.getTitle();
		try{
			Assert.assertTrue(Actual.equalsIgnoreCase(Expected), "Title is  matching");
		}catch(Throwable t)
		{
		Reporter.log(t.getMessage(),true);	
		}
		driver.quit();
	}
}
