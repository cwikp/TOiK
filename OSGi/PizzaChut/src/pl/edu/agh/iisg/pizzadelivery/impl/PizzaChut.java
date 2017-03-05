package pl.edu.agh.iisg.pizzadelivery.impl;

import java.util.Arrays;
import java.util.Collection;

import pl.edu.agh.iisg.pizzadelivery.IPizzaDelivery;
import pl.edu.agh.iisg.pizzadelivery.Pizza;

public class PizzaChut implements IPizzaDelivery{
	
	private final Pizza margeritha = new Pizza("Margherita", 10);
	private final Pizza babilon = new Pizza("Babilon", 20);
	private final Pizza capri = new Pizza("Capri", 15);

	public Collection<Pizza> getAllPizzas() {
		return Arrays.asList(margeritha, babilon, capri);
	}
	
}
