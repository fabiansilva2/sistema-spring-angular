import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { RegistroRoutingModule } from './registro-routing.module';
import { HomePageComponent } from './home-page/home-page.component';
import {MatTableModule} from '@angular/material/table';
import { EditarComponent } from './editar/editar.component';

@NgModule({
  declarations: [
    HomePageComponent,
    EditarComponent
  ],
  imports: [
    CommonModule,
    RegistroRoutingModule,
    MatTableModule
  ],
  exports: [
    HomePageComponent,
  ]
})
export class RegistroModule { }
