1. why java is not 100 object oriented 
	1. because we use primitive datatypes when coding 
2. why not pointers are not used 
	1. unsafe 
	2. reduce complexity 
	3. direct access of users to memory 
3. what is JIT compiler in java 
4. why string is immutable in java
	1. security purpose 
	2. else reference can be modified from anywhere
5. what is marker interface
	1. empty interface (has no data member and functions)
	2. like serializable and cloneable 
6. can you override private and static method in java? 
	1. no we cannot do both 
	2. why 
		1. private method cannot be extended its scope is only within class 
		2. for static method if we try to do override it it will hide parent class method that is know as METHOD HIDING
7. does finally always execute in java? 
	1. it doesnt execute only when
	2. when we call system.exit()
	3. when system crashes
8. what methods does object class have?
	1. clone - copy of object 
	2. equals - ( == ) operator
	3. finalize - called by garbage collector 
	4. getClass 
	5. hashcode 
	6. tostring 
	7. notify 
	8. notifyAll
	9. wait 
	10. wait
	11. wait 
	12. wait 
9. How to make class immutable (6 steps )
	1. make class final so it cannot be extended 
	2. make fields private 
	3. dont provide setters 
	4. make mutable fields final 
	5. initialize all fields via constructor performing deep copy 
	6. perform cloning of objects in getter methods to return a copy instead of returning the actual object ref. 
10. what is singleton class in java? how to make class singleton? 
	1. one instance at any time in one jvm 