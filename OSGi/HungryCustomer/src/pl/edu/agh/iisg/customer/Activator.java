package pl.edu.agh.iisg.customer;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import pl.edu.agh.iisg.pizzadelivery.IPizzaDelivery;
import pl.edu.agh.iisg.pizzadelivery.impl.PizzaChut;

public class Activator implements BundleActivator {

	private static BundleContext context;

	static BundleContext getContext() {
		return context;
	}

	public void start(BundleContext bundleContext) throws Exception {
		Activator.context = bundleContext;
		ServiceReference<IPizzaDelivery> ref = context.getServiceReference(IPizzaDelivery.class);
		IPizzaDelivery pizza = (IPizzaDelivery) context.getService(ref);
		System.out.println(pizza.getAllPizzas());
	}

	public void stop(BundleContext bundleContext) throws Exception {
		Activator.context = null;
	}

}
