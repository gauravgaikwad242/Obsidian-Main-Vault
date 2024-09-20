- install eclipse in EE edition 
- new project 
	- dynamic project 
		- configure runtime with web server (tomcat)
		- configuration -> modify (click button) -> add JSF 
		- ![[Pasted image 20240919163256.png]]
- next 
- remove current java/src... folder 
- add src folder 
- ![[Pasted image 20240919163408.png]]
- next
- rename content directory to webContent and check checkbox for web.xml
- next 
- disable library 
	- ![[Pasted image 20240919163607.png]]

- download javax.faces lib 
	- [Index of /repositories/releases/org/glassfish/javax.faces/2.2.8](https://maven.java.net/content/repositories/releases/org/glassfish/javax.faces/2.2.8/)
- paste it into web-inf/lib folder 
- create xhml code 
	- in webContent 
	- create new html file - hello-world.xhtml 
	- select -> new faces template
	- finish
- to run start the server first 
- right click on xhml file and run -> run on server 

```xhtml 
<!DOCTYPE html>
<HTML
lang="en"
xmlns="http://www.w3.org/1999/xhtml"
xmlns:h="http://xmlns.jcp.org/jsf/html"
xmlns:a="http://xmlns.jcp.org/jsf/facelets"
>

<h:head>
<title>Hello World!!!</title>
</h:head>

<h:body>
<h:form>
<h:inputText id="name" value="#{theUserName}" a:placeholder="what is your name?"/>
<h:commandButton value="submit" action="myresponse" />
<!-- myresponse is submit page -->
</h:form>
</h:body>

</HTML>
```


```xhtml 
<!DOCTYPE html>
<HTML
lang="en"
xmlns="http://www.w3.org/1999/xhtml"
xmlns:h="http://xmlns.jcp.org/jsf/html"
>
<h:head>
<title>Hello World!!! - response</title>
</h:head>
<h:body>
	Hello, #{theUserName}
</h:body>
</HTML>
```