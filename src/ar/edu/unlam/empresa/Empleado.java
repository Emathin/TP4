package ar.edu.unlam.empresa;

import java.util.Objects;

public class Empleado {
	protected String nombreDelEmpleado;
	protected String apellidoDelEmpleado;
	protected Double salarioDelEmpleado;
	protected String fechaDeNacimientoDelEmpleado;
	protected Integer dni;

	public Empleado(String nombreDelEmpleado, String apellidoDelEmpleado, Double salarioDelEmpleado,
			String fechaDeNacimientoDelEmpleado, Integer dni) {
		this.nombreDelEmpleado = nombreDelEmpleado;
		this.apellidoDelEmpleado = apellidoDelEmpleado;
		this.salarioDelEmpleado = salarioDelEmpleado;
		this.fechaDeNacimientoDelEmpleado = fechaDeNacimientoDelEmpleado;
		this.dni = dni;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empleado other = (Empleado) obj;
		return Objects.equals(dni, other.dni);
	}
	
	

}
