package com.babel.vehicleRentingJavi.persistance.database.mappers;

import com.babel.vehicleRentingJavi.models.Persona;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;

@Mapper
public interface PersonaMapper {
    @Insert("INSERT INTO PERSONA (NOMBRE, APELLIDO1, APELLIDO2, DIRECCION_DOMICILIO_ID, DIRECCION_NOTIFICACION_ID, " +
            "NIF, FECHA_NACIMIENTO, NACIONALIDAD) " +
            "VALUES (#{nombre}, #{apellido1}, #{apellido2}, #{direccionDomicilio.direccionId}, " +
            "#{direccionNotificacion.direccionId}, #{nif}, #{fechaNacimiento, jdbcType=DATE}, #{nacionalidad})")
    @Options(useGeneratedKeys = true, keyProperty = "personaID", keyColumn="PERSONA_ID")

    void insertPersona(Persona persona);
}
