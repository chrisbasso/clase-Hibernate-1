package org.hibernate.tutorial.em;

import java.util.ArrayList;
import java.util.List;

public class main {

	public static void main(String[] args) {

		PersonaDAO persona = new PersonaDAO();
		Empleado empleado1 = new Empleado("Juan", "Perez");
		Empleado empleado2 = new Empleado("Jose", "Lopez");
		Empleado empleado3 = new Empleado("Carlos", "Garcia");

		persona.saveEmpleado(empleado1);
		persona.saveEmpleado(empleado2);
		persona.saveEmpleado(empleado3);
		
		persona.removerEmpleado(empleado1);
		
		System.out.println(persona.GetById(2).getNombre());

		List<Empleado> empleados = persona.getEmpleados();

		for (Empleado empleado : empleados) {
			System.out.println(empleado.getNombre() + " " + empleado.getApellido());

		}

	}

}
