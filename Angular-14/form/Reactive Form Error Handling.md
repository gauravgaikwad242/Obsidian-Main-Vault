```html 
<p>form-demo3 works!</p>

<form [formGroup]="registerForm" (submit)="submitMyForm(registerForm)" class="p-2 border col-sm-3 offset-3">
    <p>
        First Name:
        <input type="text" formControlName="firstName">
        <span class="text-danger" *ngIf="registerForm.controls.firstName.hasError('required') && registerForm.controls.firstName.dirty">First Name Is mandatory</span>
        <span class="text-danger" *ngIf="registerForm.controls.firstName.hasError('minlength') && registerForm.controls.firstName.dirty">Minimum 5 chars required</span>
    </p>
    <p>
        last Name:
        <input type="text" formControlName="lastName">
    </p>
    <p>
        email:
        <input type="email" formControlName="email">
        <span class="text-danger" *ngIf="registerForm.controls.email.hasError('required') && registerForm.controls.email.dirty">email Mandatory</span>
        <span class="text-danger" *ngIf="registerForm.controls.email.hasError('email') && registerForm.controls.email.dirty">email Format is not correct</span>
        <span class="text-danger" *ngIf="registerForm.controls.email.hasError('invalidMail') && registerForm.controls.email.dirty">Custom Validation error</span>
    </p>
    <fieldset formGroupName="address">
        <p>
            City:
            <input type="text" formControlName="city">
        </p>
        <p>
            state:
            <select formControlName="state">
                <option>Odisha</option>
                <option>Karnataka</option>
                <option>Bihar</option>
                <option>Tamilnadu</option>
                <option>Kerla</option>
                <option>UP</option>
            </select>
        </p>
        <p>
            PIN:
            <input formControlName="pin">
        </p>
    </fieldset>
    <input type="submit" value="submit" class=m-3>
    <input type="reset" value="clear">
</form>

<h3>{{registerForm.value | json}}</h3>
<h3>{{registerForm.valid}}</h3>
```

```ts 
import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormControl, FormGroup, Validators } from '@angular/forms';
import { MyEmailValidator } from 'src/app/utils/my-email-validator';

@Component({
  selector: 'app-form-demo3',
  templateUrl: './form-demo3.component.html',
  styleUrls: ['./form-demo3.component.css'],
})
export class FormDemo3Component implements OnInit {
  registerForm: any;

  constructor(private formBuilder: FormBuilder) {
    // this.initializeMyForm();
    this.initializeMyFormUsingFormBuilder()
  }

  ngOnInit(): void {
  }

  initializeMyForm() {
    this.registerForm = new FormGroup({
      firstName: new FormControl('sachin',[Validators.required,Validators.minLength(5)]),
      lastName: new FormControl(),
      address: new FormGroup({
        city: new FormControl(),
        state: new FormControl(),
        pin: new FormControl(),
      }),
    });
  }
  initializeMyFormUsingFormBuilder(){
      this.registerForm = this.formBuilder.group({
        firstName: new FormControl('sachin',[Validators.required,Validators.minLength(5)],[]),
        lastName: new FormControl(),
        email:new FormControl('abc@gmail.com',[Validators.email,Validators.required,MyEmailValidator.isValidEmail]),
        address: new FormGroup({
          city: new FormControl(),
          state: new FormControl(),
          pin: new FormControl(),
        }),
      })
  } 

  submitMyForm(formdata:any){
    console.log(formdata)
  }
}

```