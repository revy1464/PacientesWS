/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Logica.FondoLogicaLocal;
import Modelo.Fondopensiones;
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
@Named(value = "regPensionesView")
@RequestScoped
public class regPensionesView {
    
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
    
    private List<Fondopensiones> listaFondos;
    
    private Fondopensiones fondoPension;
    
    @EJB
    private FondoLogicaLocal fondoLogica;

    /**
     * Creates a new instance of regPensionesView
     */
    public regPensionesView() {
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

    public List<Fondopensiones> getListaFondos() {
        try {
            listaFondos=fondoLogica.fondos();
            
        } catch (Exception ex) {
            Logger.getLogger(regPensionesView.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaFondos;
    }

    public void setListaFondos(List<Fondopensiones> listaFondos) {
        this.listaFondos = listaFondos;
    }

    public Fondopensiones getFondoPension() {
        return fondoPension;
    }

    public void setFondoPension(Fondopensiones fondoPension) {
        this.fondoPension = fondoPension;
    }

    public FondoLogicaLocal getFondoLogica() {
        return fondoLogica;
    }

    public void setFondoLogica(FondoLogicaLocal fondoLogica) {
        this.fondoLogica = fondoLogica;
    }
    
    public void registrar(){
        try {
            Random id = new Random(System.currentTimeMillis());
            Fondopensiones f=new Fondopensiones();
            f.setIdfondoPensiones(id.nextInt(1000));
            f.setCodigoFondo(txtCodigo.getValue().toString());
            f.setNombreFondoPensiones(txtNombre.getValue().toString());
            f.setDireccionPensiones(txtDireccion.getValue().toString());
            f.setCiudadPensiones(txtCiudad.getValue().toString());
            f.setTelefonoPensiones(txtTelefono.getValue().toString());
            f.setEmailPensiones(txtEmail.getValue().toString());
            fondoLogica.crearFondo(f);
        } catch (Exception ex) {
            Logger.getLogger(regPensionesView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void modificar(){
        try {
            Fondopensiones f=fondoLogica.consultarFondobyCodigo(txtCodigo.getValue().toString());           
            f.setCodigoFondo(txtCodigo.getValue().toString());
            f.setNombreFondoPensiones(txtNombre.getValue().toString());
            f.setDireccionPensiones(txtDireccion.getValue().toString());
            f.setCiudadPensiones(txtCiudad.getValue().toString());
            f.setTelefonoPensiones(txtTelefono.getValue().toString());
            f.setEmailPensiones(txtEmail.getValue().toString());
            fondoLogica.modificarFondo(f);
        } catch (Exception ex) {
            Logger.getLogger(regPensionesView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void eliminar(){
        try {
            Fondopensiones f=fondoLogica.consultarFondobyCodigo(txtCodigo.getValue().toString());           
            fondoLogica.eliminarFondo(f);
        } catch (Exception ex) {
            Logger.getLogger(regPensionesView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void showFondo(){
        try {
            Fondopensiones f=fondoLogica.consultarFondobyCodigo(txtCodigo.getValue().toString());
            txtNombre.setValue(f.getNombreFondoPensiones());
            txtDireccion.setValue(f.getDireccionPensiones());
            txtCiudad.setValue(f.getCiudadPensiones());
            txtTelefono.setValue(f.getTelefonoPensiones());
            txtEmail.setValue(f.getEmailPensiones());
            
        } catch (Exception ex) {
            Logger.getLogger(regPensionesView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void showFondoSelect(SelectEvent e){
        Fondopensiones f= (Fondopensiones) e.getObject();
        txtCodigo.setValue(fondoPension.getCodigoFondo());
        txtNombre.setValue(fondoPension.getNombreFondoPensiones());
            txtDireccion.setValue(f.getDireccionPensiones());
            txtCiudad.setValue(f.getCiudadPensiones());
            txtTelefono.setValue(f.getTelefonoPensiones());
            txtEmail.setValue(f.getEmailPensiones());
    }
}
