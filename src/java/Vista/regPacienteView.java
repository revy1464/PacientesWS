/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Logica.ArlLogicaLocal;
import Logica.EpsLogicaLocal;
import Logica.PacienteLogicaLocal;
import Modelo.Arl;
import Modelo.Paciente;
import Modelo.Fondopensiones;
import Persistencia.FondopensionesFacadeLocal;
import java.util.Date;
import java.util.List;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import org.primefaces.component.calendar.Calendar;
import org.primefaces.component.commandbutton.CommandButton;
import org.primefaces.component.graphicimage.GraphicImage;
import org.primefaces.component.inputtext.InputText;
import org.primefaces.component.selectonemenu.SelectOneMenu;

/**
 *
 * @author Usuario
 */
@Named(value = "regPacienteView")
@RequestScoped
public class regPacienteView {

    
    private InputText txtCedula;
    private InputText txtCodigo;
    private InputText txtNombre;
    private InputText txtApelido;
    private InputText txtTelefono;
    private InputText txtDireccion;
    private InputText txtCiudad;
    private InputText txtDepartamento;
    private Calendar calFechaNacimiento;
    private InputText txtLugarNacimiento;
    private SelectOneMenu cmbSexo;
    private SelectOneMenu cmbEstado;
    private InputText txtOcupacion;
    private SelectOneMenu cmbEscolaridad;
    private GraphicImage imgFoto; //Pendiente
    private SelectOneMenu cmbSalud;
    private SelectOneMenu cmbPension;
    private SelectOneMenu cmbArl;
    
    private String sexo;
    private String estado;
    private String escolaridad;
    private String saludCmb;
    private String pensionCmb;
    private String arlCmb;
    private Date date2;
    
        private CommandButton btnRegistrar;
    private CommandButton btnActualizar;
    private CommandButton btnEliminar;
    private CommandButton btnBuscar;
    
    private List<Paciente> listaPacientes;
    private List<Arl> listaArls;
    private List<Fondopensiones> listaFondos;
    
    @EJB
    private PacienteLogicaLocal pacienteLogica;
    
    @EJB
    private FondopensionesFacadeLocal fondoLogica;
    
    @EJB
    private ArlLogicaLocal arlLogica;
    
    @EJB
    private EpsLogicaLocal epsLogica;
    
    /**
     * Creates a new instance of regPacienteView
     */
    public regPacienteView() {
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

    public InputText getTxtApelido() {
        return txtApelido;
    }

    public void setTxtApelido(InputText txtApelido) {
        this.txtApelido = txtApelido;
    }

    public InputText getTxtTelefono() {
        return txtTelefono;
    }

    public void setTxtTelefono(InputText txtTelefono) {
        this.txtTelefono = txtTelefono;
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

    public InputText getTxtDepartamento() {
        return txtDepartamento;
    }

    public void setTxtDepartamento(InputText txtDepartamento) {
        this.txtDepartamento = txtDepartamento;
    }

    public Calendar getCalFechaNacimiento() {
        return calFechaNacimiento;
    }

    public void setCalFechaNacimiento(Calendar calFechaNacimiento) {
        this.calFechaNacimiento = calFechaNacimiento;
    }

    public InputText getTxtLugarNacimiento() {
        return txtLugarNacimiento;
    }

    public void setTxtLugarNacimiento(InputText txtLugarNacimiento) {
        this.txtLugarNacimiento = txtLugarNacimiento;
    }

    public SelectOneMenu getCmbSexo() {
        return cmbSexo;
    }
    
    public InputText getTxtCedula() {
        return txtCedula;
    }

    public void setTxtCedula(InputText txtCedula) {
        this.txtCedula = txtCedula;
    }

    public void setCmbSexo(SelectOneMenu cmbSexo) {
        this.cmbSexo = cmbSexo;
    }

    public SelectOneMenu getCmbEstado() {
        return cmbEstado;
    }

    public void setCmbEstado(SelectOneMenu cmbEstado) {
        this.cmbEstado = cmbEstado;
    }

    public InputText getTxtOcupacion() {
        return txtOcupacion;
    }

    public void setTxtOcupacion(InputText txtOcupacion) {
        this.txtOcupacion = txtOcupacion;
    }

    public SelectOneMenu getCmbEscolaridad() {
        return cmbEscolaridad;
    }

    public void setCmbEscolaridad(SelectOneMenu cmbEscolaridad) {
        this.cmbEscolaridad = cmbEscolaridad;
    }

    public GraphicImage getImgFoto() {
        return imgFoto;
    }

    public void setImgFoto(GraphicImage imgFoto) {
        this.imgFoto = imgFoto;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEscolaridad() {
        return escolaridad;
    }

    public void setEscolaridad(String escolaridad) {
        this.escolaridad = escolaridad;
    }

    public Date getDate2() {
        return date2;
    }

    public void setDate2(Date date2) {
        this.date2 = date2;
    }

    public List<Paciente> getListaPacientes() {
        return listaPacientes;
    }

    public void setListaPacientes(List<Paciente> listaPacientes) {
        this.listaPacientes = listaPacientes;
    }

    public List<Arl> getListaArls() {
        return listaArls;
    }

    public void setListaArls(List<Arl> listaArls) {
        this.listaArls = listaArls;
    }

    public List<Fondopensiones> getListaFondos() {
        return listaFondos;
    }

    public void setListaFondos(List<Fondopensiones> listaFondos) {
        this.listaFondos = listaFondos;
    }

    public PacienteLogicaLocal getPacienteLogica() {
        return pacienteLogica;
    }

    public void setPacienteLogica(PacienteLogicaLocal pacienteLogica) {
        this.pacienteLogica = pacienteLogica;
    }

    public FondopensionesFacadeLocal getFondoLogica() {
        return fondoLogica;
    }

    public void setFondoLogica(FondopensionesFacadeLocal fondoLogica) {
        this.fondoLogica = fondoLogica;
    }

    public ArlLogicaLocal getArlLogica() {
        return arlLogica;
    }

    public void setArlLogica(ArlLogicaLocal arlLogica) {
        this.arlLogica = arlLogica;
    }

    public EpsLogicaLocal getEpsLogica() {
        return epsLogica;
    }

    public void setEpsLogica(EpsLogicaLocal epsLogica) {
        this.epsLogica = epsLogica;
    }

    public SelectOneMenu getCmbSalud() {
        return cmbSalud;
    }

    public void setCmbSalud(SelectOneMenu cmbSalud) {
        this.cmbSalud = cmbSalud;
    }

    public SelectOneMenu getCmbPension() {
        return cmbPension;
    }

    public void setCmbPension(SelectOneMenu cmbPension) {
        this.cmbPension = cmbPension;
    }

    public SelectOneMenu getCmbArl() {
        return cmbArl;
    }

    public void setCmbArl(SelectOneMenu cmbArl) {
        this.cmbArl = cmbArl;
    }

    public String getSaludCmb() {
        return saludCmb;
    }

    public void setSaludCmb(String saludCmb) {
        this.saludCmb = saludCmb;
    }

    public String getPensionCmb() {
        return pensionCmb;
    }

    public void setPensionCmb(String pensionCmb) {
        this.pensionCmb = pensionCmb;
    }

    public String getArlCmb() {
        return arlCmb;
    }

    public void setArlCmb(String arlCmb) {
        this.arlCmb = arlCmb;
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
    
    public void registrar(){
    }
    public void modificar(){
    }
    public void eliminar(){
    }
    
    public void showPaciente(){
    }
    
    
}
