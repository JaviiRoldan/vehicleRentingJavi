package com.babel.vehicleRentingJavi.persistance.database.mappers;

import com.babel.vehicleRentingJavi.models.Profesion;
import com.babel.vehicleRentingJavi.models.Renta;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;

@Mapper
public interface ProfesionMapper {
    @Insert("INSERT INTO PROFESION (DESCRIPCION) VALUES (#{descripcion})")
    @Options(useGeneratedKeys = true, keyProperty = "profesionId", keyColumn="PROFESION_ID")
    void insertProfesion(Profesion profesion);
}
