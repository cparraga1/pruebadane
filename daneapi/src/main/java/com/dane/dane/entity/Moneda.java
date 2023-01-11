package com.dane.dane.entity;
import javax.persistence.*;

@Entity
public class Moneda {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long idmoneda;
  private String nombre;
  private String usuacrea;
  private String fechacrea;
  private String usumodifica;
  private String fechamodifica;

  public Moneda() {
  }

  public Moneda(String nombre, String usuacrea, String fechacrea, String usumodifica, String fechamodifica) {
    this.nombre = nombre;
    this.usuacrea = usuacrea;
    this.fechacrea = fechacrea;
    this.usumodifica = usumodifica;
    this.fechamodifica = fechamodifica;
  }

  public long getIdmoneda() {
    return idmoneda;
  }

  public void setIdmoneda(long idmoneda) {
    this.idmoneda = idmoneda;
  }


  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }


  public String getUsuacrea() {
    return usuacrea;
  }

  public void setUsuacrea(String usuacrea) {
    this.usuacrea = usuacrea;
  }


  public String getFechacrea() {
    return fechacrea;
  }

  public void setFechacrea(String fechacrea) {
    this.fechacrea = fechacrea;
  }


  public String getUsumodifica() {
    return usumodifica;
  }

  public void setUsumodifica(String usumodifica) {
    this.usumodifica = usumodifica;
  }


  public String getFechamodifica() {
    return fechamodifica;
  }

  public void setFechamodifica(String fechamodifica) {
    this.fechamodifica = fechamodifica;
  }

}
