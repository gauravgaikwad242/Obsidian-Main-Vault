#### JSF page structure 
- .xhtml file extension 
- html page with special jsf tag 
```
<html>
--regular html 
---jsf tags 
--more regular html
</html>
```
![[WhatsApp Image 2024-09-20 at 08.11.25_d6ccb09b.jpg]]

- simple jsf form 
```xhtml 
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" 
          "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml"
	xmlns:h="http://xmlns.jcp.org/jsf/html">
<h:head>
	<title>Student registration form</title>
</h:head>

<h:body>

	<h:form>
First Name: <h:inputText id="firstName" value="#{firstName}" />
		<br />
		<br />
last Name: <h:inputText id="lastName" value="#{lastName}" />
		<br />
		<br />
		<h:commandButton value="submit"></h:commandButton>
	</h:form>
</h:body>

</html>

```


#### Namespaces for components 
these are unique identifier and the server will not actually open these urls 
![[WhatsApp Image 2024-09-20 at 08.22.45_9caa2175.jpg]]