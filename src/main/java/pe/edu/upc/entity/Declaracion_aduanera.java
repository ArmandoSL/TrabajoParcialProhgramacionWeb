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
@Table(name = "DeclaracionAduanera")
public class Declaracion_aduanera implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/////////
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idDeclaracion;

	@OneToOne
	@JoinColumn(name = "idFlete", nullable = false)
	private Flete flete;

	@ManyToOne
	@JoinColumn(name = "idRequisito", nullable = false)
	private Requisito_legal requisito_legal;

	@ManyToOne
	@JoinColumn(name = "idAbogado", nullable = false)
	private Abogado abogado;

	//// 7
	@Column(name = "Descripcion", nullable = false, length = 50)
	private String Descripcion;

	public int getIdDeclaracion() {
		return idDeclaracion;
	}

	public void setIdDeclaracion(int idDeclaracion) {
		this.idDeclaracion = idDeclaracion;
	}

	

	public Declaracion_aduanera() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Flete getFlete() {
		return flete;
	}

	public void setFlete(Flete flete) {
		this.flete = flete;
	}

	public Requisito_legal getRequisito_legal() {
		return requisito_legal;
	}

	public void setRequisito_legal(Requisito_legal requisito_legal) {
		this.requisito_legal = requisito_legal;
	}

	public Abogado getAbogado() {
		return abogado;
	}

	public void setAbogado(Abogado abogado) {
		this.abogado = abogado;
	}

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

	public Declaracion_aduanera(int idDeclaracion, Flete flete, Requisito_legal requisito_legal, Abogado abogado,
			String descripcion) {
		super();
		this.idDeclaracion = idDeclaracion;
		this.flete = flete;
		this.requisito_legal = requisito_legal;
		this.abogado = abogado;
		Descripcion = descripcion;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idDeclaracion;
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
		Declaracion_aduanera other = (Declaracion_aduanera) obj;
		if (idDeclaracion != other.idDeclaracion)
			return false;
		return true;
	}

}
