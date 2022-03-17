package clinica.org.ClinicaApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import clinica.org.ClinicaApp.entity.Carrera;
import clinica.org.ClinicaApp.service.CarreraService;

@RestController
@RequestMapping("/clinica")
public class CarreraController {
	@Autowired
	CarreraService service;
	
	@GetMapping("/Carrera")
	public List<Carrera> listar() {
		System.out.println("Entrando a ...");
		return service.listarCarrera();
	}
}
