---
description: '@Test Annotation'
---

# @Test

## `@Test` :

As discussed before `@Test` annotation can be applied both on class level and method level.

{% hint style="warning" %}
**When applied on class level, all public methods of the class are considered as test methods. If we wish to exclude some of the methods then either we can make methods private or we have annotate with `@Test(enabled = false)` .**
{% endhint %}

**Wen applied on method level, that method will be considered as test method.**

### **Parameters of `@Test` :**

{% hint style="info" %}
Following data is taken from [https://testng.org/doc/documentation-main.html\#annotations](https://testng.org/doc/documentation-main.html#annotations)
{% endhint %}

| **Parameter** | Description |
| :--- | :--- |
| alwaysRun | If set to true, this test method will always be run even if it depends on a method that failed. |
| dataProvider | The name of the data provider for this test method. |
| dataProviderClass | The class where to look for the data provider. If not specified, the data provider will be looked on the class of the current test method or one of its base classes. If this attribute is specified, the data provider method needs to be static on the specified class. |
| dependsOnGroups | The list of groups this method depends on. |
| dependsOnMethods | The list of methods this method depends on. |
| description | The description for this method. |
| enabled | Whether methods on this class/method are enabled. |
| expectedExceptions | The list of exceptions that a test method is expected to throw. If no exception or a different than one on this list is thrown, this test will be marked a failure. |
| groups | The list of groups this class/method belongs to. |
| invocationCount | The number of times this method should be invoked. |
| invocationTimeOut | The maximum number of milliseconds this test should take for the cumulated time of all the invocationcounts. This attribute will be ignored if invocationCount is not specified. |
| priority | The priority for this test method. Lower priorities will be scheduled first. |
| successPercentage | The percentage of success expected from this method |
| singleThreaded | If set to true, all the methods on this test class are guaranteed to run in the same thread, even if the tests are currently being run with parallel="methods". This attribute can only be used at the class level and it will be ignored if used at the method level. Note: this attribute used to be called sequential \(now deprecated\). |
| timeOut | The maximum number of milliseconds this test should take. |
| threadPoolSize | The size of the thread pool for this method. The method will be invoked from multiple threads as specified by invocationCount. Note: this attribute is ignored if invocationCount is not specified |

### `groups` 

This parameter specifies the group name or group names that TestNG belongs to. This can be used in bifurcating test cases based on many categories like smoke, regression or positive, negative or any specific section of the application like login flows, checkout flows etc.,

Example:

```java
@Test(groups = {"smoke", "regression"})
	public void loginTest() {
		enterUsername();
		enterPassword();
		performSignIn();
		verifySuccessfulLogin();
	}
```

### **`dependsOnMethods`** 

This parameter specifies after which test methods the current test method should run. If status any one of those methods is fail this test will not execute.

Example

```java
//Try running this test case by uncommenting Asser.fail()

public class DependsOnMethodExample {

	@Test
	public void test1() {
		System.out.println("Test1");
		System.out.println("This doesn't dependent on any test");
//		Assert.fail();
	}

	@Test(dependsOnMethods = { "test1" })
	public void test2() {
		System.out.println("Test2");
		System.out.println("This is dependent on test1");
//		Assert.fail();
	}

	@Test(dependsOnMethods = { "test2" })
	public void test3() {
		System.out.println("Test3");
		System.out.println("This is dependent on test2");
	}
}
```

### `alwaysRun` ****

If set to true, the test method will run even if the depending methods, or groups fail.

