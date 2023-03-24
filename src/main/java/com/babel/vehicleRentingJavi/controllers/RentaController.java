package com.babel.vehicleRentingJavi.controllers;

import com.babel.vehicleRentingJavi.exceptions.RequiredMissingFieldException;
import com.babel.vehicleRentingJavi.models.Renta;
import com.babel.vehicleRentingJavi.services.RentaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RentaController {
    RentaService rentaService;
    public RentaController(RentaService rentaService) {
        this.rentaService = rentaService;
    }


    @PostMapping("/renta")
    ResponseEntity addRenta(@RequestBody Renta renta) throws RequiredMissingFieldException {
        try{
            this.rentaService.validateExisteProfesion(renta.getProfesionId());
        }catch(RequiredMissingFieldException e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("No existe esa ID de profesion");
        }catch(Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
        this.rentaService.addRenta(renta);
        return ResponseEntity.ok(String.format("Renta añadida. Id: %d", renta.getRentaId()));
    }
}
