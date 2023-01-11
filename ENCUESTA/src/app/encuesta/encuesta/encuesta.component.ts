import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { Encuesta } from '../models/encuesta';
import { EncuestaService } from '../services/encuesta.service';
import { CinicioService } from '../../inicio/services/cinicio.service';
import Swal from 'sweetalert2';

@Component({
  selector: 'app-encuesta',
  templateUrl: './encuesta.component.html',
  styleUrls: ['./encuesta.component.css']
})
export class EncuestaComponent implements OnInit {

  public infoEncuesta: any;
  encuestas: Encuesta[] = [];
  respuestas: String[] = ['', '', '', '', '', '', '', ''];
  public formulario: FormGroup;
  public identificacion: String | null = '';

  constructor(
    private router: Router,
    private route: ActivatedRoute,
    private formBuilder: FormBuilder,
    private encuestaService: EncuestaService,
    private service: CinicioService,
  ) { }

  ngOnInit(): void {

    const id = this.route.snapshot.paramMap.get('id');
    this.identificacion = id;

    this.formulario = this.formBuilder.group({

      pais: ['', Validators.required],
      nacionalidad: ['', Validators.required],
      sexo: ['', [Validators.required]],
      edad: ['', [Validators.required]],
      viaja: ['', Validators.required],
      numviajeros: ['', Validators.required],
      motivo: ['', Validators.required],
      tipoviaje: ['', Validators.required],
      servicio: ['', Validators.required],
    })
  }

  cancelar() {
    this.router.navigateByUrl('/encuesta');
  }

  cargarEncuestas(): void {
    this.encuestaService.lista().subscribe(
      data => {
        this.encuestas = data;
      },
      err => {
        console.log(err);
      }
    )
  }

  onCreate(): void {

    Swal.fire({
      text: 'Enviando...',
      timerProgressBar: true,
      didOpen: () => {
        Swal.showLoading();

        const encuesta = new Encuesta(
          0,
          this.identificacion + '',
          this.formulario.value.pais,
          this.formulario.value.nacionalidad,
          this.formulario.value.sexo,
          this.formulario.value.edad,
          this.formulario.value.numviajeros,
          this.formulario.value.idviajero,
          this.formulario.value.detalleviajeros,
          this.formulario.value.idtipoviaje,
          this.formulario.value.idtipoviajedetalle,
          this.formulario.value.idservicio,
          this.formulario.value.idserviciodetalle,
          this.formulario.value.idmotivo,
          this.formulario.value.idmotivodetalle
        );

        this.encuestaService.save(encuesta).subscribe(
          res => {
            this.router.navigateByUrl('/mensaje/1');
          },
          error => {
            this.router.navigateByUrl('/mensaje/0');
            Swal.close();
          });
        Swal.close();
      }
    })
  }
}
