package com.miguel.pacientes.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.miguel.commons.controllers.CommonController;
import com.miguel.commons.dto.PacienteRequest;
import com.miguel.commons.dto.PacienteResponse;
import com.miguel.pacientes.services.PacienteService;

import jakarta.validation.constraints.Positive;

@RestController
@RequestMapping("/api/pacientes")
@Validated
public class PacienteController extends CommonController<PacienteRequest, PacienteResponse, PacienteService> {

	public PacienteController(PacienteService service) {
		super(service);
	}
	
	@GetMapping("/id-paciente/{id}")
	public ResponseEntity<PacienteResponse> obtenerPacienteSinEstado(
			@PathVariable @Positive(message = "El ID debe ser positivo") Long id){
		return ResponseEntity.ok(service.obtenerPacienteSinEstado(id));
	}
	
	
}
