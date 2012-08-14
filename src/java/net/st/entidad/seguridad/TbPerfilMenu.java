/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.st.entidad.seguridad;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author camilo
 */
@Entity
@Table(name = "TB_PERFIL_MENU")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbPerfilMenu.findAll", query = "SELECT t FROM TbPerfilMenu t"),
    @NamedQuery(name = "TbPerfilMenu.findByPmCnsctvoPrflMnu", query = "SELECT t FROM TbPerfilMenu t WHERE t.pmCnsctvoPrflMnu = :pmCnsctvoPrflMnu"),
    @NamedQuery(name = "TbPerfilMenu.findByPCdgoPrfl", query = "SELECT t FROM TbPerfilMenu t WHERE t.pCdgoPrfl = :pCdgoPrfl"),
    @NamedQuery(name = "TbPerfilMenu.findByPmAdcn", query = "SELECT t FROM TbPerfilMenu t WHERE t.pmAdcn = :pmAdcn"),
    @NamedQuery(name = "TbPerfilMenu.findByPmMdfccn", query = "SELECT t FROM TbPerfilMenu t WHERE t.pmMdfccn = :pmMdfccn"),
    @NamedQuery(name = "TbPerfilMenu.findByPmElmncn", query = "SELECT t FROM TbPerfilMenu t WHERE t.pmElmncn = :pmElmncn")})
public class TbPerfilMenu implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "PM_CNSCTVO_PRFL_MNU")
    private BigDecimal pmCnsctvoPrflMnu;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "P_CDGO_PRFL")
    private String pCdgoPrfl;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PM_ADCN")
    private BigInteger pmAdcn;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PM_MDFCCN")
    private BigInteger pmMdfccn;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PM_ELMNCN")
    private BigInteger pmElmncn;
    @JoinColumn(name = "M_CNSCTVO_MNU", referencedColumnName = "CNSCTVO_MNU")
    @ManyToOne(optional = false)
    private TbMenu mCnsctvoMnu;

    public TbPerfilMenu() {
    }

    public TbPerfilMenu(BigDecimal pmCnsctvoPrflMnu) {
        this.pmCnsctvoPrflMnu = pmCnsctvoPrflMnu;
    }

    public TbPerfilMenu(BigDecimal pmCnsctvoPrflMnu, String pCdgoPrfl, BigInteger pmAdcn, BigInteger pmMdfccn, BigInteger pmElmncn) {
        this.pmCnsctvoPrflMnu = pmCnsctvoPrflMnu;
        this.pCdgoPrfl = pCdgoPrfl;
        this.pmAdcn = pmAdcn;
        this.pmMdfccn = pmMdfccn;
        this.pmElmncn = pmElmncn;
    }

    public BigDecimal getPmCnsctvoPrflMnu() {
        return pmCnsctvoPrflMnu;
    }

    public void setPmCnsctvoPrflMnu(BigDecimal pmCnsctvoPrflMnu) {
        this.pmCnsctvoPrflMnu = pmCnsctvoPrflMnu;
    }

    public String getPCdgoPrfl() {
        return pCdgoPrfl;
    }

    public void setPCdgoPrfl(String pCdgoPrfl) {
        this.pCdgoPrfl = pCdgoPrfl;
    }

    public BigInteger getPmAdcn() {
        return pmAdcn;
    }

    public void setPmAdcn(BigInteger pmAdcn) {
        this.pmAdcn = pmAdcn;
    }

    public BigInteger getPmMdfccn() {
        return pmMdfccn;
    }

    public void setPmMdfccn(BigInteger pmMdfccn) {
        this.pmMdfccn = pmMdfccn;
    }

    public BigInteger getPmElmncn() {
        return pmElmncn;
    }

    public void setPmElmncn(BigInteger pmElmncn) {
        this.pmElmncn = pmElmncn;
    }

    public TbMenu getMCnsctvoMnu() {
        return mCnsctvoMnu;
    }

    public void setMCnsctvoMnu(TbMenu mCnsctvoMnu) {
        this.mCnsctvoMnu = mCnsctvoMnu;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pmCnsctvoPrflMnu != null ? pmCnsctvoPrflMnu.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbPerfilMenu)) {
            return false;
        }
        TbPerfilMenu other = (TbPerfilMenu) object;
        if ((this.pmCnsctvoPrflMnu == null && other.pmCnsctvoPrflMnu != null) || (this.pmCnsctvoPrflMnu != null && !this.pmCnsctvoPrflMnu.equals(other.pmCnsctvoPrflMnu))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "net.st.entidad.seguridad.TbPerfilMenu[ pmCnsctvoPrflMnu=" + pmCnsctvoPrflMnu + " ]";
    }
    
}
