import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-calculator',
  templateUrl: './calculator.component.html',
  styleUrls: ['./calculator.component.css']
})
export class CalculatorComponent implements OnInit {

  result:number = 0;
  number1:number;
  number2:number;

  constructor() { }

  ngOnInit(): void {
  }

  plus() {
    this.result = this.number1 + this.number2;
  }

  decreace() {
    this.result = this.number1 - this.number2;
  }

  multi() {
    this.result = this.number1 * this.number2;
  }

  div() {
    this.result = this.number1 / this.number2;
  }

}
