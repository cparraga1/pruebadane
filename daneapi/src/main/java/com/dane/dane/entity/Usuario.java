package com.dane.dane.entity;
import javax.persistence.*;

@Entity
public class Usuario {

  @Id
  private String idusuario;
  private String contrasena;
  private String usucrea;
  private String fechacrea;

  public Usuario() {
  }

  public Usuario(String usuario, String contrasena, String usucrea, String fechacrea) {
    this.idusuario = usuario;
    this.contrasena = contrasena;
    this.usucrea = usucrea;
    this.fechacrea = fechacrea;
  }

  public String getIdusuario() {
    return idusuario;
  }

  public void setIdusuario(String idusuario) {
    this.idusuario = idusuario;
  }


  public String getContrasena() {
    return contrasena;
  }

  public void setContrasena(String contrasena) {
    this.contrasena = contrasena;
  }


  public String getUsucrea() {
    return usucrea;
  }

  public void setUsucrea(String usucrea) {
    this.usucrea = usucrea;
  }


  public String getFechacrea() {
    return fechacrea;
  }

  public void setFechacrea(String fechacrea) {
    this.fechacrea = fechacrea;
  }

}
