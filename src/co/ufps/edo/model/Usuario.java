package co.ufps.edo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity
public class Usuario {

	@Id
	@GeneratedValue
	@OneToMany (mappedBy="user")
	private int id;
	
	@Column
	private String usuario;
	
	@Column
	private String email;
	
	@Column
	private String pass;
	
	@ManyToOne
	@JoinColumn (name="id")
	private String role;
	
	@Column
	private int sate;
}
