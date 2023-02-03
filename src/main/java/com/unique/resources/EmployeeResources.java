package com.unique.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;



@Path("/emp")
public class EmployeeResources {

	@GET	
	@Path("/hello")
	@Produces(MediaType.APPLICATION_JSON)
	public Response hello() {
		return Response.ok("Hello World").build();
	}
}
