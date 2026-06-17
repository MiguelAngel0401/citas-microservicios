package com.miguel.pacientes.controllers;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.miguel.commons.controllers.CommonController;
import com.miguel.commons.dto.PacienteRequest;
import com.miguel.commons.dto.PacienteResponse;
import com.miguel.pacientes.services.PacienteService;

@RestController
@RequestMapping("/api/pacientes")
@Validated
public class PacienteController extends CommonController<PacienteRequest, PacienteResponse, PacienteService> {

	public PacienteController(PacienteService service) {
		super(service);
	}
	
}
