package com.example.jersey;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.servlet.ServletContainer;

import jersey.server.Resource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
		ServletContextHandler sch = new ServletContextHandler();
		sch.setContextPath("/");

		Resource resource = new Resource();
		ResourceConfig rc = new ResourceConfig();
		rc.register(resource);

		ServletContainer sc = new ServletContainer(rc);
		ServletHolder holder = new ServletHolder(sc);
		sch.addServlet(holder, "/*");

		Server server = new Server(7777);
		server.setHandler(sch);
		server.start();
		server.join();

		while (true)
			;
    }
}
