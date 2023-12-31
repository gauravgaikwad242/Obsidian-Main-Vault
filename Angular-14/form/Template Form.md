#### import FormsModule inside the base module.ts file

```html 
<p>form-demo2 works!</p>

<form #myForm="ngForm" (submit)="submitMyForm(myForm.value)">
    <p>
        First name:
        <input name="firstName" [(ngModel)]='user.firstName' #fname="ngModel" ngModel required minlength="5"
            placeholder="Enter a Name" class="col-sm-3" />
        <span class="text-danger" *ngIf="fname.hasError('required') && fname.dirty">FirstName is Required</span>
        <span class="text-danger" *ngIf="fname.hasError('minlength') && fname.dirty">Minimum 5 chars required</span>
    </p>
    <p>
        Last name:
        <input name="lastName" [(ngModel)]='user.lastName' #lname="ngModel" ngModel required />
        <span *ngIf="lname.hasError('required')">Last Name is required</span>
    </p>
    <p>
        Email:
        <input name="email" type='email' [(ngModel)]='user.email' #email="ngModel" ngModel required />
        <span *ngIf="email.hasError('required')" class="text-danger">email required</span>
        <span *ngIf="email.hasError('email')" class="text-danger">email pattern is not correct</span>
    </p>
    <fieldset ngModelGroup="address">
        <legend>Address:</legend>
        Street : <input name="street" ngModel />
        City : <input name="city" ngModel />
        PIN : <input name="pin" ngModel />
    </fieldset>
    <input type="submit" value="submit" class="m-2" [disabled]="myForm.invalid">
    <input type="reset" value="clear">
</form>

<h3>{{myForm.value | json}}</h3>
<h3>{{user | json}}</h3>
<h3>Value:{{fname.value}} , Valid:{{fname.valid}} </h3>
```

```ts 
import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-form-demo2',
  templateUrl: './form-demo2.component.html',
  styleUrls: ['./form-demo2.component.css'],
})
export class FormDemo2Component implements OnInit {
  constructor() {}

  ngOnInit(): void {}

  user = {
    firstName: '',
    lastName: 'tendulkar',
    email: '',
    address: {
      street: '',
      city: '',
      pin: '',
    },
  };

  submitMyForm(myForm: NgForm) {
    console.log(myForm);
  }
}

```