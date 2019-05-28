package poo.quiz.empleados;

public class Directo extends Empleado {
	private long salario;

	public Directo(String nombre, long salario) {
		super(nombre);
		this.salario = salario;
	}

	@Override
	public double calcularSalario() {
		return this.salario - (this.calcularSalud() + this.calcularPension());
	}
	
	public double calcularSalud() {
		return this.salario * 0.04;
	}
	
	public double calcularPension() {
		return this.salario * 0.05;
	}
	
	public long getSalario() {
		return salario;
	}
}
