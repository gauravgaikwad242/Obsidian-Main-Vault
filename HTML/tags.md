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
	- width
	- height
	- loading = "lazy" or "eager" - eager by default , with lazy image only loads when we scroll down to it
	```html
	    <img src="img/download.jpg" alt="image of nature" title="image of nature" width="400" height="300" loading="lazy">
```

- #figure 
	- it doesnt change the structure or look but gives semantic meaning to image or other things
	- #figcaption
		- it gives caption to the element in figure tag
```
    <figure>
        <!-- figure is nothis special but it will tell browser that the figcaption is for image -->
        <img src="img/OIP (3).jpg" alt="image of nature" title="image of nature" width="400" height="300"
            loading="lazy">
        <figcaption>
            this is the icon for page
        </figcaption>
    </figure>
```

- resouces:: via.palceholder.com
- unsplash.com lincesed free images
- pexels.com 
- gratiscography.com
- pixabay.com

- softwares:
- irfanview for resizing or editing
- canva

- tinypng.com or tinyjpg.com will minimise images

<hr>
next
<hr>

#article 
- it is like #section but even more symantic meaning to page

#div 
	- avoid using div
    - div is like section without semantic meaning
        to convey meaning we have to add many attribute
        it is block element
	- we will use div and span only when it comes down to css 

#span 
- block element
- it is like div , not much semantic meaning

<hr>
anchor tag
<hr>

#a - anchor tag
- used to give links
- links with # are the links to same page where `#hr` is element with id `hr`
```html
        <nav aria-label="primary-navigation">
            <ul>
                <li>
                    got to &nbsp;<a href="#hr">hr</a>
                </li>
                <li>
                    got to &nbsp;<a href="#form">form</a>
                </li>
                <li>
                    got to &nbsp;<a href="#figure">figure</a>
                </li>
                
            </ul>
        </nav>
```
- attributes
	- `href` - to give link to the anchor tag
```html   
for html page or resource
<p><a href="about.html">&copy; Gaurav Gaikwad</a></p>
for same path 
<p><a href="#">This page</a></p>
for root path
<a href="./">Home</a>
for some id in same page
<a href="#page">About this page</a>
 Dial at <a href="tel:+999999999">My Phone</a>
<a href="about.html#page">About this page</a>

for telephone
<a href="tel:+999999999">My Phone</a>
for email - not recommended
<a href="mailto:random@email.com">email me</a>
```
	- `download` - to download the linked resource
	- #target - for the link open option #collectmoredetails 
		- `_blank` - will open in new tab

#aside 
- doesn have much semantic meaning
- can be used for sidebar
#details - used with summar #collectmoredetails
	#summary - can be used for question , have option to expand
		#p  the answer
#mark 
- works as highlighter
```html
<summary>Guess the <mark>no of hours</mark> i code per day ?</summary>
```

<hr>
`TABLE`
<hr>

#caption - like a title for table
#thead - head element 
	#tr 
		#th - heading for column or row
#tbody - body element 
	#tr 
		#td -  data in a cell row or column 
		- attributes
			- #rowspan = `rowspan = "2"` will take two row space 
			- #colspan = `colspan = "3"` will take 3 column of space

<hr>
`FORM` 
<hr>

#form 
	all of the form elements are inside the `<form></form>` tag
	- attribute
		- action = "https://httpbin.org/get"
			- action is used for the link to submit the form
		- method = "post" 
			- we can choose methods such as get post 

#fieldset
	fieldset is like grouping form elements in one place like personal info in one 
	education details in one
#legend
	legend is like caption for a #fieldset  like Personal information

- form fields
#input
	 for taking in user input
	 - attribute 
	 - `type` = type of user input 
		 - `text`
		 - `password`
		 - `tel`
		 - `radio`
			 - for radio buttons multiple input should have same  name attribute
			 - and values can be stored in `value` attr
		- `checkbox`
			- all the input fields used for checkbox should have same name attr
		 - `number`
	-` min and max` - are the values for input type number 
	- `step` - the step of numbers 
	- `value` = default value of input box
	- `name` = it is the field which goes with when we submit form in json or queru params
	- `id` = id and name should be same 
	- `autocomplete` = "on"
		- this will give suggestions for from element 
	- `required`
		-  so the field cannot be left empty
	- `autofocus` - so on page load the particular field will have the pointer

#label 
	it is like caption or heading to form

#select - for dropdown selection
	#option - this stores one value for select dropdown
		- attr 
			- `value` - so the visible value and form value can be different
			- `selected` - so that particular option will be selected by default
	#optgroup - for grouping options
		attr - `label` - label for the optiongroup

#datalist - this is used with #input element
	*the id of #input should be same as of id of #datalist*
	used for suggestting some values with dropdown
	#option  is used as single tag for the options

#button
	- `type` 
		- "submit" - will submit the  for
		- "reset" -  will reset the form 

- form code 
```html 
            <form action="https://httpbin.org/get" method="post">
                <!-- <fieldset></fieldset> to group of section the form fields 
                fieldset gives semantic meaning to form-->
                <fieldset>
                    <!-- <legend></legend> is like caption -->
                    <legend>Personal Info</legend>
                <p>
                    <!-- every input should have label -->
                    <label for="firstName">First Name:</label>
                    <input type="text" name="firstName" id="firstName" placeholder="Jane" autocomplete="on" required
                        autofocus>
                    <!-- autofocus only one in whole page -->
                    <!-- autocomplete willa uto save and get the info next time -->
                </p>
                <p>
                    <label for="lastName">Last Name:</label>
                    <input type="text" name="lastName" id="lastName" placeholder="John" autocomplete="on" required>
                </p>
                <p>
                    <label for="password">Password:</label>
                    <input type="password" name="password" id="password" required>
                </p>
                <p>
                    <label for="phone">Phone:</label>
                    <!-- pattern supports regex -->
                    <!-- type tell will make open numeric keyboard on mobile -->
                    <input type="tel" name="phone" id="phone" pattern="[0-9]{10}" required>
                </p>
                <p>
                    <label for="decade">Favourite Decade:</label>
                    <!-- *step max and min and value -->
                    <input type="number" name="decade" id="decade" min="1950" max="2020" step="10" value="1980">
                </p>
                <p>
                    <label for="coffee">Favourite Coffee:</label>
                    <select name="coffee" id="coffee" multiple size="5">
                        <!-- *optgroup to group options  -->
                        <optgroup label="coffees">
                            <!-- select have closing tag unlike input -->
                            <option value="regular coffee">Regular Coffee</option>
                            <option value="iced coffee">Iced Coffee</option>
                        </optgroup>
                        <optgroup label="Espresso Drinks">
                            <!-- selected for default slection -->
                            <option value="latte" selected>Latte</option>
                            <option value="cappuccino">Cappuccino</option>
                            <option value="cortado">Cortado</option>
                            <option value="americano">Americano</option>
                        </optgroup>
                        <option value="other">Other</option>
                    </select>
                </p>
                <p>Different type of input with select</p>
                <p>
                    <label for="coffee1">Favourite Coffee:</label>
                    <input type="text" name="coffee1" id="coffee1" list="coffee-list">
                    <datalist id="coffee-list">
                            <option value="regular coffee">
                            <option value="iced coffee">
                            <option value="latte">
                            <option value="cappuccino">
                            <option value="cortado">
                            <option value="americano">
                    </datalist>
                </p>
            </fieldset>
            <br>
            <fieldset>
                <legend>What is your Fovourite Food? </legend>
                <!-- input type radio should have name field same -->
                <p>
                    <input type="radio" name="food" id="tacos" value="tacos">
                    <label for="tacos">Tacos</label>
                </p>
                <p>
                    <input type="radio" name="food" id="pizza" value="pizza">
                    <label for="pizza">Pizza</label>
                </p>
                <p>
                    <input type="radio" name="food" id="other" value="other">
                    <label for="other">Other</label>
                </p>

            </fieldset>
            <fieldset>
                <legend>Do you Have Pets?</legend>
                <p>
                    <input type="checkbox" name="pets" id="dog" value="dog">
                    <label for="dog">Dog</label>
                </p>
                <p>
                    <input type="checkbox" name="pets" id="cat" value="cat">
                    <label for="cat">Cat</label>
                </p>
                <p>
                    <input type="checkbox" name="pets" id="fish" value="fish">
                    <label for="fish">Fish</label>
                </p>
                <p>
                    <input type="checkbox" name="pets" id="other" value="other">
                    <label for="other">Other</label>
                </p>
            </fieldset>
            <fieldset>
                <legend>Send me a Note</legend>
                <label for="message">Your Message</label>
                <br>
                <textarea name="message" id="message" cols="30" rows="10" placeholder="type your message"></textarea>
            </fieldset>
            <br>
            <button type="submit">Submit</button>
            <button type="submit" formaction="https://httpbin.org/post">Submit Post</button>
            <button type="reset">Reset</button>
            </form>
```