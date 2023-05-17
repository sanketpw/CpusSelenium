package academicui;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class SKIPTHETEST {
	Boolean datasetup = true;
	
	@Test(priority=1,groups="regression")
	public void atest1R()
{
	System.out.println("skipping this test");
}

@Test
	public void atest2R()
		{
		System.out.println("LOG OUT FROM APPLICATION-AfterTest");
		}

@Test
	public void btest1()
	{
		System.out.println("Database connection ON-BeforeMethod");
	}

@Test(priority=1,groups="bvt")
	public void btest2()
	{
		System.out.println("Database connection OFF-AfterMethod");
	}
	
@Test
		public void btest3()
		{
			System.out.println("test 1 log in 1 is successful");
		}

@Test
		public void btest4()
	{
		System.out.println("TEST 2 log in 2 is successful");
	

if (datasetup==true)
{
	System.out.println("execute the test");

}
else
	{
	System.out.println("skip the test");
	throw
	}

	}
}

