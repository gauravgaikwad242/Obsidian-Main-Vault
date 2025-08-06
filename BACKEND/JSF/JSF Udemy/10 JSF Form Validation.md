##### JSF has Validation Features inbuilt 
1. required
2. validateLength
3. validateDouble/validateLong
4. validateRegex
5. custom validation 

#### New Project - validate-demo

### required 

```html 
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" 
          "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml"
	xmlns:h="http://xmlns.jcp.org/jsf/html"
	xmlns:ui="http://xmlns.jcp.org/jsf/facelets"
	xmlns:f="http://xmlns.jcp.org/jsf/core">
<h:head>
	<title>Student Form Registration</title>
	<style>
.error {
	color: red
}
</style>
</h:head>

<h:body>
	<h:form>
	
		<h:messages styleClass="error" />
First Name: <h:inputText value="#{student.firstName}"
			label="First Name" />
		<br />
		<br />
Last Name: <h:inputText value="#{student.lastName}"
			label="Last Name" required="true" />
		<br />
		<br />
Email: <h:inputText value="#{student.email}" label="Email"
			required="true" />
		<br />
		<br />
		<h:commandButton value="submit" action="student_form_response"></h:commandButton>
	</h:form>

</h:body>

</html>

```

#### customizing error message 

- additionally we have to give h:message for each input and match for and id property 
- we can even give custom validation message like for last_name in below code 

```html 
First Name: <h:inputText value="#{student.firstName}" label="First Name" />
		<br />
		<br />
Last Name: <h:inputText id="last_name" value="#{student.lastName}"
			label="Last Name" required="true" requiredMessage="last name is required"/>

		<h:message for="last_name" styleClass="error"></h:message>
		<br />
		<br />
Email: <h:inputText id="email" value="#{student.email}" label="Email"
			required="true" />
		<h:message for="email" styleClass="error"></h:message>
```


#### Length validation 
- length validation is different for string and int 
- we need closing inputtext tag 
- `<f:validateLongRange minimum="0" maximum="10" />`
- `<f:validateLength minimum="5" maximum="5" />`
```html 
FreePasses: <h:inputText id="freePasses" value="#{student.freePasses}"
			label="Free Passes" required="true">
			<f:validateLongRange minimum="0" maximum="10" />
		</h:inputText>
		<h:message for="freePasses" styleClass="error"></h:message>
		<br />
		<br />
		
		
Postal Code: <h:inputText id="postal_code" value="#{student.postalCode}"
			label="Postal Code" required="true">
			<f:validateLength minimum="5" maximum="5" />
		</h:inputText>
		<h:message for="postal_code" styleClass="error"></h:message>
		<br />
		<br />
```


#### Regex Validation 

```html 
Phone Number: <h:inputText id="phone_number"
			value="#{student.phoneNumber}" label="Phone Number"
			validatorMessage="phone no must follow xxx-xxx-xxxx">
			<f:validateRegex pattern="\d{3}-\d{3}-\d{4}" />
		</h:inputText>
		<h:message for="phone_number" styleClass="error"></h:message>
		<br />
		<br />
```


#### Custom Validation 

