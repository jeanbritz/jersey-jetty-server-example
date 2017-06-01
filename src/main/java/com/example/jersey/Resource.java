package com.example.jersey;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/base")
public class Resource {

	@GET
	@Path("hello")
	public String sayHello() {
		return "Hello World";
	}
}
