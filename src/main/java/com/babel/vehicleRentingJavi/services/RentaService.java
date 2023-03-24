package com.babel.vehicleRentingJavi.services;

import com.babel.vehicleRentingJavi.exceptions.RequiredMissingFieldException;
import com.babel.vehicleRentingJavi.models.Renta;

public interface RentaService {
    Renta addRenta(Renta renta);
    void validateExisteProfesion(Integer profesionId) throws RequiredMissingFieldException;

    //Profesion addRentaProfesion(Profesion profesion);

}
