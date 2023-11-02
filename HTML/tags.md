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
	- li for listing #li 
	- ordered list - ol #ol - we get 1, 2, 3 as ranking for the elements
		- attibutes
		- `start` = "5" will start from 5 or e for alpha numeric
		- `reversed` = will start ranking from revese like z,y,x or 5,4,3
		- `value` will give the specific value to the list
	- un-ordered list - ul #ul - we get bullet symbols for list
	- description list #dl - we get hierachial test
		- #dt description term 
		- #dd description details
```html
    <ol>
        <li>i learn about java</li>
        <li>i sit to work as developer</li>
    </ol>
                <ol start="5" reversed>
                <li>Step One</li>
                <!-- value att for setting the index of element
                here 26 is letter z -->
                <li value="26">Step Two</li>
                <li>Step Three</li>
    </ol>
    
    <ul>
        <li><p>core java i like</p></li>
        <li>i sit to work as developer</li>
        <li>
            <p>i am from india:</p>
            <address>
                india the country <br>
                maharashtra is state <br>
            </address>
        </li>
    </ul>

    <!-- <dl>description list</dl> -->
    <dl>
        <dt>North Pole</dt>
        <dd>i heard it is very<strong>cold</strong></dd>
        
        <dt>Mount Everest</dt>
        <dd>it is very cold and very high</dd>
    </dl>
```

- some more symantic tags
- nav - for navigation purpose
#nav
```
    <nav>
        <ul>
            <li>
                <!-- this following code is to give links in same page
                and it will sroll to same page -->
                <a href="#page">About this page</a>
            </li>
            <li>
                <a href="#page">What i Like </a>
            </li>
        </ul>
    </nav>
```

- section - use rather than #div #section  has more symantic meaning than #div
#section
```html
    <section id="page">
        <h2>this is page</h2>
        <dl>
            <dt>about the web</dt>
            <dd>it has some description</dd>
        </dl>
        <p>Lorem ipsum dolor, sit amet consectetur adipisicing elit. Voluptatem alias placeat, numquam architecto laboriosam consequatur nemo molestiae, laudantium 
        </p>
    </section>
```

- tags for #images
- #img 
	- attributes
	- src = "" - source of images
	- alt = "" like tooltip for images
	- title = "" if image doesnt load it will show this text
	- 