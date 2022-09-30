import { Component, OnInit } from '@angular/core';
import {IRatingUnit} from "../irating-unit";

@Component({
  selector: 'app-rating-bar-component',
  templateUrl: './rating-bar-component.component.html',
  styleUrls: ['./rating-bar-component.component.css']
})
export class RatingBarComponentComponent implements OnInit {

  ratings : IRatingUnit[] = [];
  rating : IRatingUnit = {value: 1, active: false};

  constructor() {
    for (let i = 1; i <= 10; i++) {
      const obj : IRatingUnit = {value: i, active: false};
      this.ratings.push(obj);
      console.log(obj);
    }
  }

  ngOnInit(): void {
  }

  vote(rating: IRatingUnit) {
    for (const item of this.ratings) {
      if (item.value <= rating.value) {
        item.active = true;
      } else {
        item.active = false;
      }
    }
  }
}
