package entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Pizza extends Consummation{

	public Pizza(String name) {
		super(name, 4.99, 1104.0);
	}

	@Override
	public String toString() {
		return "Pizza ->" + "\n Name: " + name + "\n Calories:" + calories +  "\n Price: " + price ;
	}
	
	
}
