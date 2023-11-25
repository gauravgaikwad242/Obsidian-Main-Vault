- import ReactiveFormsModule inside respective module
```ts 
import { FormsModule, ReactiveFormsModule } from '@angular/forms';


@NgModule({
  declarations: [
    OnboardingComponent
  ],
  imports: [
    FormsModule,
    ReactiveFormsModule
  ]
})
export class OnboardingModule { }

```

- component
```ts
import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, FormArray, FormControl, Validators } from '@angular/forms';

@Component({
  selector: 'app-form-demo4',
  templateUrl: './form-demo4.component.html',
  styleUrls: ['./form-demo4.component.css'],
})
export class FormDemo4Component implements OnInit {
  empForm!: FormGroup;

  constructor(private fb: FormBuilder) {}

  ngOnInit() {
    this.empForm = this.fb.group({
      employees: this.fb.array([]),
    });
  }

  employees(): FormArray {
    return this.empForm.get('employees') as FormArray;
  }

  newEmployee(): FormGroup {
    return this.fb.group({
      firstName: new FormControl('',[Validators.required,Validators.minLength(5)]),
      lastName: '',
      skills: this.fb.array([]),
    });
  }

  addEmployee() {
    this.employees().push(this.newEmployee());
  }

  removeEmployee(empIndex: number) {
    this.employees().removeAt(empIndex);
  }

  employeeSkills(empIndex: number): FormArray {
    return this.employees().at(empIndex).get('skills') as FormArray;
  }

  newSkill(): FormGroup {
    return this.fb.group({
      skill: '',
      exp: '',
    });
  }

  addEmployeeSkill(empIndex: number) {
    this.employeeSkills(empIndex).push(this.newSkill());
  }

  removeEmployeeSkill(empIndex: number, skillIndex: number) {
    this.employeeSkills(empIndex).removeAt(skillIndex);
  }

  onSubmit() {
    console.log(this.empForm.value);
  }

  printMe(empIndex:number){
    console.log(this.employees().at(empIndex) )
  }
  checkMe(empIndex:number,fieldName:any){
    const formArray = this.employees().at(empIndex) as FormArray;
    return formArray.controls[fieldName].hasError('minlength')
  }
}

```

```html
<h1>Angular Nested FormArray / Dynamic FormArray</h1> 
<form [formGroup]="empForm" (ngSubmit)="onSubmit()">
  <div formArrayName="employees">
    <div *ngFor="let employee of employees().controls; let empIndex=index">
      <div
        [formGroupName]="empIndex"
        style="border: 2px solid blue; padding: 10px; width: 750px; margin: 10px;"
      >
        {{empIndex}} First Name :
        <input type="text" formControlName="firstName" />
        <span class="text-danger" *ngIf="checkMe(empIndex,'firstName')">
          Minimum 5 chars required
        </span>
        Last Name:
        <input type="text" formControlName="lastName" />
 
        <button (click)="removeEmployee(empIndex)">Remove Emp</button>
 
        <div formArrayName="skills">
          <div
            *ngFor="let skill of employeeSkills(empIndex).controls; let skillIndex=index"
          >
            <div [formGroupName]="skillIndex">
              {{skillIndex}} Skill :
              <input type="text" formControlName="skill" />
              Exp:
              <input type="text" formControlName="exp" />
 
              <button (click)="removeEmployeeSkill(empIndex,skillIndex)">
                Remove Skill
              </button>
            </div>
          </div>
        </div>
        <button type="button" (click)="addEmployeeSkill(empIndex)">
          Add Skill
        </button>
      </div>
    </div>
    <button type="button" (click)="addEmployee()">Add Employee</button>
  </div>
</form>
 
{{this.empForm.value | json}}
```