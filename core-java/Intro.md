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
	- #accessModifiers  *provides access restrictions which will enhance the data security.*
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
	- for returning a value from a method we will be having `4 options`
	1. void
		- method will not return anything 
	2. all 8 primitive datatypes
		- (int, byte, short, long, float, double, boolean, char )
	3. classes
	4. interfaces

eg. of java method
	- form method we can use all 4 #accessModifiers 
	- we can tell this is a method because it has #returnType 
```java
private void method1() {

}

//default
void method2() {

}
```

- the data with double qoutes "" is #String 
	- #String contains set of characters such as alpahbets or numbers or symbols

- when a method will be executed?
	- a java method will be executed only when we are calling it.
- How to call a java method?
	- we need to call a java method with the help of its *`RESPECTIVE`* CLASS OBJECT.

- how to create a Class Object?
	- inorder to create a class object we need to write `new` keywork and initialize that object with the help of a #constructor .( #constructor  name should be same as class Name)
- `new` keywork will always used to create class object.
	- `new` to create object next to `initialize` the object with Constructor
	1. ClassA aobj = new ClassA(); //classA object
	2. ClassA() = is #constructor 
	3. first create with `new` then `initialize` with #constructor 
- #question what is difference between create and initialize the object?
- *there is a method which can be executed even without calling it, it is #main method.*

- *NOTE: if we want to see the output of the java program we need to perform tow tasks.*
	- compilation
	- runnning