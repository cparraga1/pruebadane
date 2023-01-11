package com.dane.dane.dto;

import java.sql.Timestamp;

public class ViajeroDto {

  private long idviajero;
  private String nombre;
  private String usucrea;
  private String fechacrea;
  private String usumodifica;
  private java.sql.Timestamp fechamodifica;

  public ViajeroDto() {
  }

  public ViajeroDto(String nombre, String usucrea, String fechacrea, String usumodifica, Timestamp fechamodifica) {
    this.nombre = nombre;
    this.usucrea = usucrea;
    this.fechacrea = fechacrea;
    this.usumodifica = usumodifica;
    this.fechamodifica = fechamodifica;
  }

  public long getIdviajero() {
    return idviajero;
  }

  public void setIdviajero(long idviajero) {
    this.idviajero = idviajero;
  }


  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
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


  public String getUsumodifica() {
    return usumodifica;
  }

  public void setUsumodifica(String usumodifica) {
    this.usumodifica = usumodifica;
  }


  public java.sql.Timestamp getFechamodifica() {
    return fechamodifica;
  }

  public void setFechamodifica(java.sql.Timestamp fechamodifica) {
    this.fechamodifica = fechamodifica;
  }

}
