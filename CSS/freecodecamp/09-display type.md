#CSSProperties 

#display 
- `display : block`
	- Defalut for block element
	- each element will go in next line and will be stacked on one another
	- e.g. div, section, article
- `display : inline
	- Default for inline element 
	- each element will we arranged in same row 
	- *we cannot apply properties such as heigh padding margin*
	- e.g. a, span, mark, abbr
- `display : block-inline`
	- this property will make inline element partially block where it will not create new line but will *get all properties which can be applied to block such as height, padding*

<hr>

CODE 

```html
    <main>
        <p>This is a paragraph</p>
        <p>This is <span class="opposite">another</span> paragraph</p>
    
        <hr>
        <br>
        <br>
        <br>

        <nav>
            <ul>
                <li><a href="one.html">Appetizer</a></li>
                <li><a href="one.html">Entrees</a></li>
                <li><a href="two.html">Desserts</a></li>
           </ul>
        </nav>
    </main>
```

```css 
@import url('https://fonts.googleapis.com/css2?family=Roboto@1&display=swap');

* {
    padding: 0;
    margin: 0;
    box-sizing: border-box;
}

body {
    font-size: 2rem;
    font-family: 'Roboto', sans-serif;
}
/* main {
    background-color: aqua;
    width: 50%;
} */

p {
    background-color: lightgray;
    /* we can apply margins to block level elements */
    /* margin: 100px 50px; */
}

.opposite {
    background-color: #333;
    color: whitesmoke;

    /* these both the properties doesnt apply to inline element */
    /* margin-top: 50px;
    height: 50px; */

    /* padding will be overlapping to the parent element */
    padding: 4rem;

    /* this will change the behaviour to  */
    /* display: inline-block;  will make the element as hybrid block where 
    it will not be created in new line but block properties can be applied to it*/
    display: inline-block;
    /* now margin and height can be applied */
    margin-top: 100px;
    height: 200px;
    padding: 4rem;
}



ul {
    list-style-type: none;
    padding: 0.5rem;
    text-align: right;
    background-color: #333;
    margin: 0;
}

li {
    /* this will make the li tags inline */
    /* display: none; will remove it from document and hide it */
    display: inline-block;
    margin-inline: 0.5rem;
}

li a {
    color: white;
    text-decoration: none;
}

li:hover, li:focus {
    color: white;
    text-decoration: underline;
}
```