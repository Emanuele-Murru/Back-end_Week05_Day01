package entities;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public abstract class Consummation extends Product{
	protected Double calories;

	public Consummation(String _name, Double _price, Double _calories) {
		super(_name, _price);
		this.calories = _calories;
	}	
}
