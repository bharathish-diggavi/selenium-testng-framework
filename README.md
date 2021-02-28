selenium-testng-framework
---

---
A sample framework based on Page Object Model, Selenium, TestNG using Java.

This framework is based in **Page Object Model (POM).**

The framework uses:

1. Java
2. Selenium
3. TestNG
4. ExtentReport
5. Log4j
6. SimpleJavaMail

Steps to create test cases:
----
Let's say we want to automate Google search test.  

1.Create GoogleSearchPage in **pages** package.  
  A page class typically should contain all the elements that are present on the page and corresponding action methods.
  
  ```
  public class GooglePage extends BasePage {
	
	@FindBy(name = "q")
	private WebElement searchinput;

	public GooglePage(WebDriver driver) {
		super(driver);
	}

	public void searchText(String key) {
		searchinput.sendKeys(key + Keys.ENTER);
	}

}
```
2.Create the test class which class the methods of GoogleSearchPage

```
@Test(testName = "Google search test", description = "Test description")
public class GoogleSearchTest extends BaseTest {

	@Test
	public void googleSearchTest() {
		driver.get("https://www.google.co.in/");
		GooglePage googlePage = PageinstancesFactory.getInstance(GooglePage.class);
		googlePage.searchText("abc");
		Assert.assertTrue(driver.getTitle().contains("abc"), "Title doesn't contain abc : Test Failed");
	}
}
```
3.Add the test class in testng.xml file under the folder `src/test/resources/suites/`

```
<suite name="Suite">
	<listeners></listeners>
	<test thread-count="5" name="Test" parallel="classes">
		<classes>
			<class name="example.example.tests.GoogleSearchTest" />
```
4.Execute the test cases by maven command `mvn clean test`

---

Reproting
---
The framework gives report in three ways,

1. Log - In file `logfile.log`.
2. A html report - Which is generated using extent reports, under the folder `ExtentReports`.
3. A mail report - For which the toggle `mail.sendmail` in `test.properties` should be set `true`. And all the properties such as `smtp host, port, proxy details, etc.,` should be provided correctly.

---

Key Points:
---

1. The class `WebDriverContext` is responsible for maintaining the same WebDriver instance throughout the test. So whenever you require a webdriver instance which has been using for current test (In current thread) always call `WebDriverContext.getDriver()`.
2. Always use `PageinstancesFactory.getInstance(type)` to get the instance of particular Page Object. (Of course you can use `new` but it's better use a single approach across the framework.

---

>For any query or suggestions please do comment or mail @ diggavibharathish@gmail.com 
