package com.babel.vehicleRentingJavi.persistance.database.mappers;

import com.babel.vehicleRentingJavi.models.Profesion;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;

@Mapper
public interface ProfesionMapper {

    @Insert("INSERT INTO PROFESION (DESCRIPCION) VALUES (#{descripcion})")
    @Options(useGeneratedKeys = true, keyProperty = "profesionId", keyColumn="PROFESION_ID")
    void insertProfesion(Profesion profesion);
    @Insert("SELECT COUNT (PROFESION_ID) FROM PROFESION WHERE PROFESION_ID = (#{profesionId})")
    int existeProfesion(int profesionId);
}
