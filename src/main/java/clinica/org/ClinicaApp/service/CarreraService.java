package clinica.org.ClinicaApp.service;

import java.util.Optional;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import clinica.org.ClinicaApp.entity.Carrera;
import clinica.org.ClinicaApp.model.CarreraRepository;

@Service
public class CarreraService {
	@Autowired
	CarreraRepository repo;
	
	public Carrera crearCarrera(Carrera carrera) {
		return repo.save(carrera);
		
	}
	
	public void eliminarCarrera(Carrera carrera) {
		repo.delete(carrera);
		
	}
	
	public List<Carrera> listarCarrera() {
		return repo.findAll();
		
	}
	
	public Optional<Carrera> mostrarCarrera(Long id) {
		return repo.findById(id);
		
	}
}
