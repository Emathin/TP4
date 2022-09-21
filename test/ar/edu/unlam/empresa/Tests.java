package ar.edu.unlam.empresa;

import static org.junit.Assert.*;

import org.junit.Test;

public class Tests {

	@Test
	public void test() {

	}

	@Test
	public void queSePuedanCrearEmpleadosDeTodoTipoDepartamentosEmpresasYSerAgregadosCadaUnoDondeCorresponden() {

		Empleado empleado0 = new Empleado("Diego", "Cruz", 70000.36, "04-11-1988", 17456321);
		Empleado empleado1 = new Empleado("Carlos", "Rodriguez", 70000.36, "23-5-1978", 24156145);
		Empleado empleado2 = new Gerente("Juan", "Monteagudo", 100000.71, "04-03-1995", 20111452);
		Empleado empleado3 = new Ingeniero("Ruben", "Moreira", 170000.29, "04-03-2000", 35000.50, 45321445);
		Empleado empleado4 = new Director("Seymour", "Skinner", 999999.43, "20-06-2001", 28765345);

		Gerente empleado5 = new Gerente("Andres", "Borgeat", 708000.33, "04-11-1988", 10345213);
		Ingeniero empleado6 = new Ingeniero("Roberto", "García Moritán", 145000.12, "04-11-1988", 15000.52, 30768543);
		Director empleado7 = new Director("Ana Carolina", "Ardohain", 74000.87, "04-11-1988", 45776513);

		Departamento departamento1 = new Departamento("Comercial", empleado2);
		departamento1.agregarEmpleado(empleado0);
		departamento1.agregarEmpleado(empleado3);

		Departamento departamento2 = new Departamento("Produccion", empleado1);
		departamento2.agregarEmpleado(empleado5);
		departamento2.agregarEmpleado(empleado6);

		Departamento departamento3 = new Departamento("Directorio", empleado4);
		departamento3.agregarEmpleado(empleado7);

		Empresa empresa1 = new Empresa("Don Satur");
		empresa1.agregarDepartamento(departamento3);
		empresa1.agregarDepartamento(departamento2);
		empresa1.agregarDepartamento(departamento1);

		assertTrue(empleado0 instanceof Empleado);
		assertTrue(empleado1 instanceof Empleado);
		assertTrue(empleado2 instanceof Empleado);
		assertTrue(empleado3 instanceof Empleado);
		assertTrue(empleado4 instanceof Empleado);
		assertTrue(empleado5 instanceof Empleado);
		assertTrue(empleado6 instanceof Empleado);
		assertTrue(empleado7 instanceof Empleado);

		assertTrue(departamento1 instanceof Departamento);
		assertTrue(departamento2 instanceof Departamento);
		assertTrue(departamento3 instanceof Departamento);

		assertTrue(empresa1 instanceof Empresa);

	}
}
