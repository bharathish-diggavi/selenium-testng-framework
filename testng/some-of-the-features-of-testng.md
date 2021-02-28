# Some of the features of TestNG

## Some of the features of TestNG

### 1. Ability to enable or disable a test method:

We can manually set d**i**sable a paricular test method or all the test methods in a class by providing a parameter to `@Test` annotation

**Example:**

{% tabs %}
{% tab title="Ignore all test case in a class" %}
```java
//To disable all test methods in a class
@Ignore
public class FirstTest { ...
```
{% endtab %}

{% tab title="Ignore a particular test method" %}
```java
@Test(enabled = false)
	public void ignoredTestCase(String name) { ...
```
{% endtab %}
{% endtabs %}



