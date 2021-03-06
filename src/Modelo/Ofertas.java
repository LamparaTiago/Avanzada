/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Santiago Gaviria Oliveros
 */
@Entity
@Table(name = "ofertas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ofertas.findAll", query = "SELECT o FROM Ofertas o"),
    @NamedQuery(name = "Ofertas.findByCodigooferta", query = "SELECT o FROM Ofertas o WHERE o.codigooferta = :codigooferta"),
    @NamedQuery(name = "Ofertas.findByValor", query = "SELECT o FROM Ofertas o WHERE o.valor = :valor"),
    @NamedQuery(name = "Ofertas.findByFechaoferta", query = "SELECT o FROM Ofertas o WHERE o.fechaoferta = :fechaoferta"),
    @NamedQuery(name = "Ofertas.findByOferta", query = "SELECT o FROM Ofertas o join o.subastas_codigosubasta su where su.codigosubasta= :codsubasta"),
    @NamedQuery(name = "Ofertas.findByOfertafull", query = "SELECT o FROM Ofertas o join o.proveedoresCedula pro where pro.cedula=:cedula"),
    @NamedQuery(name = "Ofertas.findByDetallesoferta", query = "SELECT o FROM Ofertas o WHERE o.detallesoferta = :detallesoferta"),})
public class Ofertas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigooferta")
    private Integer codigooferta;
    @Basic(optional = false)
    @Column(name = "resultado")
    private String resultado;
    @Basic(optional = false)
    @Column(name = "valor")
    private double valor;
    @Basic(optional = false)
    @Column(name = "fechaoferta")
    @Temporal(TemporalType.DATE)
    private Date fechaoferta;
    @Column(name = "detallesoferta")
    private String detallesoferta;
    @JoinColumn(name = "subastas_codigosubasta", referencedColumnName = "codigosubasta")
    @ManyToOne(optional = false)
    private Subastas subastas_codigosubasta;
    @JoinColumn(name = "proveedores_cedula", referencedColumnName = "cedula")
    @ManyToOne(optional = false)
    private Proveedores proveedoresCedula;
    

    public Ofertas() {
    }

    public Ofertas(Integer codigooferta) {
        this.codigooferta = codigooferta;
    }

    public Ofertas(double valor, Date fechaoferta, String detalles, Subastas sub, Proveedores pro,String resultado) {
        this.valor = valor;
        this.fechaoferta = fechaoferta;
        this.detallesoferta = detalles;
        this.subastas_codigosubasta = sub;
        this.proveedoresCedula = pro;
        this.resultado = resultado;
    }

    public Ofertas(Integer codigooferta, double valor, Date fechaoferta, String detalles, Subastas sub, Proveedores pro,String res) {
        this.codigooferta = codigooferta;
        this.valor = valor;
        this.fechaoferta = fechaoferta;
        this.detallesoferta = detalles;
        this.subastas_codigosubasta = sub;
        this.proveedoresCedula = pro;
        this.resultado = res;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public Subastas getSubastas_codigosubasta() {
        return subastas_codigosubasta;
    }

    public void setSubastas_codigosubasta(Subastas subastas_codigosubasta) {
        this.subastas_codigosubasta = subastas_codigosubasta;
    }

   
    public Integer getCodigooferta() {
        return codigooferta;
    }

    public void setCodigooferta(Integer codigooferta) {
        this.codigooferta = codigooferta;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Date getFechaoferta() {
        return fechaoferta;
    }

    public void setFechaoferta(Date fechaoferta) {
        this.fechaoferta = fechaoferta;
    }

    public String getDetallesoferta() {
        return detallesoferta;
    }

    public void setDetallesoferta(String detallesoferta) {
        this.detallesoferta = detallesoferta;
    }

    public Subastas getSubastasCodigosubasta() {
        return subastas_codigosubasta;
    }

    public void setSubastasCodigosubasta(Subastas subastasCodigosubasta) {
        this.subastas_codigosubasta = subastasCodigosubasta;
    }

    public Proveedores getProveedoresCedula() {
        return proveedoresCedula;
    }

    public void setProveedoresCedula(Proveedores proveedoresCedula) {
        this.proveedoresCedula = proveedoresCedula;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigooferta != null ? codigooferta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ofertas)) {
            return false;
        }
        Ofertas other = (Ofertas) object;
        if ((this.codigooferta == null && other.codigooferta != null) || (this.codigooferta != null && !this.codigooferta.equals(other.codigooferta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Ofertas[ codigooferta=" + codigooferta + " ]";
    }

}
