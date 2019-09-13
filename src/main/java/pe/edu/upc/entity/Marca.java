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
	public Marca(int idMarca, String nombreMarca) {
		super();
		this.idMarca = idMarca;
		NombreMarca = nombreMarca;
	}
	public Marca() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
