/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amclos.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Administrador
 */
@Entity
@Table(name = "TIPOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tipos.findAll", query = "SELECT t FROM Tipos t")})
public class Tipos implements Serializable {
    @OneToMany(mappedBy = "tipoPeriodo")
    private List<Periodos> periodosList;
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "USUARIO")
    private String usuario;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "PROGRAMA")
    private String programa;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 6)
    @Column(name = "CODIGO")
    private String codigo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "GRUPO")
    private String grupo;
    @Column(name = "VALOR")
    private Short valor;
    @OneToMany(mappedBy = "tipoEscala")
    private List<Indicador> indicadorList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "estado")
    private List<Variable> variableList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tipoSituacion")
    private List<Preguntas> preguntasList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "estado")
    private List<Usuario> usuarioList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tipoUsuario")
    private List<Usuario> usuarioList1;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tipos")
    private List<Riesgos> riesgosList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "estado")
    private List<OpcionesRespuesta> opcionesRespuestaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codigoTipo")
    private List<Funcion> funcionList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tipoInstitucion")
    private List<Institucion> institucionList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "estado")
    private List<Institucion> institucionList1;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tipos")
    private List<InstitucionVariable> institucionVariableList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tipoZona")
    private List<ZonaGeografica> zonaGeograficaList;

    public Tipos() {
    }

    public Tipos(String codigo) {
        this.codigo = codigo;
    }

    public Tipos(String codigo, String usuario, String programa, Date fecha, String descripcion, String grupo) {
        this.codigo = codigo;
        this.usuario = usuario;
        this.programa = programa;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.grupo = grupo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public Short getValor() {
        return valor;
    }

    public void setValor(Short valor) {
        this.valor = valor;
    }

    @XmlTransient
    public List<Indicador> getIndicadorList() {
        return indicadorList;
    }

    public void setIndicadorList(List<Indicador> indicadorList) {
        this.indicadorList = indicadorList;
    }

    @XmlTransient
    public List<Variable> getVariableList() {
        return variableList;
    }

    public void setVariableList(List<Variable> variableList) {
        this.variableList = variableList;
    }

    @XmlTransient
    public List<Preguntas> getPreguntasList() {
        return preguntasList;
    }

    public void setPreguntasList(List<Preguntas> preguntasList) {
        this.preguntasList = preguntasList;
    }

    @XmlTransient
    public List<Usuario> getUsuarioList() {
        return usuarioList;
    }

    public void setUsuarioList(List<Usuario> usuarioList) {
        this.usuarioList = usuarioList;
    }

    @XmlTransient
    public List<Usuario> getUsuarioList1() {
        return usuarioList1;
    }

    public void setUsuarioList1(List<Usuario> usuarioList1) {
        this.usuarioList1 = usuarioList1;
    }

    @XmlTransient
    public List<Riesgos> getRiesgosList() {
        return riesgosList;
    }

    public void setRiesgosList(List<Riesgos> riesgosList) {
        this.riesgosList = riesgosList;
    }

    @XmlTransient
    public List<OpcionesRespuesta> getOpcionesRespuestaList() {
        return opcionesRespuestaList;
    }

    public void setOpcionesRespuestaList(List<OpcionesRespuesta> opcionesRespuestaList) {
        this.opcionesRespuestaList = opcionesRespuestaList;
    }

    @XmlTransient
    public List<Funcion> getFuncionList() {
        return funcionList;
    }

    public void setFuncionList(List<Funcion> funcionList) {
        this.funcionList = funcionList;
    }

    @XmlTransient
    public List<Institucion> getInstitucionList() {
        return institucionList;
    }

    public void setInstitucionList(List<Institucion> institucionList) {
        this.institucionList = institucionList;
    }

    @XmlTransient
    public List<Institucion> getInstitucionList1() {
        return institucionList1;
    }

    public void setInstitucionList1(List<Institucion> institucionList1) {
        this.institucionList1 = institucionList1;
    }

    @XmlTransient
    public List<InstitucionVariable> getInstitucionVariableList() {
        return institucionVariableList;
    }

    public void setInstitucionVariableList(List<InstitucionVariable> institucionVariableList) {
        this.institucionVariableList = institucionVariableList;
    }

    @XmlTransient
    public List<ZonaGeografica> getZonaGeograficaList() {
        return zonaGeograficaList;
    }

    public void setZonaGeograficaList(List<ZonaGeografica> zonaGeograficaList) {
        this.zonaGeograficaList = zonaGeograficaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigo != null ? codigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tipos)) {
            return false;
        }
        Tipos other = (Tipos) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.amclos.model.Tipos[ codigo=" + codigo + " ]";
    }

    public List<Periodos> getPeriodosList() {
        return periodosList;
    }

    public void setPeriodosList(List<Periodos> periodosList) {
        this.periodosList = periodosList;
    }
    
}
