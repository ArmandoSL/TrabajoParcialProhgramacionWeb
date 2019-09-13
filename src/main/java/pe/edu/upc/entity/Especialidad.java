package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "Especialidad")
public class Especialidad implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idEspecialidad;
	@Column(name = "Descripcion",nullable =  false,length = 50)
	private String Descripcion;

		///////////7

	public int getIdEspecialidad() {
		return idEspecialidad;
	}

	public Especialidad() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setIdEspecialidad(int idEspecialidad) {
		this.idEspecialidad = idEspecialidad;
	}

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

	public Especialidad(int idEspecialidad, String descripcion) {
		super();
		this.idEspecialidad = idEspecialidad;
		Descripcion = descripcion;
	}

}
