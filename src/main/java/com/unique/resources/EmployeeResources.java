package com.unique.resources;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.jboss.resteasy.plugins.providers.html.View;

import com.google.inject.Inject;
import com.unique.service.EmployeeService;



@Path("/emp")
public class EmployeeResources {
	
	@Inject
	EmployeeService es;
	
//	@POST				//return json formal value
//	@Path("/add")
//	@Produces(MediaType.APPLICATION_JSON)
//	public Response postEmp(@FormParam("name") String name,@FormParam("state") String state,@FormParam("city") String city,@FormParam("phone") String phone) {
//		es.AddEmp(name, city, state, phone);
//		return Response.status(200).entity("Added SuccessFully.............").build();
//	}
	
	@POST					//return jsp page
	@Path("/add")
	public View postEmp(@FormParam("name") String name,@FormParam("state") String state,@FormParam("city") String city,@FormParam("phone") String phone) {
		es.AddEmp(name, city, state, phone);
		return new View("/register.jsp");
	}
	
	
}
