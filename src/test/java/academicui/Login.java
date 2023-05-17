package academicui;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login 
{	
		@BeforeTest
			public void LoginToApplication()
		{
			System.out.println("LOG IN TO APPLICATION-BEFORE TEST");
		}
 
		@AfterTest
			public void LogoutFromApplication()
				{
				System.out.println("LOG OUT FROM APPLICATION-AfterTest");
				}
	
		@BeforeMethod
			public void ConnectTodb()
			{
				System.out.println("Database connection ON-BeforeMethod");
			}
		
		@AfterMethod
			public void DissconnectTodb()
			{
				System.out.println("Database connection OFF-AfterMethod");
			}
			
		@Test(priority=1, description="test1")
				public void LoginTest()
				{
					System.out.println("test 1 log in 1 is successful");
				}
 
		@Test(priority=1,description="test2")
				public void LogOut()
			{
				System.out.println("TEST 2 log in 2 is successful");
			}
}