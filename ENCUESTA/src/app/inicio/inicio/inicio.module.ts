import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { Cinicio } from './cinicio/cinicio.component';
import { CinicioService } from '../services/cinicio.service';
import { HttpClientModule } from '@angular/common/http';
import { CregistroComponent } from './cregistro/cregistro.component';
import { PdfMakeWrapper } from 'pdfmake-wrapper';
import * as pdfFonts from "pdfmake/build/vfs_fonts";
import { ReactiveFormsModule } from '@angular/forms';
import { NgxCaptchaModule } from 'ngx-captcha';

PdfMakeWrapper.setFonts(pdfFonts);

@NgModule({
  declarations: [
    Cinicio,
    CregistroComponent
  ],
  imports: [
    CommonModule,
    FormsModule,
    HttpClientModule,
    ReactiveFormsModule,
    NgxCaptchaModule
  ],
  exports: [
    Cinicio,
    CregistroComponent,
  ],
  providers:[
    CinicioService,
    CregistroComponent,
  ]
})
export class InicioModule { }
