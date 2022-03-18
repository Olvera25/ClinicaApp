package clinica.org.ClinicaApp.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="rol")
public class Rol {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	Long idrol;
	String nombre;
	
	
	public Rol() {
		super();
	}
	
	public Rol(Long idrol, String nombre) {
		super();
		this.idrol = idrol;
		this.nombre = nombre;
	}
	
	public Long getIdrol() {
		return idrol;
	}
	
	public void setIdrol(Long idrol) {
		this.idrol = idrol;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
