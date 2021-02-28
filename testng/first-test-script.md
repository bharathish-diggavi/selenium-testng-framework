---
description: Creating out first test script and understanding it
---

# First Test Script

## Creating First Test Script

1. Create a package in `src/test/java` called `com.practice` \(Can be anything\).
2. Create a class `FirstTest.java` like below.

```java
package com.practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTest {

	@Test
	public void helloworldTest() {
		String message = "Hello world!!";
		Assert.assertTrue(message.contains("Hello"));
	}
	
	@Test
	public void failingTestCase() {
		String message = "Hello world!!";
		Assert.assertTrue(message.contains("hello"));
	}
}
```

3. Run the test cases.  
`<right-click-class> -> Run As-> TestNG Test` This option should appear if you have installed TestNG plugin to eclipse.

4.  Console output  
Once we run the test, we should see something like this in the console

![Console Output](../.gitbook/assets/screenshot-from-2020-10-17-14-21-55.png)

{% hint style="info" %}
We intentionally failing the second test method.
{% endhint %}

## Understanding the `FirstTest`

* Our `FirstTest` class has two methods both annotated with `@Test` annotation. So in TestNG all the methods that are annotated with `@Test` annotation are test methods or test cases.
* `@Test` can be applied on class level also. In that case it'll consider all the public methods in the class as test methods.
* 
So we we run the test case using TestNG plugin, keep in mind that we are not the one who created instance of `FirstTest.java` and called `helloworldTest()` and `failingTestCase()` . TestNG did it. \(This is why we use testing frameworks like JUnit, TestNG etc.,\)

And what goes inside those test methods is entirely in our hand.

{% hint style="info" %}
 We can use both `org.junit.Assert` and  `org.testng.Assert`
{% endhint %}

