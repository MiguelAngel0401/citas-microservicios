package com.miguel.citas.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.miguel.citas.dto.CitaRequest;
import com.miguel.citas.dto.CitaResponse;
import com.miguel.citas.services.CitaService;
import com.miguel.commons.controllers.CommonController;

import jakarta.validation.constraints.Positive;

@RestController
@RequestMapping("/api/citas")
public class CitaController extends CommonController<CitaRequest, CitaResponse, CitaService> {

	public CitaController(CitaService service) {
		super(service);
	}
	
	@PatchMapping("/{idCita}/estado/{idEstado}")
    public ResponseEntity<Void> actualizarEstadoCita(
            @PathVariable @Positive(message = "El idCita debe ser positivo") Long idCita,
            @PathVariable @Positive(message = "El idEstado debe ser positivo") Long idEstado) {

        service.actualizarEstadoCita(idCita, idEstado);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/id-medico/{idMedico}/citas-asignadas")
    public ResponseEntity<Void> medicoTieneCitasAsignadas(
            @PathVariable @Positive(message = "El idMedico debe ser positivo") Long idMedico) {

        service.medicoTieneCitasAsignadas(idMedico);
        return ResponseEntity.noContent().build();
    }
	
}
