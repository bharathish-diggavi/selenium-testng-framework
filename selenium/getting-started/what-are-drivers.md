---
description: 'chromedriver.exe, gekodriver.exe etc.,'
---

# What are drivers

As mentioned in the set up. We have downloaded and added the **chromedriver** to our project folder.

These drivers are the interfaces between our Java code and the Browser application \(in OS level\). Meaning, whatever the code we are writing, those are converted to instructions to the browser based on the driver we provide. Similarly every browser has its own driver version. Sometimes it depends on the version of the browser also. So before we start automating any browser we need to have correct driver version in place.

For example if we think to use FireFox as the browser the we have to download [**geckodriver**](https://github.com/mozilla/geckodriver/releases)**.**

Then in over code, instead of

```java
WebDriver driver = new ChromeDriver();
```

We would say,

```java
WebDriver driver = new FireFoxDriver();
```

That's it, now our script will run in Firefox.

