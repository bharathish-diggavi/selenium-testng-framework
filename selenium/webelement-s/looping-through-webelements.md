---
description: Looping through list of web elements
---

# Looping Through WebElements

As discussed sometimes list of web elements have advantages over identifying a single element.

List of web elements is essentially a java.util.List of WebElement interface, i.e., we can leverage all that we can do on a normal java list, like  
Filtering, sorting, getting element at desired index, etc.,

### Examples:

#### Getting element at a desired index

```java
WebElement desiredElement = elements.get(2);
// Note : Index starts from zero.
```



#### Filtering only visible elements in list of elements:

```java
List<WebElement> elements = driver.
					  findElements(By.id("common-id-of-the-elelemnts"));
		
for(WebElement element : elements) {
	if(!element.isDisplayed()) {
		elements.remove(element);
	}
}

//java8 way
elements.stream().
			filter(element -> element.isDisplayed()).
			collect(Collectors.toList());
```

#### Filtering only elements which contain certain text :

```java
List<WebElement> elements = driver.
					  findElements(By.id("common-id-of-the-elelemnts"));
		
for(WebElement element : elements) {
	if(element.getText().contains("desiredtext")) {
		elements.remove(element);
	}
}

//java8 way
elements.stream().filter(element -> 
			element.getText().
			contains("desiredtext")).collect(Collectors.toList());
```

