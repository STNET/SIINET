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
@Table(name = "TB_USUARIO_VIGENCIA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbUsuarioVigencia.findAll", query = "SELECT t FROM TbUsuarioVigencia t"),
    @NamedQuery(name = "TbUsuarioVigencia.findByCnsctvoUsroVgncs", query = "SELECT t FROM TbUsuarioVigencia t WHERE t.cnsctvoUsroVgncs = :cnsctvoUsroVgncs"),
    @NamedQuery(name = "TbUsuarioVigencia.findByCdgoUsro", query = "SELECT t FROM TbUsuarioVigencia t WHERE t.cdgoUsro = :cdgoUsro"),
    @NamedQuery(name = "TbUsuarioVigencia.findByPsswrdUsro", query = "SELECT t FROM TbUsuarioVigencia t WHERE t.psswrdUsro = :psswrdUsro"),
    @NamedQuery(name = "TbUsuarioVigencia.findByCdgoPrfl", query = "SELECT t FROM TbUsuarioVigencia t WHERE t.cdgoPrfl = :cdgoPrfl"),
    @NamedQuery(name = "TbUsuarioVigencia.findByNmroDcmntoIdntfccn", query = "SELECT t FROM TbUsuarioVigencia t WHERE t.nmroDcmntoIdntfccn = :nmroDcmntoIdntfccn"),
    @NamedQuery(name = "TbUsuarioVigencia.findByNmbreUsro", query = "SELECT t FROM TbUsuarioVigencia t WHERE t.nmbreUsro = :nmbreUsro"),
    @NamedQuery(name = "TbUsuarioVigencia.findByAplldoUsro", query = "SELECT t FROM TbUsuarioVigencia t WHERE t.aplldoUsro = :aplldoUsro"),
    @NamedQuery(name = "TbUsuarioVigencia.findByCmbaCntrsna", query = "SELECT t FROM TbUsuarioVigencia t WHERE t.cmbaCntrsna = :cmbaCntrsna"),
    @NamedQuery(name = "TbUsuarioVigencia.findByActvo", query = "SELECT t FROM TbUsuarioVigencia t WHERE t.actvo = :actvo"),
    @NamedQuery(name = "TbUsuarioVigencia.findBySpr", query = "SELECT t FROM TbUsuarioVigencia t WHERE t.spr = :spr"),
    @NamedQuery(name = "TbUsuarioVigencia.findByIncoVgnca", query = "SELECT t FROM TbUsuarioVigencia t WHERE t.incoVgnca = :incoVgnca"),
    @NamedQuery(name = "TbUsuarioVigencia.findByFnVgnca", query = "SELECT t FROM TbUsuarioVigencia t WHERE t.fnVgnca = :fnVgnca"),
    @NamedQuery(name = "TbUsuarioVigencia.findByUsroCrcn", query = "SELECT t FROM TbUsuarioVigencia t WHERE t.usroCrcn = :usroCrcn"),
    @NamedQuery(name = "TbUsuarioVigencia.findByFchaCrcn", query = "SELECT t FROM TbUsuarioVigencia t WHERE t.fchaCrcn = :fchaCrcn")})
public class TbUsuarioVigencia implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CNSCTVO_USRO_VGNCS")
    private Integer cnsctvoUsroVgncs;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "CDGO_USRO")
    private String cdgoUsro;
    @Size(max = 10)
    @Column(name = "PSSWRD_USRO")
    private String psswrdUsro;
    @Size(max = 3)
    @Column(name = "CDGO_PRFL")
    private String cdgoPrfl;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "NMRO_DCMNTO_IDNTFCCN")
    private String nmroDcmntoIdntfccn;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "NMBRE_USRO")
    private String nmbreUsro;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "APLLDO_USRO")
    private String aplldoUsro;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CMBA_CNTRSNA")
    private BigInteger cmbaCntrsna;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ACTVO")
    private BigInteger actvo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SPR")
    private BigInteger spr;
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
    @JoinColumn(name = "CNSCTVO_USRO", referencedColumnName = "CNSCTVO_USRO")
    @ManyToOne(optional = false)
    private TbUsuario cnsctvoUsro;

    public TbUsuarioVigencia() {
    }

    public TbUsuarioVigencia(Integer cnsctvoUsroVgncs) {
        this.cnsctvoUsroVgncs = cnsctvoUsroVgncs;
    }

    public TbUsuarioVigencia(Integer cnsctvoUsroVgncs, String cdgoUsro, String nmroDcmntoIdntfccn, String nmbreUsro, String aplldoUsro, BigInteger cmbaCntrsna, BigInteger actvo, BigInteger spr, Date incoVgnca, Date fnVgnca, String usroCrcn, Date fchaCrcn) {
        this.cnsctvoUsroVgncs = cnsctvoUsroVgncs;
        this.cdgoUsro = cdgoUsro;
        this.nmroDcmntoIdntfccn = nmroDcmntoIdntfccn;
        this.nmbreUsro = nmbreUsro;
        this.aplldoUsro = aplldoUsro;
        this.cmbaCntrsna = cmbaCntrsna;
        this.actvo = actvo;
        this.spr = spr;
        this.incoVgnca = incoVgnca;
        this.fnVgnca = fnVgnca;
        this.usroCrcn = usroCrcn;
        this.fchaCrcn = fchaCrcn;
    }

    public Integer getCnsctvoUsroVgncs() {
        return cnsctvoUsroVgncs;
    }

    public void setCnsctvoUsroVgncs(Integer cnsctvoUsroVgncs) {
        this.cnsctvoUsroVgncs = cnsctvoUsroVgncs;
    }

    public String getCdgoUsro() {
        return cdgoUsro;
    }

    public void setCdgoUsro(String cdgoUsro) {
        this.cdgoUsro = cdgoUsro;
    }

    public String getPsswrdUsro() {
        return psswrdUsro;
    }

    public void setPsswrdUsro(String psswrdUsro) {
        this.psswrdUsro = psswrdUsro;
    }

    public String getCdgoPrfl() {
        return cdgoPrfl;
    }

    public void setCdgoPrfl(String cdgoPrfl) {
        this.cdgoPrfl = cdgoPrfl;
    }

    public String getNmroDcmntoIdntfccn() {
        return nmroDcmntoIdntfccn;
    }

    public void setNmroDcmntoIdntfccn(String nmroDcmntoIdntfccn) {
        this.nmroDcmntoIdntfccn = nmroDcmntoIdntfccn;
    }

    public String getNmbreUsro() {
        return nmbreUsro;
    }

    public void setNmbreUsro(String nmbreUsro) {
        this.nmbreUsro = nmbreUsro;
    }

    public String getAplldoUsro() {
        return aplldoUsro;
    }

    public void setAplldoUsro(String aplldoUsro) {
        this.aplldoUsro = aplldoUsro;
    }

    public BigInteger getCmbaCntrsna() {
        return cmbaCntrsna;
    }

    public void setCmbaCntrsna(BigInteger cmbaCntrsna) {
        this.cmbaCntrsna = cmbaCntrsna;
    }

    public BigInteger getActvo() {
        return actvo;
    }

    public void setActvo(BigInteger actvo) {
        this.actvo = actvo;
    }

    public BigInteger getSpr() {
        return spr;
    }

    public void setSpr(BigInteger spr) {
        this.spr = spr;
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

    public TbUsuario getCnsctvoUsro() {
        return cnsctvoUsro;
    }

    public void setCnsctvoUsro(TbUsuario cnsctvoUsro) {
        this.cnsctvoUsro = cnsctvoUsro;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cnsctvoUsroVgncs != null ? cnsctvoUsroVgncs.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbUsuarioVigencia)) {
            return false;
        }
        TbUsuarioVigencia other = (TbUsuarioVigencia) object;
        if ((this.cnsctvoUsroVgncs == null && other.cnsctvoUsroVgncs != null) || (this.cnsctvoUsroVgncs != null && !this.cnsctvoUsroVgncs.equals(other.cnsctvoUsroVgncs))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "net.st.entidad.seguridad.TbUsuarioVigencia[ cnsctvoUsroVgncs=" + cnsctvoUsroVgncs + " ]";
    }
    
}
