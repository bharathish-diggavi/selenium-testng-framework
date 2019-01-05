package example.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * The Class BasePage every Page should extend this class.
 *
 * @author Bharathish
 */
public class BasePage {

	/** The driver. */
	protected WebDriver driver;

	/**
	 * Instantiates a new base page.
	 *
	 * @param driver the driver
	 */
	public BasePage(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
}
