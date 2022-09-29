import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AngularNameCardComponent } from './angular-name-card/angular-name-card.component';
import { TodoComponent } from './angular-name-card/todo/todo.component';
import {ReactiveFormsModule} from "@angular/forms";
import { RegisterComponent } from './register/register.component';

@NgModule({
  declarations: [
    AppComponent,
    AngularNameCardComponent,
    TodoComponent,
    RegisterComponent
  ],
    imports: [
        BrowserModule,
        AppRoutingModule,
        ReactiveFormsModule
    ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
