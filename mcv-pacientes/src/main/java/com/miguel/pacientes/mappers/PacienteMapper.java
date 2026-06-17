package com.miguel.pacientes.mappers;

import com.miguel.commons.enums.EstadoRegistro;
import com.miguel.commons.mappers.CommonMapper;
import com.miguel.commons.dto.PacienteResponse;
import com.miguel.commons.dto.PacienteRequest;
import com.miguel.pacientes.entities.Paciente;
import org.springframework.stereotype.Component;

@Component
public class PacienteMapper implements CommonMapper<PacienteRequest, PacienteResponse, Paciente> {

    @Override
    public Paciente requestAEntidad(PacienteRequest request) {
        if (request == null) return null;
        return Paciente.crear(
                request.nombre(),
                request.apellidoPaterno(),
                request.apellidoMaterno(),
                request.edad(),
                request.peso(),
                request.estatura(),
                request.email(),
                request.telefono(),
                request.direccion()
        );
    }

    @Override
    public PacienteResponse entidadAResponse(Paciente entidad) {
        if (entidad == null) return null;
        return new PacienteResponse(
                entidad.getId(),
                String.join(" ", entidad.getNombre(),
                        entidad.getApellidoPaterno(),
                        entidad.getApellidoMaterno()),
                entidad.getEdad(),
                entidad.getPeso(),
                entidad.getEstatura(),
                entidad.getImc(),
                entidad.getEmail(),
                entidad.getTelefono(),
                entidad.getDireccion(),
                entidad.getNumExpediente()
        );
    }
}