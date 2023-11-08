```html
            <ol start="5" reversed>
                <li>Step One</li>
                <li value="26">Step Two</li>
                <li>Step Three</li>
            </ol>
            <ul>
                <li>Step One</li>
                <li>Step Two</li>
            </ul>
```

#CSSProperties 

#list-style-type
	to change the bullet symbols of style 
	or to disable the symbol
```css
ol {
    /* bullet symbols */
    list-style-type: none; no bullet 
    list-style-type: decimal-leading-zero; - like 1.0
    list-style-type: disc; - like dot symbols
    list-style-type: lower-roman; i ii
    list-style-type: lower-alpha; I II
    list-style-type: square;
}
```

#text-align #notspecific to list
- will make the text align at the given position 
- e.g. `text-align: center;` will center the text in container

#list-style-position
- #text-align  will only make the text at center but not the bullet marks 
- for solving this issue we use #list-style-position 
- value `inside` changes from browser to browser 
```css
    /* center wil only make text centre not bullet */
    text-align: center;
    /* to solve above problem */
    list-style-position: inside; 
```
#list-style-image 
- to set images instead of bullets for list 
- here the favicon.ico is present in same folder
```css
list-style-image: url('favicon.ico');
```

#content 
- to change the content of the bullet i.e. changing symbols to our own text 
```
ul ::marker {
    content: "only $5 >>";
}
```

<hr>


#sudoclass

#nth-child #notspecific to list 
- to select nth element in any parent element 
- e.g. to select nth and even element of li in ul
```css 
/* li has more specificity than ul */
ul li:nth-child(2) {
    color: red;
}
ul li:nth-child(even) {
    color: red;
}
```

<hr>


#sudoelement

#marker
- to style the bullet of the list 
```css 
 /* space is needed between element and marker */
ul ::marker {
    color: red;
    font-family: fantasy;
    font-size: 1em;
    /* content can be font awesome icon or svg */
    content: "only $5 >>";
}
```

<hr>
CODE 
<hr>

```html 
<body>
    <header>
        <h1>CSS Links</h1>
    </header>
    <main>
        <article>
            <h2>ordered List</h2>
            <!-- start att for starting oflist order reversed for reversingit -->
            <ol start="5" reversed>
                <li>Step One</li>
                <!-- value att for setting the index of element
                here 26 is letter z -->
                <li value="26">Step Two</li>
                <li>Step Three</li>
            </ol>
        </article>
        <article>
            <h2>un-ordered List</h2>
            <ul>
                <li>Step One</li>
                <li>Step Two</li>
                <li>Step Three</li>
            </ul>
        </article>
    </main>
</body>
```

```css 
@import url('https://fonts.googleapis.com/css2?family=Roboto@1&display=swap');

body {

    background-color: #333;
    color: whitesmoke;

    padding: 5% 10%;
    font-size: 2rem;
    font-family: 'Roboto', sans-serif;
}

ol {
    /* bullet symbols */
    list-style-type: none;
    list-style-type: decimal-leading-zero;
    list-style-type: disc; /*like ul*/
    list-style-type: lower-roman;
    list-style-type: lower-alpha;
}

ul {
    list-style-type: square;
    /* center wil only make text centre not bullet */
    text-align: center;
    /* to solve above problem */
    list-style-position: inside;

    color: yellow;
    line-height: 1.5;

    /* setting image for bullet */
    /* #url  */
    /* list-style-image: url('favicon.ico'); */

    /* list-style: square url('favicon.ico') inside; */
}

/* li has more specificity than ul */
ul li:nth-child(2) {
    color: red;
}
ul li:nth-child(even) {
    color: red;
}

/* SUDO ELEMENT
 MARKER #  */
 /* space is needed between element and marker */
ul ::marker {
    color: red;
    font-family: fantasy;
    font-size: 1em;
    /* content can be font awesome icon or svg */
    content: "only $5 >>";
}
```