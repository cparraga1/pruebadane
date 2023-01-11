export class Usuario {
  idusuario: string;
  contrasena: string;
  usucrea: string;
  fechacrea: string;

  constructor(
    idusuario: string,
    contrasena: string,
    usucrea: string,
    fechacrea: string) {
    this.idusuario = idusuario;
    this.contrasena = contrasena;
    this.usucrea = usucrea;
    this.fechacrea = fechacrea;
  }
}
