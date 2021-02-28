---
description: Why we need a framework ?
---

# Introduction

Now we are pretty much aware what selenium can do and how to do it. Even though that is enough to automate a single flow or a test case. But eventually when number of test cases increase, this code will become hard to maintain. Some of those maintenance issues are 

1. If we need any proof of the test case we need to explicitly write code for it and we need to do that in all the test cases that we've coded.
2. We can not run multiple of those test cases if we have written them in different classes.
3. Logging and reporting is hard to maintain in all of those classes. And etc.,



### What is a Framework?

Here is definition from Wikipedia.

> In computer programming, a software framework is an abstraction in which software providing generic functionality can be selectively changed by additional user-written code, thus providing application-specific software.  
> - Wikipedia

In our scenario most of the common functions that we use while writing an automation test case like,

1. The way we run them.
2. The way we assert the conditions.
3. The way we Log.
4. The way we Create a report, etc.,

Is common across all the test cases we are going to automate. Only the flow is going to change in these test cases. So we will include all this commonly used functions \(Boilerplate\) in our framework.

So essentially the framework that we are going to develop is not the exact automation code itself, in contrast it'll have all the necessary components to develop automation test cases. And the goal is to enable the user of this framework to create an automation test case with least or no boilerplate code. 

### Our automation Framework

To automate our test cases, we can either

1. Develop a framework from scratch or
2. Use an existing framework or,
3. By building on on top of existing framework\(s\) according to our needs  We can overcome above stated problems.

In this section we are following the 3rd approach.

