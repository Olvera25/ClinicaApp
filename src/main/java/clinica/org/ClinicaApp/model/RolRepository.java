package clinica.org.ClinicaApp.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import clinica.org.ClinicaApp.entity.Rol;

@Repository 
public interface RolRepository extends JpaRepository<Rol, Long>{

}
