package poo.quiz.tests;

import org.junit.Assert;
import org.junit.Test;

import poo.quiz.empleados.Directo;
import poo.quiz.empleados.Vendedor;
import poo.quiz.nomina.Nomina;

public class NominaTest {
	
	@Test
	public void contratarEmpleadoExitosamente() {
		// Arrange
		Vendedor 	empleado 	= new Vendedor("Lalo", 3160000, 45000000);
		Nomina 		nomina 		= new Nomina();
		
		// Act
		boolean pudoContratar = nomina.contratarEmpleado(empleado);
		
		// Assert
		Assert.assertTrue(pudoContratar);
	}
	
	@Test
	public void despedirEmpleadoYQueSePueda() {
		// Arrange
		Directo empleado 	= new Directo("Saul", 2500000);
		Nomina 	nomina 		= new Nomina();
		
		nomina.contratarEmpleado(empleado);
		
		// Act
		boolean pudoDespedir = nomina.despedirEmpleado(empleado);
		
		// Assert
		Assert.assertTrue(pudoDespedir);
	}
	
	@Test
	public void consultarElNombreDelEmpleadoYQueEsteBueno() {
		// Arrange
		Directo empleado 	= new Directo("Ligia", 3500000);
		
		// Act
		String nombre = empleado.getNombre();
		
		// Assert
		Assert.assertEquals("Ligia", nombre);
	}
}
