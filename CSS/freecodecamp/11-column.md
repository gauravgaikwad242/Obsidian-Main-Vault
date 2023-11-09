#CSSProperties 

#column-count 
- apply this property to parent of the elements which we want to arrange as columns 
#column-width
- for giving minimum width to the columns if the width goes below this it will get stacked and not shrink
#column-rule
- column rule will crete section between column like border but single line 
#column-gap
- will apply the gap in columns 
```css
.column {
    /* this will arrange all the child element into columns */
    column-count: 4;
    /* so each column must be getting 250px minimum or else it will be stacked below
    the other column if the width decreasess further all column will be in one line */
    column-width: 250px;

    /* same as above two properties */
    columns: 4 250px;
    /* column rule will crete section between column like border but single line */
    column-rule: 3px solid #333;
    /* spacing between column */
    column-gap:3rem;

}
```

#break-inside
- this will avoid the data of one paragraph in getting two column 
- i.e. splitting of a paragraph in two columns
```css
.column h2 {
    break-inside: avoid;
}
```

#column-span : all
- this will span that element or paragraph into all the column and will get into middle
![alt text](image1.png)
