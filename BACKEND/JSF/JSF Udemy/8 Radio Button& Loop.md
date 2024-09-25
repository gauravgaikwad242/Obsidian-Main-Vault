here otherLanguages is List (arraylist ) for saving multiple values 

```html 
Other Programming Languages: 
		<h:selectManyCheckbox value="#{studentThree.otherLanguages}">
			<f:selectItem itemValue="Java" itemLabel="Java" />
			<f:selectItem itemValue="C" itemLabel="C" />
			<f:selectItem itemValue="Python" itemLabel="Python" />
		</h:selectManyCheckbox>
```

#### Loop over List 
we have to add xmlns for facelet 
- here we will use repeat component 
```html 
<html xmlns="http://www.w3.org/1999/xhtml"
xmlns:h="http://xmlns.jcp.org/jsf/html"
xmlns:ui="http://xmlns.jcp.org/jsf/facelets">

Other Programming Languages: 
<ul>
		<ui:repeat var="language" value="#{studentThree.otherLanguages}">
			<li>#{language}</li>
		</ui:repeat>
	</ul>
```