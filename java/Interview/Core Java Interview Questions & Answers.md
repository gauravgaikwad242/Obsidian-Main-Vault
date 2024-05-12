#javatechie 
[YouTube](https://youtu.be/FFfJeb8Ec6Y?si=2E7RGTtmlEcw54yO)

1. What is the pillar of oops concepts ? 
	1. Encapsulation 
		1. binding or wrapping up of data into single unit
		2. [[41.1 Encapsulation]]
	2. Inheritance 
		1. reuse all property of parent 
		2. inheritance is the process of aquiring properties of one class into another class, we need extends or implements 
		3. [[42.0 Inheritance]]
	3. Polymorphism 
		1. poly means single with mulitple implementation 
		2. overriding
			1. [[45 Method Overriding]]
		3. overloading
			1. same method signature but the arguments is different 
			2. [[44.0 Polymorphism]]
		4. [[44.0 Polymorphism]]
	4. Abstraction 
		1. [[46.0 Abstraction]]

2. <mark style="background: #FF5582A6;">for overriding can we return different datatype in child class</mark> ?
	1. yes if in parent class we are returning Parent class from a method then in child class we can return child class and it is still valid overriding
3. Explain Exception hierarchy in Inheritance. 
	1. if parent method is throwing exception should child throw exception ? 
		1. no it is optional 
	2. but if child is throwing then parent must throw 

4. parent child override scenario.
```java 
        Automobile au1 = new Automobile();
        au1.move(); //parent 
        Automobile au2 = new Car();
        au2.move(); //if overriden then child
				    // if not then parent i.e. Automobile 
        Car car = new Car();
        car.move(); //child 
```

5. can we override static and private method ? 
	1. no we cannot 
	2. if we override it is called method hiding 
		1. if we called static overridden method with child object but parent reference then it will call parent method 
	3. for private we cannot inherit hence we cannot override 
6. diff between java 7 and java 8 Interface ? 
	1. java 7 - only abstract method 
	2. java 8 - abstract, static, default 
		1. we dont have to mandatorily override the default method
		2. if some method is common to all interfaces then we can static method in interfacae  
7. diff between final, finalize, finally ? 
	1. final : keyword 
	2. finalize : method 
	3. finally : block 
8. what is equal and hashcode method and its contract ? 
	1. Hashcode : uid for object 
	2. equals : compares two objects but doesnt compare hashcode of the object.
9. what is exception and its hierarchy ? 
	1. ![[Pasted image 20240511191557.png]]
10. why checked exception also called as compile time exception? is it occurs in compile time ? 
	1. no, it happens at runtime 
	2. but we have to handle it before compiling the code 
11. How to write custom exception ? 
	1. extend the exception class by the custom exception and pass message to super() 
12. throw and throws 
	1. 