package com.miguel.citas.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.miguel.citas.entities.Cita;
import com.miguel.citas.enums.EstadoCita;
import com.miguel.commons.enums.EstadoRegistro;

@Repository
public interface CitaRepository extends JpaRepository<Cita, Long> {
	List<Cita> findByEstadoRegistro(EstadoRegistro estadoRegistro);
	
	Optional<Cita> findByIdAndEstadoRegistro(Long id, EstadoRegistro estadoRegistro);
	
	boolean existsByIdPacienteAndEstadoRegistroAndEstadoCitaIn(Long idPaciente, EstadoRegistro estadoRegistro, 
			List<EstadoCita> estadoCita);
	
	boolean existsByIdMedicoAndEstadoRegistroAndEstadoCitaIn(Long idMedico, EstadoRegistro estadoRegistro, 
			List<EstadoCita> estadoCita);
}
