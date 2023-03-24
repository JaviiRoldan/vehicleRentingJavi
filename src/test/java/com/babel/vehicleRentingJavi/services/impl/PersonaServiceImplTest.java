package com.babel.vehicleRentingJavi.services.impl;

import com.babel.vehicleRentingJavi.exceptions.RequestApiValidationException;
import com.babel.vehicleRentingJavi.exceptions.RequiredMissingFieldException;
import com.babel.vehicleRentingJavi.models.Direccion;
import com.babel.vehicleRentingJavi.models.Persona;
import com.babel.vehicleRentingJavi.persistance.database.mappers.DireccionMapper;
import com.babel.vehicleRentingJavi.persistance.database.mappers.PersonaMapper;
import com.babel.vehicleRentingJavi.services.PersonaService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

public class PersonaServiceImplTest {

    PersonaService servicio;
    PersonaMapper personaMapper;
    DireccionMapper direccionMapper;

    @BeforeEach
    void SetUpAll() {
        personaMapper = Mockito.mock(PersonaMapper.class);
        direccionMapper = Mockito.mock(DireccionMapper.class);
        servicio = new PersonaServiceImpl(personaMapper, direccionMapper);
    }

    @Test
    public void getPerson_should_throwApiValidationException_when_idNegative() {

        //then
        Assertions.assertThrows(RequestApiValidationException.class, () -> {
            //given
            int idPersona = -23;
            //when
            Persona persona = servicio.getPerson(idPersona);
        });
    }

    @Test
    public void getPerson_should_throwApiValidationException_when_idZero() {
//then
        Assertions.assertThrows(RequestApiValidationException.class, () -> {
            //given
            int idPersona = 0;
            //when
            Persona persona = servicio.getPerson(idPersona);
        });
    }

    @Test
    public void getPerson_should_throwApiValidationException_when_nombreIsNull() throws ParseException {

        Assertions.assertThrows(RequestApiValidationException.class, () -> {

            Persona persona = createPersona();
            persona.setNombre(null);
            this.servicio.addPersona(persona);
        });

    }
    private static Persona createPersona() throws ParseException {
        Persona persona = new Persona();
        persona.setNombre("Juan");
        persona.setApellido1("Francés");
        persona.setApellido2("Antúnez");
        persona.setFechaNacimiento(new SimpleDateFormat("dd-MM-yyyy").parse("29-12-1980"));

        Direccion domicilio = new Direccion();
        domicilio.setTipoViaId(1);
        domicilio.setNombreCalle("Greco2");
        domicilio.setNumero("120");
        domicilio.setCodPostal("36201");
        domicilio.setMunicipio("Pontevedra");
        domicilio.setProvinciaCod("36");
        persona.setDireccionDomicilio(domicilio);

        Direccion notificacion = new Direccion();
        notificacion.setTipoViaId(1);
        notificacion.setNombreCalle("Greco");
        notificacion.setNumero("120");
        notificacion.setCodPostal("36201");
        notificacion.setMunicipio("Pontevedra");
        notificacion.setProvinciaCod("36");

        persona.setDireccionDomicilioSameAsNotificaciones(false);
        return persona;
    }

    @Test
    public void addPersonaDireccion_should_when_DireccionDomicilio_EqualsDireccionNotificacion() throws ParseException, RequiredMissingFieldException {
        Persona persona = createPersona();
        persona.setDireccionDomicilioSameAsNotificaciones(true);
        this.servicio.addPersona(persona);
        Assertions.assertEquals(persona.getDireccionDomicilio(),persona.getDireccionNotificacion());
    }

    @Test
    public void addPersonaDireccion_should_when_DireccionDomicilio_NotEqualsDireccionNotificacion() throws ParseException, RequiredMissingFieldException {
        Persona persona = createPersona();
        persona.setDireccionDomicilioSameAsNotificaciones(false);
        this.servicio.addPersona(persona);
        Assertions.assertNotEquals(persona.getDireccionDomicilio(),persona.getDireccionNotificacion());
    }

    @Test
    public void addPersonaDireccion_should_callInsertDireccionDomicilio() throws ParseException, RequiredMissingFieldException {

        int idDireccion = 28;
        //when(direccionMapper.insertDireccion(any())).;

        Persona persona = createPersona();
        persona.setDireccionDomicilioSameAsNotificaciones(false);
        this.servicio.addPersona(persona);
        Assertions.assertNotEquals(persona.getDireccionDomicilio(),persona.getDireccionNotificacion());
    }
}
