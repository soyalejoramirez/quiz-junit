package poo.quiz.empleados;

public class Vendedor extends Directo {
	private long ventasDelMes;

	public Vendedor(String nombre, long salario, long ventasDelMes) {
		super(nombre, salario);
		this.ventasDelMes = ventasDelMes;
	}
	
	@Override
	public double calcularSalario() {
		return super.calcularSalario() + this.calcularComision();
	}
	
	public double calcularComision() {
		double comision;
		
		if(this.getSalario() <= 1000000) {
			comision = this.ventasDelMes * 0.03;
		} else {
			comision = this.ventasDelMes * 0.026;
		}
		
		return comision;
	}
	
	public long getVentasDelMes() {
		return ventasDelMes;
	}
}
