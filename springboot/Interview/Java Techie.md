---
~
---
1. why will you choose spring boot over spring framework? 
- Dependency Resolution and version resolution
	- no need to add all the dependency like spring-core, spring context, spring tx(transaction), hibernate core, jackson dependency etc
	- avoids version conflict
	- we need to Remember all the dependency we need to add , in springboot it takes from spring parent
- Avoid Addition Configuration 
- Embed Tomcat, Jetty no need of war files 
- production ready features such as metrics, health checks 

![[Pasted image 20240429202657.png]]

2. what all spring boot starter you have used or what all modules you have worked on? 
	- spring boot starter web
	- data jpa 
	- aop 
	- web services (for soap based) 
	- security 
	- apache kafka 
	- spring cloud (service discovery, microservice, configuration management, load balancing )
	- spring boot starter thymeleaf (static webpages)

3. How will you run your spring boot application? 
	- ide 
	- mvn pugin --> mvn spring-boot:run 
		- it directly runs classes from target folder and not from jar 
		- jar xf appname.jar   for extracting the java file

4. what is the pupose of @SpringBootApplication anotation 
	- combination of 
		- @EnableAutoConfiguration
		- @ComponentScan
		- @Configuration 
	- @EnableAutoConfiguration
		- automatically configure the application based on dependency and classpath
	- @componentScan 
		- by default it will load main class and its subpackages 
		- but only under its package 
	- @Configuration
		- it allows to configure beans 
5. will app work with above 3 anotation instead of @Springbootapplication? will app run??
	- yes 

6. what is AutoConfiguration in springboot? 
	- if we add starter-web what all things will happen? 
	- to see what all autoconfigurations are being done 
		- debut = true (app.prop file)