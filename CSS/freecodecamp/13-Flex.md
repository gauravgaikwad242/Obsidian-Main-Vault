`display: flex;`

#CSSProperties 

#display : flex

#align-items:
- this will align the elements in the flex container in the direction of flex
- i.e. if the flex direction is row , the property value flex-start will align the element at top left of the container 

```css
  align-items: flex-end;
  align-items: center;
  align-items: flex-start;
  align-items: center;
```

#justify-content:
- same as above #align-items but the alignment will be done in opposite direction
```css 
  justify-content: flex-end; - at the end of opposite of flex direction
  justify-content: center; - at centre
  justify-content: space-around; - space will be not evenly 
  justify-content: space-between; - it will evenly space out the elements - child elements
  /* better than space between */
  justify-content: space-evenly; - it will evenly space out the elements - child elements, better than space between
```

#flex-direction : row or : column
- this will set the direction of flex
- by default it will be row 

#flex-wrap: wrap, :nowrap 
- by default it will be set to nowrap 
- it will avoid the content to overlfow

#align-content : space-evenly
- this will be applied over the all element row consider as 1 element 1 row as 1 item

#gap : 1rem 
- it will set the gap in all the child element of flex box 

#margin-inline
	it will set the same margin on both side of element

#collectmoredetails ]
#flex-grow
#flex-shrink
#flex-basis

```html
<body>
   <main class="container">
        <div class="box">1</div>
        <div class="box">2</div>
        <div class="box">3</div>
        <div class="box">4</div>
        <div class="box">5</div>
        <div class="box">6</div>
   </main>
</body>

```

```css 
@import url("https://fonts.googleapis.com/css2?family=Roboto&display=swap");

* {
  margin: 0;
  padding: 0;
  box-sizing: border-box;
}

body {
  font-family: "Roboto", sans-serif;
  min-height: 100vh;
  padding: 20px;
}

.container {
  max-width: 800px;
  min-height: 400px;
  
  /* it will set margin on both side same */
  margin-inline: auto;
  border: 1px solid #000;

  /* this will make all div verticle */
  display: flex;

  justify-content: flex-end;
  justify-content: center;
  /* this will set 1 gap in all element */
  gap: 1rem;

  /* space will be not evenly  */
  justify-content: space-around;

  /* it will evenly space out the elements - child elements */
  justify-content: space-between;
  /* better than space between */
  justify-content: space-evenly;

  /* this will make elem go to bottom */
  align-items: flex-end;
  align-items: center;

  /* by default it is row */
  flex-direction: column;

  align-items: flex-start;
  align-items: center;

  flex-direction: row-reverse;
  /* flex-direction: column-reverse; */
  flex-direction: row;
  /* to reverse the row */

  /* this will make the overlflow of 
  element stop out of parent element */
  flex-wrap: wrap;

  flex-wrap: nowrap;

  /* mix of direction and wrap properties */
  /* flex-flow: row wrap; */


  /* this will be applied over the all element row consider as 1 element
  1 row as 1 item */
  align-content: space-evenly;

} 

.box {
  /* min-width: 100px; */
  height: 100px;
  background-color: #000;
  color: #fff;
  font-size: 2rem;
  padding: 0.5rem;


  flex-grow: 1;
  flex-shrink: 1;
  /* in this caes it will give min width */
  flex-basis: 100px;

  /* grow shrink basis */
  /* flex: 1 1 100; */
  flex: 1 1 250%;
}

.box:nth-child(2) {
    /* this is not 2 times
    but what ever the width after flexbasis which is 100px 
    it will grow twice as  */
    flex-grow: 2;
    /* same as flex grow but for shrinking */
    flex-shrink: 2;

    flex: 2 2 250%;

    /* it will make the element go to position
    before 0  */
    order: -1;

/* flexbox froggy .com for flex box practice */
}
```