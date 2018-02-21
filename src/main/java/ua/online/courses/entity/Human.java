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

	
	
	
	
}
