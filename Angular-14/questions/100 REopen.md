1. what are components? 
- basic building block 
- explain all four file, combination of these 4 files is component
- explain default app component in angular when generated new component

2. what is selector? (like app-header, app-footer>)
- is identity of a component 
- used to identify each component uniquely in ***component tree***
- when app loads the selector will be replaced by the component 

3. what is template?
- template is a HTML view of angular component 
- angular brings javascript to template or html 

4. what is MODULE? 
-![[Pasted image 20240221143523.png]]
- app module is root module 
- declaration - declare component 
- imports - services of other module can be used module 
- if export for declaration is used then only we can import it in other module 
- bootstrap: where we declaret the component to bootstrap
- for small app one module is enough for big we can divide it in multiple modules 

5. ![[Pasted image 20240221143839.png]]
index.html --> main.js (main.ts) --> app.module.ts --> app.component

6. what is a bootstrapped module and bootstrapped component? 
- first module which is bootstrapped


7. what is databinding in angular ?  vvip.
- way to communicate between component and view
- 3 types of databinding
- ts - html --- Interpolation and property 
- html - ts ---> event 
- both ways -- > two way data binding

8. what is string Interpolation n angular?
- one way databinding
- from ts to html or component to view 
- works only with string not number or boolean 
- {{}} is the syntax
- simple as compared to property binding 

9. what is property binding? 
- same as above 
- superset of interpolation 
- can be used with any datatype 
- [] syntax 

10 what is event binding? 
- ![[Pasted image 20240221151046.png]]
- from view to component 
- user events like buttonclick, mouse hover, etc

11 what is two way databinding in angular? vvip 
- if we know this we know all databinding 
-  ![[Pasted image 20240221151454.png]]
- give example if we need to show live data into the screen from input
- **we need to import forms module in module**

12 what are directives? types of directive? 
-  directives are classes which add additional behavior to elements ( change appearence and structure of DOM) 
- structural directive - ngif ngfor ngswich 
- attribute - ngstyle, ngclass
- component - component Directives are Directives with its own template (html) (most used )

13. structural Directives? ngIF? 
- ![[Pasted image 20240221155006.png]]
- ![[Pasted image 20240221155119.png]]

14. ngFor? 
- ![[Pasted image 20240221155306.png]]

15 ngSwitch? 
![[Pasted image 20240221155449.png]]![[Pasted image 20240221155547.png]]
16 ngStyle ? attribute directive
 ![[Pasted image 20240221155923.png]]
 ![[Pasted image 20240221155932.png]]

17 ngClass? 
- ![[Pasted image 20240221160222.png]]
18 diff between structural, attribute , component directive 
![[Pasted image 20240221160731.png]]

19 what are decorator? vvimp 
![[Pasted image 20240221161901.png]]

20 type of decorators? 
![[Pasted image 20240221161927.png]]21 what are pipes? 
![[Pasted image 20240221162154.png]]22 chaining pipes? 
![[Pasted image 20240221162557.png]]![[Pasted image 20240221162625.png]]

23 explain services with example? 
![[Pasted image 20240221173908.png]]- reusable code 

24 how to create service ? 
- ng g service folder/serviceName 

25 how to dependencyInjector?
3step 
- in @component mension in providers array 
- in constructor
*dependency injection will work even without providers array in component this is because hierarchical dep injection*

26 **what is hierarchial dependency injection**? 
- **VVIP WATH VIDEO OR PDF**
-  if mensioned in providers array in component then to its child it is available 
- if mensioned in providers in modules then all the component in the module 
- if providedIn = 'root' in @injectable then to all the module and is default setting (providing service at root injectable level)

27 what is provider in angular? 
- ![[Pasted image 20240221175257.png]]

28 what is the role of @injectable decorator? how to use one service into another service?
- ![[Pasted image 20240221175406.png]]

29 what are parent child components 

30 what is @input decorator ? how to transfer data from parent to child component? 
- ![[Pasted image 20240221191521.png]]

31 what is @output decorator and Event emitter? 
![[Pasted image 20240221191913.png]]
32 what are lifecycle hooks in angular?? vvimp

![[Pasted image 20240221192333.png]]
![[Pasted image 20240221192412.png]]![[Pasted image 20240221192626.png]]

33 what is constructor?
![[Pasted image 20240221192913.png]]![[Pasted image 20240221192923.png]]

34 ngOnChanges?
![[Pasted image 20240221193136.png]]
35 ngOnInit?? 

![[Pasted image 20240221193707.png]]

36 Differences between constructor and ngoninit?
