package entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class ExtrasDecorators extends Consummation {
	protected Consummation decoratedPizza;
	
	public ExtrasDecorators (String name, Double price, Double calories) {
		super (name, price, calories);
	}
	
	@Override
	public abstract String getName();
	public abstract Double getPrice();
	public abstract Double getCalories();
}
