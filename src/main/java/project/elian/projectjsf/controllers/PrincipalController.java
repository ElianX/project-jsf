/**
 * 
 */
package project.elian.projectjsf.controllers;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import project.elian.projectjsf.entity.Empleado;
import project.elian.projectjsf.services.EmpleadoService;

/**
 * @author ElianX
 * Clase controller que se encarga de procesar la información para la pantalla principal.xhtml
 */

@ManagedBean
@ViewScoped
public class PrincipalController {
	private List<Empleado> empleados;
	private EmpleadoService empleadoService = new EmpleadoService();
	
	/**
	 * Método que se encarga de inicializar la información de la pantalla principal.xhtml
	 */
	@PostConstruct
	public void init() {
		this.consultarEmpleados();
	}
	
	/**
	 * 
	 */
	public void consultarEmpleados() {
		this.empleados  = this.empleadoService.consultarEmpleados();
	}

	/**
	 * @return the empleados
	 */
	public List<Empleado> getEmpleados() {
		return empleados;
	}

	/**
	 * @param empleados the empleados to set
	 */
	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}
}
