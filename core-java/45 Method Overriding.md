
### writing two or more methods in TWO different classes having same method name, same parameters and same return type

##### The method present in parent class is know as OVERRIDEN method. and the method present present in subclass is called OVERRIDING method. 

##### when an overridden method is called through parent class reference java determines which version of the method is to be executed based upon the type of the object being referred to at the time the call occurs. Thus, this determination is made at runtime 
That is the reason it is called runtime ***Polymorphism***

cannot perform method Overriding if child class method has more restrictive access Modifiers than parent class method

we cannot override constructor because 1. constructor name is same as class name 2. constructors doesn't take part in inheritance

Note: we can override method with different return type, but for classes not primitive datatype 

#question can we override or overloading final method??

Points 
1. if we want to perform method overriding 100% we need to use inheritance 
2. if we cant inherit a method we cant override (ex: private methods)
3. private > default > protected  > public 
4. whenever we are performing method overriding child class method should not be more restrictive than the parent class method
5. we cannot perform method overriding for a static method it may seem like we are overriding but it is actually METHOD HIDING 
6.  After jdk 1.5 return types may not be smame in co-variant return types 
7. covariant return type concept is applicable only for classtypes and not primitive data types