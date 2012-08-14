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
@Table(name = "TB_SUCURSAL")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbSucursal.findAll", query = "SELECT t FROM TbSucursal t"),
    @NamedQuery(name = "TbSucursal.findByCnsctvoScrsl", query = "SELECT t FROM TbSucursal t WHERE t.cnsctvoScrsl = :cnsctvoScrsl"),
    @NamedQuery(name = "TbSucursal.findByCdgoScrsl", query = "SELECT t FROM TbSucursal t WHERE t.cdgoScrsl = :cdgoScrsl"),
    @NamedQuery(name = "TbSucursal.findByNmbreScrsl", query = "SELECT t FROM TbSucursal t WHERE t.nmbreScrsl = :nmbreScrsl"),
    @NamedQuery(name = "TbSucursal.findByNmbreRspnsble", query = "SELECT t FROM TbSucursal t WHERE t.nmbreRspnsble = :nmbreRspnsble"),
    @NamedQuery(name = "TbSucursal.findByCdgoDne", query = "SELECT t FROM TbSucursal t WHERE t.cdgoDne = :cdgoDne"),
    @NamedQuery(name = "TbSucursal.findByDrccn", query = "SELECT t FROM TbSucursal t WHERE t.drccn = :drccn"),
    @NamedQuery(name = "TbSucursal.findByTlfn", query = "SELECT t FROM TbSucursal t WHERE t.tlfn = :tlfn"),
    @NamedQuery(name = "TbSucursal.findByFx", query = "SELECT t FROM TbSucursal t WHERE t.fx = :fx"),
    @NamedQuery(name = "TbSucursal.findByEml", query = "SELECT t FROM TbSucursal t WHERE t.eml = :eml"),
    @NamedQuery(name = "TbSucursal.findByCnsctvoCdgoCdd", query = "SELECT t FROM TbSucursal t WHERE t.cnsctvoCdgoCdd = :cnsctvoCdgoCdd"),
    @NamedQuery(name = "TbSucursal.findByUsroCrcn", query = "SELECT t FROM TbSucursal t WHERE t.usroCrcn = :usroCrcn"),
    @NamedQuery(name = "TbSucursal.findByFchaCrcn", query = "SELECT t FROM TbSucursal t WHERE t.fchaCrcn = :fchaCrcn")})
public class TbSucursal implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CNSCTVO_SCRSL")
    private Integer cnsctvoScrsl;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "CDGO_SCRSL")
    private String cdgoScrsl;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "NMBRE_SCRSL")
    private String nmbreScrsl;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "NMBRE_RSPNSBLE")
    private String nmbreRspnsble;
    @Size(max = 10)
    @Column(name = "CDGO_DNE")
    private String cdgoDne;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 18)
    @Column(name = "DRCCN")
    private String drccn;
    @Size(max = 18)
    @Column(name = "TLFN")
    private String tlfn;
    @Size(max = 18)
    @Column(name = "FX")
    private String fx;
    @Size(max = 50)
    @Column(name = "EML")
    private String eml;
    @Column(name = "CNSCTVO_CDGO_CDD")
    private BigInteger cnsctvoCdgoCdd;
    @Column(name = "USRO_CRCN")
    private BigInteger usroCrcn;
    @Column(name = "FCHA_CRCN")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fchaCrcn;
    @OneToMany(mappedBy = "cnsctvoScrsl")
    private List<TbUsuario> tbUsuarioList;

    public TbSucursal() {
    }

    public TbSucursal(Integer cnsctvoScrsl) {
        this.cnsctvoScrsl = cnsctvoScrsl;
    }

    public TbSucursal(Integer cnsctvoScrsl, String cdgoScrsl, String nmbreScrsl, String nmbreRspnsble, String drccn) {
        this.cnsctvoScrsl = cnsctvoScrsl;
        this.cdgoScrsl = cdgoScrsl;
        this.nmbreScrsl = nmbreScrsl;
        this.nmbreRspnsble = nmbreRspnsble;
        this.drccn = drccn;
    }

    public Integer getCnsctvoScrsl() {
        return cnsctvoScrsl;
    }

    public void setCnsctvoScrsl(Integer cnsctvoScrsl) {
        this.cnsctvoScrsl = cnsctvoScrsl;
    }

    public String getCdgoScrsl() {
        return cdgoScrsl;
    }

    public void setCdgoScrsl(String cdgoScrsl) {
        this.cdgoScrsl = cdgoScrsl;
    }

    public String getNmbreScrsl() {
        return nmbreScrsl;
    }

    public void setNmbreScrsl(String nmbreScrsl) {
        this.nmbreScrsl = nmbreScrsl;
    }

    public String getNmbreRspnsble() {
        return nmbreRspnsble;
    }

    public void setNmbreRspnsble(String nmbreRspnsble) {
        this.nmbreRspnsble = nmbreRspnsble;
    }

    public String getCdgoDne() {
        return cdgoDne;
    }

    public void setCdgoDne(String cdgoDne) {
        this.cdgoDne = cdgoDne;
    }

    public String getDrccn() {
        return drccn;
    }

    public void setDrccn(String drccn) {
        this.drccn = drccn;
    }

    public String getTlfn() {
        return tlfn;
    }

    public void setTlfn(String tlfn) {
        this.tlfn = tlfn;
    }

    public String getFx() {
        return fx;
    }

    public void setFx(String fx) {
        this.fx = fx;
    }

    public String getEml() {
        return eml;
    }

    public void setEml(String eml) {
        this.eml = eml;
    }

    public BigInteger getCnsctvoCdgoCdd() {
        return cnsctvoCdgoCdd;
    }

    public void setCnsctvoCdgoCdd(BigInteger cnsctvoCdgoCdd) {
        this.cnsctvoCdgoCdd = cnsctvoCdgoCdd;
    }

    public BigInteger getUsroCrcn() {
        return usroCrcn;
    }

    public void setUsroCrcn(BigInteger usroCrcn) {
        this.usroCrcn = usroCrcn;
    }

    public Date getFchaCrcn() {
        return fchaCrcn;
    }

    public void setFchaCrcn(Date fchaCrcn) {
        this.fchaCrcn = fchaCrcn;
    }

    @XmlTransient
    public List<TbUsuario> getTbUsuarioList() {
        return tbUsuarioList;
    }

    public void setTbUsuarioList(List<TbUsuario> tbUsuarioList) {
        this.tbUsuarioList = tbUsuarioList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cnsctvoScrsl != null ? cnsctvoScrsl.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbSucursal)) {
            return false;
        }
        TbSucursal other = (TbSucursal) object;
        if ((this.cnsctvoScrsl == null && other.cnsctvoScrsl != null) || (this.cnsctvoScrsl != null && !this.cnsctvoScrsl.equals(other.cnsctvoScrsl))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "net.st.entidad.seguridad.TbSucursal[ cnsctvoScrsl=" + cnsctvoScrsl + " ]";
    }
    
}
