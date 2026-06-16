package com.miguel.citas.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.miguel.citas.dto.CitaRequest;
import com.miguel.citas.dto.CitaResponse;
import com.miguel.citas.services.CitaService;
import com.miguel.commons.controllers.CommonController;

@RestController
@RequestMapping("/api/citas")
public class CitaController extends CommonController<CitaRequest, CitaResponse, CitaService> {

	public CitaController(CitaService service) {
		super(service);
	}
	
}
