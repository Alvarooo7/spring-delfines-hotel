package pe.edu.delfines.models.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "vendedores")
public class Vendedor {
	
	@Id
	@Column(name = "id", length = 4)
	private String id;
	
	@Column(name = "nombre", length = 60)
	private String nombre;
	
	@Column(name = "direccion", length = 70)
	private String direccion;

	@Column(name = "telefono", length = 20)
	private String telefono;
	
	@Column(name = "observacion", length = 100)
	private String observacion;
	
	@Column(name = "sueldo")
	private Float sueldo;
	
	
	
	public Vendedor() {
		
	}
}
