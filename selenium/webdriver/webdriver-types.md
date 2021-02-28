---
description: Different types of WeDriver implementations and their set up
---

# WebDriver Types

As discussed WebDriver is an interface and there are several implementations of the same in Selenium. Selenium supports most of the web browsers and provides implementations for them. Some of the popular ones are

* Chrome
* FireFox
* Safari
* etc.,

**Example:**

```java
WebDriver driver = new ChromeDriver();
//or
WebDriver driver = new FirefoxDriver();
//or
WebDriver driver = new SafariDriver();
```

{% hint style="info" %}
In order to make these implementations work we need one more component which is called **webdriver** executable file. \(In short these are the binary files which help in converting java code to machine understandable instructions in order to make browser work\).

Each of WebDriver implementations have their own binaries depending on the operating system.[Check here](https://www.seleniumhq.org/download/)

One of two ways that selenium can use these binaries are,

1. We need to download these driver binaries and keep them in the root of the project. Or, 
2. Before creating the instance of web driver we need to set the path for the binaries.
{% endhint %}

**Example:**

```java
//For Chrome browser
System.setProperty("webdriver.chrome.driver","/path-to-driver.exe");
WebDriver driver = new ChromeDriver();

//For Firefox browser
System.setProperty("webdriver.gecko.driver","/path-to-driver.exe");
WebDriver driver = new FirefoxDriver();
```

If we don't keep the binaries in root or set the path selenium is going throw an exception saying webdriver path has not been set.

```java
Exception in thread "main" java.lang.IllegalStateException: The path to the driver executable must be set by the webdriver.chrome.driver system property; for more information, see https://github.com/SeleniumHQ/selenium/wiki/ChromeDriver. The latest version can be downloaded from http://chromedriver.storage.googleapis.com/index.html
```

