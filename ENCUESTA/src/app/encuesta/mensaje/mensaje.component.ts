import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-mensaje',
  templateUrl: './mensaje.component.html',
  styleUrls: ['./mensaje.component.css']
})
export class MensajeComponent implements OnInit {

  mens: string = '';
  mensaje: string = '';
  mensajes: string[] = [
    'A ocurrido un problema, por favor intentar de nuevo',
    'Encuesta registrada con éxito' 
  ];

  constructor(
    private router:Router,
    private route: ActivatedRoute
  ) { }

  ngOnInit(): void {

    this.mens = this.route.snapshot.paramMap.get('m') + '';
    this.mensaje = this.mensajes[Number(this.mens) -1];
  }

  onReturnIni(){
    this.router.navigateByUrl('/');
  }
}
