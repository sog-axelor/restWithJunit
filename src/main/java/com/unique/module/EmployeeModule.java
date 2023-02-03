package com.unique.module;

import com.google.inject.AbstractModule;
import com.unique.impl.EmployeeImplement;
import com.unique.resources.EmployeeResources;
import com.unique.service.EmployeeService;

public class EmployeeModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(EmployeeResources.class);
		bind(EmployeeService.class).to(EmployeeImplement.class);
	}
}
