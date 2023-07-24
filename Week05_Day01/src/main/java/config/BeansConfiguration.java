package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import entities.Consummation;
import entities.Drink;
import entities.ExtraCheeseDecorator;
import entities.Pizza;

@Configuration

public class BeansConfiguration {

	@Bean("sayHello")
	String sayHello() {
		return "Hello World!";
	}

	@Bean("margherita")
	Pizza margherita() {
		return new Pizza("Margherita");
	}

	@Bean("extraCheese")
	String cheese() {
		return new ExtraCheeseDecorator().print();
	}

	@Bean("fanta")
	Consummation lemonade() {
		return new Drink("Fanta (0.33L)", 1.29, 128.0);
	}

	@Bean("coca-cola")
	Consummation cocacola() {
		return new Drink("Coke (0.33L)", 1.29, 819.5);
	}

	@Bean("water")
	Consummation water() {
		return new Drink("Water(0,5L)", 1.29, 0.0);
	}

	@Bean("wine")
	Consummation wine() {
		return new Drink("Wine (0,75L, 13%", 7.49, 607.0);
	}
}
