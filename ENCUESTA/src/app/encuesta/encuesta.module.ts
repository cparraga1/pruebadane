import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { EncuestaComponent } from './encuesta/encuesta.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule} from '@angular/common/http';
import { MensajeComponent } from './mensaje/mensaje.component';
import { NgxCaptchaModule } from 'ngx-captcha';


@NgModule({
  declarations: [
    EncuestaComponent,
    MensajeComponent
  ],
  imports: [
    CommonModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule,
    NgxCaptchaModule
  ],
  exports:[
    EncuestaComponent,
  ]
})
export class EncuestaModule { }
