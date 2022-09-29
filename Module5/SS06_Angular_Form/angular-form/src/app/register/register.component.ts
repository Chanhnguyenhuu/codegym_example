import { Component, OnInit } from '@angular/core';
import {FormControl, FormGroup, Validators} from "@angular/forms";

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  registerForm : FormGroup;

  constructor() { }

  ngOnInit(): void {
    this.registerForm = new FormGroup({
      email : new FormControl(),
      password : new FormControl(),
      confirmPassword : new FormControl(),
      country : new FormControl(),
      age : new FormControl(),
      gender : new FormControl(),
      phone : new FormControl(),
    })
  }

  onSubmit() {
    console.log(this.registerForm.value);
  }

}
