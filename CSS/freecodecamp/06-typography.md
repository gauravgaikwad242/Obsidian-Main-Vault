- *typography is the way that text is arranged and presented*
- *default browser font size is 16px which will be 1rem*

#CSSProperties 

#font-size 
- for setting font size 
- better to use `rem` or `em` unit to make page responsive 
- some element such as #button does not inherit the property
```css
body {
    color: whitesmoke;
    padding: 25%;
    font-size: 1.5rem;
 }
 
 input, button {
    font: inherit;
 }
```

#text-decoration
- for giving text underline linethrough or none
- we can remove the underline of anchor tag with value "none"
```css
    text-decoration: underline;
    text-decoration: overline;
    text-decoration: line-through;
    /* none will remove underline of a link */
    text-decoration: none;
```


#text-transform
- transforms the case of the text 
```css
    text-transform: uppercase;
    text-transform: capitalize;
    text-transform: lowercase;
    text-transform: none;
```

#text-align 
- to align the text inside a container 
```css
    text-align: justify;
    text-align: right;
    text-align: left;
```

#text-indent
- it like giving the tab i.e. 4 spaces 
```css 
    text-indent: 1em;
```

#line-height : no unit
- for setting the space between the lines
- increasese readability by increasing height between two line
```css 
line-height: 1.5;
```

#letter-spacing 
- for setting the space between each letter (alphabets)
```css 
    /* increases space beween letters */
    letter-spacing: 0.1em;
    letter-spacing: 0em;
```

#word-spacing
- for setting spaces between each work 
```css
	word-spacing: 0.1em;
```

- FONT PROPERTIES 

#font-weight 
- for setting boldness of font 
- around 300 - 400 by default
```css
    /* font-weight: bold or not */
    font-weight: 300;
    font-weight: 400;
    font-weight: bold;
    font-weight: normal;
```

#font-style 
```css
    font-style: italic;
    /* objlique is strong italic */
    font-style: oblique;
    font-style: normal;
```

#font-style 
- to set actual font style 
- better to use #font-family as it gives fallback if the font is not available on m/c
```css 
    /* serif is brower default */
    font-family: serif;
    font-family: sans-serif;
    font-family: monospace;
    font-family: cursive;
    font-family: fantasy;
```

#font-family 
- for setting font-style but it gives fallback if the font is not available on m/c
- if first is not available then it goes to 2nd and so on
```css 
    /*qotes needed for names with space */
    font-family: 'Courier New', Courier, monospace;
    font-family: Arial, Helvetica, sans-serif;
    font-family: Verdana, Geneva, Tahoma, sans-serif;
    font-family: 'Times New Roman', Times, serif;
```

#resource `fonts.google.com` for getting the fonts from internet
```css 
import at the top of file
    @import url('https://fonts.googleapis.com/css2?family=Roboto:ital@1&display=swap'); */

p {
font-family: 'Roboto', sans-serif;
}
```

<hr>

CODE  

```html 
    <body>
        <header>
            <h1>CSS Typography</h1>
        </header>
        <main>
            <p>LoremM ipsum dolor sit amet consectetur adipisicing elit. Autem consectetur voluptatum doloribus veritatis, voluptatibus quo deleniti sint quia porro quod labore quaerat velit beatae facere doloremque ullam quibusdam quam dolorum!</p>
            <section>
                <!-- <form action="">
                    <label for="name">Name:</label>
                    <input type="text" name="name" id="name" placeholder="your name">
                    <button type="submit">Submit</button>
                </form> -->
            </section>
            <article>
                <p class="capital">
                    LETS SEE IF THE IF ALL CAPITAL LETTERS WILL BE CONVERTED
                </p>
            </article>
        </main>
    </body>

```

```css 
@import url('https://fonts.googleapis.com/css2?family=Roboto:ital@1&display=swap');
/* typography is the way that text is arranged and presented */
/* browser size 16px for font */
body {
    background-color: #333;
    color: whitesmoke;

    padding: 25%;
    /* 2 times the browser ie 32px */
    font-size: 1.5rem;
    /* color: purple; */
}

/* child of body will inherit the font size from body */
/* but not for input and button */

 /* input, button {
    font: inherit; 

 } */


 p {
    text-decoration: underline;
    text-decoration: overline;
    text-decoration: line-through;
    /* none will remove underline of a link */
    text-decoration: none;

    text-transform: uppercase;
    text-transform: capitalize;
    text-transform: lowercase;
    text-transform: none;

    text-align: justify;
    text-align: right;
    text-align: left;

    /* TAB button */
    text-indent: 1em;

    /* increasese readability by increasing height between two line */
    line-height: 1.5;
    /* increases space beween letters */
    letter-spacing: 0.1em;
    letter-spacing: 0em;

    word-spacing: 0.1em;

    /* FONT PROPERTIES */
    /* font-weight: bold or not */
    font-weight: 300;
    font-weight: 400;
    font-weight: bold;
    font-weight: normal;

    font-style: italic;
    /* objlique is strong italic */
    font-style: oblique;
    font-style: normal;

    /* serif is brower default */
    font-family: serif;
    font-family: sans-serif;
    font-family: monospace;
    font-family: cursive;
    font-family: fantasy;

    /* fallback mechanism if not 3 then 2 if not then 1 doubt**
    qotes needed for names with space */
    font-family: 'Courier New', Courier, monospace;
    font-family: Arial, Helvetica, sans-serif;
    font-family: Verdana, Geneva, Tahoma, sans-serif;
    font-family: 'Times New Roman', Times, serif;
    /* websafe font  */

    /* fonts.google.com */
    font-family: 'Roboto', sans-serif;
    /* we can import this from directly into css
    imported at top
    @import url('https://fonts.googleapis.com/css2?family=Roboto:ital@1&display=swap'); */

 }

 .capital {
   text-transform: capitalize;
 }

```