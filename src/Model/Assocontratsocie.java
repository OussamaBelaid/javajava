package Model;
// Generated 13 d�c. 2017 11:10:08 by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Assocontratsocie generated by hbm2java
 */
@Entity
@Table(name="assocontratsocie"
    ,catalog="rent"
)
public class Assocontratsocie  implements java.io.Serializable {


     private Integer id;
     private Contrat contrat;
     private Societe societe;

    public Assocontratsocie() {
    }

    public Assocontratsocie(Contrat contrat, Societe societe) {
       this.contrat = contrat;
       this.societe = societe;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_contrat", nullable=false)
    public Contrat getContrat() {
        return this.contrat;
    }
    
    public void setContrat(Contrat contrat) {
        this.contrat = contrat;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_societe", nullable=false)
    public Societe getSociete() {
        return this.societe;
    }
    
    public void setSociete(Societe societe) {
        this.societe = societe;
    }




}


