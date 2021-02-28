---
description: WebElement Interface
---

# WebElement\(s\)

WebElement is an interface in selenium which will a representation of any object we see on a web page. For example button, input box, link, text, image, etc.,

Since it an interface and we'll not be able to instantiate it. But we can get the WebElement object from the [WebDriver](../webdriver/) driver that we already have.

```java
WebElement element = driver.
                     findElement(By.id("id-of-the-elelemnt"));
```

{% hint style="info" %}
### By class

**By** is one more important to class which provides or describes the mechanism from which we are identifying a particular element in a web page. It has all the locator mechanism that we discussed in [Locators](../locators/).

**Example:**

```java
WebElement element = driver.
                     findElement(By.id("id-of-the-elelemnt"));
                     
WebElement element = driver.
                     findElement(By.className("className-of-the-elelemnt"));

WebElement element = driver.
                     findElement(By.tagName("tagName-of-the-elelemnt"));

WebElement element = driver.
                     findElement(By.xpath("xpath-of-the-elelemnt"));
                     
WebElement element = driver.
                     findElement(By.cssSelector("css-of-the-elelemnt"));
```

Etc.,
{% endhint %}

Now the **element** is the object representation of the element in the web page.

Once we find the WebElement, we can call methods corresponding to the actions the we would perform on an element in a web page. Like click, enter text, copy text, drag, drop etc., [More](webelement-methods.md)

## WebElements

Many a times we come across situations we want to interact with similar kind of elements in a single page which share same locators, or there will be multiple elements matched for the locator that we have written and we wanna filter it, in any case finding WebElements instead of finding a single web element will be handy. **WebElements is no class**.

### Way to find WebElemets:

```java
List<WebElement> element = driver.
            findElements(By.id("common-id-of-the-elelemnts"));
```

Finding a list of web elements has lots of benefits than finding a single element in many situations, Some of them are  
1. Finding all options of a select block.  
2. Finding all elements of ordered or un-ordered list. Etc.,

And there are many ways we can leverage list of [WebElements](looping-through-webelements.md)

