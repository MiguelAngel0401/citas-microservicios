package com.miguel.medicos.services;

import com.miguel.commons.dto.MedicoRequest;
import com.miguel.commons.dto.MedicoResponse;
import com.miguel.commons.services.CrudService;

public interface MedicoService extends CrudService<MedicoRequest, MedicoResponse> {
	
	MedicoResponse obtenerMedicoPorIdSinEstado(Long id);
	
	void actualizarDisponibilidadMedico(Long idMedico, Long idDisponibilidad);

}
