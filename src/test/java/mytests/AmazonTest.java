package mytests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AmazonTest extends BaseTest{

	@Test(priority = 1)
	public void titleTest() {
		Assert.assertEquals(driver.getTitle(), "amazon.com");
	}
	
}
