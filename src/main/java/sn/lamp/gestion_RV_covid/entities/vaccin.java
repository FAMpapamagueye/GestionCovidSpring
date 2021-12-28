package sn.lamp.gestion_RV_covid.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class vaccin {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Temporal(TemporalType.DATE)
	private Date FirstVaccin;
	private String typeVaccin;
	@Temporal(TemporalType.DATE)
	private Date secondVaccin;
	@ManyToOne
	@JoinColumn(name = "user_id")
	private Utilisateur user;

	public vaccin() {
		// TODO Auto-generated constructor stub
	}

	public vaccin(Date firstVaccin, String typeVaccin, Date secondVaccin, Utilisateur user) {
		super();
		FirstVaccin = firstVaccin;
		this.typeVaccin = typeVaccin;
		this.secondVaccin = secondVaccin;
		this.user = user;
	}

	public Date getFirstVaccin() {
		return FirstVaccin;
	}

	public void setFirstVaccin(Date firstVaccin) {
		FirstVaccin = firstVaccin;
	}

	public String getTypeVaccin() {
		return typeVaccin;
	}

	public void setTypeVaccin(String typeVaccin) {
		this.typeVaccin = typeVaccin;
	}

	public Date getSecondVaccin() {
		return secondVaccin;
	}

	public void setSecondVaccin(Date secondVaccin) {
		this.secondVaccin = secondVaccin;
	}

	public Utilisateur getUser() {
		return user;
	}

	public void setUser(Utilisateur user) {
		this.user = user;
	}

}
