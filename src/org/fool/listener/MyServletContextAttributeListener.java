package org.fool.listener;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class
 * MyServletContextAttributeListener
 *
 */
@WebListener
public class MyServletContextAttributeListener implements ServletContextAttributeListener {

	/**
	 * @see ServletContextAttributeListener#attributeAdded(ServletContextAttributeEvent)
	 */
	public void attributeAdded(ServletContextAttributeEvent scae) {
		System.out.println("attribute added");
		System.out.println(scae.getName() + ":" + scae.getValue());
	}

	/**
	 * @see ServletContextAttributeListener#attributeRemoved(ServletContextAttributeEvent)
	 */
	public void attributeRemoved(ServletContextAttributeEvent scae) {
		System.out.println("attribute removed");
		System.out.println(scae.getName() + ":" + scae.getValue());
	}

	/**
	 * @see ServletContextAttributeListener#attributeReplaced(ServletContextAttributeEvent)
	 */
	public void attributeReplaced(ServletContextAttributeEvent scae) {
		System.out.println("attribute replaced");
		System.out.println(scae.getName() + ":" + scae.getValue());
	}

}
