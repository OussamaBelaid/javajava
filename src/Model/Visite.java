package Model;
// Generated 13 d�c. 2017 11:10:08 by Hibernate Tools 4.3.1


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Visite generated by hbm2java
 */
@Entity
@Table(name="visite"
    ,catalog="rent"
)
public class Visite  implements java.io.Serializable {


     private Integer id;
     private Voiture voiture;
     private float montant;
     private Date dateDeb;
     private Date dateFin;
     private int etat;

    public Visite() {
    }

    public Visite(Voiture voiture, float montant, Date dateDeb, Date dateFin, int etat) {
       this.voiture = voiture;
       this.montant = montant;
       this.dateDeb = dateDeb;
       this.dateFin = dateFin;
       this.etat = etat;
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
    @JoinColumn(name="id_voit", nullable=false)
    public Voiture getVoiture() {
        return this.voiture;
    }
    
    public void setVoiture(Voiture voiture) {
        this.voiture = voiture;
    }

    
    @Column(name="montant", nullable=false, precision=12, scale=0)
    public float getMontant() {
        return this.montant;
    }
    
    public void setMontant(float montant) {
        this.montant = montant;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="date_deb", nullable=false, length=10)
    public Date getDateDeb() {
        return this.dateDeb;
    }
    
    public void setDateDeb(Date dateDeb) {
        this.dateDeb = dateDeb;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="date_fin", nullable=false, length=10)
    public Date getDateFin() {
        return this.dateFin;
    }
    
    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    
    @Column(name="etat", nullable=false)
    public int getEtat() {
        return this.etat;
    }
    
    public void setEtat(int etat) {
        this.etat = etat;
    }




}


