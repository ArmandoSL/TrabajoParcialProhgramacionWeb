package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name = "Productos Importar")
public class Productos_importar implements Serializable {

	
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/////////////////7
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int idProducto;
		@OneToOne
		@JoinColumn(name = "idMarca",nullable = false)
		private int idMarca;
		
		@Column(name = "NombreProducto", nullable = false, length = 50)
		private String NombreProducto;
		@Column(name = "DescripcionProducto", nullable = false, length = 50)
		private String DescripcionProducto;
		@Column(name = "Precio", nullable = false, length = 50)
		private double Precio;
		
		//////////////////7
		public int getIdProducto() {
			return idProducto;
		}
		public void setIdProducto(int idProducto) {
			this.idProducto = idProducto;
		}
		public int getIdMarca() {
			return idMarca;
		}
		public void setIdMarca(int idMarca) {
			this.idMarca = idMarca;
		}
		public String getNombreProducto() {
			return NombreProducto;
		}
		public void setNombreProducto(String nombreProducto) {
			NombreProducto = nombreProducto;
		}
		public String getDescripcionProducto() {
			return DescripcionProducto;
		}
		public void setDescripcionProducto(String descripcionProducto) {
			DescripcionProducto = descripcionProducto;
		}
		public double getPrecio() {
			return Precio;
		}
		public void setPrecio(double precio) {
			Precio = precio;
		}
		public Productos_importar(int idProducto, int idMarca, String nombreProducto, String descripcionProducto,
				double precio) {
			super();
			this.idProducto = idProducto;
			this.idMarca = idMarca;
			NombreProducto = nombreProducto;
			DescripcionProducto = descripcionProducto;
			Precio = precio;
		}
		public Productos_importar() {
			super();
			// TODO Auto-generated constructor stub
		}
		
}
