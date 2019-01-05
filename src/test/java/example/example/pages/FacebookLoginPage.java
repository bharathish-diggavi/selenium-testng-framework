package example.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * The Class represents FacebookLoginPage.
 *
 * @author Bharathish
 */
public class FacebookLoginPage extends BasePage {

	/** The email input. */
	@FindBy(id = "email")
	private WebElement emailInput;

	/** The pass. */
	@FindBy(id = "pass")
	private WebElement pass;

	/**
	 * Instantiates a new facebook login page.
	 *
	 * @param driver the driver
	 */
	public FacebookLoginPage(WebDriver driver) {
		super(driver);
	}

	/**
	 * Enter email.
	 *
	 * @param email the email
	 * @return the facebook login page
	 */
	public FacebookLoginPage enterEmail(String email) {
		emailInput.sendKeys(email);
		return this;
	}

	/**
	 * Enter password.
	 *
	 * @param password the password
	 * @return the facebook login page
	 */
	public FacebookLoginPage enterPassword(String password) {
		pass.sendKeys(password);
		return this;
	}

	/**
	 * Click sign in.
	 */
	public void clickSignIn() {
		pass.submit();
	}
}
