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

```html
<body>
    <div class="outer-container">
        <div class="inner-container">
            <div class="box absolute">
                <p>Absolute</p>
            </div>
            <div class="box relative">
                <p>Relative</p>
            </div>
            <div class="box fixed">
                <p>Fixed </p>
            </div>
            <div class="box sticky">
                <p>Sticky</p>
            </div>
        </div>
    </div>
</body>
```

```css
@import url("https://fonts.googleapis.com/css2?family=Roboto&family=Lobster&display=swap");

* {
  margin: 0;
  padding: 0;
  box-sizing: border-box;
}

body {
  font-family: "Roboto", sans-serif;
  font-size: 1.5rem;
  min-height: 200vh;
}

.outer-container {
  border: 3px dashed #000;
  width: 75vw;
  height: 85vh;
  margin: 40px auto;

  /* position: relative; */
}

.inner-container {
  border: 2px solid #00f;
  width: 40vw;
  height: 50vh;
  margin: 200px auto;
}

.box {
  width: 150px;
  height: 150px;
  color: #fff;
  padding: 1rem;
}

.absolute {
    background-color: blue;
    /* static is default */
    position: static;
    /* needs top bottom etc
    if there is no parent element for absolute 
    it will take most outer elemtne as parent */
    /* this will set box to top left
    %1
    %2 */
    position: absolute;
    top: 0;
    left: 100px;

    /* we can hide the some element 
    from page but we want it to render */
    /* left: -100000px; */

    /* to make aboslute box on top of fixed even if
    it comes later in code  */
    z-index: 1;

}

.relative {
    background-color: red;
    /* by default it will be relative to parent element */
    position: relative;
    top: 10px;
    left: 10px;
}

.fixed {
    /* even if we scroll it will stay at same 
    position it will have fixed position
    
    if fixed comes last it will be above other elements*/
    background-color: green;
    position: fixed;
    top: 100px;
}

.sticky {
    background-color: black;
    position: sticky;
/* this will make it stick at top for a moment */
/* it will stick at top till
the whole parent elemtn is scrolled
once the parent is out of screnn 
it will unstick */
    top: 0;
}
```