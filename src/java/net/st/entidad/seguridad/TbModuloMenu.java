/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.st.entidad.seguridad;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author camilo
 */
@Entity
@Table(name = "TB_MODULO_MENU")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbModuloMenu.findAll", query = "SELECT t FROM TbModuloMenu t"),
    @NamedQuery(name = "TbModuloMenu.findByCnsctvoMdloMnu", query = "SELECT t FROM TbModuloMenu t WHERE t.cnsctvoMdloMnu = :cnsctvoMdloMnu")})
public class TbModuloMenu implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CNSCTVO_MDLO_MNU")
    private Integer cnsctvoMdloMnu;
    @JoinColumn(name = "CNSCTVO_MDLO", referencedColumnName = "CNSCTVO_MDLO")
    @ManyToOne(optional = false)
    private TbModulo cnsctvoMdlo;
    @JoinColumn(name = "CNSCTVO_MNU", referencedColumnName = "CNSCTVO_MNU")
    @ManyToOne(optional = false)
    private TbMenu cnsctvoMnu;

    public TbModuloMenu() {
    }

    public TbModuloMenu(Integer cnsctvoMdloMnu) {
        this.cnsctvoMdloMnu = cnsctvoMdloMnu;
    }

    public Integer getCnsctvoMdloMnu() {
        return cnsctvoMdloMnu;
    }

    public void setCnsctvoMdloMnu(Integer cnsctvoMdloMnu) {
        this.cnsctvoMdloMnu = cnsctvoMdloMnu;
    }

    public TbModulo getCnsctvoMdlo() {
        return cnsctvoMdlo;
    }

    public void setCnsctvoMdlo(TbModulo cnsctvoMdlo) {
        this.cnsctvoMdlo = cnsctvoMdlo;
    }

    public TbMenu getCnsctvoMnu() {
        return cnsctvoMnu;
    }

    public void setCnsctvoMnu(TbMenu cnsctvoMnu) {
        this.cnsctvoMnu = cnsctvoMnu;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cnsctvoMdloMnu != null ? cnsctvoMdloMnu.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbModuloMenu)) {
            return false;
        }
        TbModuloMenu other = (TbModuloMenu) object;
        if ((this.cnsctvoMdloMnu == null && other.cnsctvoMdloMnu != null) || (this.cnsctvoMdloMnu != null && !this.cnsctvoMdloMnu.equals(other.cnsctvoMdloMnu))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "net.st.entidad.seguridad.TbModuloMenu[ cnsctvoMdloMnu=" + cnsctvoMdloMnu + " ]";
    }
    
}
