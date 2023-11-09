- Wrapping of text around the containers or images like in newspaper
#watchagain

#CSSProperties 

#float
- applying this property to the block or image will wrap other elements around it
```css
.left {
	float: right;
    float: left;
    margin-right: 1rem;
}
```

#clear

```css
.clear {
    clear:right;
    /* this will make the paragraph wrapped around , 
    if it ends then next paragraph will not wrap but it will start after the float body */
    clear: both;
    /* this is old way we have used section tag for this */
}
```

#display 
- 
```css
section {
     background-color: bisque;
     border: 1px solid #333;
     padding: 1rem;
     /* but if the text is samll th flaot box overflows */
     /* this will fix but is old way */
     /* overflow: auto; */
     /* this is new way modern way */
     display: flow-root;
}
```
