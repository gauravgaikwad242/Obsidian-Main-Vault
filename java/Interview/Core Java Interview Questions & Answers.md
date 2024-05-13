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
	1. [[52 throw and throws]]
13. Exception tricky questions 
	1. parent class we cannot use before child class 
	2. so first we have to handle child and then parent (exception hierarchy)
14. try catch finally return scenario questions 
	1. output is 3 
		1. ![[Pasted image 20240512093252.png]]
	2. output is 2 
		1. ![[Pasted image 20240512093322.png]]
	3. output is 3 
		1. ![[Pasted image 20240512093349.png]]
15. How to break flow of finally? 
	1. ![[Pasted image 20240512093445.png]]
	2. with exception in finally or system.exit(0);
16. How many way we can create string object ? 
16. string object creation scenario?
16. what is scp, string constant pool?
	1. with new String()
		- in this scenario 2 objects will be created 
		1. object -> new -> heap 
		2. object -> literal -> scp 
	2. or with String abc = "stp";
		- <mark style="background: #FF5582A6;">here no object will be created as in above scenario it is already created </mark>
		2. object -> literal -> scp 
	3. to prove above 
		1. ![[Pasted image 20240512094451.png]]
		2. <mark style="background: #FF5582A6;">we will get true in above code </mark>
		3. intern() points to the scp , and it is used to get scp reference 
17. why string is immutable ?
	1. [[36.0 String Handling]]
	2. when we create a same string two times it will create only one object in scp hence it is immutable 
	3. it is made immutable for security purpose , if one reference is changed it will change all of the references and that is security issue 
	4. ![[Pasted image 20240512095055.png]]
	5. ![[Pasted image 20240512095103.png]]
	6. ![[Pasted image 20240512095224.png]]
18. How to use mutable class and what is the difference between stringbuffer and stringbuilder ? 
	1. ![[Pasted image 20240512095356.png]]
	2. equals method difference - data reference reference  
	3. concat append append 
19. <mark style="background: #FF5582A6;">How can we write our own custom immutable class</mark> ? 
	1. make class as final - so no one can inherit 
	2. declare all fields (instance var) as private and final 
	3. say to to setters 
	4. initialize all var in constructor 
	5. perform cloning of mutable object while returning 
		1. for obje like data , list etc 
		2. for data -> data.clone()
		3. for list collection.unmodifiable(list)
			1. or new ArrayList(list)
20. Which one is good to store password in java string or char[] and why ?
	1. ![[Pasted image 20240512104605.png]]
	2. ![[Pasted image 20240512104718.png]]
21. What is marker interface (tagging interface) ? can we create our own marker interface ? 
	1. interface which does not have any element in it like method or fields 
	2. yes we can create our own marker interface .
	3. ![[Pasted image 20240512104858.png]]
	4. it will check with **instanceof** if it has implementation of the marker interface

22. What all collection you used in your project ? 
	1. ![[Pasted image 20240512170301.png]]
23. diff between list and set 
24. diff between Arraylist and LinkedList
	1. ![[Pasted image 20240512170449.png]]
![[Pasted image 20240512175639.png]]

25. List object creation scenario ?
	1. which one list = Arraylist or Arraylist = Arraylist 
	2. first one is better due to loose coupling 
26. Declaring a List field with the final keyword ?
	1. we can add elements 
	2. but we cannot re-assign
	3. if we dont want modifiable the we can use collection.unmodifiable 
27. <mark style="background: #FF5582A6;">How can i write custom ArrayList where i dont want to allow duplicate ?</mark> 
	1. we can create class extend ArrayList 
	2. we can override add method  
28. Why set doesnt allow duplicate elements ? 
	1. it internally uses map to store elements 
		1. ![[Pasted image 20240512180922.png]]
29. <mark style="background: #FF5582A6;">What is the diff between COMPARABLE and COMPARATOR</mark>
	1. ![[Pasted image 20240512185508.png]]
30. multi comparing using comparator scenario 
31. what is diff between fail fast and fail safe iterator ? 
	1. it fails because of modcount value is not same 
	2. ![[Pasted image 20240512193342.png]]
	3. fail fast 
		1. ![[Pasted image 20240512193504.png]]
	4. fail safe 
		1. ![[Pasted image 20240512193611.png]]
		2. here it will return clone of the list 
		3. so if we print we will not see c 
		4. <mark style="background: #FF5582A6;">but for map we use concurrent map and there it will return actual object </mark>
32. what is need of concurrenthashmap and how it is diff from Hashmap? 
	1. ![[Pasted image 20240512194045.png]]
33. if we have hashTable which is already synchronized thenn why we need ConcurrentHashMap ? 
	1. ![[Pasted image 20240512194758.png]]
34. ![[Pasted image 20240512194849.png]]
35. <mark style="background: #FF5582A6;">How HashMap internally works ?</mark>
	1. if key is null it will be placed in 0 bucket 
	2. ![[Pasted image 20240512200456.png]]
	3. ![[Pasted image 20240512200623.png]]
36. what is enhancement done to hashmap in java 8? 
	1.<mark style="background: #FF5582A6;"> balanced tree instead of linkedlist for buckets sometimes in some condition </mark>
37. How treeMap internally works ? 
	1. treemap will sort the key 
	2. ![[Pasted image 20240512200952.png]]