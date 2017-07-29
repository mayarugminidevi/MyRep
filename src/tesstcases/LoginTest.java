package tesstcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest {
	@AfterMethod
	public void afterMethod(){
		System.out.println("After Method");
	}
	
	@Test(dataProvider="getData")
	public void doLoginTest(String username,String password,String expresult, String browser){
		System.out.println(username+"----"+password);
	}
	@DataProvider(parallel=true)
	public Object[][] getData(){
		Object[][] data= new Object[3][4];
		
		data[0][0]= "U1";
		data[0][1]= "P1";
		data[0][2]= "Pass";
		data[0][3]= "Mozilla";
		
		data[1][0]= "U2";
		data[1][1]= "P2";
		data[1][2]= "Pass";
		data[1][3]= "Chrome";
		
		data[2][0]= "U3";
		data[2][1]= "P3";
		data[2][2]= "Fail";
		data[2][3]= "IE";
		return data;
	}

}
