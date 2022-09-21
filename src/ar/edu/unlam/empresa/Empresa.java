package ar.edu.unlam.empresa;

import java.util.HashSet;
import java.util.Set;

public class Empresa {

	/*
	 * El t�rmino empleador est� originado en la relaci�n de trabajo. El empleador
	 * es aquel que crea uno o varios puestos de trabajo y los ofrece con el fin de
	 * que sean ocupados por trabajadores bajo su mando, y a trav�s de un contrato
	 * de trabajo.En algunas ocasiones se confunde "empleador" con "empresa", aunque
	 * estrictamente los t�rminos difieren considerablemente, porque la empresa
	 * tambi�n est� integrada por los trabajadores que pertenecen a ella, a la vez
	 * que la expresi�n incluye los activos de la misma y empleados jer�rquico
	 * (gerentes y directores) que no son empleadores.
	 */

	private String nombreDeLaEmpresa;
	private Set<Departamento> departamentos;

	public Empresa(String nombreDeEmpresa) {
		this.nombreDeLaEmpresa = nombreDeEmpresa;
		this.departamentos = new HashSet<Departamento>();
	}

	public void agregarDepartamento(Departamento unDepartamento) {
		departamentos.add(unDepartamento);
	}

	public Departamento obtenerDepartamento(Departamento DerpartamentoBuscado) {
		for (Departamento departamento : departamentos) {
			if (departamento.equals(DerpartamentoBuscado))
				return departamento;
		}
		return null;
	}

	public Set<Departamento> getDepartamentos() {
		return departamentos;
	}
}
