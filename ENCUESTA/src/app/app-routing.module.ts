import { NgModule } from '@angular/core';
import {  RouterModule, Routes } from '@angular/router';
import { Cinicio } from './inicio/inicio/cinicio/cinicio.component';
import { CregistroComponent } from './inicio/inicio/cregistro/cregistro.component';
import { EncuestaComponent } from './encuesta/encuesta/encuesta.component';
import { MensajeComponent } from './encuesta/mensaje/mensaje.component';

const routes:Routes =[
    {
        path:"",
        component: Cinicio,
        pathMatch: 'full'
    },
    {
        path:"register",
        component: CregistroComponent
    },
    {
        path:"encuesta/:id",
        component: EncuestaComponent
    },
    {
        path:"mensaje/:m",
        component: MensajeComponent
    },
    {
        path:"**",
        redirectTo:""
    },
]

@NgModule({

  imports: [
      RouterModule.forRoot(routes)
  ],
  exports: [
      RouterModule
  ]
})
export class AppRoutingModule { }
