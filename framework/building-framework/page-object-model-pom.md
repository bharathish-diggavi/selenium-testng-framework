# Page Object Model \(POM\)

### Page Object Model \(POM\)

Page Object Model \(POM\) is a design pattern which instruct us to,

1. Treat each page in the our application as Java Objects.
2. Treat each element in the screen like link,input box, check box, button etc., as the member variables of the object. \(`WebElement(s)`\)
3. All the action that we are going to perform on those elements are methods of that object.

By doing so we can achieve much cleaner, modular, reusable and robust framework.

For example take the Google's home page. In this scenario,

1. The google home page becomes - **`GooglePage.java`**
2. Search input becomes - `private WebElement searchinput;`
3. Typing inside that text box will be like - `public void searchText(String key) {        searchinput.sendKeys(key + Keys.ENTER);  }`

```java
public class GooglePage {
	
	@FindBy(name = "q")
	private WebElement searchinput;

	public void searchText(String key) {
		searchinput.sendKeys(key + Keys.ENTER);
	}
}
```

Selenium library has some inbuilt features which we can leverage to achieve POM. One such example is shown in above code `@FindBy` annotation.

