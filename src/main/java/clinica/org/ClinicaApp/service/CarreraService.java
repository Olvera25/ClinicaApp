package clinica.org.ClinicaApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import clinica.org.ClinicaApp.entity.Carrera;
import clinica.org.ClinicaApp.model.CarreraRepository;

@Service
public class CarreraService {
	@Autowired
	CarreraRepository repo;
	
	public void crearactualizarCarrera(Carrera carrera) {
		repo.save(carrera);
		
	}
	
	public void eliminarCarrera(Carrera carrera) {
		repo.save(carrera);
		
	}
	
	public void listarCarrera() {
		repo.findAll();
		
	}
	
	public void mostrarCarrera(Long id) {
		repo.findById(id);
		
	}
}
