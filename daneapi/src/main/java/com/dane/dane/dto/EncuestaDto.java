package com.dane.dane.dto;

public class EncuestaDto {

  private long idencuesta;
  private String usuario;
  private String pais;
  private String nacionalidad;
  private String sexo;
  private long edad;
  private long numviajeros;
  private long idviajero;
  private String detalleviajeros;
  private long idtipoviaje;
  private String idtipoviajedetalle;
  private long idservicio;
  private String idserviciodetalle;
  private long idmotivo;
  private String idmotivodetalle;

  public EncuestaDto() {
  }

  public EncuestaDto(String usuario, String pais, String nacionalidad, String sexo, long edad, long numviajeros, long idviajero, String detalleviajeros, long idtipoviaje, String idtipoviajedetalle, long idservicio, String idserviciodetalle, long idmotivo, String idmotivodetalle) {
    this.usuario = usuario;
    this.pais = pais;
    this.nacionalidad = nacionalidad;
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

  public long getIdencuesta() {
    return idencuesta;
  }

  public void setIdencuesta(long idencuesta) {
    this.idencuesta = idencuesta;
  }


  public String getUsuario() {
    return usuario;
  }

  public void setUsuario(String usuario) {
    this.usuario = usuario;
  }


  public String getPais() {
    return pais;
  }

  public void setPais(String pais) {
    this.pais = pais;
  }


  public String getNacionalidad() {
    return nacionalidad;
  }

  public void setNacionalidad(String nacionalidad) {
    this.nacionalidad = nacionalidad;
  }


  public String getSexo() {
    return sexo;
  }

  public void setSexo(String sexo) {
    this.sexo = sexo;
  }


  public long getEdad() {
    return edad;
  }

  public void setEdad(long edad) {
    this.edad = edad;
  }


  public long getNumviajeros() {
    return numviajeros;
  }

  public void setNumviajeros(long numviajeros) {
    this.numviajeros = numviajeros;
  }


  public long getIdviajero() {
    return idviajero;
  }

  public void setIdviajero(long idviajero) {
    this.idviajero = idviajero;
  }


  public String getDetalleviajeros() {
    return detalleviajeros;
  }

  public void setDetalleviajeros(String detalleviajeros) {
    this.detalleviajeros = detalleviajeros;
  }


  public long getIdtipoviaje() {
    return idtipoviaje;
  }

  public void setIdtipoviaje(long idtipoviaje) {
    this.idtipoviaje = idtipoviaje;
  }


  public String getIdtipoviajedetalle() {
    return idtipoviajedetalle;
  }

  public void setIdtipoviajedetalle(String idtipoviajedetalle) {
    this.idtipoviajedetalle = idtipoviajedetalle;
  }


  public long getIdservicio() {
    return idservicio;
  }

  public void setIdservicio(long idservicio) {
    this.idservicio = idservicio;
  }


  public String getIdserviciodetalle() {
    return idserviciodetalle;
  }

  public void setIdserviciodetalle(String idserviciodetalle) {
    this.idserviciodetalle = idserviciodetalle;
  }


  public long getIdmotivo() {
    return idmotivo;
  }

  public void setIdmotivo(long idmotivo) {
    this.idmotivo = idmotivo;
  }


  public String getIdmotivodetalle() {
    return idmotivodetalle;
  }

  public void setIdmotivodetalle(String idmotivodetalle) {
    this.idmotivodetalle = idmotivodetalle;
  }

}
