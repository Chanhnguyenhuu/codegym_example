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
      email : new FormControl([], [Validators.required, Validators.email]),
      password : new FormControl([], [Validators.required, Validators.minLength(6)]),
      confirmPassword : new FormControl([], [Validators.required]),
      country : new FormControl([], [Validators.required]),
      age : new FormControl([], [Validators.required, Validators.min(18)]),
      gender : new FormControl([], [Validators.required]),
      phone : new FormControl(['+84'], [Validators.required, Validators.minLength(9), Validators.maxLength(10)]),
    })
  }

  onSubmit() {
      console.log(this.registerForm.value);
  }

  check(confirmPassword: String, password:String) {
      let confirmPass = confirmPassword.split('');
      let pass = password.split('');
      let item = false;
      if (confirmPass.length == pass.length) {
        for (let i = 0; i < pass.length; i++) {
          if (confirmPass[i] != pass[i]) {
            item = false;
            break;
          }
          else {
             item = true;
          }
        }
      }
      return item;
   }

}
