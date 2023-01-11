import Swal from 'sweetalert2';
import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormControl, FormGroup, Validators } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { Usuario } from 'src/app/inicio/model/usuario';
import { CinicioService } from '../../services/cinicio.service';

@Component({
  selector: 'app-cregistro',
  templateUrl: './cregistro.component.html',
  styleUrls: ['./cregistro.component.css']
})
export class CregistroComponent implements OnInit {

  formulario: FormGroup;

  constructor(
    private router: Router,
    private formBuilder: FormBuilder,
    private service: CinicioService
  ) {
  }

  ngOnInit(): void {

    this.formulario = this.formBuilder.group({
      usuario: [null, [Validators.required]],
      contrasenia: [null, [Validators.required]],
    })
  }

  registro() {
    const usuario = new Usuario(
      this.formulario.value.usuario,
      this.formulario.value.contrasenia,
      this.formulario.value.usuario, ''
    );

    Swal.fire({
      text: 'Guardando...',
      timerProgressBar: true,
      didOpen: () => {
        Swal.showLoading();

        this.service.saveUsuario(usuario).subscribe(
          data => {
            Swal.close();
            this.router.navigateByUrl('/encuesta/' + this.formulario.value.usuario);            
          },
          err => {
            //console.log("Ocurrio un problema");
            this.router.navigateByUrl('/mensaje/0');
            Swal.close();
          }
        )
        Swal.close();
      }
    })
  };
}
