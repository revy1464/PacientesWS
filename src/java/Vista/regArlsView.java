/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Logica.ArlLogicaLocal;
import Modelo.Arl;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import org.primefaces.component.commandbutton.CommandButton;
import org.primefaces.component.inputtext.InputText;
import org.primefaces.event.SelectEvent;

/**
 *
 * @author Usuario
 */
@Named(value = "regArlView")
@RequestScoped
public class regArlsView {
    
    private InputText txtCodigo;
    private InputText txtNombre;
    private InputText txtDireccion;
    private InputText txtCiudad;
    private InputText txtTelefono;
    private InputText txtEmail;
    
    private CommandButton btnRegistrar;
    private CommandButton btnActualizar;
    private CommandButton btnEliminar;
    private CommandButton btnBuscar;
    
    private List<Arl> listaArls;
    
    private Arl arl;
    
    @EJB
    private ArlLogicaLocal arlLogica;

    /**
     * Creates a new instance of regPensionesView
     */
    public regArlsView() {
    }

    public InputText getTxtCodigo() {
        return txtCodigo;
    }

    public void setTxtCodigo(InputText txtCodigo) {
        this.txtCodigo = txtCodigo;
    }

    public InputText getTxtNombre() {
        return txtNombre;
    }

    public void setTxtNombre(InputText txtNombre) {
        this.txtNombre = txtNombre;
    }

    public InputText getTxtDireccion() {
        return txtDireccion;
    }

    public void setTxtDireccion(InputText txtDireccion) {
        this.txtDireccion = txtDireccion;
    }

    public InputText getTxtCiudad() {
        return txtCiudad;
    }

    public void setTxtCiudad(InputText txtCiudad) {
        this.txtCiudad = txtCiudad;
    }

    public InputText getTxtTelefono() {
        return txtTelefono;
    }

    public void setTxtTelefono(InputText txtTelefono) {
        this.txtTelefono = txtTelefono;
    }

    public InputText getTxtEmail() {
        return txtEmail;
    }

    public void setTxtEmail(InputText txtEmail) {
        this.txtEmail = txtEmail;
    }

    public CommandButton getBtnRegistrar() {
        return btnRegistrar;
    }

    public void setBtnRegistrar(CommandButton btnRegistrar) {
        this.btnRegistrar = btnRegistrar;
    }

    public CommandButton getBtnActualizar() {
        return btnActualizar;
    }

    public void setBtnActualizar(CommandButton btnActualizar) {
        this.btnActualizar = btnActualizar;
    }

    public CommandButton getBtnEliminar() {
        return btnEliminar;
    }

    public void setBtnEliminar(CommandButton btnEliminar) {
        this.btnEliminar = btnEliminar;
    }

    public CommandButton getBtnBuscar() {
        return btnBuscar;
    }

    public void setBtnBuscar(CommandButton btnBuscar) {
        this.btnBuscar = btnBuscar;
    }


    public Arl getArl() {
        return arl;
    }

    public void setArl(Arl arl) {
        this.arl = arl;
    }

    public ArlLogicaLocal getArlLogica() {
        return arlLogica;
    }

    public void setArlLogica(ArlLogicaLocal arlLogica) {
        this.arlLogica = arlLogica;
    }

    public List<Arl> getListaArls() {
        try {
            listaArls=arlLogica.arls();
            
        } catch (Exception ex) {
            Logger.getLogger(regArlsView.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaArls;
    }

    public void setListaArls(List<Arl> listaArl) {
        this.listaArls = listaArl;
    }

   
    public void registrar(){
        try {
            Random id = new Random(System.currentTimeMillis());
            Arl a=new Arl();
            a.setIdarl(id.nextInt(1000));
            a.setCodigoARL(txtCodigo.getValue().toString());
            a.setNombreArl(txtNombre.getValue().toString());
            a.setDireccionArl(txtDireccion.getValue().toString());
            a.setCiudadArl(txtCiudad.getValue().toString());
            a.setTelefonoArl(txtTelefono.getValue().toString());
            a.setEmailArl(txtEmail.getValue().toString());
            arlLogica.crearArl(a);
        } catch (Exception ex) {
            Logger.getLogger(regArlsView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void modificar(){
        try {
            Arl a=arlLogica.consultarArlbyCodigo(txtCodigo.getValue().toString());           
a.setCodigoARL(txtCodigo.getValue().toString());
            a.setNombreArl(txtNombre.getValue().toString());
            a.setDireccionArl(txtDireccion.getValue().toString());
            a.setCiudadArl(txtCiudad.getValue().toString());
            a.setTelefonoArl(txtTelefono.getValue().toString());
            a.setEmailArl(txtEmail.getValue().toString());
            arlLogica.modificarArl(a);
        } catch (Exception ex) {
            Logger.getLogger(regArlsView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void eliminar(){
        try {
            Arl a=arlLogica.consultarArlbyCodigo(txtCodigo.getValue().toString());           
            arlLogica.eliminarArl(a);
        } catch (Exception ex) {
            Logger.getLogger(regArlsView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void showArl(){
        try {
            Arl a=arlLogica.consultarArlbyCodigo(txtCodigo.getValue().toString());
            txtNombre.setValue(a.getNombreArl());
            txtDireccion.setValue(a.getDireccionArl());
            txtCiudad.setValue(a.getCiudadArl());
            txtTelefono.setValue(a.getTelefonoArl());
            txtEmail.setValue(a.getEmailArl());
            
        } catch (Exception ex) {
            Logger.getLogger(regArlsView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void showArlSelect(SelectEvent e){
        Arl a= (Arl) e.getObject();
        txtCodigo.setValue(a.getCodigoARL());
        txtNombre.setValue(a.getNombreArl());
            txtDireccion.setValue(a.getDireccionArl());
            txtCiudad.setValue(a.getCiudadArl());
            txtTelefono.setValue(a.getTelefonoArl());
            txtEmail.setValue(a.getEmailArl());
    }
}
