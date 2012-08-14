
package net.st.controlador.seguridad;

import javax.el.ELContext;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.application.FacesMessage;
/*
import org.cursoexperto.jftf.controller.ClienteJpaController;
import org.cursoexperto.jftf.entidades.Cliente;
*/

/**
 *
 * @author camilo
 */
@ManagedBean
@SessionScoped

public class LoginController 
  {

    /** Creates a new instance of LoginController */
    public LoginController() {
        
        FacesContext facesContext = FacesContext.getCurrentInstance();
    //    jpaController = (ClienteJpaController) facesContext.getApplication().getELResolver().getValue(facesContext.getELContext(), null, "clienteJpa");
    }
   // private ClienteJpaController jpaController = null;
    private String usuario = null;
    private String password = null;
    private String loginStatus = null;
    
    public String login() {
        ELContext elContext = FacesContext.getCurrentInstance().getELContext();
     //   ClienteController c = (ClienteController) FacesContext.getCurrentInstance().getApplication().getELResolver().getValue(elContext, null, "cliente");
     //   Cliente cli = jpaController.findByUsuario(usuario);
     /*   if (cli != null) {
            if (getPassword().equals(cli.getPassword())) {
                c.setLogged(true);
                c.setCliente(cli);
            } else {
                FacesContext context = FacesContext.getCurrentInstance();
                FacesMessage message = new FacesMessage("Invalid Username and/or Password");
                context.addMessage("loginForm", message);
                FacesMessage facesMsg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Password incorrecta", "Password incorrecta");
                FacesContext.getCurrentInstance().addMessage("loginForm", facesMsg);
                return "logout";
            }
        } else {
            FacesContext context = FacesContext.getCurrentInstance();
            FacesMessage message = new FacesMessage("Invalid Username and/or Password");
            context.addMessage("loginForm", message);
            FacesMessage facesMsg = new FacesMessage(FacesMessage.SEVERITY_INFO, "El usuario no existe", "El usuario no existe");
            FacesContext.getCurrentInstance().addMessage("loginForm", facesMsg);
            return "logout";
        }  */
        return "login";
    }

    /**
     * @return the usuario
     */

    
    public void setLoginStatus(String loginStatus) {
        this.loginStatus = loginStatus;
    }

    public String getLoginStatus()  {
        // Do your stuff here.
        return loginStatus;
    }    

    
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

