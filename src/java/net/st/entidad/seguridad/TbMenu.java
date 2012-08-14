/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.st.entidad.seguridad;

import java.io.Serializable;
import java.math.BigInteger;
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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author camilo
 */
@Entity
@Table(name = "TB_MENU")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbMenu.findAll", query = "SELECT t FROM TbMenu t"),
    @NamedQuery(name = "TbMenu.findByCnsctvoMnu", query = "SELECT t FROM TbMenu t WHERE t.cnsctvoMnu = :cnsctvoMnu"),
    @NamedQuery(name = "TbMenu.findByIndce", query = "SELECT t FROM TbMenu t WHERE t.indce = :indce"),
    @NamedQuery(name = "TbMenu.findByNmbreMnu", query = "SELECT t FROM TbMenu t WHERE t.nmbreMnu = :nmbreMnu"),
    @NamedQuery(name = "TbMenu.findByIndcePdre", query = "SELECT t FROM TbMenu t WHERE t.indcePdre = :indcePdre"),
    @NamedQuery(name = "TbMenu.findByPdre", query = "SELECT t FROM TbMenu t WHERE t.pdre = :pdre"),
    @NamedQuery(name = "TbMenu.findByFrm", query = "SELECT t FROM TbMenu t WHERE t.frm = :frm"),
    @NamedQuery(name = "TbMenu.findByImgn", query = "SELECT t FROM TbMenu t WHERE t.imgn = :imgn"),
    @NamedQuery(name = "TbMenu.findByImgnSlccn", query = "SELECT t FROM TbMenu t WHERE t.imgnSlccn = :imgnSlccn"),
    @NamedQuery(name = "TbMenu.findByVsble", query = "SELECT t FROM TbMenu t WHERE t.vsble = :vsble")})
public class TbMenu implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CNSCTVO_MNU")
    private Integer cnsctvoMnu;
    @Basic(optional = false)
    @NotNull
    @Column(name = "INDCE")
    private BigInteger indce;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "NMBRE_MNU")
    private String nmbreMnu;
    @Column(name = "INDCE_PDRE")
    private BigInteger indcePdre;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PDRE")
    private BigInteger pdre;
    @Size(max = 25)
    @Column(name = "FRM")
    private String frm;
    @Column(name = "IMGN")
    private BigInteger imgn;
    @Column(name = "IMGN_SLCCN")
    private BigInteger imgnSlccn;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "VSBLE")
    private String vsble;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cnsctvoMnu")
    private List<TbModuloMenu> tbModuloMenuList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "mCnsctvoMnu")
    private List<TbPerfilMenu> tbPerfilMenuList;

    public TbMenu() {
    }

    public TbMenu(Integer cnsctvoMnu) {
        this.cnsctvoMnu = cnsctvoMnu;
    }

    public TbMenu(Integer cnsctvoMnu, BigInteger indce, String nmbreMnu, BigInteger pdre, String vsble) {
        this.cnsctvoMnu = cnsctvoMnu;
        this.indce = indce;
        this.nmbreMnu = nmbreMnu;
        this.pdre = pdre;
        this.vsble = vsble;
    }

    public Integer getCnsctvoMnu() {
        return cnsctvoMnu;
    }

    public void setCnsctvoMnu(Integer cnsctvoMnu) {
        this.cnsctvoMnu = cnsctvoMnu;
    }

    public BigInteger getIndce() {
        return indce;
    }

    public void setIndce(BigInteger indce) {
        this.indce = indce;
    }

    public String getNmbreMnu() {
        return nmbreMnu;
    }

    public void setNmbreMnu(String nmbreMnu) {
        this.nmbreMnu = nmbreMnu;
    }

    public BigInteger getIndcePdre() {
        return indcePdre;
    }

    public void setIndcePdre(BigInteger indcePdre) {
        this.indcePdre = indcePdre;
    }

    public BigInteger getPdre() {
        return pdre;
    }

    public void setPdre(BigInteger pdre) {
        this.pdre = pdre;
    }

    public String getFrm() {
        return frm;
    }

    public void setFrm(String frm) {
        this.frm = frm;
    }

    public BigInteger getImgn() {
        return imgn;
    }

    public void setImgn(BigInteger imgn) {
        this.imgn = imgn;
    }

    public BigInteger getImgnSlccn() {
        return imgnSlccn;
    }

    public void setImgnSlccn(BigInteger imgnSlccn) {
        this.imgnSlccn = imgnSlccn;
    }

    public String getVsble() {
        return vsble;
    }

    public void setVsble(String vsble) {
        this.vsble = vsble;
    }

    @XmlTransient
    public List<TbModuloMenu> getTbModuloMenuList() {
        return tbModuloMenuList;
    }

    public void setTbModuloMenuList(List<TbModuloMenu> tbModuloMenuList) {
        this.tbModuloMenuList = tbModuloMenuList;
    }

    @XmlTransient
    public List<TbPerfilMenu> getTbPerfilMenuList() {
        return tbPerfilMenuList;
    }

    public void setTbPerfilMenuList(List<TbPerfilMenu> tbPerfilMenuList) {
        this.tbPerfilMenuList = tbPerfilMenuList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cnsctvoMnu != null ? cnsctvoMnu.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbMenu)) {
            return false;
        }
        TbMenu other = (TbMenu) object;
        if ((this.cnsctvoMnu == null && other.cnsctvoMnu != null) || (this.cnsctvoMnu != null && !this.cnsctvoMnu.equals(other.cnsctvoMnu))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "net.st.entidad.seguridad.TbMenu[ cnsctvoMnu=" + cnsctvoMnu + " ]";
    }
    
}
