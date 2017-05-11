package com.edu.servicio;

import org.springframework.stereotype.Component;

import com.edu.interfaz.Operaciones;

@Component(value="servicioSumar")
public class OperacionesImpl implements Operaciones{

	@Override
	public int suma(int n1, int n2) {
		
		return n1+n2;
	}

}
