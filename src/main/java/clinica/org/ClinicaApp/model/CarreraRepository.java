package clinica.org.ClinicaApp.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import clinica.org.ClinicaApp.entity.Carrera;

@Repository 
public interface CarreraRepository extends JpaRepository<Carrera, String>{

}
