---
description: Methods inside WebDriver
---

# WebDriver Methods

## WebDriver methods explained:

Now we know WebDriver object is a java object representation of the browser, we can use methods inside it and interact with our web browser.

### get\(\)

1. This is the method that we user to open a URL in the browser.
2. This method accept a string parameter which will be the URL the we want to open
3. URL should be well structured \(meaning with the protocol either http:// or https://\)

**Example:**

```java
driver.get("https://www.google.co.in/");
```

### getCurrentUrl\(\)

1. This method return the current URL that is open in the browser as String.

**Example:**  [**here**](https://github.com/bharathish-diggavi/selenium-getting-started/blob/master/src/getting/started/GetCurrentUrlExample.java)\*\*\*\*

```java
String currentUrl = driver.getCurrentUrl();
```

### getTitle\(\)

1. This method returns the title of the current page that is opened in the browser.
2. This will be the value of `<title>` tag inside the `<head>` section of the current page source.

**Example:** [**here**](https://github.com/bharathish-diggavi/selenium-getting-started/blob/master/src/getting/started/GetTitleExample.java)\*\*\*\*

```java
String title = driver.getTitle();
```

### getPageSource\(\)

1. This method with return the whole html of the page as String.

**Example:** [**here**](https://github.com/bharathish-diggavi/selenium-getting-started/blob/master/src/getting/started/GetPageSourceExample.java)\*\*\*\*

```java
String source = driver.getPageSource();
```

### **navigate\(\)**

1. This method helps navigating in the browser based on it's history. Like forward, back, refresh, navigating to some URL etc.,\)

**Example:** [**here**](https://github.com/bharathish-diggavi/selenium-getting-started/blob/master/src/getting/started/NavigateExample.java)\*\*\*\*

```java
driver.navigate().back();
driver.navigate().forward();
driver.navigate().refresh();
driver.navigate().to("https://www.facebook.com/");
```

### **close\(\)**

1. This method closes the main window but it'll not close other windows.

**Example:** [**here**](https://github.com/bharathish-diggavi/selenium-getting-started/blob/master/src/getting/started/CloseExample.java)\*\*\*\*

```java
driver.close();
```

### **quit\(\)**

1. This method closes all open windows.

**Example:** [**here**](https://github.com/bharathish-diggavi/selenium-getting-started/blob/master/src/getting/started/QuitExample.java)\*\*\*\*

```java
driver.quit();
```

### findElement\(By by\)

1. This method finds the particular element in the page which matches the given locator mechanism mention in`By` .
2. If the specified locator mechanism is matching more than one element then **Selenium will always selects the first one to appear in the page source.**

```java
WebElement element = driver.findElement(By.name("q"));
WebElement element = driver.findElement(By.id("submit-button"));
```

### findElements\(By by\)

1. This method finds the list of all elements in the page which matches the given locator mechanism mention in`By` .

```java
List<WebElement> elements = driver.findElements(By.className("q"));
List<WebElement> elements = driver.findElement(By.tagName("a"));
```



{% hint style="info" %}
**By** is a class in selenium library which has static methods with all the locator mechanisms.

Example: By.id, By.name, By.cssSelector etc.,
{% endhint %}

To know more about locators  ⤵ 

{% page-ref page="../locators/" %}

