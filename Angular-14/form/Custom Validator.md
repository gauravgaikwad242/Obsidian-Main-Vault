- instead of writing logic in class we can directly export function

```ts
import { FormControl } from "@angular/forms";

export function MyEmailValidator {

  static isValidEmail(inputBox: FormControl) {
    if (inputBox.value !== 'sanjay@gmail.com') {
      return { invalidMail: true }; //The Control is invalid
    }
    return null; //The control is valid
  }

}
```

```ts 
import { FormControl } from "@angular/forms";

export class MyEmailValidator {

  static isValidEmail(inputBox: FormControl) {
    if (inputBox.value !== 'sanjay@gmail.com') {
      return { invalidMail: true }; //The Control is invalid
    }
    return null; //The control is valid
  }

}

```

- use in ts file 
```ts 
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
```