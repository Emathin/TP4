package ar.edu.unlam.empresa;

public class Director extends Empleado {
	private Boolean tienteCochera;
	/*
	 * Se interpreta que un sueldo extra, es un sueldo más del mismo importe que el
	 * sueldo especificado al crear o definir al Director; osea dos sueldos o dos
	 * veces su sueldo. Por eso la lógica dentro del método sumarSueldoExtra()
	 */

	public Director(String nombreDelEmpleado, String apellidoDelEmpleado, Double salarioDelEmpleado,
			String fechaDeNacimientoDelEmpleado, Integer dni) {
		super(nombreDelEmpleado, apellidoDelEmpleado, salarioDelEmpleado, fechaDeNacimientoDelEmpleado, dni);
		sumarSueldoExtra();
	}

	private void sumarSueldoExtra() {
		this.salarioDelEmpleado += salarioDelEmpleado * 2;
	}

	////// Getters and setters/////

	public Boolean getTienteCochera() {
		return tienteCochera;
	}

	public void setTienteCochera(Boolean tienteCochera) {
		this.tienteCochera = tienteCochera;
	}

}
