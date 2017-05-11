package com.edu;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.caucho.HessianServiceExporter;


import com.edu.interfaz.Operaciones;

@Configuration
@ComponentScan("com.edu")
public class AppConfig {
	
	@Bean(name="/sumaHessian")
	public HessianServiceExporter HessianOperaciones(Operaciones servicioOperaciones) {
		HessianServiceExporter exporter = new HessianServiceExporter();
		exporter.setService(servicioOperaciones);
		exporter.setServiceInterface(Operaciones.class);
		return exporter;
	}
	
}