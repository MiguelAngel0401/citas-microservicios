package com.miguel.pacientes.services;

import com.miguel.commons.dto.PacienteRequest;
import com.miguel.commons.dto.PacienteResponse;
import com.miguel.commons.services.CrudService;

public interface PacienteService extends CrudService<PacienteRequest, PacienteResponse> {
	
	PacienteResponse obtenerPacienteSinEstado(Long id);

}
