package apr2;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstClass {
@Test
public void login() {
	Reporter.log("Executing login test",true);
}
@Test
public void compose() {
	Reporter.log("Executing compose test",true);

}
@Test
public void reply() {
	Reporter.log("Executing reply test",true);
}
@BeforeMethod
public void beforemethod() {
	Reporter.log("Running in beforemethod",true);
}
@AfterMethod
public void aftermethod() {
	Reporter.log("Running in aftermethod",true);
}
@BeforeTest
public void beforetest() {
	Reporter.log("Running in BeforeTest",true);
}
@AfterTest
public void aftertest() {
	Reporter.log("Running in AfterTest",true);
}
@BeforeSuite
public void beforesuite() {
	Reporter.log("Running in BeforeSuite",true);
}
@AfterSuite
public void aftersuite() {
	Reporter.log("Running in AfterSuite",true);
}
}
