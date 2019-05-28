package poo.quiz.empleados;

public abstract class Empleado {
	private String nombre;
	public abstract double calcularSalario();
	
	public Empleado(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
}
