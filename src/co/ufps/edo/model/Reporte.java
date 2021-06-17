package co.ufps.edo.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity
public class Reporte {

	@Id
	@GeneratedValue
	@OneToMany (mappedBy="report")
	private int id;
	
	@Column
	private String file;
	
	@ManyToOne
	private int conexion;
	
	@Column
	private Date datacreate;
	
	@Column
	private String state;
	
	@Column
	private String descripcion;
	
	@Column
	private String name;
}
