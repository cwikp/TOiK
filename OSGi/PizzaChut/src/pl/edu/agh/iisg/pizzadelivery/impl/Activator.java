package pl.edu.agh.iisg.pizzadelivery.impl;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

import pl.edu.agh.iisg.pizzadelivery.IPizzaDelivery;

public class Activator implements BundleActivator{
	
	private ServiceRegistration serviceRegistration;

	public void start(BundleContext context) throws Exception {
		IPizzaDelivery service = new PizzaChut();

		serviceRegistration = context.registerService(IPizzaDelivery.class, service, null);
		System.out.println("PizzaChut service is ready!");
	}

	public void stop(BundleContext context) throws Exception {
		serviceRegistration.unregister();
	}

}
