package poo.quiz.nomina;

import java.util.ArrayList;

import poo.quiz.empleados.Directo;
import poo.quiz.empleados.Empleado;
import poo.quiz.empleados.Freelance;
import poo.quiz.empleados.Vendedor;

public class Nomina {
	private ArrayList<Empleado> empleados;
	
	public Nomina() {
		this.empleados = new ArrayList<>();
	}
	
	public boolean contratarEmpleado(Empleado empleado) {
		boolean pudoAgregar = true;
		
		for (Empleado emp : empleados) {
			if(emp.getNombre().equals(empleado.getNombre())) {
				pudoAgregar = false;
			}
		}
		
		if(pudoAgregar) {
			pudoAgregar = this.empleados.add(empleado);
		} else {
			System.out.println("El empleado " + empleado.getNombre() + " ya está trabajando con nosotros.");
		}
		
		return pudoAgregar;
	}
	
	public boolean despedirEmpleado(Empleado empleado) {
		boolean pudoDespedir = false;
		
		for (int i = 0; i < empleados.size(); i++) {
			if(empleados.get(i).getNombre().equals(empleado.getNombre())) {
				this.empleados.remove(i);
				pudoDespedir = true;
				break;
			}
		}
		
		if(!pudoDespedir) {
			System.out.println("El empleado ni siquiera existe en nuestra nómina.");
		}
		
		return pudoDespedir;
	}
	
	public void calcularNomina() {
		for (Empleado empleado : empleados) {
			System.out.println("El salario de " + empleado.getNombre() + " es " + empleado.calcularSalario());
		}
	}
	
	public void listarDirectos() {
		System.out.println("Empleados directos");
		
		for (Empleado empleado : empleados) {
			if(empleado instanceof Directo) {
				System.out.println(empleado.getNombre());
			}
		}
	}
	
	public void listarFreelance() {
		System.out.println("Empleados freelance");
		
		for (Empleado empleado : empleados) {
			if(empleado instanceof Freelance) {
				System.out.println(empleado.getNombre());
			}
		}
	}
	
	public void consultarComisiones() {
		System.out.println("Comisiones");
		
		for (Empleado empleado : empleados) {
			if(empleado instanceof Vendedor) {
				System.out.println(empleado.getNombre() + " comisión de " + ((Vendedor) empleado).calcularComision());
			}
		}
	}
	
	public double consultarDeduccion(String tipoDeduccion) {
		double totalDeduccion = 0;
		
		switch (tipoDeduccion) {
		case "SALUD":
			for (Empleado empleado : empleados) {
				if(empleado instanceof Directo) {
					totalDeduccion += ((Directo) empleado).calcularSalud();
				}
			}
			
			break;
		case "PENSION":
			for (Empleado empleado : empleados) {
				if(empleado instanceof Directo) {
					totalDeduccion += ((Directo) empleado).calcularPension();
				}
			}
			
			break;
		default:
			System.out.println("No se ingresó una deducción válida");
			break;
		}
		
		return totalDeduccion;
	}
}
