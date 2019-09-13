package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name = "Declaracion_aduanera")
public class Declaracion_aduanera implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/////////
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idDeclaracion;
	@OneToOne
	@JoinColumn(name = "idFlete",nullable = false)
	private int idFlete;
	@ManyToOne
	@JoinColumn(name = "idRequisito",nullable = false)
	private int idRequisito;
	@ManyToOne
	@JoinColumn(name = "idAbogado",nullable = false)
	private int idAbogado;
	////7
	@Column(name = "Descripcion",nullable = false,length = 50)
	private String Descripcion;

	public int getIdDeclaracion() {
		return idDeclaracion;
	}

	public void setIdDeclaracion(int idDeclaracion) {
		this.idDeclaracion = idDeclaracion;
	}

	public int getIdFlete() {
		return idFlete;
	}

	public void setIdFlete(int idFlete) {
		this.idFlete = idFlete;
	}

	public int getIdRequisito() {
		return idRequisito;
	}

	public void setIdRequisito(int idRequisito) {
		this.idRequisito = idRequisito;
	}

	public int getIdAbogado() {
		return idAbogado;
	}

	public void setIdAbogado(int idAbogado) {
		this.idAbogado = idAbogado;
	}

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

	public Declaracion_aduanera(int idDeclaracion, int idFlete, int idRequisito, int idAbogado, String descripcion) {
		super();
		this.idDeclaracion = idDeclaracion;
		this.idFlete = idFlete;
		this.idRequisito = idRequisito;
		this.idAbogado = idAbogado;
		Descripcion = descripcion;
	}

	public Declaracion_aduanera() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
