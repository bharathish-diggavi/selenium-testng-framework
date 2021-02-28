---
description: Finding an element using xpath selector
---

# XPath Selector

XPath is custom way of locating elements by using tag name, attributes and styles.

General syntax for writing xpath is

```text
//<tag-name>[@<attribute-name> =' <attribute-value'>]
example:
//a[@id="my-link"]
```

### Finding by `<tag-name>`

This will match all the elements with that `tag-name` 

For example, below xpath selector matches all the link elements inside the page.

```java
WebElement element = driver.findElement(By.xpath("//a"]));
```

### Finding by `<class-name>`

This will match all the elements that have the given class name.

```java
WebElement element = driver.findElement(By.xpath("//div[@class = 'givenclassname']"]));
```

{% hint style="info" %}
Similarly all the attributes inside the node can be used for writing xpaths.

Below are some examples.
{% endhint %}

| Example | Description |
| :--- | :--- |
| `//div[@id='given-id']` | Selects all the div elements with has given Id |
| `//*[@class='given-class-name']` | Selects all the elements with has given class name |

### Navigation through elements

Lets say we have located an element using it's tag name and attributes in xpath, now if we want the child of it or grand child of it, we can navigate using `/` or `//` where,

1. `/` = immediate child
2. `//` = any child \(including immediate child\)

Below are some of the examples,

| Example | Description |
| :--- | :--- |
| `//div[@class='given-class-name']/a` | Find an element with tag a which is an immediate child of a div element which has class as given class name. |
| `//div[@id='given-id']/span[@class='given-class-name']` | Finds an element with tag span and class as 'given-class-name' which is child \(any child\) of a div element which has id as 'given-id' |
| `//span[@id='given-id']/..` | Finds the parent of span element which has id as 'given-id |

#### Below are the navigation that we can use

| Expression | Description |
| :--- | :--- |
| / | Selects from the root node |
| // | Selects nodes in the document from the current node that match the selection no matter where they are |
| . | Selects the current node |
| .. | Selects the parent of the current node |
| @ | Selects attributes |

### Writing xpaths with relationships

We can write xpath using relationships that an element has with other element. Like child, ancestor, parent, etc..,  
Below are some of the examples,

| Example | Description |
| :--- | :--- |
| `//span[@id='given-id']/parent::div` | Selects the div element whose child span has id as 'g |

{% hint style="info" %}
**Actually there is shortcut to find parent based on child's xpath... i.e., //\[.//\] if we consider the above example, //div\[./span\[@id='given-id'\]\]**

**Will give the same result**
{% endhint %}

#### Below are the list of relationships that we can use while writing xpath

| Relationship | Result |
| :--- | :--- |
| ancestor | Selects all ancestors \(parent, grandparent, etc.\) of the current node |
| ancestor-or-self | Selects all ancestors \(parent, grandparent, etc.\) of the current node and the current node itself |
| attribute | Selects all attributes of the current node |
| child | Selects all children of the current node |
| descendant | Selects all descendants \(children, grandchildren, etc.\) of the current node |
| descendant-or-self | Selects all descendants \(children, grandchildren, etc.\) of the current node and the current node itself |
| following | Selects everything in the document after the closing tag of the current node |
| following-sibling | Selects all siblings after the current node |
| namespace | Selects all namespace nodes of the current node |
| parent | Selects the parent of the current node |
| preceding | Selects all nodes that appear before the current node in the document, except ancestors, attribute nodes and namespace nodes |
| preceding-sibling | Selects all siblings before the current node |
| self | Selects the current node |

{% hint style="info" %}
The date here is referred from [W3Schools ](https://www.w3schools.com/xml/xpath_axes.asp)website.
{% endhint %}

{% hint style="info" %}
Some useful links to learn about writing xpaths

* [https://www.w3schools.com/xml/xpath\_syntax.asp](https://www.w3schools.com/xml/xpath_syntax.asp)
* [https://www.guru99.com/xpath-selenium.html](https://www.guru99.com/xpath-selenium.html)
{% endhint %}

