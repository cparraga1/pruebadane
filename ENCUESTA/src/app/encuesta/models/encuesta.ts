export class Encuesta {

  idencuesta: number;
  usuario: string;
  pais: string;
  nacionalidad: string;
  sexo: string;
  edad: number;
  numviajeros: number;
  idviajero: number;
  detalleviajeros: string;
  idtipoviaje: number;
  idtipoviajedetalle: string;
  idservicio: number;
  idserviciodetalle: string;
  idmotivo: number;
  idmotivodetalle: string;

  constructor(
    idencuesta: number,
    usuario: string,
    pais: string,
    nacionalidad: string,
    sexo: string,
    edad: number,
    numviajeros: number,
    idviajero: number,
    detalleviajeros: string,
    idtipoviaje: number,
    idtipoviajedetalle: string,
    idservicio: number,
    idserviciodetalle: string,
    idmotivo: number,
    idmotivodetalle: string
  ) {
    this.idencuesta = idencuesta;
    this.usuario = usuario;
    this.pais = pais;
    this.nacionalidad = nacionalidad
    this.sexo = sexo;
    this.edad = edad;
    this.numviajeros = numviajeros;
    this.idviajero = idviajero;
    this.detalleviajeros = detalleviajeros;
    this.idtipoviaje = idtipoviaje;
    this.idtipoviajedetalle = idtipoviajedetalle;
    this.idservicio = idservicio;
    this.idserviciodetalle = idserviciodetalle;
    this.idmotivo = idmotivo;
    this.idmotivodetalle = idmotivodetalle;
  }
}
