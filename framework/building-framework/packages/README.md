# Packages

Our framework will contain following packages inside **src/test/java** source folder. \(Since it's the testing code always recommended to write in src/test/java instead of src/main/java, even it makes sense to delete src/main/java\)

1. **context** - Will contain all the necessary classes which hold constants, global variables etc.,
2. **factory** - Will contain all the factory methods. Like creation of page objects.
3. **listeners** - Will contain all the TestNG listeners for logging, reporting and mailing etc.,
4. **pages** - Will contain all the Page Object classes.
5. **report** - Will contain reporting related code.
6. **tests** - Will contain our actual automation test cases.
7. **util** - Will contain all the utility classes and methods that will hep us to run, log, report our test cases.

Even create one more source folder **src/test/resources.** Which will be the location for all of our non java files.

1. **drivers** - For drivers that are required by selenium.
2. **config** - For all configuration and property files.
3. **suites** - For test suites.

Once we create all these packages, our project is going to look similar to.

![project structure with packages and folders](../../../.gitbook/assets/image%20%281%29.png)

We will go through packages one by one and create classes in them.

{% hint style="info" %}
Links to all the source files will be available, we'll be concentrating mainly on important methods in those classes.
{% endhint %}



