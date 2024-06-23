import { HomePageComponent } from './registro/home-page/home-page.component';
import { EditarComponent } from './registro/editar/editar.component';
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

const routes: Routes = [

  {path: '', component: HomePageComponent},
  {path: 'editar', component: EditarComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
