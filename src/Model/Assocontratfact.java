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
 * Assocontratfact generated by hbm2java
 */
@Entity
@Table(name="assocontratfact"
    ,catalog="rent"
)
public class Assocontratfact  implements java.io.Serializable {


     private Integer id;
     private Contrat contrat;
     private Facture facture;

    public Assocontratfact() {
    }

    public Assocontratfact(Contrat contrat, Facture facture) {
       this.contrat = contrat;
       this.facture = facture;
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
    @JoinColumn(name="id_fact", nullable=false)
    public Facture getFacture() {
        return this.facture;
    }
    
    public void setFacture(Facture facture) {
        this.facture = facture;
    }




}


