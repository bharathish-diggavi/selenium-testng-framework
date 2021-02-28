# Selenium-Related

## What is selenium?

Selenium is a library, which has necessary classes and methods to automate user actions on the browser. Like navigating, clicking, entering form etc.,

##  **What are the different types of locators in Selenium?**

In Selenium locators are the way to identify elements inside a web page.

| **Locator** | Example |
| :--- | :--- |
| Id | `WebElement element = driver.findElement(By.id("id-value"));` |
| Name | `WebElement element = driver.findElement(By.name("name-value"));` |
| Tag name | `WebElement element = driver.findElement(By.tagName("a"));` |
| Link text | `WebElement element = driver.findElement(By.linkText("link-text-value"));` |
| Partial link text | `WebElement element = driver.findElement(By.partialLinkText("partial-value-of-link-text"));` |
| CSS selector | `WebElement element = driver.findElement(By.cssSelector("input[type='submit']"]));` |
| XPath | `WebElement element = driver.findElement(By.xpath("//input[type=submit]"));` |

##  **When should I use Selenium Grid?**

Selenium Grid is used to run the same scripts in multiple environments like different OS, Browsers etc.,

## What are Implicit and Explicit Waits?

#### Implicit wait: 

As per selenium documentation "**An implicit wait is to tell WebDriver to poll the DOM for a certain amount of time when trying to find an element or elements if they are not immediately available**".

We can consider it as default wait during the script execution, and **it is defined on the WebDriver object.**

Defining implicit wait:

```java
WebDriver driver = new ChromeDriver();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
```

#### **Explicit Wait:**

Explicit wait is halting the execution for certain amount of time while we are waiting for a condition. Some commonly encountered conditions are defined in **`ExpectedConditions`** class of selenium library.

With the help of ExplicitWait and ExpectedConditions we can achive waiting for specific conditions.

There are 2 ways we can use explicit wait we can use in our code

**`WebDriverWait`**

```java
WebDriverWait wait = new WebDriverWait(driver, 10);
wait.until(ExpectedConditions
                .presenceOfElementLocated(By.id("myElement")));
```

**`FluentWait:`** Fluent wait is bit advanced and gives other features where we can specify polling frequency, ignore exception etc.,

```java
FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
             .withTimeout(Duration.of(10, ChronoUnit.SECONDS))
			 .pollingEvery(Duration.of(2, ChronoUnit.SECONDS))
			 .ignoring(NoSuchElementException.class);
wait.until(ExpectedConditions
             .presenceOfElementLocated(By.id("myElement")));
```

\`\`

