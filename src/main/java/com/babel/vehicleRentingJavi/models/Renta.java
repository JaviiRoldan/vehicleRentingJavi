package com.babel.vehicleRentingJavi.models;

import java.util.Date;

public class Renta {
    private Integer rentaId;
    private Integer personaId;
    private Integer profesionId;
    private Integer anio;
    private Double importe;
    private Integer isCuentaPropia;
    private String iae;
    private String cifEmpleador;
    private Date fechaInicioEmpleo;

    public Integer getRentaId() {
        return rentaId;
    }

    public void setRentaId(Integer rentaId) {
        this.rentaId = rentaId;
    }

    public Integer getPersonaId() {
        return personaId;
    }

    public void setPersonaId(Integer personaId) {
        this.personaId = personaId;
    }

    public Integer getProfesionId() {
        return profesionId;
    }

    public void setProfesionId(Integer profesionId) {
        this.profesionId = profesionId;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public Double getImporte() {
        return importe;
    }

    public void setImporte(Double importe) {
        this.importe = importe;
    }

    public Integer getIsCuentaPropia() {
        return isCuentaPropia;
    }

    public void setIsCuentaPropia(Integer isCuentaPropia) {
        this.isCuentaPropia = isCuentaPropia;
    }

    public String getIae() {
        return iae;
    }

    public void setIae(String iae) {
        this.iae = iae;
    }

    public String getCifEmpleador() {
        return cifEmpleador;
    }

    public void setCifEmpleador(String cifEmpleador) {
        this.cifEmpleador = cifEmpleador;
    }

    public Date getFechaInicioEmpleo() {
        return fechaInicioEmpleo;
    }

    public void setFechaInicioEmpleo(Date fechaInicioEmpleo) {
        this.fechaInicioEmpleo = fechaInicioEmpleo;
    }
}
