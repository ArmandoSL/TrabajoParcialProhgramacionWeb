package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Flete")
public class Flete implements Serializable {

	/**
		 * 
		 */
	private static final long serialVersionUID = 1L;
	///////////////////
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idFlete;

	@ManyToOne
	@JoinColumn(name = "idTransportista", nullable = false)
	private Transportista transportista;

	@Column(name = "MontoTotal", nullable = false, length = 50)
	private double MontoTotal;
	@Column(name = "Descripcion", nullable = false, length = 50)
	private String Descripcion;
	@Column(name = "PesoTotal", nullable = false ,precision = 2)
	private double PesoTotal;
	@Column(name = "PrecioFlete", nullable = false,precision = 2)
	private double precioFlete;

	/////////////////////

	public Flete() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Flete(int idFlete, Transportista transportista, double montoTotal, String descripcion, double pesoTotal,
			double precioFlete) {
		super();
		this.idFlete = idFlete;
		this.transportista = transportista;
		MontoTotal = montoTotal;
		Descripcion = descripcion;
		PesoTotal = pesoTotal;
		this.precioFlete = precioFlete;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idFlete;
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
		Flete other = (Flete) obj;
		if (idFlete != other.idFlete)
			return false;
		return true;
	}

	public int getIdFlete() {
		return idFlete;
	}

	public void setIdFlete(int idFlete) {
		this.idFlete = idFlete;
	}

	public Transportista getTransportista() {
		return transportista;
	}

	public void setTransportista(Transportista transportista) {
		this.transportista = transportista;
	}

	public double getMontoTotal() {
		return MontoTotal;
	}

	public void setMontoTotal(double montoTotal) {
		MontoTotal = montoTotal;
	}

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

	public double getPesoTotal() {
		return PesoTotal;
	}

	public void setPesoTotal(double pesoTotal) {
		PesoTotal = pesoTotal;
	}

	public double getPrecioFlete() {
		return precioFlete;
	}

	public void setPrecioFlete(double precioFlete) {
		this.precioFlete = precioFlete;
	}

}
