package ar.edu.unlam.empresa;

import static org.junit.Assert.assertSame;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Departamento {

	private String nombreDelDepartamento;
	private Set<Empleado> empleadosDelDepartamento;

	/*
	 * No debe haber un departamento sin nombre y sin gerente, pero el depto del
	 * directorio no tiene gerente. Son todos directores.
	 */

	public Departamento(String nombreDelDepto, Empleado empleado) {
		this.nombreDelDepartamento = nombreDelDepto;
		this.empleadosDelDepartamento = new HashSet<Empleado>();
		if (!elNombreEsDirectorio(nombreDelDepto))
			if (!chequearQueSeaGerente(empleado))
				System.out.println("Debe agregar un gerente");
		agregarEmpleado(empleado);
	}

	private Boolean elNombreEsDirectorio(String nombreDelDepto) {
		if (nombreDelDepto == "Directorio")
			return true;
		else
			return false;
	}

	private Boolean chequearQueSeaGerente(Empleado gerente) {
		if (this.nombreDelDepartamento == "Directorio") {

		}
		if (gerente instanceof Gerente)
			return true;
		else
			return false;
	}

	public Empleado obtenerEmpleado(Empleado empleadoBuscado) {
		for (Empleado empleado : empleadosDelDepartamento) {
			if (empleado.equals(empleadoBuscado))
				return empleado;
		}
		return null;
	}

	public void agregarEmpleado(Empleado empleado) {
		if (empleado instanceof Gerente)
			this.empleadosDelDepartamento.add(empleado);
	}

	public Set<Empleado> getEmpleadosDelDepartamento() {
		return empleadosDelDepartamento;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombreDelDepartamento);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Departamento other = (Departamento) obj;
		return Objects.equals(nombreDelDepartamento, other.nombreDelDepartamento);
	}

}
