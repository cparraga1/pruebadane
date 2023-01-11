package com.dane.dane.dto;

public class GastoDto {

  private long idgasto;
  private long idtipogasto;
  private double valorpropio;
  private long idmonedapropio;
  private double valornotercero;
  private long idmonedatercero;
  private double valorsitercero;
  private long idmonedasitercero;
  private long numpersonas;
  private long idencuesta;

  public GastoDto() {
  }

  public GastoDto(long idtipogasto, double valorpropio, long idmonedapropio, double valornotercero, long idmonedatercero, double valorsitercero, long idmonedasitercero, long numpersonas, long idencuesta) {
    this.idtipogasto = idtipogasto;
    this.valorpropio = valorpropio;
    this.idmonedapropio = idmonedapropio;
    this.valornotercero = valornotercero;
    this.idmonedatercero = idmonedatercero;
    this.valorsitercero = valorsitercero;
    this.idmonedasitercero = idmonedasitercero;
    this.numpersonas = numpersonas;
    this.idencuesta = idencuesta;
  }

  public long getIdgasto() {
    return idgasto;
  }

  public void setIdgasto(long idgasto) {
    this.idgasto = idgasto;
  }


  public long getIdtipogasto() {
    return idtipogasto;
  }

  public void setIdtipogasto(long idtipogasto) {
    this.idtipogasto = idtipogasto;
  }


  public double getValorpropio() {
    return valorpropio;
  }

  public void setValorpropio(double valorpropio) {
    this.valorpropio = valorpropio;
  }


  public long getIdmonedapropio() {
    return idmonedapropio;
  }

  public void setIdmonedapropio(long idmonedapropio) {
    this.idmonedapropio = idmonedapropio;
  }


  public double getValornotercero() {
    return valornotercero;
  }

  public void setValornotercero(double valornotercero) {
    this.valornotercero = valornotercero;
  }


  public long getIdmonedatercero() {
    return idmonedatercero;
  }

  public void setIdmonedatercero(long idmonedatercero) {
    this.idmonedatercero = idmonedatercero;
  }


  public double getValorsitercero() {
    return valorsitercero;
  }

  public void setValorsitercero(double valorsitercero) {
    this.valorsitercero = valorsitercero;
  }


  public long getIdmonedasitercero() {
    return idmonedasitercero;
  }

  public void setIdmonedasitercero(long idmonedasitercero) {
    this.idmonedasitercero = idmonedasitercero;
  }


  public long getNumpersonas() {
    return numpersonas;
  }

  public void setNumpersonas(long numpersonas) {
    this.numpersonas = numpersonas;
  }


  public long getIdencuesta() {
    return idencuesta;
  }

  public void setIdencuesta(long idencuesta) {
    this.idencuesta = idencuesta;
  }

}
