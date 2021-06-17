package co.ufps.edo.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity
public class Seguimiento {
	
	@Id
	private int id;
	
	@ManyToOne
	private int report;
	
	@Column
	private Date datagenerate;
	
	@Column
	private int state;
	
	@Column
	private String result;
	
	@Column
	private String detailrequest;
	
	@Column
	private String type;
	
	@Column
	private String filegenerate;
}
