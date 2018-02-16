package ua.online.courses.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "user")
@Getter @Setter
@NoArgsConstructor
public class User extends BaseEntity {

	private String login;
	private String password;
	private String email;

	@Column(name = "first_name", length = 20)
	private String firstName;

	@Column(name = "last_name", length = 20)
	private String lastName;
	private int age;

//	@Enumerated(EnumType.STRING)
//	private UserRole role;

	@OneToMany(mappedBy = "user")
	private List<Item> items = new ArrayList<>();

public User(String login, String password, String email, String firstName, String lastName, int age) {
	super();
	this.login = login;
	this.password = password;
	this.email = email;
	this.firstName = firstName;
	this.lastName = lastName;
	this.age = age;
}

@Override
public String toString() {
	return "User [login=" + login + ", password=" + password + ", email=" + email + ", firstName=" + firstName
			+ ", lastName=" + lastName + ", age=" + age + ", getId()=" + getId() + "]";
}

	

	

	
	}

	

	


