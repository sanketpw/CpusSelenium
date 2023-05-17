package Title;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class verifytitletest {

	@Test
		public void titleTest()
		{
			
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
			driver.get("https://rcpituat.mastersofterp.in/");
			driver.manage().window().maximize();
			String expectedtitle  =	"R. C. Patel Institute of Technology";
			String actualtitle = driver.getTitle();
			Assert.assertEquals(actualtitle, expectedtitle);
			driver.close();
		}
}
