### Managed Bean 
- is a simple regular java class
- will hold form data 
- also code business logic 
- created and managed by JSF -- hence called Managed Beans 
- dont confuse with EJB 

<hr>

Form -> managed Bean -> next page(this page can access data from previous managed bean)

<hr> 


#### Requirement for Managed Beans 
1. must have Public no-arg constructor 
2. expose properties via public getters / setters method 
3. should have `@ManagedBean` annotation (jsf2 added the annotation) javax.faces.bean.ManagedBean 
	1. previously we had to config MB in file

```java 
package com.luv2code.jsf.hello;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Student {

	private String firstName;
	private String lastName;
	
	public Student() {
		
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
}

```

#### JSF Expression Language 

- used to 
	- Access Properties of managed Bean 
	- other logic functions 
- syntax 
- `#{<beanName>.<property>}`
- eg. student.firstName 

to access 
- to set 
<h:inputText value="#{student.firstName}" />
- jsf will automatically call student.setFirstName 

- to get 
- #{student.firstName}
	-  jsf will automatically call student.getFirstName 
- REF managed bean from above

```html
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" 
          "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml"
	xmlns:h="http://xmlns.jcp.org/jsf/html">
<h:head>
	<title>Student registration form</title>
</h:head>

<h:body>

	<h:form>
First Name: <h:inputText id="firstName" value="#{student.firstName}" />
		<br />
		<br />
last Name: <h:inputText id="lastName" value="#{student.lastName}" />
		<br />
		<br />
		<h:commandButton value="submit" action="student_response"></h:commandButton>
	</h:form>
</h:body>

</html>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" 
          "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml"
	xmlns:h="http://xmlns.jcp.org/jsf/html">
<h:head>
	<title>Student Confirmation</title>
</h:head>

<h:body>
 student is confirmed : #{student.firstName} #{student.lastName}

</h:body>

</html>

```

```html 

```