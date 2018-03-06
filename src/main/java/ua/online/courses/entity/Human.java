package ua.online.courses.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "human")
public class Human extends BaseEntity {

	@Column(name = "first_name", length = 20)
	private String firstName;

	@Column(name = "last_name", length = 20)
	private String lastName;
	
	private String age;
	private String country;
	private String gender;
	private String mail;
	
	@Enumerated(EnumType.STRING)
	private Degree degree;
	
	private String socialnet;
	
	@Column(name="programming_langueg")
	private String programmingLangueg;
	
	private String oc;
	private String ex;
	private String rang;
	private String teh;
	private String search;
	private String norm;
	

	@Override
	public String toString() {
		return "Human [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", country=" + country
				+ ", gender=" + gender + ", mail=" + mail + ", degree=" + degree + ", socialnet=" + socialnet
				+ ", programmingLangueg=" + programmingLangueg + ", oc=" + oc + ", ex=" + ex + ", rang=" + rang
				+ ", teh=" + teh + ", search=" + search + ", norm=" + norm + ", getId()=" + getId() + "]";
	}

	public Human() {
	}

	public Human(String firstName, String lastName, String age, String country, String gender, String mail,
			Degree degree, String socialnet, String programmingLangueg, String oc, String ex, String rang, String teh,
			String search, String norm) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.country = country;
		this.gender = gender;
		this.mail = mail;
		this.degree = degree;
		this.socialnet = socialnet;
		this.programmingLangueg = programmingLangueg;
		this.oc = oc;
		this.ex = ex;
		this.rang = rang;
		this.teh = teh;
		this.search = search;
		this.norm = norm;
	}

	
	
	
	
}
