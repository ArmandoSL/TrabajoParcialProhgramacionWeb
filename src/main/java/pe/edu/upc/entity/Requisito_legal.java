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
public class Requisito_legal implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/////
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idRequisito;
	@Column(name = "Descripcion",nullable = false,length = 50)
	private String Descripcion;
	//private int archivo;
	///////////7
	public int getIdRequisitos() {
		return idRequisito;
	}
	public void setIdRequisitos(int idRequisitos) {
		this.idRequisito = idRequisitos;
	}
	public String getDescripcion() {
		return Descripcion;
	}
	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}
	public Requisito_legal() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Requisito_legal(int idRequisitos, String descripcion) {
		super();
		this.idRequisito = idRequisitos;
		Descripcion = descripcion;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idRequisito;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Requisito_legal other = (Requisito_legal) obj;
		if (idRequisito != other.idRequisito)
			return false;
		return true;
	}
	
	
	
}
