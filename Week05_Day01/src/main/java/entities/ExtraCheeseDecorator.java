package entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ExtraCheeseDecorator extends ExtrasDecorators {
	public ExtraCheeseDecorator() {
		super("Cheese", 0.69, 92.0);
	}

	public ExtraCheeseDecorator(Consummation decPizza) {
		super("Cheese", 0.69, 92.0);
		this.decoratedPizza = decPizza;
	}

	@Override
	public String getName() {
		return decoratedPizza.getName() + " con extra Cheese";
	}

	@Override
	public Double getPrice() {
		return decoratedPizza.getPrice() + this.price;
	}

	@Override
	public Double getCalories() {
		return decoratedPizza.getCalories() + this.calories;
	}

	public String print() {
		return "{" + "Calories= +" + this.calories + ", Price= +" + this.price + "}";
	}

	@Override
	public String toString() {
		return "{" + "Calories:" + this.getCalories() + ", Name: " + this.getName() + ", Price: " + this.getPrice()
				+ "}";
	}
}
