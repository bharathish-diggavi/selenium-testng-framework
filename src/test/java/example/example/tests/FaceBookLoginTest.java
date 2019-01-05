package example.example.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import example.example.factory.PageinstancesFactory;
import example.example.pages.FacebookLoginPage;

/**
 * The Class FaceBookLoginTest.
 *
 * @author Bharathish
 */
@Test(testName = "Facebook login test", description = "Facebook login test")
public class FaceBookLoginTest extends BaseTest {

	@Test
	public void facebookLoginTest() {
		driver.get("https://www.facebook.com/");
		FacebookLoginPage facebookLoginPage = PageinstancesFactory.getInstance(FacebookLoginPage.class);
		facebookLoginPage.enterEmail("abc").enterPassword("abc").clickSignIn();
		Assert.assertTrue(false, "Login failed : Test failed");
	}
}
