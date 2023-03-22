package com.babel.vehicleRentingJavi.models;

import java.util.Date;
import java.util.List;

public class Persona {
    private Integer personaID;
    private String nombre;
    private String apellido1;
    private String apellido2;

    private Direccion direccionDomicilio;
    private Direccion direccionNotificacion;

    private boolean direccionDomicilioSameAsNotificaciones;
    private String nif;
    private Date fechaNacimiento;
    private String nacionalidad;
    private Integer scoring;
    private Date fechaScoring;

    public Integer getPersonaID() {
        return personaID;
    }

    public void setPersonaID(Integer personaID) {
        this.personaID = personaID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public Direccion getDireccionDomicilio() {
        return direccionDomicilio;
    }

    public void setDireccionDomicilio(Direccion direccionDomicilio) {
        this.direccionDomicilio = direccionDomicilio;
    }

    public Direccion getDireccionNotificacion() {
        return direccionNotificacion;
    }

    public void setDireccionNotificacion(Direccion direccionNotificacion) {
        this.direccionNotificacion = direccionNotificacion;
    }

    public boolean isDireccionDomicilioSameAsNotificaciones() {
        return direccionDomicilioSameAsNotificaciones;
    }

    public void setDireccionDomicilioSameAsNotificaciones(boolean direccionDomicilioSameAsNotificaciones) {
        this.direccionDomicilioSameAsNotificaciones = direccionDomicilioSameAsNotificaciones;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public Integer getScoring() {
        return scoring;
    }

    public void setScoring(Integer scoring) {
        this.scoring = scoring;
    }

    public Date getFechaScoring() {
        return fechaScoring;
    }

    public void setFechaScoring(Date fechaScoring) {
        this.fechaScoring = fechaScoring;
    }
}
