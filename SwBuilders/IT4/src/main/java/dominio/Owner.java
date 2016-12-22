package dominio;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity 
@Table
public class Owner extends SanctionHolder {
	@OneToMany(fetch = FetchType.LAZY, targetEntity=Inquiry.class, cascade={CascadeType.PERSIST, CascadeType.REMOVE})
	private Set<Inquiry> inquiries;
	@OneToMany(fetch = FetchType.LAZY, targetEntity=Inquiry.class, cascade={CascadeType.PERSIST, CascadeType.REMOVE})
	private Set<Vehicle> vehicles;
	
	public Owner() {
		super();
		this.inquiries=new HashSet<>();
		this.vehicles=new HashSet<>();
	}	


	
}
