/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.st.entidad.seguridad;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author camilo
 */
@Entity
@Table(name = "TB_USUARIO_PERFIL_VIGENCIAS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbUsuarioPerfilVigencias.findAll", query = "SELECT t FROM TbUsuarioPerfilVigencias t"),
    @NamedQuery(name = "TbUsuarioPerfilVigencias.findByCnsctvoUsroPrflVgncs", query = "SELECT t FROM TbUsuarioPerfilVigencias t WHERE t.cnsctvoUsroPrflVgncs = :cnsctvoUsroPrflVgncs"),
    @NamedQuery(name = "TbUsuarioPerfilVigencias.findByCnsctvoUsro", query = "SELECT t FROM TbUsuarioPerfilVigencias t WHERE t.cnsctvoUsro = :cnsctvoUsro"),
    @NamedQuery(name = "TbUsuarioPerfilVigencias.findByCnsctvoPrfl", query = "SELECT t FROM TbUsuarioPerfilVigencias t WHERE t.cnsctvoPrfl = :cnsctvoPrfl"),
    @NamedQuery(name = "TbUsuarioPerfilVigencias.findByIncoVgnca", query = "SELECT t FROM TbUsuarioPerfilVigencias t WHERE t.incoVgnca = :incoVgnca"),
    @NamedQuery(name = "TbUsuarioPerfilVigencias.findByFnVgnca", query = "SELECT t FROM TbUsuarioPerfilVigencias t WHERE t.fnVgnca = :fnVgnca"),
    @NamedQuery(name = "TbUsuarioPerfilVigencias.findByUsroCrcn", query = "SELECT t FROM TbUsuarioPerfilVigencias t WHERE t.usroCrcn = :usroCrcn"),
    @NamedQuery(name = "TbUsuarioPerfilVigencias.findByFchaCrcn", query = "SELECT t FROM TbUsuarioPerfilVigencias t WHERE t.fchaCrcn = :fchaCrcn")})
public class TbUsuarioPerfilVigencias implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CNSCTVO_USRO_PRFL_VGNCS")
    private Integer cnsctvoUsroPrflVgncs;
    @Column(name = "CNSCTVO_USRO")
    private BigInteger cnsctvoUsro;
    @Size(max = 3)
    @Column(name = "CNSCTVO_PRFL")
    private String cnsctvoPrfl;
    @Column(name = "INCO_VGNCA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date incoVgnca;
    @Column(name = "FN_VGNCA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fnVgnca;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "USRO_CRCN")
    private String usroCrcn;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FCHA_CRCN")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fchaCrcn;
    @JoinColumn(name = "CNSCTVO_USRO_PRFL", referencedColumnName = "CNSCTVO_USRO_PRFL")
    @ManyToOne(optional = false)
    private TbUsuarioPerfil cnsctvoUsroPrfl;

    public TbUsuarioPerfilVigencias() {
    }

    public TbUsuarioPerfilVigencias(Integer cnsctvoUsroPrflVgncs) {
        this.cnsctvoUsroPrflVgncs = cnsctvoUsroPrflVgncs;
    }

    public TbUsuarioPerfilVigencias(Integer cnsctvoUsroPrflVgncs, String usroCrcn, Date fchaCrcn) {
        this.cnsctvoUsroPrflVgncs = cnsctvoUsroPrflVgncs;
        this.usroCrcn = usroCrcn;
        this.fchaCrcn = fchaCrcn;
    }

    public Integer getCnsctvoUsroPrflVgncs() {
        return cnsctvoUsroPrflVgncs;
    }

    public void setCnsctvoUsroPrflVgncs(Integer cnsctvoUsroPrflVgncs) {
        this.cnsctvoUsroPrflVgncs = cnsctvoUsroPrflVgncs;
    }

    public BigInteger getCnsctvoUsro() {
        return cnsctvoUsro;
    }

    public void setCnsctvoUsro(BigInteger cnsctvoUsro) {
        this.cnsctvoUsro = cnsctvoUsro;
    }

    public String getCnsctvoPrfl() {
        return cnsctvoPrfl;
    }

    public void setCnsctvoPrfl(String cnsctvoPrfl) {
        this.cnsctvoPrfl = cnsctvoPrfl;
    }

    public Date getIncoVgnca() {
        return incoVgnca;
    }

    public void setIncoVgnca(Date incoVgnca) {
        this.incoVgnca = incoVgnca;
    }

    public Date getFnVgnca() {
        return fnVgnca;
    }

    public void setFnVgnca(Date fnVgnca) {
        this.fnVgnca = fnVgnca;
    }

    public String getUsroCrcn() {
        return usroCrcn;
    }

    public void setUsroCrcn(String usroCrcn) {
        this.usroCrcn = usroCrcn;
    }

    public Date getFchaCrcn() {
        return fchaCrcn;
    }

    public void setFchaCrcn(Date fchaCrcn) {
        this.fchaCrcn = fchaCrcn;
    }

    public TbUsuarioPerfil getCnsctvoUsroPrfl() {
        return cnsctvoUsroPrfl;
    }

    public void setCnsctvoUsroPrfl(TbUsuarioPerfil cnsctvoUsroPrfl) {
        this.cnsctvoUsroPrfl = cnsctvoUsroPrfl;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cnsctvoUsroPrflVgncs != null ? cnsctvoUsroPrflVgncs.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbUsuarioPerfilVigencias)) {
            return false;
        }
        TbUsuarioPerfilVigencias other = (TbUsuarioPerfilVigencias) object;
        if ((this.cnsctvoUsroPrflVgncs == null && other.cnsctvoUsroPrflVgncs != null) || (this.cnsctvoUsroPrflVgncs != null && !this.cnsctvoUsroPrflVgncs.equals(other.cnsctvoUsroPrflVgncs))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "net.st.entidad.seguridad.TbUsuarioPerfilVigencias[ cnsctvoUsroPrflVgncs=" + cnsctvoUsroPrflVgncs + " ]";
    }
    
}
