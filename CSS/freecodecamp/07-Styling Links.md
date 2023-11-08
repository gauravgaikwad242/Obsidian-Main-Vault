```html
<a href="https://www.google.com/search?q=hypertext+links">hypertext links</a>
```

#CSSProperties

#cursor

```css
    cursor: not-allowed;
    cursor: pointer;
```

#opacity #notspecific to anchor
- gives transparency to the element, use case will be on hover link becomes a bit transparent

#background #notspecific to anchor 
- for giving background properties, use case will be on hover link gets a background color


<hr>

#sudoclass  Note: *sudo classes have generally more specificity than classes and element*

#visited 
- styling for visited links

#hover 
- hovering on the element, `not specific for anchor`

#focus
- focus is used when browsing website with the keyboard, a box will appear on that element

#active
- when clicking and holding on anchor links their color change 



<hr>

CODE 

```html
<body>
    <header>
        <h1>CSS Links</h1>
    </header>
    <main>
        <p>Welcome to my page about <a href="https: //www.google.com/search?q=cool+web+links">cool web links</a> .</p>
        <p>Actually .. that isn&apos;t a good search phrase .</p>
        <p>Let's search for <a href="https://www.google.com/search?q=hypertext+links">hypertext links</a> instead !</p>
        <p>I created page one with info about <a href="one.html">guitars</a> .</p>
        <p>I created page two with info about <a href="two.html">JavaScript</a> .</p>
    </main>
</body>
```

```css
@import url('https://fonts.googleapis.com/css2?family=Roboto:ital@1&display=swap');

body {

    background-color: #333;
    color: whitesmoke;

    padding: 10%;
    font-size: 2rem;
    font-family: 'Roboto', sans-serif;
}

a {
    text-decoration: none;

    cursor: not-allowed;
    cursor: pointer;

    color: rgb(178, 178, 245);
}

/* #SUDO CLASS
they represent state of class
SUDO CLASS HAVE MORE SPECIFICITY THAN THE BASIC ELEMENT  a:visited has more specificity than a
*/
a:visited {
    color: plum;
}

/* with focus it will give outline to link when using website with tab */
a:hover, a:focus     {
    /* transperency */
    opacity: 0.2;
    color: hsl(34, 78%, 91%, 0.6); /* 0.6 is opacity*/
    /* here backgournd will highlight the text */
    background: rgb(92, 91, 91)
}

/* active for long click */
a:active {
    color: red;
}
```