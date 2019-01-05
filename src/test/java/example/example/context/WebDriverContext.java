package example.example.context;

import org.openqa.selenium.WebDriver;

/**
 * The Class is responsible in maintaining single instance of webdriver in any given thread.
 *
 * @author Bharathish
 */
public class WebDriverContext {
	
	/** The driverinstance. */
	private static InheritableThreadLocal<WebDriver> driverinstance = new InheritableThreadLocal<>();

	/**
	 * Gets the driver.
	 *
	 * @return the driver
	 */
	public static WebDriver getDriver() {
		if (driverinstance.get() == null)
			throw new IllegalStateException(
					"WebDriver has not been set, Please set WebDriver instance by WebDriverContext.setDriver...");
		else
			return driverinstance.get();
	}

	/**
	 * Sets the driver.
	 *
	 * @param driver the new driver
	 */
	public static void setDriver(WebDriver driver) {
		driverinstance.set(driver);
	}

	/**
	 * Removes the driver.
	 */
	public static void removeDriver() {
		driverinstance.remove();
	}
}
