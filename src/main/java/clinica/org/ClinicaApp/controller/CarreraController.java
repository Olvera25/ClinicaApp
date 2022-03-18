package clinica.org.ClinicaApp.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import clinica.org.ClinicaApp.entity.Carrera;
import clinica.org.ClinicaApp.service.CarreraService;

@RestController
@RequestMapping("/clinica")
public class CarreraController {
	@Autowired
	CarreraService service;

	@PostMapping
	public ResponseEntity<Carrera> guardar(@RequestBody Carrera carrera){
		Carrera car=service.crearCarrera(carrera);
		try {
			return ResponseEntity.created(new URI("/Guardar" + car.getCodigo())).body(car);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
	
	@GetMapping("/Carrera")
	public List<Carrera> listar() {
		System.out.println("Entrando a ...");
		return service.listarCarrera();
	}

	@DeleteMapping
	public ResponseEntity<Void> eliminarCarrera(@RequestBody Carrera carrera){
		//CarreraService.delete(carrera);
		return ResponseEntity.ok().build();
	}
}
