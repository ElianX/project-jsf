/**
 * 
 */
package project.elian.projectjsf.services;

import java.util.ArrayList;
import java.util.List;

import project.elian.projectjsf.entity.Empleado;

/**
 * @author ElianX
 * Clase que permite realizar la lógica de negocio para empleados
 */
public class EmpleadoService {
	/**
	 *  Método que permite consultar la lista de empleados de empresas de IT
	 *  @return {@link Empleado} lista de empleados.
	 */
	public List<Empleado> consultarEmpleados(){
		List <Empleado> empleados = new ArrayList<Empleado>();
		
		Empleado empleadoIBM = new Empleado();
		Empleado empleadoMicrosoft = new Empleado();
		Empleado empleadoApple = new Empleado();
		
		empleadoIBM.setNombre("Diego");
		empleadoIBM.setPrimerApellido("Lopez");
		empleadoIBM.setSegundoApellido("Jiménez");
		empleadoIBM.setPuesto("Senior Dev Java");
		empleadoIBM.setEstatus(true);
		
		empleadoMicrosoft.setNombre("Juan");
		empleadoMicrosoft.setPrimerApellido("Jose");
		empleadoMicrosoft.setSegundoApellido("Alvárez");
		empleadoMicrosoft.setPuesto("Junior Dev C#");
		empleadoMicrosoft.setEstatus(false);
		
		empleadoApple.setNombre("Fernando");
		empleadoApple.setPrimerApellido("Daniells");
		empleadoApple.setSegundoApellido("Romero");
		empleadoApple.setPuesto("Gerente CEO");
		empleadoApple.setEstatus(false);
		
		empleados.add(empleadoIBM);
		empleados.add(empleadoMicrosoft);
		empleados.add(empleadoApple);
		
		return empleados;
		
	}
}
