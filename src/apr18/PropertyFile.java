package apr18;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PropertyFile {
WebDriver driver;
Properties conpro;
@Test
public void startTest() throws Throwable, IOException
{
	conpro = new Properties();
	conpro.load(new FileInputStream("OR.properties"));
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(conpro.getProperty("URL"));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.xpath(conpro.getProperty("ObjUser"))).sendKeys(conpro.getProperty("Username"));
	driver.findElement(By.xpath(conpro.getProperty("ObjPass"))).sendKeys(conpro.getProperty("Password"));
	driver.findElement(By.xpath(conpro.getProperty("ObjLogin"))).click();
	driver.quit();
	
}
}
