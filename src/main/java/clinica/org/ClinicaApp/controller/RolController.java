package clinica.org.ClinicaApp.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/clinica")
public class RolController {
	@GetMapping("/Rol")
	public void listar() {
		System.out.println("Entrando a la tabla Rol");
	}
}
