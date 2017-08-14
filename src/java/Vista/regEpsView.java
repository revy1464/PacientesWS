/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Logica.EpsLogicaLocal;
import Modelo.Eps;
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
@Named(value = "regEpsView")
@RequestScoped
public class regEpsView {

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

    private List<Eps> listaEpss;

    private Eps eps;

    @EJB
    private EpsLogicaLocal epsLogica;

    /**
     * Creates a new instance of regEpsView
     */
    public regEpsView() {
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

    public Eps getEps() {
        return eps;
    }

    public void setEps(Eps eps) {
        this.eps = eps;
    }

    public EpsLogicaLocal getEpsLogica() {
        return epsLogica;
    }

    public void setEpsLogica(EpsLogicaLocal epsLogica) {
        this.epsLogica = epsLogica;
    }

    public List<Eps> getListaEpss() {
        try {
            listaEpss = epsLogica.eps_s();

        } catch (Exception ex) {
            Logger.getLogger(regEpsView.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaEpss;
    }

    public void setListaEpss(List<Eps> listaEps) {
        this.listaEpss = listaEps;
    }

    public void registrar() {
        try {
            Random id = new Random(System.currentTimeMillis());
            Eps e = new Eps();
            e.setIdEps(id.nextInt(1000));
            e.setCodigoEPS(txtCodigo.getValue().toString());
            e.setNombreEPS(txtNombre.getValue().toString());
            e.setDireccionEPS(txtDireccion.getValue().toString());
            e.setCiudadEPS(txtCiudad.getValue().toString());
            e.setTelefonoEPS(txtTelefono.getValue().toString());
            e.setEmailEPS(txtEmail.getValue().toString());
            epsLogica.crearEps(e);
        } catch (Exception ex) {
            Logger.getLogger(regEpsView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void modificar() {
        try {
            Eps e = epsLogica.consultarEpsbyCodigo(txtCodigo.getValue().toString());
            e.setCodigoEPS(txtCodigo.getValue().toString());
            e.setNombreEPS(txtNombre.getValue().toString());
            e.setDireccionEPS(txtDireccion.getValue().toString());
            e.setCiudadEPS(txtCiudad.getValue().toString());
            e.setTelefonoEPS(txtTelefono.getValue().toString());
            e.setEmailEPS(txtEmail.getValue().toString());
            epsLogica.modificarEps(e);
        } catch (Exception ex) {
            Logger.getLogger(regEpsView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void eliminar() {
        try {
            Eps a = epsLogica.consultarEpsbyCodigo(txtCodigo.getValue().toString());
            epsLogica.eliminarEps(a);
        } catch (Exception ex) {
            Logger.getLogger(regEpsView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void showEps() {
        try {
            Eps a = epsLogica.consultarEpsbyCodigo(txtCodigo.getValue().toString());
            txtNombre.setValue(a.getNombreEPS());
            txtDireccion.setValue(a.getDireccionEPS());
            txtCiudad.setValue(a.getCiudadEPS());
            txtTelefono.setValue(a.getTelefonoEPS());
            txtEmail.setValue(a.getEmailEPS());

        } catch (Exception ex) {
            Logger.getLogger(regEpsView.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void showEpsSelect(SelectEvent event) {
        Eps e = (Eps) event.getObject();
        txtCodigo.setValue(e.getCodigoEPS());
        txtNombre.setValue(e.getNombreEPS());
        txtDireccion.setValue(e.getDireccionEPS());
        txtCiudad.setValue(e.getCiudadEPS());
        txtTelefono.setValue(e.getTelefonoEPS());
        txtEmail.setValue(e.getEmailEPS());
    }
}
