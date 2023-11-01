- top level tags
#doctype 
	for document type
```
<!DOCTYPE html>
```

#html
	every page starts and ends with html tag
	lang="en" lang is attribute en is language en-us will be dialect
```
<html lang="en"></html>
```

- head tags
#head
	head are metatdata tag not visible on page
#meta
	for metadata put meta tag in #head 
```
<!-- for metadata put meta tag in head -->
        <!-- metadata goes here -->
        <!-- charset is attribute for encoding type -->
        <meta charset="UTF-8">
        <meta name="author" content="Gaurav G">
        <meta name="description" content="this page is first page creted with freecodecamp">
```

#title
```     <!-- title can not be seen on page -->
        <title>My First Web Page</title>
```

#link 
```
<!-- feb icon - icon at the top of wepage 
        rel is type of link
        href is path for the icon
        type is type of lin-->
        <link rel="icon" href="OIP.jpg" type="image/x-icon">

        <!-- link to css where rel is stylesheet -->
        <link rel="stylesheet" href="main.css" type="text/css">
```
- body tags

#body

- basic html structure till now
```html
<!Doctype html>
<html lang="en">
    <head>
        <title></title>
        <meta name="" content="">
        <meta charset="UTF-8">
        <link rel="stylesheet" href="">
        <link rel="icon" href="">
    </head>
    <body>  
    </body>
</html>
```

- Semantic Tags
- header tags
	#blockElement
#h1
	#h2
		#h3

- for horizontal line
#hr 
- paragraph tag 
	- has more semantic meaning than div
#p 
- for break in text , text goes to next line
#br 
- em - empahsis
#em for making text italic
- strong form making text bold
#strong
- abbrevation tag - to give tooltip like text
#abbr
```
<abbr title="Mozzila dev net">MDN</abbr>
```

- address tag - to add address to page
#address
```
        <address>
            india the country <br>
            maharashtra is state <br>
        </address>
```

- list tags
	- ordered list - ol #ol