package clinica.org.ClinicaApp.service;

import java.util.Optional;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import clinica.org.ClinicaApp.entity.Rol;
import clinica.org.ClinicaApp.model.RolRepository;

@Service
public class RolService {
	@Autowired
	RolRepository repo;
	
	public Rol crearRol(Rol rol) {
		return repo.save(rol);
		
	}
	
	public void eliminarRol(Rol rol) {
		repo.delete(rol);
		
	}
	
	public List<Rol> listarRol() {
		return repo.findAll();
		
	}
	
	public Optional<Rol> mostrarRol(Long id) {
		return repo.findById(id);
		
	}
}
