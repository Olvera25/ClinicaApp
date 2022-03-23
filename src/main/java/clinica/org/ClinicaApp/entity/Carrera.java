package clinica.org.ClinicaApp.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table (name="carrera")
public class Carrera {
	@Id
	String codigo;
	String nombre;
	
	public Carrera() {
		
	}
	
	public Carrera(String codigo, String nombre) {
		this.codigo=codigo;
		this.nombre=nombre;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
