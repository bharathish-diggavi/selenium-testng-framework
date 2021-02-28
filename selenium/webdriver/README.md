---
description: WebDriver Interface
---

# WebDriver

WebDriver is an interface in selenium library which the object representation of **Web Browser.** Implementation of which is provided by different Browser types line Chrome, FireFox etc.,

```java
WebDriver driver = new ChromeDriver;
//or
WebDriver driver = new FireFoxDriver();
```

Now we can perform all the actions on the browser using this object.

Some of which are are.

| Modifier and Type | Method and Description |
| :--- | :--- |
| void | close\(\) |
|  | Close the current window, quitting the browser if it's the last window currently open. |
| WebElement | findElement\(By by\) |
|  | Find the first WebElement using the given method. |
| java.util.List&lt;WebElement&gt; | findElements\(By by\) |
|  | Find all elements within the current page using the given mechanism. |
| void | get\(java.lang.String url\) |
|  | Load a new web page in the current browser window. |
| java.lang.String | getCurrentUrl\(\) |
|  | Get a string representing the current URL that the browser is looking at. |
| java.lang.String | getPageSource\(\) |
|  | Get the source of the last loaded page. |
| java.lang.String | getTitle\(\) |
|  | The title of the current page. |
| java.lang.String | getWindowHandle\(\) |
|  | Return an opaque handle to this window that uniquely identifies it within this driver instance. |
| java.util.Set&lt;java.lang.String&gt; | getWindowHandles\(\) |
|  | Return a set of window handles which can be used to iterate over all open windows of this WebDriver instance by passing them to switchTo\(\).WebDriver.Options.window\(\) |
| WebDriver.Options | manage\(\) |
|  | Gets the Option interface |
| WebDriver.Navigation | navigate\(\) |
|  | An abstraction allowing the driver to access the browser's history and to navigate to a given URL. |
| void | quit\(\) |
|  | Quits this driver, closing every associated window. |
| WebDriver.TargetLocator | switchTo\(\) |
|  | Send future commands to a different frame or window. |

**These details are taken from Selenium Official Java Docs.**

