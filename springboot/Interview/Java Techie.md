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

9. How SpringApplication run() method works internally? 
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
	7. these annotations defines the role of the class 
	8. using these will make it easy to identify role of the class to developer 

12. How can you define bean in spring framework? 
	1. by using stereotype annotation 
	2. by using java base config 
		- create config class 
		- annotate with @configuration 
		- create bean method 
		- annotate the method with @Bean 

13.  <mark style="background: #FF5582A6;">What is dependency Injection? VVIMP </mark>
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

15. <mark style="background: #FF5582A6;">where would you choose setter injection over constructor and vice versa</mark>? 
	1. constructor level DI : 
			- if mandatory for the bean where it is being injected or else we want to throw error .
			- immutable in nature
			- we cannot resolve circular dependency
	2. Setter DI : 
			- if we want the dependency as optional for our bean , without injecting the dependency we can create the bean. 
			- not immutable in nature 
			- we can resolve circular dependency, for the circular dpendency problem we should use circular dependency 
			- we have to use @Lazy annotation for this
			- ![[Pasted image 20240501103236.png]]

16. Can you provide example of real world use can where @PostConstruct is particularly useful ?
	 (first SpringApplication.run then @PostConstruct and then CommandLineRunner.run )
	1. Connection Pool Logic 
	2. Kafka Producer/consumer instantiate 
	3. data shedding (inserting data to db on startup)

17. How can we load dynamic value in spring boot? 
	1. we can use @Value annotation
		1. ![[Pasted image 20240501104340.png]]
	2. we can use/inject Environment class 
		1. ![[Pasted image 20240501104514.png]]
		2. environment.getProperty("dis.off.price)
	-<mark style="background: #FFF3A3A6;"> with vm arguments we can set env instead of </mark>application.prop/yaml 

18. Key difference between properties and yaml file, when will we consider one over another ?
	1. syntax and structure 
		1. yaml is more human readable andis better for complex configuration, hierarchy with whitespace 
		2. properties file do not have any hierarchy
	2. list and arrays 
		1. properties file we can do it by using comma separated value 
		2. yaml file have inbuilt feature 
			1. ![[Pasted image 20240501105317.png]]
	3. complex data type 
		1. properties file we cannot define complex datafile
	4. Readability 
		1. properties file is more compact but becomes difficult to read for complex config

19. diff between yml and YAML ? 
	1. both are same and no difference 
	2. in older window we could only use 3 letter extension

20. <mark style="background: #FF5582A6;"> If i will configure same valuse in both properties then which value will be loaded in spring boot Or who will load first yaml or properties?</mark>
	1. application.properties file is having more precedence and will be loaded first 
	2. we can see in `ProperySourceLoader.java` and `YamlPropertySourceLoader.java` if we put breakpoint there the former will be loaded first and will not be OVERRIDEN.

21. <mark style="background: #FF5582A6;">How to load external properties in spring boot? without app.prop/yaml ?</mark> external to application and not in  code? 
	1. first we have to tell spring boot the location of new file 
	2. spring.config.import = "path to the file".
	3. ![[Pasted image 20240501110743.png]]

22. How to map or bind config properties to java object? 
	1. create a java class 
	2. annotate with @configuration 
	3. annotate with @Component 
	4. annotate with @ConfigurationProperties( prefix = "spring.datasource" )
	5. add the properties in the class 



### Part 3 

23. How will you resolve bean dependency ambiguity? (two implementation classes which will be injected) 
	1. we will get error in this case 
	2. to solve we can use @Qualifier("orderServiceImpl2")
	3. injection will be done by type (type os orderserviceimpl2)

24. can we resolve ambiguity without using @Qualifier? 
	1. yes by using @Resource(name = "orderRepositoryImpl1") (java annotation)
	2. by name

25. what is bean scope and can you explain different type of bean scope? 
	1. refer to lifecycle and visbility of bean withing the ioc container 
	2. or how long it will be live , how long it will alive and when it will destroyer
	- Singleton 
		- only single object of the bean in context, (default)
		- ![[Pasted image 20240501120649.png]]
		- @Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
	- Prototype 
		- As many time we request the object new bean will be created 
		- ![[Pasted image 20240501121243.png]]
	- Request - web only 
		- new instance for each http request, 
		-    
		- after http request the bean will be discarded 
		- ![[Pasted image 20240501121531.png]]
		- The _proxyMode_ attribute is necessary because at the moment of the instantiation of the web application context, there is no active request. Spring creates a proxy to be injected as a dependency, and instantiates the target bean when it is needed in a request. (baeldung)
	- Session - web only 
		- single instance of bean per user session 
		- ![[Pasted image 20240501122005.png]]
		- to kill session forcefully ![[Pasted image 20240501122135.png]]
	- Application - web only
		- only one bean across whole web application
		- This is similar to the _singleton_ scope, but there is a very important difference with regards to the scope of the bean.
		- <mark style="background: #FFB86CA6;">When beans are _application_ scoped, the same instance of the bean is shared across multiple servlet-based applications running in the same _ServletContext_, while _singleton_ scoped beans are scoped to a single application context only.</mark>
		- @Scope( value = WebApplicationContext.SCOPE_APPLICATION, proxyMode = ScopedProxyMode.TARGET_CLASS)
	- WebSocket
		- creates single instance bean for one websocket session

26. How to define<mark style="background: #FF5582A6;"> custom</mark> bean scope? (eg. what is i want new bean for each thread scope)
	1. we have to implement Scope interface and override methods accordingly 
	2. the name of the scope like singleton, we have to register 
	3. ![[Pasted image 20240501123054.png]]

27. Can you provide a few real-time use cases for when to choose singleton scope and prototype scope? 
	1. Singleton usecases 
		1. database configuration 
			1. config database connection pool, caching configuration 
		2. service layer 
			1. stateless service
		3. Application Configuration 
	2. Prototype Scope 
		1. user session 
		2. thread safety 
			1. to avoid race condition 
		3. Heavy Initialization 
			1. to avoid extra utitization of resources 

28. Can we inject prototype bean in singleton bean? if yes what will happen if we inject prototype bean in single bean? 
	1. we will get same prototype bean in singleton bean and it will not work 
	2. temp solution is 
		1. ![[Pasted image 20240501164848.png]]
	3. proper solution is to inject ObjectFactory and getting the prototype bean through it 
		1. ![[Pasted image 20240501165016.png]]
		2. while surfing stackoverflow i saw this 
		- ![[Pasted image 20240501165114.png]]
	4. or we can use `@Lookup` 
		1. ![[Pasted image 20240501165236.png]]

29. What is difference between spring singleton and plain singleton ?
	1. spring singleton - > one instance per application context
	2. plain singleton - > one instance per JVM 

30. What is the purpose of the BeanPostProcessor interface in spring, and how can you use it to customize bean initialization and destruction? 
	1. plays important role in spring-core module
	2. before and after bean initializtion , we can do custom processes
	3. ![[Pasted image 20240501165720.png]]![[Pasted image 20240501165739.png]]
	4. ![[Pasted image 20240501170019.png]]

### Part 4

31. Have you worked on restful webservices ? if yes what all HTTP methods have you used in your project ?
	- yes , the following
		1. Post 
		2. Put 
		3. Get
		4. Patch 
		5. Delete 

32. How can you specify the http method type for your REST endpoint? 
	1. based on the action you want to perform (CRUD) 
		1. for retrieving the data GetMapping
		2. insert postMapping 
		3. update putMapping 
		4. partial updata patchMapping
		5. delete deleteMapping 
	- all these annotations internally use @RequestMapping 

33. scenario based questions .
	1. ![[Pasted image 20240502181553.png]]
	2. ![[Pasted image 20240502181914.png]]

34.  Scenario 
	1. ![[Pasted image 20240502182137.png]]

35. difference between pathVariable and RequestParam 
	1. path variable is mandatory and if absent we willget 404 error 
	2. requestParam is not mandatory always

36. why did we use @RestController and not @Controller (explain the difference) ? 
	1. for @Controller endpoint springboot will look for html page or view (model and view) 
	2. for @RestController it returns the json data  ( the media type can be anything )
	- for returning text or making controller behave like RestController we can add produces = MediaType.mymediatype
	- ![[Pasted image 20240502183500.png]]

37. How can we deserialize a json requst payload into an object within a Spring MVC controller ? 
	1. with the use of @RequestBody

38. <mark style="background: #FF5582A6;">can we perform update operation in POST http method if yes then why do we need put mapping or put http method? </mark>
	1. yes we can do update operation with post
	2. all the http method have semantic meaning and doing so will violet rest principle 
	3. post is generally to create the resource 
	4. put is update 
	5. idempotent nature of rest service  
		1. on your subsequent action if the resource is getting modified then it is not considered as idempotent 
		2. post is not idempotent 
			1. if we do 2 same requests two resources will get created 
		3. put is idempotent
			1. if we do 2 same request only first will be executed 

39. <mark style="background: #FF5582A6;">can we pass request body in Get method? </mark>
	1. yes we can do that but it is not recommended.

40. <mark style="background: #FF5582A6;">how can we perform content negotiation (xml/json) in Rest endpoint? </mark>
	1. if we want to return both xml and json or anything other 
	2. we need to enable xml databinding 
		1. ![[Pasted image 20240502191204.png]]
	3. ![[Pasted image 20240502191217.png]]
	4. ![[Pasted image 20240502191238.png]]
	5. ![[Pasted image 20240502191752.png]]
	6. we have to define format as query param in url 

41. what all status code you have observed in your application ? 
	1. 400 - bad request (wrong input)
	2. 404 - url is wrong or resource not available 
	3. 401 - authentication error 
	4. 403 - authorization error 
	5. 405 - method not allowed , hitting post instead of get or etc
	6. 415 - unsupported mediatype , if we send xml data instead of json etc 
	7. 500 - internal server error 
	8. 502 - bad gateway , some unhealthy website we try to access 
	9. 200 - okay, request was successful 
	10. 201 - created 
	11. 204 - not content ( process was successful )

42. How can we customize the status code ? 
	1. ![[Pasted image 20240502192443.png]]
	2. best coding practice  

43.  How can we enable CROSS origin ? 
	1. by default it is off and cannot access by different domain 
	2. if we want our angular app to 
	3. we have to annotate the rest controller with @CrossOrigin 
	4. ![[Pasted image 20240502192900.png]]
	5. or we can do java based config 
	6. ![[Pasted image 20240502193019.png]]

44. How can we upload a file in spring? 
	1. file is binary data 
	2. we have class like MultipartFile and anotation 
		1. ![[Pasted image 20240502193228.png]]

45. How do you maintain versioning for RestApi? 
	1. if we dont want any bug in current endpoint with new changes which is in production then we will do versioning 
	2. there are various strategies 
	3. at endpoint level in @GetMapping 
	4. in request parameter
	5. in header 

46. How will you document the rest API ? 
	1. we can do swagger (Open API) implementation
	2. ![[Pasted image 20240502200148.png]]
	3. and hit this endpoint for api UI 
		1. ![[Pasted image 20240502201815.png]]
	4. for api doc 
		1. ![[Pasted image 20240502202017.png]]

47. How do you hide some endpoing to be exposed as documentation? 
	1. we can use @Hidden on endpoint method 
	2. to add notes to the api 
		1. ![[Pasted image 20240502202304.png]]

48. How can we consume any rest full webservices?  
	1. we have 
		1. rest template 
		2. <mark style="background: #FFF3A3A6;">feign client </mark>
			1. declarative  ( by netflix )
			2. proxy as interface 
			3. code will be created at runtime 
			4. ![[Pasted image 20240502202932.png]]
			5. by default load balancing 
		3. Web Client 
			1. async and non blocking 
			2. not recommended for traditional 
			3. ![[Pasted image 20240502203219.png]]
		4. Advance Rest Client 

### Part 5 

49. How will you handle exception in your project ?
	1.  we can create custom exception. 
	2. better to throw them instead of framework handling it. 
	3. we can make them either runtime or checked exception 
	4. For handling it globally we can use **@RestControllerAdvice** 
	- create class with @RestControllerAdvice 
	- create method with and give our custom exception as parameter 
	- annotate the method with @ExceptionHandler(customexception.class )
	- and return the custom dto class with error message 
	- in spring boot 3.0 onwards we have <mark style="background: #FF5582A6;">ProblemDetail</mark> class for returning error 
		- ![[Pasted image 20240503191959.png]]
	- [[springboot/ExceptionHandling/@RestControllerAdvice|@RestControllerAdvice]]

50. How can you avoid defining handlers for multiple exceptions, or what is the best practice for handling exceptions ? 
	1. acc to video we can catch multiple exception in single catch and create handler for that 
	2. acc to me we can add multiple exception in @ExceptionHandler annotation

51. How will you validate or sanitize your request payload ? 
	1. add spring-boot-starter-validation dependency 
	2. importing from jakarta now 
	3. in the class 
		1. ![[Pasted image 20240503192832.png]]
		2. ![[Pasted image 20240503193358.png]]

52. How can you populate validation error message to the end users? 
	1. we have to catch the error in ExceptionHandler method 
	2. exception thrown is @MethodArgumentNotValidException
		1. ![[Pasted image 20240503194120.png]]

53. How can you define custom bean validation ? 
	1. we have to create annotation 
		1. ![[Pasted image 20240503194407.png]]
	2. implementation to the annotation 
		1. ![[Pasted image 20240503194433.png]]
		2. WE HAVE TO IMPLEMENT CONSTRAINVALIDATION

54. ![[Pasted image 20240503194643.png]]
	1. we can use the profiles concept  
	- bean according to profile 
		- ![[Pasted image 20240503195025.png]]
	- <mark style="background: #FF5582A6;">spring.profile.active = prod </mark>

55. How can you enable a specific environment without without using profies ? OR what is the alternatvie to profiles to achieving same use case? 
	1. yes there is a way, in old we only had profiles but in new spring we have <mark style="background: #FFB86CA6;">condition</mark> 
	2. we have annotations like @ConditionalOn...., there are lots of annotation 
	3. in prop file we have app.active.env 
		1. ![[Pasted image 20240504091320.png]]

56. what is difference between @Profile and @Conditional 
	1. profile is for spring implementation 
	2. conditional we can do custom implementation

57. what is aop? 
	1. aspect oriented programming 
	2. cross cutting concerns 
	3. secondary logic 
		1. transaction 
		2. logging 
		3. validation 
		4. auditing 
		5. notification 
	4. we reduce the duplication of the code 
	5. Aspect means the class which contains the secondary logic 

58. What is pointcut and join Point in AOP ? 
	1. JoinPoint --> the target where we want to implement the aspect 
		1. like some method , class , package 
	2. PointCut --> the expression to tell the aop what is our joinPoint 

59. What are the different types of advice ? 
	1. Before Advice
	2. After Advice 
		1. it does not care about exception 
	3. After Returning Advice 
		1. exec only if there is no exception 
	4. After Throwing Advice 
		1. only in case of exception 
	5. Around Advice  
		1. key advice 
		2. lots of customization we can do 

60. ![[Pasted image 20240504094018.png]]
	1. ![[Pasted image 20240504094626.png]]

### Part 6 

61.  0:49 : How does your application interact with the database and which framework are you using ? 
	1. we are using spring data jpa 
	- to connect to database using jpa 
		1. create entity class and annotate with @Entity 
		2. create id field and annotate with @Id and for auto incr @GeneratedValue 
		3. we can customize the table name and column name with @Table and @Column 
		4. create Repository interface 
		5. define datasource and jpa properties 
		6. ![[Pasted image 20240504105120.png]]
		7. dialect will help jpa to finetune database and helps the database to create query 
		8. if we have field employeeName in database we will get employee_name automatically because of naming strategy 

62. 11:22 :  why is it important to configure a physical naming strategy ? 
	1. to disable customization of column name ![[Pasted image 20240504171022.png]]
	2. ![[Pasted image 20240504171049.png]]

63. 14:07 : what are the key benefits of using spring data JPA ? 
	1. simplify the development, 
	2. min configuration 
	3. more focus on business logic
	4. gives high level abstraction 
	5. reduce the boilerplate code by giving CRUD operations
	6. features such as named-Query, JPA query , specification 

64. 21:00 : What are the differences between hibernate JPA and Spring Data JPA ? 
	1. we have 3 frameworks 
		1. Hibernate - 
			1. ORM (table mapping will be done by hibernate)
			2. also helps in caching 
			3. 
		2. JPA 
			1. Specification 
			2. Contains no implementation 
			3. in java terms we can say like Interface 
			4. and hibernate is Implementation 
		3. Spring Data JPA 
			1. another layer of abstraction on top of JPA 
			2. utilities 

65. 24:19 : <mark style="background: #FF5582A6;">How can you connect multiple databases or data sources in a single application ? </mark> (https://github.com/Java-Techie-jt/multi-datasource.git)
	1. is it possible using spring data JPA --> Yes 
	- steps 
		1. for single db ![[Pasted image 20240504173258.png]]
		2. for multi we need multi datasource 
			1. ![[Pasted image 20240504173410.png]]
		3. if database types is diff like mysql and postgres then we also need diff entity manager, transacttion manager 
		4. define Entity 
		5. define Repository 
		6. we need two different data-source 
		7. we need to give different prefix for datasources 
			1. ![[Pasted image 20240504173906.png]]
		8. we have to configure the datasource object bean and transaction manager 
		9. Why do we have @Primary on one config and not on both 
			1. spring boot needs one default datasource 
			2. if it doesnt find anything it will use this primary datasource

```

package com.javatechie.config;

import jakarta.persistence.EntityManagerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;


import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
        entityManagerFactoryRef = "employeeEntityManagerFactory",
        transactionManagerRef = "employeeTransactionManager",
        basePackages = { "com.javatechie.repository.employee" })
public class EmployeeDataSourceConfig {

    @Primary
    @Bean(name = "employeeProperties")
    @ConfigurationProperties("spring.datasource.employee")
    public DataSourceProperties dataSourceProperties() {
        return new DataSourceProperties();
    }

    @Primary
    @Bean(name = "employeeDatasource")
    @ConfigurationProperties(prefix = "spring.datasource.employee")
    public DataSource datasource(@Qualifier("employeeProperties") DataSourceProperties properties) {
        return properties.initializeDataSourceBuilder()
                .build();
    }

    @Primary
    @Bean(name = "employeeEntityManagerFactory")
    public LocalContainerEntityManagerFactoryBean entityManagerFactoryBean
            (EntityManagerFactoryBuilder builder, @Qualifier("employeeDatasource") DataSource dataSource) {
        Map<String, Object> jpaProps = new HashMap<>();
        jpaProps.put("hibernate.hbm2ddl.auto", "update");
        jpaProps.put("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
        return builder.dataSource(dataSource)
                .properties(jpaProps)
                .packages("com.javatechie.entity.employee")
                .persistenceUnit("employee").build();
    }

    @Primary
    @Bean(name = "employeeTransactionManager")
    @ConfigurationProperties("spring.jpa")
    public PlatformTransactionManager transactionManager(
            @Qualifier("employeeEntityManagerFactory") EntityManagerFactory entityManagerFactory) {
        return new JpaTransactionManager(entityManagerFactory);
    }
}
``` 

 66. 39:48 : What are the different ways to define custom queries in spring Data JPA ? 
	 1. Method Syntax (derived query)  
		 1. ![[Pasted image 20240504181634.png]]
	 2. Query (JPQL)
		 1.  ![[Pasted image 20240504181524.png]]
	 3. SQL 
	1. ![[Pasted image 20240504181837.png]]
		1. ![[Pasted image 20240504181932.png]]
	2. find avg of employee salary
		1. we cannot achieve this with derived query we will use JPA Jpql 
		2. ![[Pasted image 20240504182503.png]]
 
 
 67. 56:20 : How will you define entity relationships or association mapping in spring Data JPA ?
	 1. Note : we should not use associations in microservices  
	 2. explain the hibernate mappings 

68. 1:08:11 : is this possible to execute join query in spring data jpa ? if yes, how can you add some insights ? 
	1. ![[Pasted image 20240504184237.png]]

69.  1:19:22 : How will you implement pagination and sorting in Spring Data JPA ? 
	1. with pageRequest and pageable 


### Part 7

![[Pasted image 20240504184915.png]]



61.  0:49 : How does your application interact with the database and which framework are you using ? 
62. 11:22 :  why is it important to configure a physical naming strategy ? 
63. 14:07 : what are the key benefits of using spring data JPA ? 
64. 21:00 : What are the differences between hibernate JPA and Spring Data JPA ? 
65. 24:19 : How can you connect multiple databases or data sources in a single application ?

 66. 39:48 : What are the different ways to define custom queries in spring Data JPA ? 
 
 67. 56:20 : How will you define entity relationships or association mapping in spring Data JPA ?

68. 1:08:11 : is this possible to execute join query in spring data jpa ? if yes, how can you add some insights ? 

69. 1:19:22 : How will you implement pagination and sorting in Spring Data JPA ? 