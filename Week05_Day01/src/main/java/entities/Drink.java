package entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Drink extends Consummation{
	
	public Drink(String name, Double price, Double calories) {
		super(name, price, calories);
	}
	
	@Override
	public String toString() {
		return "Drink ->" + "\n Name: " + name + "\n Calories: " + calories + "\n Price: " + price;
	}
}
