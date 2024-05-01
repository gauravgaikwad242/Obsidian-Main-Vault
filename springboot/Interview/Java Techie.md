---
~
---
### Part 1

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
		- 

5. will app work with above 3 anotation instead of @Springbootapplication? will app run??
	- yes 

6. what is Auto-Configuration in spring-boot? 
	- if we add starter-web what all things will happen? 
	- to see what all autoconfigurations are being done 
		- debut = true (app.prop file)
	- positive matches in debug logs - automatically configured
	- negative matches in debug logs - spring boot will not be Auto-Configured
	- like if we add jpa dependency the spring boot will configure DataSource Dependency, we will see "DataSourceAutoConfiguration matched" as logs
	- event though we have not configured spring aop it still configures the bean  because matchIfMissing - following image 
	- ![[Pasted image 20240430192208.png]]
	- we can see all the matches the framework will do in classpath `org.springframework.boot.autoconfigure.AutoConfiguration.imports`
```
@ConditionalOnClass({}) //if the class is in classpath
@ConditionalOnMissingBean ?
```

7. How to disable a specific auto-configuration
	- in @SpringBootApplication we have property exclude there we can exclude the specific auto configuration 
	- @SpringBootApplication(exclude = {DatasourceAutoConfiguration.class})
	- in above springboot will not do AutoConfiguration for datasource bean 
	- or In Properties file 
	- spring.autoconfigure.exlude=org.springframework.boot.autoconfigure.aop.AopAutoConfiguration, other fully qualified class name

8. How to customize the default configuration in springboot? 
	- we can override in property file like we can change default port 8080 to 9009 like 
	- server.port=9009
	- this will customize or override the default behavior 

9. How springboot run() method works internally? 
	- run method returns ApplicationContext (configurationApplicationContext)
	1. it will load the environment 
		- from app.prop or app.yaml etc
		- ![[Pasted image 20240430194727.png]]
	2. prints the banner
	3. creates ApplicationContext 
		- with create method  
		- there are three factories which all return applicationcontext
		- ![[Pasted image 20240430195408.png]]
		- generally servlet for spring web
		- ![[Pasted image 20240430200205.png]]
	4. configures the embedded tomcat server  

10. what is Command Line Runner in spring boot?
	1. if we need something to be run at application startup we write in the commandlinerunner run method 
	2. activity like dbconnection, datapopulation, preprocessing logic 
	3. which one run first springapplicattion.run or cmd.run 
		1. springapplication run method will run first 

<hr> 

### Part 2 

11. explain purpose of stereotype annotations in the spring framework?
	1. @Component 
	2. @Service 
		1. implements component
	3. @Repository 
	4. @Controller 
	5. @RestController
		1. @Controller
		2. @ResponseBody
	6. use to create bean of the class 
	7. these anotations defines the role of the class 
	8. using these will make it easy to identify role of the class to developer 

12. How can you define bean in spring framework? 
	1. by using stereotype annotation 
	2. by using java base config 
		- create config class 
		- annotate with @configuration 
		- create bean method 
		- annotate the method with @Bean 

13.  ? VVIMP 
	1. KEY FEATURE, BACKBONE OF SPRING framework
	2. <mark style="background: #FFB86CA6;">DI is design pattern and it is used to achieve loose coupling between classes within an application by removing the dependency between them</mark>
	3. instead of managing java object by developers, framework will handle it for use

14. How many ways we can perform dependency injection? 
	1. field lever DI 
		1. @Autowire 
	2. setter injection 
		1. ![[Pasted image 20240430210856.png]]
	3. constructor DI
	4. ![[Pasted image 20240430211208.png]]

15. where would you choose setter injection over constructor and vice versa? 
	1. 