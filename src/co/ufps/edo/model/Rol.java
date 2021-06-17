package co.ufps.edo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity
public class Rol {

	@Id
	@OneToMany (mappedBy="role")
	private int id;
	
	@Column 
	private String nombre;
}
