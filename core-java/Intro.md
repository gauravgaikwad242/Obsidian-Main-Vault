-  Three Fundamental elements in java to code
	- class
	- interface
	- enum
		- we need Enum when we want to use universal constants in our project 

class - 90% interface=8-10 % enum= less than 2%

#syntax - set of rules we need to follow while writing code , or else we will get error
#SDLC - Software Developement Life Cycle
#devops - tools will make code more effective

- ACCESS MODIFIERS #accessModifiers
	1. public 
	2. private
	3. protected
	4. package-private (default)
	- for data security
	- #accessModifiers  provides access restrictions which will enhance the data security.
	- *NOTE: for java class we only need 2 #accessModifiers - 1. public 2. default *

- *java has around 50 keyword and all of them starts with lower letter*
- eg class

- #class
```java
/*
#accessModifiers class className {

}
*/
public class Demo {

}
```
- #interface
```java
public interface Demo {

}
```

- #enum
```java
public enum Days {

}
```

- #interview OOPS CONCEPTS
- 4 Super Powers in Java
- we have learn these in order
	1. Encapsulation
	2. Inheritance
	3. Polymorphism
	4. Abstraction : 
		- hiding implementation details for user and only showing necessary things
		- we can achieve abstraction in two ways
		- if we want to achieve #abstraction then only we need #interface 
		1.  f

- #class 
```
#accessModifiers #class cN {
variables;
methods;
create objects;
Blocks;
}
```

	- *NOTE: for java class we only need 2 #accessModifiers - 1. public 2. default *

```
public class ClassA {}
```

	- here the #accessModifiers  is default
	- never write default

```
class ClassB {}
```

- #method
- what is a java method ?
	- java method is a place where we will be  writing Business Logic.

- how many methods?
	- we can write any no. of methods in java class.

- syntax of a java method?
```
<accessModifier> <returnType> <methodName> () {
--------;
--------; method body/ funtionality /implementation
--------;
--------;
}
```

- Return Type:
	- for returning a value from a method we will be having 4 options
	1. void
		- method will not return anything 
	2. all 8 primitive datatypes
		- (int, byte, short, long, float, double, boolean, char )
	3. classes
	4. interfaces

eg. of java method
	- form method we can use all 4 #accessModifiers 
```
private void method1() {

}

//default
void method2() {

}
```