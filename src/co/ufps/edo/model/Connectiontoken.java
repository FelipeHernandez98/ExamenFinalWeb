package co.ufps.edo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity
public class Connectiontoken {
	
	@Id
	@OneToMany(mappedBy="conexion")
	private int id;
	
	@Column
	private String host;
	
	@Column
	private String userdb;
	
	@Column
	private String pass;
	
	@Column
	private String db;
	
	@Column
	private String token;
	
	@Column
	private String port;
	
	@ManyToOne 
	private int user;
	
	@Column
	private int state;
	
	@Column
	@ManyToOne
	private String type;

}
