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
 * Vidange generated by hbm2java
 */
@Entity
@Table(name="vidange"
    ,catalog="rent"
)
public class Vidange  implements java.io.Serializable {


     private Integer id;
     private Voiture voiture;
     private Date dateEntre;
     private int km;
     private int kmVidange;
     private float montant;
     private int etat;

    public Vidange() {
    }

    public Vidange(Voiture voiture, Date dateEntre, int km, int kmVidange, float montant, int etat) {
       this.voiture = voiture;
       this.dateEntre = dateEntre;
       this.km = km;
       this.kmVidange = kmVidange;
       this.montant = montant;
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
    @JoinColumn(name="id_voiture", nullable=false)
    public Voiture getVoiture() {
        return this.voiture;
    }
    
    public void setVoiture(Voiture voiture) {
        this.voiture = voiture;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="date_entre", nullable=false, length=10)
    public Date getDateEntre() {
        return this.dateEntre;
    }
    
    public void setDateEntre(Date dateEntre) {
        this.dateEntre = dateEntre;
    }

    
    @Column(name="km", nullable=false)
    public int getKm() {
        return this.km;
    }
    
    public void setKm(int km) {
        this.km = km;
    }

    
    @Column(name="km_vidange", nullable=false)
    public int getKmVidange() {
        return this.kmVidange;
    }
    
    public void setKmVidange(int kmVidange) {
        this.kmVidange = kmVidange;
    }

    
    @Column(name="montant", nullable=false, precision=12, scale=0)
    public float getMontant() {
        return this.montant;
    }
    
    public void setMontant(float montant) {
        this.montant = montant;
    }

    
    @Column(name="etat", nullable=false)
    public int getEtat() {
        return this.etat;
    }
    
    public void setEtat(int etat) {
        this.etat = etat;
    }




}

