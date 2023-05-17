package academicui;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


@Test(groups="user registration")
public class Grpoudemotest {
	
	@Test(priority=1,groups="regression")
	public void atest1R()
{
	System.out.println("LOG IN TO APPLICATION-BEFORE TEST");
	
}

@Test(priority=2,groups="regression")
	public void atest2R()
		{
		System.out.println("LOG OUT FROM APPLICATION-AfterTest");
		}

@Test(priority=1,groups="bvt")
	public void btest1()
	{
		System.out.println("Database connection ON-BeforeMethod");
	}

@Test(priority=1,groups="bvt")
	public void btest2()
	{
		System.out.println("Database connection OFF-AfterMethod");
	}
	
@Test(priority=2,groups="bvt")
		public void btest3()
		{
			System.out.println("test 1 log in 1 is successful");
		}

@Test(priority=3,groups="regression")
		public void btest4()
	{
		System.out.println("TEST 2 log in 2 is successful");
	}
}

