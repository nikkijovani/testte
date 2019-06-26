/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author aluno
 */
@Entity
@Table(name = "usuario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Usuario.findAll", query = "SELECT u FROM Usuario u")
    , @NamedQuery(name = "Usuario.findByNmNome", query = "SELECT u FROM Usuario u WHERE u.nmNome = :nmNome")
    , @NamedQuery(name = "Usuario.findByIdNome", query = "SELECT u FROM Usuario u WHERE u.idNome = :idNome")})
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Size(max = 100)
    @Column(name = "nm_nome")
    private String nmNome;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "id_nome")
    private String idNome;

    public Usuario() {
    }

    public Usuario(String idNome) {
        this.idNome = idNome;
    }

    public String getNmNome() {
        return nmNome;
    }

    public void setNmNome(String nmNome) {
        this.nmNome = nmNome;
    }

    public String getIdNome() {
        return idNome;
    }

    public void setIdNome(String idNome) {
        this.idNome = idNome;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idNome != null ? idNome.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.idNome == null && other.idNome != null) || (this.idNome != null && !this.idNome.equals(other.idNome))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Usuario[ idNome=" + idNome + " ]";
    }

    public void setNome(String parameter) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
