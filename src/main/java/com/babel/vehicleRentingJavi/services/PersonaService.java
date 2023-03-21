package com.babel.vehicleRentingJavi.services;

import com.babel.vehicleRentingJavi.exceptions.RequiredMissingFieldException;
import com.babel.vehicleRentingJavi.models.Persona;

public interface PersonaService {
    Persona addPersona(Persona persona) throws RequiredMissingFieldException;
    Persona addPersonaDireccion(Persona persona);

    }
