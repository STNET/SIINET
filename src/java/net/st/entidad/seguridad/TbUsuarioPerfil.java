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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author camilo
 */
@Entity
@Table(name = "TB_USUARIO_PERFIL")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbUsuarioPerfil.findAll", query = "SELECT t FROM TbUsuarioPerfil t"),
    @NamedQuery(name = "TbUsuarioPerfil.findByCnsctvoUsroPrfl", query = "SELECT t FROM TbUsuarioPerfil t WHERE t.cnsctvoUsroPrfl = :cnsctvoUsroPrfl")})
public class TbUsuarioPerfil implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CNSCTVO_USRO_PRFL")
    private Integer cnsctvoUsroPrfl;
    @JoinColumn(name = "CNSCTVO_USRO", referencedColumnName = "CNSCTVO_USRO")
    @ManyToOne(optional = false)
    private TbUsuario cnsctvoUsro;
    @JoinColumn(name = "CNSCTVO_PRFL", referencedColumnName = "CNSCTVO_PRFL")
    @ManyToOne(optional = false)
    private TbPerfil cnsctvoPrfl;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cnsctvoUsroPrfl")
    private List<TbUsuarioPerfilVigencias> tbUsuarioPerfilVigenciasList;

    public TbUsuarioPerfil() {
    }

    public TbUsuarioPerfil(Integer cnsctvoUsroPrfl) {
        this.cnsctvoUsroPrfl = cnsctvoUsroPrfl;
    }

    public Integer getCnsctvoUsroPrfl() {
        return cnsctvoUsroPrfl;
    }

    public void setCnsctvoUsroPrfl(Integer cnsctvoUsroPrfl) {
        this.cnsctvoUsroPrfl = cnsctvoUsroPrfl;
    }

    public TbUsuario getCnsctvoUsro() {
        return cnsctvoUsro;
    }

    public void setCnsctvoUsro(TbUsuario cnsctvoUsro) {
        this.cnsctvoUsro = cnsctvoUsro;
    }

    public TbPerfil getCnsctvoPrfl() {
        return cnsctvoPrfl;
    }

    public void setCnsctvoPrfl(TbPerfil cnsctvoPrfl) {
        this.cnsctvoPrfl = cnsctvoPrfl;
    }

    @XmlTransient
    public List<TbUsuarioPerfilVigencias> getTbUsuarioPerfilVigenciasList() {
        return tbUsuarioPerfilVigenciasList;
    }

    public void setTbUsuarioPerfilVigenciasList(List<TbUsuarioPerfilVigencias> tbUsuarioPerfilVigenciasList) {
        this.tbUsuarioPerfilVigenciasList = tbUsuarioPerfilVigenciasList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cnsctvoUsroPrfl != null ? cnsctvoUsroPrfl.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbUsuarioPerfil)) {
            return false;
        }
        TbUsuarioPerfil other = (TbUsuarioPerfil) object;
        if ((this.cnsctvoUsroPrfl == null && other.cnsctvoUsroPrfl != null) || (this.cnsctvoUsroPrfl != null && !this.cnsctvoUsroPrfl.equals(other.cnsctvoUsroPrfl))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "net.st.entidad.seguridad.TbUsuarioPerfil[ cnsctvoUsroPrfl=" + cnsctvoUsroPrfl + " ]";
    }
    
}
