---
description: Methods of WebElement
---

# WebElement Methods

The list of methods 

| Modifier and Type | Method and Description |
| :--- | :--- |
| void | clear\(\)  If this element is a text entry element, this will clear the value. |
|  |  |
| void | click\(\)  Click this element. |
|  |  |
| WebElement | findElement\(By by\)  Find the first WebElement using the given method. |
|  |  |
| java.util.List&lt;WebElement&gt; | findElements\(By by\)  Find all elements within the current context using the given mechanism. |
|  |  |
| java.lang.String | getAttribute\(java.lang.String name\)  Get the value of the given attribute of the element. |
|  |  |
| java.lang.String | getCssValue\(java.lang.String propertyName\)  Get the value of a given CSS property. |
|  |  |
| Point | getLocation\(\)  Where on the page is the top left-hand corner of the rendered element? |
|  |  |
| Rectangle | getRect\(\)  |
| Dimension | getSize\(\)  What is the width and height of the rendered element? |
|  |  |
| java.lang.String | getTagName\(\)  Get the tag name of this element. |
|  |  |
| java.lang.String | getText\(\)  Get the visible text of the element |
|  |  |
| boolean | isDisplayed\(\)  Is this element displayed or not? This method avoids the problem of having to parse an element's "style" attribute. |
|  |  |
| boolean | isEnabled\(\)  Is the element currently enabled or not? This will generally return true for everything but disabled input elements. |
|  |  |
| boolean | isSelected\(\)  Determine whether or not this element is selected or not. |
|  |  |
| void | sendKeys\(java.lang.CharSequence... keysToSend\)  Use this method to simulate typing into an element, which may set its value. |
|  |  |
| void | submit\(\)  If this current element is a form, or an element within a form, then this will be submitted to the remote server. |

