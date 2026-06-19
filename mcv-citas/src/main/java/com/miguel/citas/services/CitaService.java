package com.miguel.citas.services;

import com.miguel.citas.dto.CitaRequest;
import com.miguel.citas.dto.CitaResponse;
import com.miguel.commons.services.CrudService;

public interface CitaService extends CrudService<CitaRequest, CitaResponse> {
	
	void actualizarEstadoCita(Long idCita, Long idEstadoCita);
	
	void medicoTieneCitasAsignadas(Long idMedico);
	
	void pacienteTieneCitasAsignadas(Long idPaciente);

}
