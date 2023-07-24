package entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Merchandise extends Product{
	
	public Merchandise(String name, Double price) {
		super(name, price);
	}
	
	@Override
	public String toString() {
		return "Merchandise ->" + "\n Name: " + name + "\n Price: " + price;
	}
}
