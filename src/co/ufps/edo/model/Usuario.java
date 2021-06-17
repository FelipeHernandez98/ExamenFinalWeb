package co.ufps.edo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity
public class Usuario {

	@Id
	@GeneratedValue
	private int id;
	
	@Column
	private String usuario;
	
	@Column
	private String email;
	
	@Column
	private String pass;
	
	@ManyToOne
	@JoinColumn (name="")
	private String role;
	
	@Column
	private int sate;
}
