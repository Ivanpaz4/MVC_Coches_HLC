package com.hlc.coche_mvc.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hlc.coche_mvc.entidades.Coche;
import com.hlc.coche_mvc.servicios.CocheServicio;

import jakarta.annotation.PostConstruct;

@Component
public class InicializadorDatos {
	@Autowired
	private CocheServicio cocheServicio;
	@PostConstruct
	public void init() {
		//Crear y guardar algunos coches de ejemplo
		if(cocheServicio.listarTodosLosCoches().iterator().hasNext()) {
			//Si ya hay dstos, no inicializamos.
			return;
		}
		
		Coche coche1 = new Coche();
		coche1.setMarca("Audi");
		coche1.setColor("Gris");
		coche1.setMatricula("9988GFD");
		Coche coche2 =  new Coche();
		coche2.setMarca("Dacia");
		coche2.setColor("Rojo");
		coche2.setMatricula("6666ASD");
		
		
		
		
	}
	
}
