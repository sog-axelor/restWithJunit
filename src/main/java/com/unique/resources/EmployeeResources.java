package com.unique.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.jboss.resteasy.plugins.providers.html.View;

import com.google.inject.Inject;
import com.unique.Db.Employee;
import com.unique.service.EmployeeService;
@Path("/emp")
public class EmployeeResources {

		@Inject
		EmployeeService es;
	
//	@GET	
//	@Path("/list")
//	@Produces(MediaType.APPLICATION_JSON)
//	public Response getListEmp() {
//			List<Employee> list  = es.getAllPersons();
//		return Response.ok(list).build();
//	}

	
		@GET	
		@Path("/list")
		public View getListEmp() {
				List<Employee> list  = es.getAllPersons();
				return new View("/view.jsp", list,"list");
		}
	
	
}