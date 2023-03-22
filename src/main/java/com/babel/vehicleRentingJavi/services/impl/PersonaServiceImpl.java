package com.babel.vehicleRentingJavi.services.impl;

import com.babel.vehicleRentingJavi.exceptions.RequiredMissingFieldException;
import com.babel.vehicleRentingJavi.models.Persona;
import com.babel.vehicleRentingJavi.models.Profesion;
import com.babel.vehicleRentingJavi.models.Renta;
import com.babel.vehicleRentingJavi.persistance.database.mappers.DireccionMapper;
import com.babel.vehicleRentingJavi.persistance.database.mappers.PersonaMapper;
import com.babel.vehicleRentingJavi.persistance.database.mappers.ProfesionMapper;
import com.babel.vehicleRentingJavi.persistance.database.mappers.RentaMapper;
import com.babel.vehicleRentingJavi.services.PersonaService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PersonaServiceImpl implements PersonaService {
    private PersonaMapper personaMapper;
    private DireccionMapper direccionMapper;
    private RentaMapper rentaMapper;

    private ProfesionMapper profesionMapper;

    public PersonaServiceImpl(PersonaMapper personaMapper, DireccionMapper direccionMapper, RentaMapper rentaMapper, ProfesionMapper profesionMapper) {
        this.personaMapper = personaMapper;
        this.direccionMapper = direccionMapper;
        this.rentaMapper = rentaMapper;
        this.profesionMapper = profesionMapper;
    }

    @Override
    @Transactional
    public Persona addPersona(Persona persona) throws RequiredMissingFieldException {

        this.validatePersonaData(persona);

        persona = this.addPersonaDireccion(persona);
        this.personaMapper.insertPersona(persona);
        return persona;
    }
    public Persona addPersonaDireccion(Persona persona){
        this.direccionMapper.insertDireccion(persona.getDireccionDomicilio());

        if(persona.isDireccionDomicilioSameAsNotificaciones()){
            persona.setDireccionNotificacion(persona.getDireccionDomicilio());
        }else {
            this.direccionMapper.insertDireccion(persona.getDireccionNotificacion());
        }
        return persona;
    }

    private void validatePersonaData(Persona persona) throws RequiredMissingFieldException {
        this.validateNombre(persona);
    }
    private void validateNombre(Persona persona) throws RequiredMissingFieldException {
        if(persona.getNombre() == null || persona.getNombre().isEmpty()){
            throw new RequiredMissingFieldException();

        }
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////
    //RENTA
    @Override
    public Renta addRenta(Renta renta){
        this.rentaMapper.insertRenta(renta);
        return renta;
    }

    @Override
    public Profesion addRentaProfesion(Profesion profesion) {
        this.profesionMapper.insertProfesion(profesion);
        return profesion;
    }
    private void validateRentaExistePersona(Integer personaId) throws RequiredMissingFieldException {

    }
    private void validateRentaExisteProfesion(Integer profesionId) throws RequiredMissingFieldException {

    }

}
