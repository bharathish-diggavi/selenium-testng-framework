---
description: Finding an element using css selector
---

# CSS Selectors

Basically `css` is the combination of attributes that will identify an element or group of elements.

### Finding by `<tag-name>`

This will match all the elements with that `tag-name` 

For example, css selector a matches all the link elements inside the page.

```java
WebElement element = driver.findElement(By.cssSelector("a"]));
```

### Id selector : `#id-value`

If we want to find an element using it's id, we can write css selector like

```java
WebElement element = driver.findElement(By.cssSelector("#myid"]));
```

![](../../.gitbook/assets/image%20%283%29.png)

Here we can find the `section` with css selector using id attributes as

```java
WebElement element = driver.findElement(By.cssSelector("#about"]));
```

### Class selector : `.class-value`

If we want to find an element using it's id, we can write css selector like

```java
WebElement element = driver.findElement(By.cssSelector(".class-value"]));
```

if we want to find element which has multiple class attributes, then we can combine the classes together with `.` 

![](../../.gitbook/assets/image%20%283%29.png)

Here we can find the `ul` with css selector using class attributes as

```java
WebElement element = driver.findElement(By.cssSelector(".list-group.list-group-flush"]));
```



### Selector using any attribute: `tag-name[attribute-name = 'attribute-value']` 

If the element that we want to locate is not having either of `class` or `id` attributes and having other attributes like `type, data-target, href` etc., then we can make use of them to locate the elements.

For example

```java
WebElement element = driver.findElement(By.cssSelector("input[type='submit']"));
WebElement element = driver.findElement(By.cssSelector
                                        ("a[href='https://www.google.co.in/']"));
```

{% hint style="info" %}
This is most common and useful syntax, we can locate any element in the page using this syntax by taking any of it's attributes
{% endhint %}

### Immediate child selector: `>` 

The `>` selects the immediate child of the element before the symbol.

For example:

![](../../.gitbook/assets/image%20%283%29.png)

In the above section, if I want to find the list element `li` which has none of the attributes inside `ul` unordered list then we can write css selector like

```java
WebElement element = driver.findElement(By.cssSelector(".list-group>li"));
// In this .list-group will find the ul
// Then >li matches both li elements below that ul
```

### Any child selector: `blank-space` 

The `blank-space` selects the immediate child of the element before the symbol.

For example:

![](../../.gitbook/assets/image%20%283%29.png)

In the above section, if I want to find the list element `li` which has none of the attributes inside `section` then we can write css selector like

```java
WebElement element = driver.findElement(By.cssSelector("#about li");
// In this #about will find the section
// Followed bya blank space li matches both li elements below that ul
```

### nth-child selector: `:nth-child()` 

When a written css is locating more than one element, and if want to select an element based on it's position the we can use

![](../../.gitbook/assets/image%20%283%29.png)

In the above section, if I want to find the first list element `li` which has none of the attributes inside `ul` unordered list then we can write css selector like

```java
WebElement element = driver.findElement(By.cssSelector(".list-group>li:nth-child(1)"));
// In this .list-group will find the ul
// Then >li matches both li elements below that ul
//nth-child(1) matched the first li element.
```

More about `nth-child()` can be found [here](https://developer.mozilla.org/en-US/docs/Web/CSS/:nth-child)

