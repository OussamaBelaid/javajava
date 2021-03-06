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
 * Filtreair generated by hbm2java
 */
@Entity
@Table(name="filtreair"
    ,catalog="rent"
)
public class Filtreair  implements java.io.Serializable {


     private Integer id;
     private Voiture voiture;
     private Date date;
     private int km;
     private float montant;
     private int etat;

    public Filtreair() {
    }

    public Filtreair(Voiture voiture, Date date, int km, float montant, int etat) {
       this.voiture = voiture;
       this.date = date;
       this.km = km;
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
    @JoinColumn(name="id_veh", nullable=false)
    public Voiture getVoiture() {
        return this.voiture;
    }
    
    public void setVoiture(Voiture voiture) {
        this.voiture = voiture;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="date", nullable=false, length=10)
    public Date getDate() {
        return this.date;
    }
    
    public void setDate(Date date) {
        this.date = date;
    }

    
    @Column(name="km", nullable=false)
    public int getKm() {
        return this.km;
    }
    
    public void setKm(int km) {
        this.km = km;
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


