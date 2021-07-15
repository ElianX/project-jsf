/**
 * 
 */
package project.elian.projectjsf.controllers;

import java.io.IOException;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

/**
 * @author ElianX
 *
 */

@ManagedBean
public class LoginController {
	/**
	 *  Usuario que ingresa en el login.xhtml
	 */
	private String usuario; 
	
	/**
	 *  Contraseña que ingresa en el login.xhtml
	 */
	private String password; 
	
	
	/** 
	 * Método que permite ingresar a la pantalla principal del proyecto
	 */
	public void ingresar() {
		System.out.println("Usuario: " + usuario);	
		
		if(usuario.equals("Juanito") && password.equals("12345")) {
			try {
				this.redireccionar("principal.xhtml");
			} catch (IOException e) {
				FacesContext.getCurrentInstance().addMessage("formlogin:text_usuario", new FacesMessage(FacesMessage.SEVERITY_FATAL, "Error 404 - Page Not Found", ""));							
				e.printStackTrace();
			}
		}else {
			FacesContext.getCurrentInstance().addMessage("formlogin:text_usuario", new FacesMessage(FacesMessage.SEVERITY_ERROR, "Usuario o contraseña incorrectos", ""));			
		}
	}
	
	private void redireccionar(String url_pagina) throws IOException {
		ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
		ec.redirect(url_pagina);
	}
	
	
	
	/**
	 * @return the usuario
	 */
	public String getUsuario() {
		return usuario;
	}
	/**
	 * @param usuario the usuario to set
	 */
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
