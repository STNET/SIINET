/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.st.entidad.seguridad;

import java.io.Serializable;
import java.math.BigInteger;
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
 * @author camilo
 */
@Entity
@Table(name = "TB_MODULO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbModulo.findAll", query = "SELECT t FROM TbModulo t"),
    @NamedQuery(name = "TbModulo.findByCnsctvoMdlo", query = "SELECT t FROM TbModulo t WHERE t.cnsctvoMdlo = :cnsctvoMdlo"),
    @NamedQuery(name = "TbModulo.findByCdgoMdlo", query = "SELECT t FROM TbModulo t WHERE t.cdgoMdlo = :cdgoMdlo"),
    @NamedQuery(name = "TbModulo.findByDscrpcnMdlo", query = "SELECT t FROM TbModulo t WHERE t.dscrpcnMdlo = :dscrpcnMdlo"),
    @NamedQuery(name = "TbModulo.findByBrrdo", query = "SELECT t FROM TbModulo t WHERE t.brrdo = :brrdo"),
    @NamedQuery(name = "TbModulo.findByIncoVgnca", query = "SELECT t FROM TbModulo t WHERE t.incoVgnca = :incoVgnca"),
    @NamedQuery(name = "TbModulo.findByFnVgnca", query = "SELECT t FROM TbModulo t WHERE t.fnVgnca = :fnVgnca"),
    @NamedQuery(name = "TbModulo.findByFchaCrcn", query = "SELECT t FROM TbModulo t WHERE t.fchaCrcn = :fchaCrcn"),
    @NamedQuery(name = "TbModulo.findByUsroCrcn", query = "SELECT t FROM TbModulo t WHERE t.usroCrcn = :usroCrcn"),
    @NamedQuery(name = "TbModulo.findByObsrvcns", query = "SELECT t FROM TbModulo t WHERE t.obsrvcns = :obsrvcns"),
    @NamedQuery(name = "TbModulo.findByVsble", query = "SELECT t FROM TbModulo t WHERE t.vsble = :vsble"),
    @NamedQuery(name = "TbModulo.findByCnsctvoDsde", query = "SELECT t FROM TbModulo t WHERE t.cnsctvoDsde = :cnsctvoDsde"),
    @NamedQuery(name = "TbModulo.findByCnsctvoHsta", query = "SELECT t FROM TbModulo t WHERE t.cnsctvoHsta = :cnsctvoHsta")})
public class TbModulo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CNSCTVO_MDLO")
    private Integer cnsctvoMdlo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "CDGO_MDLO")
    private String cdgoMdlo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "DSCRPCN_MDLO")
    private String dscrpcnMdlo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "BRRDO")
    private String brrdo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "INCO_VGNCA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date incoVgnca;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FN_VGNCA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fnVgnca;
    @Column(name = "FCHA_CRCN")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fchaCrcn;
    @Column(name = "USRO_CRCN")
    private BigInteger usroCrcn;
    @Size(max = 150)
    @Column(name = "OBSRVCNS")
    private String obsrvcns;
    @Column(name = "VSBLE")
    private BigInteger vsble;
    @Column(name = "CNSCTVO_DSDE")
    private BigInteger cnsctvoDsde;
    @Column(name = "CNSCTVO_HSTA")
    private BigInteger cnsctvoHsta;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cnsctvoMdlo")
    private List<TbModuloMenu> tbModuloMenuList;

    public TbModulo() {
    }

    public TbModulo(Integer cnsctvoMdlo) {
        this.cnsctvoMdlo = cnsctvoMdlo;
    }

    public TbModulo(Integer cnsctvoMdlo, String cdgoMdlo, String dscrpcnMdlo, String brrdo, Date incoVgnca, Date fnVgnca) {
        this.cnsctvoMdlo = cnsctvoMdlo;
        this.cdgoMdlo = cdgoMdlo;
        this.dscrpcnMdlo = dscrpcnMdlo;
        this.brrdo = brrdo;
        this.incoVgnca = incoVgnca;
        this.fnVgnca = fnVgnca;
    }

    public Integer getCnsctvoMdlo() {
        return cnsctvoMdlo;
    }

    public void setCnsctvoMdlo(Integer cnsctvoMdlo) {
        this.cnsctvoMdlo = cnsctvoMdlo;
    }

    public String getCdgoMdlo() {
        return cdgoMdlo;
    }

    public void setCdgoMdlo(String cdgoMdlo) {
        this.cdgoMdlo = cdgoMdlo;
    }

    public String getDscrpcnMdlo() {
        return dscrpcnMdlo;
    }

    public void setDscrpcnMdlo(String dscrpcnMdlo) {
        this.dscrpcnMdlo = dscrpcnMdlo;
    }

    public String getBrrdo() {
        return brrdo;
    }

    public void setBrrdo(String brrdo) {
        this.brrdo = brrdo;
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

    public Date getFchaCrcn() {
        return fchaCrcn;
    }

    public void setFchaCrcn(Date fchaCrcn) {
        this.fchaCrcn = fchaCrcn;
    }

    public BigInteger getUsroCrcn() {
        return usroCrcn;
    }

    public void setUsroCrcn(BigInteger usroCrcn) {
        this.usroCrcn = usroCrcn;
    }

    public String getObsrvcns() {
        return obsrvcns;
    }

    public void setObsrvcns(String obsrvcns) {
        this.obsrvcns = obsrvcns;
    }

    public BigInteger getVsble() {
        return vsble;
    }

    public void setVsble(BigInteger vsble) {
        this.vsble = vsble;
    }

    public BigInteger getCnsctvoDsde() {
        return cnsctvoDsde;
    }

    public void setCnsctvoDsde(BigInteger cnsctvoDsde) {
        this.cnsctvoDsde = cnsctvoDsde;
    }

    public BigInteger getCnsctvoHsta() {
        return cnsctvoHsta;
    }

    public void setCnsctvoHsta(BigInteger cnsctvoHsta) {
        this.cnsctvoHsta = cnsctvoHsta;
    }

    @XmlTransient
    public List<TbModuloMenu> getTbModuloMenuList() {
        return tbModuloMenuList;
    }

    public void setTbModuloMenuList(List<TbModuloMenu> tbModuloMenuList) {
        this.tbModuloMenuList = tbModuloMenuList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cnsctvoMdlo != null ? cnsctvoMdlo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbModulo)) {
            return false;
        }
        TbModulo other = (TbModulo) object;
        if ((this.cnsctvoMdlo == null && other.cnsctvoMdlo != null) || (this.cnsctvoMdlo != null && !this.cnsctvoMdlo.equals(other.cnsctvoMdlo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "net.st.entidad.seguridad.TbModulo[ cnsctvoMdlo=" + cnsctvoMdlo + " ]";
    }
    
}
