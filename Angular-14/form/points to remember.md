#### everything can be accessed form form group with CONTROLS property 
it is the object which has all info like errors value arrays etc


- for getting nested form error for array 
```html
<p *ngIf="topformgroup.controls.someformgroup.get(""+index1).get("formcontrolone").hasError("required")"></p>
```