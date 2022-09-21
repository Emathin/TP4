package ar.edu.unlam.empresa;

public class Ingeniero extends Empleado {

	public Ingeniero(String nombreDelEmpleado, String apellidoDelEmpleado, Double salarioDelEmpleado,
			String fechaDeNacimientoDelEmpleado, Double adicionalParaLaProductividad, Integer dni) {
		super(nombreDelEmpleado, apellidoDelEmpleado, salarioDelEmpleado, fechaDeNacimientoDelEmpleado, dni);
		sumarAdicionalAlSueldo(adicionalParaLaProductividad);
	}

	private void sumarAdicionalAlSueldo(Double adicional) {
		this.salarioDelEmpleado += adicional;
	}

}
