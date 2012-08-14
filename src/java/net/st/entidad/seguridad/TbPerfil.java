/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.st.entidad.seguridad;

import java.io.Serializable;
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
@Table(name = "TB_PERFIL")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbPerfil.findAll", query = "SELECT t FROM TbPerfil t"),
    @NamedQuery(name = "TbPerfil.findByCnsctvoPrfl", query = "SELECT t FROM TbPerfil t WHERE t.cnsctvoPrfl = :cnsctvoPrfl"),
    @NamedQuery(name = "TbPerfil.findByCdgoPrfl", query = "SELECT t FROM TbPerfil t WHERE t.cdgoPrfl = :cdgoPrfl"),
    @NamedQuery(name = "TbPerfil.findByNmbrePrfl", query = "SELECT t FROM TbPerfil t WHERE t.nmbrePrfl = :nmbrePrfl")})
public class TbPerfil implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CNSCTVO_PRFL")
    private Integer cnsctvoPrfl;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "CDGO_PRFL")
    private String cdgoPrfl;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "NMBRE_PRFL")
    private String nmbrePrfl;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cnsctvoPrfl")
    private List<TbUsuarioPerfil> tbUsuarioPerfilList;

    public TbPerfil() {
    }

    public TbPerfil(Integer cnsctvoPrfl) {
        this.cnsctvoPrfl = cnsctvoPrfl;
    }

    public TbPerfil(Integer cnsctvoPrfl, String cdgoPrfl, String nmbrePrfl) {
        this.cnsctvoPrfl = cnsctvoPrfl;
        this.cdgoPrfl = cdgoPrfl;
        this.nmbrePrfl = nmbrePrfl;
    }

    public Integer getCnsctvoPrfl() {
        return cnsctvoPrfl;
    }

    public void setCnsctvoPrfl(Integer cnsctvoPrfl) {
        this.cnsctvoPrfl = cnsctvoPrfl;
    }

    public String getCdgoPrfl() {
        return cdgoPrfl;
    }

    public void setCdgoPrfl(String cdgoPrfl) {
        this.cdgoPrfl = cdgoPrfl;
    }

    public String getNmbrePrfl() {
        return nmbrePrfl;
    }

    public void setNmbrePrfl(String nmbrePrfl) {
        this.nmbrePrfl = nmbrePrfl;
    }

    @XmlTransient
    public List<TbUsuarioPerfil> getTbUsuarioPerfilList() {
        return tbUsuarioPerfilList;
    }

    public void setTbUsuarioPerfilList(List<TbUsuarioPerfil> tbUsuarioPerfilList) {
        this.tbUsuarioPerfilList = tbUsuarioPerfilList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cnsctvoPrfl != null ? cnsctvoPrfl.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbPerfil)) {
            return false;
        }
        TbPerfil other = (TbPerfil) object;
        if ((this.cnsctvoPrfl == null && other.cnsctvoPrfl != null) || (this.cnsctvoPrfl != null && !this.cnsctvoPrfl.equals(other.cnsctvoPrfl))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "net.st.entidad.seguridad.TbPerfil[ cnsctvoPrfl=" + cnsctvoPrfl + " ]";
    }
    
}
