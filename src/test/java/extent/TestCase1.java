package extent;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import extreports.base;

public class TestCase1 extends base {
	WebDriver driver;
	
	@Test
	public void testPageTitle() {
		driver = initializeBrowser();
		driver.get("http://hourglass.surge.sh/");
		String result = driver.getTitle();
		Assert.assertEquals(result, "React App", "String mismatch");
		driver.close();
	}
}