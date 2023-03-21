package com.babel.vehicleRentingJavi.models;

public class Direccion {
    private Integer direccionId;
    private Integer tipoViaId;
    private String nombreCalle;
    private String numero;
    private String piso;
    private String codPostal;
    private String municipio;
    private String provinciaCod;


    public Integer getDireccionId() {
        return direccionId;
    }

    public void setDireccionId(Integer direccionId) {
        this.direccionId = direccionId;
    }

    public Integer getTipoViaId() {
        return tipoViaId;
    }

    public void setTipoViaId(Integer tipoViaId) {
        this.tipoViaId = tipoViaId;
    }

    public String getNombreCalle() {
        return nombreCalle;
    }

    public void setNombreCalle(String nombreCalle) {
        this.nombreCalle = nombreCalle;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getPiso() {
        return piso;
    }

    public void setPiso(String piso) {
        this.piso = piso;
    }

    public String getCodPostal() {
        return codPostal;
    }

    public void setCodPostal(String codPostal) {
        this.codPostal = codPostal;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getProvinciaCod() {
        return provinciaCod;
    }

    public void setProvinciaCod(String provinciaCod) {
        this.provinciaCod = provinciaCod;
    }
}
