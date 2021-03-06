package co.ufps.edo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity 
public class Typedb {
	
	@Id 
	@Column (length=20)
	@OneToMany (mappedBy="type")
	private String id;
	
	@Column (length= 100)
	private String descripcion;
	
	@Column (length=200)
	private String driver;
	
	@Column (length=500)
	private String aditional;
}
