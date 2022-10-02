import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AngularTimelinesAppComponent } from './angular-timelines-app/angular-timelines-app.component';
import {TimelinesComponent} from "./angular-timelines-app/timelines/timelines.component";
import { AngularProductManagementComponent } from './angular-product-management/angular-product-management.component';
import { YoutubePlaylistComponent } from './angular-product-management/youtube-playlist/youtube-playlist.component';
import { YoutubePlayerComponent } from './angular-product-management/youtube-player/youtube-player.component';
import { AngularPlaylistManagementComponent } from './angular-playlist-management/angular-playlist-management.component';
import { ProductListComponent } from './angular-playlist-management/product/product-list/product-list.component';
import { ProductCreateComponent } from './angular-playlist-management/product/product-create/product-create.component';
import {ReactiveFormsModule} from "@angular/forms";

@NgModule({
  declarations: [
    AppComponent,
    AngularTimelinesAppComponent,
    TimelinesComponent,
    TimelinesComponent,
    AngularProductManagementComponent,
    YoutubePlaylistComponent,
    YoutubePlayerComponent,
    AngularPlaylistManagementComponent,
    ProductListComponent,
    ProductCreateComponent
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
