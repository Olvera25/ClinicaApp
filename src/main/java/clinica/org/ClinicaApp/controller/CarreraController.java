package clinica.org.ClinicaApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clinica")
public class CarreraController {
	@GetMapping("/Carrera")
	public void listar() {
		System.out.println("Entrando a ...");
	}
}
