package tesstcases;

import org.testng.Assert;
import org.testng.annotations.Test;
//import org.testng.asserts.SoftAssert;

public class RegTest {
     // SoftAssert softAssert = new SoftAssert();
	
	@Test
	public void doRegisterTest(){
		String expectedTitle = "xxxxxx";
		String actualTitle = "xxxxx";
		System.out.println("A");
		//Assert.assertEquals(actualTitle, expectedTitle);
		//softAssert.assertEquals(actualTitle, expectedTitle);
		//softAssert.assertEquals("a", "b");
		System.out.println("B");
		//Assert.assertTrue(2>3, "Error Message");
		
		//softAssert.assertAll();
	}
}
