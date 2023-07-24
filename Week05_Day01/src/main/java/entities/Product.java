package entities;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public abstract class Product {
	String name;
	Double price;
	
	public Product(String _name, Double _price) {
		this.name = _name;
		this.price = _price;
	}
}
