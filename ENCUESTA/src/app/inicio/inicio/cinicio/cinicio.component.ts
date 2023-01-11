import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { CinicioService } from '../../services/cinicio.service';
import Swal from 'sweetalert2'

@Component({
  selector: 'app-cinicio',
  templateUrl: './cinicio.component.html',
  styleUrls: ['./cinicio.component.css']
})
export class Cinicio implements OnInit {

  public formulario: FormGroup;
  public infoUsuario: any;

  constructor(
    private service: CinicioService,
    private router: Router,
    private formBuilder: FormBuilder) {
  }

  ngOnInit() {

    this.formulario = this.formBuilder.group({
      usuario: ['', Validators.required],
      contrasenia: ['', [Validators.required]]
    })
  }

  ingresar() {

    Swal.fire({
      text: 'Ingresando...',
      timerProgressBar: true,
      didOpen: () => {
        Swal.showLoading();

        this.service.validarUsuario(this.formulario.value.usuario).subscribe(
          res => {
            this.infoUsuario = res;
            if (res != null) {
              this.router.navigateByUrl('/encuesta/' + this.formulario.value.usuario);
              Swal.close();
            } else {
              this.router.navigateByUrl('/register');
              Swal.close();
            }
          },
          error => {
            this.router.navigateByUrl('/mensaje/0');
            Swal.close();
          });
      }
    })

  }
}
