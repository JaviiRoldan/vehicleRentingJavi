package com.babel.vehicleRentingJavi.services.impl;

import com.babel.vehicleRentingJavi.exceptions.RequiredMissingFieldException;
import com.babel.vehicleRentingJavi.models.Renta;
import com.babel.vehicleRentingJavi.persistance.database.mappers.ProfesionMapper;
import com.babel.vehicleRentingJavi.persistance.database.mappers.RentaMapper;
import com.babel.vehicleRentingJavi.services.RentaService;
import org.springframework.stereotype.Service;

@Service
public class RentaServiceImpl implements RentaService {
    private RentaMapper rentaMapper;
    private ProfesionMapper profesionMapper;

    public RentaServiceImpl(RentaMapper rentaMapper, ProfesionMapper profesionMapper) {
        this.rentaMapper = rentaMapper;
        this.profesionMapper = profesionMapper;
    }
    public Renta addRenta(Renta renta){
        this.rentaMapper.insertRenta(renta);
        return renta;
    }
    public void validateExisteProfesion(Integer profesionId) throws RequiredMissingFieldException {
        int existeProfesion = profesionMapper.existeProfesion(profesionId);
        if(existeProfesion==0){
            throw new RequiredMissingFieldException();
        }
    }
}
