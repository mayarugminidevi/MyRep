package tesstcases;

import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
//import org.testng.asserts.SoftAssert;

public class ApplicaionTest {
	//SoftAssert softAssert;
	@BeforeTest
	public void beforeTest(){
		System.out.println("Before executing testcase");
	}
	@AfterTest
	public void AfterTest(){
		System.out.println("After executing testcase");
	}
	@BeforeSuite
	public void beforeSuite(){
		System.out.println("Before Suite");
	}
	
	@AfterSuite
	public void afterSuite(){
		System.out.println("After Suite");
	}
	
	@BeforeMethod
	public void beforeMethod(){
		System.out.println("Before executing method");
	}
	@AfterMethod
	public void afterMethod(){
	System.out.println("After executing Method");
	}
	@Test(priority=1)
	public void doLogin(){
		//throw new SkipException("Any Reason");
		// softAssert = new SoftAssert();
		// softAssert.fail("Error Message");
		System.out.println("Login Test Execution");
		//softAssert.assertAll();
	}
	
	@Test(priority=2, dependsOnMethods={"doLogin"})
	public void doPasswordChange(){
		//softAssert = new SoftAssert();
		//softAssert.assertEquals("a", "b");
		System.out.println("Changing password");
		//softAssert.assertAll();
	}
	
	@Test(priority=3,dependsOnMethods={"doLogin"})
	public void logOut(){
		System.out.println("Logging out");
	}
	

}
