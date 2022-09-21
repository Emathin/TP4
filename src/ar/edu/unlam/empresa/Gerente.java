package ar.edu.unlam.empresa;

public class Gerente extends Empleado {
	private Boolean tienteCochera;

	public Gerente(String nombreDelEmpleado, String apellidoDelEmpleado, Double salarioDelEmpleado,
			String fechaDeNacimientoDelEmpleado, Integer dni) {
		super(nombreDelEmpleado, apellidoDelEmpleado, salarioDelEmpleado, fechaDeNacimientoDelEmpleado, dni);

	}

	public Boolean getTienteCochera() {
		return tienteCochera;
	}

	public void setTienteCochera(Boolean tienteCochera) {
		this.tienteCochera = tienteCochera;
	}

}
