package clinica.org.ClinicaApp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import clinica.org.ClinicaApp.entity.Carrera;
import clinica.org.ClinicaApp.model.CarreraRepository;

@Service
public class CarreraService {
	@Autowired
	CarreraRepository repo;
	
	public Carrera crearCarrera(Carrera carrera) {
		if (carrera.getCodigo()==null){
			return repo.save(carrera);
		}
		return null;
	}

	public List<Carrera> listarCarrera(){
		return repo.findAll();
	}
	
	public void eliminarCarrera(Carrera carrera) {
		repo.delete(carrera);
	}

	public Carrera editarCarrera(Carrera carrera){
		if (carrera.getCodigo() != null && repo.existsById(carrera.getCodigo())){
			return repo.save(carrera);
		}
		return null;
	}
	
	public Optional<Carrera> mostrarCarrera(String codigo) {
		return repo.findById(codigo);
		
	}
}
