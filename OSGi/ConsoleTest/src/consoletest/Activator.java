package consoletest;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {
	
	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		String symbolicName = context.getBundle().getSymbolicName();
		System.out.println("Bundle ready to action: " + symbolicName);
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		String symbolicName = context.getBundle().getSymbolicName();
		System.out.println("Segmentation Fault! " + symbolicName);
	}

}
