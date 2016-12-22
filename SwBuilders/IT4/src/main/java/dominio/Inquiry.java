package dominio;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import persistencia.*;
 

@Entity
@Table
public class Inquiry {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(nullable=false, updatable=false)
	private Date dateOfIssue;
	@Column(nullable=false, updatable=false)
	private String location;
	@ManyToOne(targetEntity=Owner.class)
	private Owner owner;
	@Column(nullable=false, updatable=false)
	private double speed;
	@Column(nullable=false, updatable=false)
	private double maxSpeed;
	
	
	public Inquiry() {
		
	}
	
	public Inquiry(String license, double speed, String location, double maxSpeed) {
		this();
		this.dateOfIssue=new Date(System.currentTimeMillis());
		this.speed=speed;
		this.maxSpeed=maxSpeed;
		this.location=location;
		this.owner=findOwner(license);
	}

	private Owner findOwner(String license) {
		OwnerDao dao=new OwnerDao();
		return dao.findByLicense(license);
	}
	public Sanction createSanctionFor(String dni) {
		int points=calculatePoints();
		int amount=calculateAmount();
		Sanction sanction=new Sanction();
		DriverDao dao=new DriverDao();
		Driver driver=dao.findByDni(dni);
		sanction.setSanctionHolder(driver);
		sanction.setPoints(points);
		sanction.setAmount(amount);
		GeneralDao<Sanction> daoSanction=new GeneralDao<>();
		daoSanction.insert(sanction);
		return sanction; 
	}


	public int getId() {
		return id;
	}

	private int calculatePoints() {
		if (maxSpeed==30) {
			return points(51,60,70);
		} else if (maxSpeed==40) {
			return points(61,70,80);
		} else if (maxSpeed==50) {
			return points(71,80,90);	
		} else if (maxSpeed==60) {
			return points(91,110,120);
		} else if (maxSpeed==70) {
			return points(101,120,130);
		} else if (maxSpeed==80) {
			return points(111,130,140);
		} else if (maxSpeed==90) {			
			return points(121,140,150);
		} else if (maxSpeed==100) {
			return points(131,150,160);
		} else if (maxSpeed==110) {
			return points(141,160,170);
		} else if (maxSpeed==120) {
			return points(151,170,180);
		}
		
		return 0;
	}
	
	private int points(int lInf1, int lSup1, int lSup2){
		if (speed>=lInf1 && speed<=lSup1)
			return 2;
		else if (speed>=(lSup1+1) && speed<=lSup2)
			return 4;
		else if (speed>=(lSup2+1))
			return 6;
		
		return 0;
	}

	private int calculateAmount() {
		if (maxSpeed==30) {
			return amount(31,50,60,70,80);
		} else if (maxSpeed==40) {
			return amount(41,60,70,80,90);
		} else if (maxSpeed==50) {
			return amount(51,70,80,90,100);
		} else if (maxSpeed==60) {
			return amount(61,90,110,120,130);
		} else if (maxSpeed==70) {
			return amount(71,100,120,130,140);
		} else if (maxSpeed==80) {
			return amount(81,110,130,140,150);
		} else if (maxSpeed==90) {
			return amount(91,120,140,150,160);
		} else if (maxSpeed==100) {
			return amount(101,130,150,160,170);
		} else if (maxSpeed==110) {
			return amount(111,140,160,170,180);
		} else if (maxSpeed==120) {
			return amount(121,150,170,180,190);
		}
		return 0;
	}
	
	private int amount(int lInf1, int lSup1, int lSup2, int lSup3, int lSup4){
		if (speed>=lInf1 && speed<=lSup1) 
			return 100;
		else if (speed>=(lSup1+1) && speed<=lSup2)
			return 300;
		else if (speed>=(lSup2+1) && speed<=lSup3)
			return 400;
		else if (speed>=(lSup3+1) && speed<=lSup4)
			return 500;
		else
			return 600;
	}
}
