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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "TB_USUARIO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbUsuario.findAll", query = "SELECT t FROM TbUsuario t"),
    @NamedQuery(name = "TbUsuario.findByCnsctvoUsro", query = "SELECT t FROM TbUsuario t WHERE t.cnsctvoUsro = :cnsctvoUsro"),
    @NamedQuery(name = "TbUsuario.findByCdgoUsro", query = "SELECT t FROM TbUsuario t WHERE t.cdgoUsro = :cdgoUsro"),
    @NamedQuery(name = "TbUsuario.findByPsswrdUsro", query = "SELECT t FROM TbUsuario t WHERE t.psswrdUsro = :psswrdUsro"),
    @NamedQuery(name = "TbUsuario.findByNmroDcmntoIdntfccn", query = "SELECT t FROM TbUsuario t WHERE t.nmroDcmntoIdntfccn = :nmroDcmntoIdntfccn"),
    @NamedQuery(name = "TbUsuario.findByNmbreUsro", query = "SELECT t FROM TbUsuario t WHERE t.nmbreUsro = :nmbreUsro"),
    @NamedQuery(name = "TbUsuario.findByAplldoUsro", query = "SELECT t FROM TbUsuario t WHERE t.aplldoUsro = :aplldoUsro"),
    @NamedQuery(name = "TbUsuario.findByCmbaCntrsna", query = "SELECT t FROM TbUsuario t WHERE t.cmbaCntrsna = :cmbaCntrsna"),
    @NamedQuery(name = "TbUsuario.findByActvo", query = "SELECT t FROM TbUsuario t WHERE t.actvo = :actvo"),
    @NamedQuery(name = "TbUsuario.findBySpr", query = "SELECT t FROM TbUsuario t WHERE t.spr = :spr"),
    @NamedQuery(name = "TbUsuario.findByUsroCrcn", query = "SELECT t FROM TbUsuario t WHERE t.usroCrcn = :usroCrcn"),
    @NamedQuery(name = "TbUsuario.findByFchaCrcn", query = "SELECT t FROM TbUsuario t WHERE t.fchaCrcn = :fchaCrcn")})
public class TbUsuario implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CNSCTVO_USRO")
    private Integer cnsctvoUsro;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "CDGO_USRO")
    private String cdgoUsro;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "PSSWRD_USRO")
    private String psswrdUsro;
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
    @Size(min = 1, max = 50)
    @Column(name = "USRO_CRCN")
    private String usroCrcn;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FCHA_CRCN")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fchaCrcn;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cnsctvoUsro")
    private List<TbUsuarioPerfil> tbUsuarioPerfilList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cnsctvoUsro")
    private List<TbUsuarioVigencia> tbUsuarioVigenciaList;
    @JoinColumn(name = "CNSCTVO_SCRSL", referencedColumnName = "CNSCTVO_SCRSL")
    @ManyToOne
    private TbSucursal cnsctvoScrsl;

    public TbUsuario() {
    }

    public TbUsuario(Integer cnsctvoUsro) {
        this.cnsctvoUsro = cnsctvoUsro;
    }

    public TbUsuario(Integer cnsctvoUsro, String cdgoUsro, String psswrdUsro, String nmroDcmntoIdntfccn, String nmbreUsro, String aplldoUsro, BigInteger cmbaCntrsna, BigInteger actvo, BigInteger spr, String usroCrcn, Date fchaCrcn) {
        this.cnsctvoUsro = cnsctvoUsro;
        this.cdgoUsro = cdgoUsro;
        this.psswrdUsro = psswrdUsro;
        this.nmroDcmntoIdntfccn = nmroDcmntoIdntfccn;
        this.nmbreUsro = nmbreUsro;
        this.aplldoUsro = aplldoUsro;
        this.cmbaCntrsna = cmbaCntrsna;
        this.actvo = actvo;
        this.spr = spr;
        this.usroCrcn = usroCrcn;
        this.fchaCrcn = fchaCrcn;
    }

    public Integer getCnsctvoUsro() {
        return cnsctvoUsro;
    }

    public void setCnsctvoUsro(Integer cnsctvoUsro) {
        this.cnsctvoUsro = cnsctvoUsro;
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

    @XmlTransient
    public List<TbUsuarioPerfil> getTbUsuarioPerfilList() {
        return tbUsuarioPerfilList;
    }

    public void setTbUsuarioPerfilList(List<TbUsuarioPerfil> tbUsuarioPerfilList) {
        this.tbUsuarioPerfilList = tbUsuarioPerfilList;
    }

    @XmlTransient
    public List<TbUsuarioVigencia> getTbUsuarioVigenciaList() {
        return tbUsuarioVigenciaList;
    }

    public void setTbUsuarioVigenciaList(List<TbUsuarioVigencia> tbUsuarioVigenciaList) {
        this.tbUsuarioVigenciaList = tbUsuarioVigenciaList;
    }

    public TbSucursal getCnsctvoScrsl() {
        return cnsctvoScrsl;
    }

    public void setCnsctvoScrsl(TbSucursal cnsctvoScrsl) {
        this.cnsctvoScrsl = cnsctvoScrsl;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cnsctvoUsro != null ? cnsctvoUsro.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbUsuario)) {
            return false;
        }
        TbUsuario other = (TbUsuario) object;
        if ((this.cnsctvoUsro == null && other.cnsctvoUsro != null) || (this.cnsctvoUsro != null && !this.cnsctvoUsro.equals(other.cnsctvoUsro))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "net.st.entidad.seguridad.TbUsuario[ cnsctvoUsro=" + cnsctvoUsro + " ]";
    }
    
}
