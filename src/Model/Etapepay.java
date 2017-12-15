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
 * Etapepay generated by hbm2java
 */
@Entity
@Table(name="etapepay"
    ,catalog="rent"
)
public class Etapepay  implements java.io.Serializable {


     private Integer id;
     private Paiment paiment;
     private String typePay;
     private float montant;
     private Date datePay;
     private int etat;

    public Etapepay() {
    }

    public Etapepay(Paiment paiment, String typePay, float montant, Date datePay, int etat) {
       this.paiment = paiment;
       this.typePay = typePay;
       this.montant = montant;
       this.datePay = datePay;
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
    @JoinColumn(name="id_paiment", nullable=false)
    public Paiment getPaiment() {
        return this.paiment;
    }
    
    public void setPaiment(Paiment paiment) {
        this.paiment = paiment;
    }

    
    @Column(name="type_pay", nullable=false, length=50)
    public String getTypePay() {
        return this.typePay;
    }
    
    public void setTypePay(String typePay) {
        this.typePay = typePay;
    }

    
    @Column(name="montant", nullable=false, precision=12, scale=0)
    public float getMontant() {
        return this.montant;
    }
    
    public void setMontant(float montant) {
        this.montant = montant;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="date_pay", nullable=false, length=19)
    public Date getDatePay() {
        return this.datePay;
    }
    
    public void setDatePay(Date datePay) {
        this.datePay = datePay;
    }

    
    @Column(name="etat", nullable=false)
    public int getEtat() {
        return this.etat;
    }
    
    public void setEtat(int etat) {
        this.etat = etat;
    }




}


