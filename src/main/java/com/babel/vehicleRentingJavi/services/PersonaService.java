package com.babel.vehicleRentingJavi.services;

import com.babel.vehicleRentingJavi.exceptions.RequiredMissingFieldException;
import com.babel.vehicleRentingJavi.models.Persona;
import com.babel.vehicleRentingJavi.models.Profesion;
import com.babel.vehicleRentingJavi.models.Renta;

public interface PersonaService {
    Persona addPersona(Persona persona) throws RequiredMissingFieldException;
    Persona addPersonaDireccion(Persona persona);


    Renta addRenta(Renta renta);
    void validateRentaExisteProfesion(Integer profesionId) throws RequiredMissingFieldException;

    //Profesion addRentaProfesion(Profesion profesion);


}
