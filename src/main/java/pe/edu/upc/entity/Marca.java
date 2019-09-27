package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "Marca")
public class Marca implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	///////////////
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idMarca;
	@Column(name = "NombreMarca", nullable = false, length = 20)
	private String NombreMarca;
	@Column(name = "Descripcion", nullable = false, length = 20)
	private String Descripcion;
	
	//////////////////////////7
	public int getIdMarca() {
		return idMarca;
	}
	public void setIdMarca(int idMarca) {
		this.idMarca = idMarca;
	}
	public String getNombreMarca() {
		return NombreMarca;
	}
	public void setNombreMarca(String nombreMarca) {
		NombreMarca = nombreMarca;
	}
	
	public String getDescripcion() {
		return Descripcion;
	}
	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}
	
	public Marca(int idMarca, String nombreMarca, String descripcion) {
		super();
		this.idMarca = idMarca;
		NombreMarca = nombreMarca;
		Descripcion = descripcion;
	}
	public Marca() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idMarca;
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
		Marca other = (Marca) obj;
		if (idMarca != other.idMarca)
			return false;
		return true;
	}
	
	
}
