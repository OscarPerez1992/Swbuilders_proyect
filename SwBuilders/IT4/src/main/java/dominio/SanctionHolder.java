package dominio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity 
@Table
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class SanctionHolder {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private int id;
	@Column(length=10, nullable=false, unique=true)
	private String dni;
	@Column(length=50, nullable=false)
	private String name;
	@Column(length=50, nullable=false)
	private String lastName;
	@Column(length=255, nullable=false)
	private String fullAddress;
	
	public SanctionHolder() {
		
	}
	

	public String getDni() {
		return dni;
	}

}
