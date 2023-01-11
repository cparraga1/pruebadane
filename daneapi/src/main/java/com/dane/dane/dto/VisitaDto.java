package com.dane.dane.dto;

public class VisitaDto {

  private long idvisita;
  private String pais;
  private long propia;
  private long hotel;
  private long familiar;
  private long alquiler;
  private long otro;
  private long idencuesta;

  public VisitaDto() {
  }

  public VisitaDto(String pais, long propia, long hotel, long familiar, long alquiler, long otro, long idencuesta) {
    this.pais = pais;
    this.propia = propia;
    this.hotel = hotel;
    this.familiar = familiar;
    this.alquiler = alquiler;
    this.otro = otro;
    this.idencuesta = idencuesta;
  }

  public long getIdvisita() {
    return idvisita;
  }

  public void setIdvisita(long idvisita) {
    this.idvisita = idvisita;
  }


  public String getPais() {
    return pais;
  }

  public void setPais(String pais) {
    this.pais = pais;
  }


  public long getPropia() {
    return propia;
  }

  public void setPropia(long propia) {
    this.propia = propia;
  }


  public long getHotel() {
    return hotel;
  }

  public void setHotel(long hotel) {
    this.hotel = hotel;
  }


  public long getFamiliar() {
    return familiar;
  }

  public void setFamiliar(long familiar) {
    this.familiar = familiar;
  }


  public long getAlquiler() {
    return alquiler;
  }

  public void setAlquiler(long alquiler) {
    this.alquiler = alquiler;
  }


  public long getOtro() {
    return otro;
  }

  public void setOtro(long otro) {
    this.otro = otro;
  }


  public long getIdencuesta() {
    return idencuesta;
  }

  public void setIdencuesta(long idencuesta) {
    this.idencuesta = idencuesta;
  }

}
