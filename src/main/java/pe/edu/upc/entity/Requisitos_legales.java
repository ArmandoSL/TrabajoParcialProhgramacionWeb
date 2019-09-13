package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "Requisitos_legales")
public class Requisitos_legales implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/////
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idRequisitos;
	@Column(name = "Descripcion",nullable = false,length = 50)
	private String Descripcion;
	//private int archivo;
	///////////7
	public int getIdRequisitos() {
		return idRequisitos;
	}
	public void setIdRequisitos(int idRequisitos) {
		this.idRequisitos = idRequisitos;
	}
	public String getDescripcion() {
		return Descripcion;
	}
	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}
	public Requisitos_legales() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Requisitos_legales(int idRequisitos, String descripcion) {
		super();
		this.idRequisitos = idRequisitos;
		Descripcion = descripcion;
	}
	
	
	
}
