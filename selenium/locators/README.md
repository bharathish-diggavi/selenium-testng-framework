---
description: Mechanism to find elements in a web page
---

# Locators

There are 7 ways which we can use to find an element or group of elements in a web page. And they are

1. Id
2. Name
3. Tag name
4. Link text
5. Partial link text
6. **CSS Selector**
7. **XPath**

### Id:

If an element has **`id`**  attribute then we can use it find the element.

```java
WebElement element = driver.findElement(By.id("id-value"));
```

### Name:

If an element has **`name`**  attribute then we can use it find the element.

```java
WebElement element = driver.findElement(By.name("name-value"));
```

### Tag name:

We can find an element using it's**`tagname` .**

```java
WebElement element = driver.findElement(By.tagName("a"));
```

### Link text:

If an element is having tag `a` , then we can identify it using the link text of it.

```java
WebElement element = driver.findElement(By.linkText("link-text-value"));
// For example in Goole search page we can find the gmail link element as
WebElement element = driver.findElement(By.linkText("Gmail"));
```

### Partial link text:

If an element is having tag `a` , then we can identify it using a portion of it's text.

```java
WebElement element = driver.findElement(
                     By.partialLinkText("partial-value-of-link-text"));
// For example in Goole search page we can find the gmail link element as
WebElement element = driver.findElement(By.partialLinkText("mail"));
```

{% hint style="info" %}
All the above mentioned locator mechanisms are straight forward.

But what if the element have any unique id, name or link text

Then the last two locators mechanisms help to locate the elements.

We'll be seeing them in the separate sections.
{% endhint %}

