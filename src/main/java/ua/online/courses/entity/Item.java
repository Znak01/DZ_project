package ua.online.courses.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name = "item")
@Getter @Setter
@NoArgsConstructor
public class Item extends BaseEntity {

	@Column(name = "name", length = 100, unique = true)
	private String name;
	
	@Column(name = "price", columnDefinition = "DECIMAL(5,2)")
	private BigDecimal price;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;

	public Item(String name, BigDecimal price) {
		super();
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Item [name=" + name + ", price=" + price + ", getId()=" + getId() + "]";
	}
	
	
	
}
