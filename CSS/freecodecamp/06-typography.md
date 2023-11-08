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