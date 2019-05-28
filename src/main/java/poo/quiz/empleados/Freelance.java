package poo.quiz.empleados;

public class Freelance extends Empleado {
	private long valorHora;
	private int horasTrabajadas;
	
	public Freelance(String nombre, long valorHora) {
		super(nombre);
		this.valorHora = valorHora;
	}
	
	@Override
	public double calcularSalario() {
		return valorHora * this.horasTrabajadas;
	}
	
	public long getValorHora() {
		return valorHora;
	}
	
	public void setHorasTrabajadas(int horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}
	
	public int getHorasTrabajadas() {
		return horasTrabajadas;
	}
}
