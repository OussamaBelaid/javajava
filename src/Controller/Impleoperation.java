/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import Controller.Interoperation ; 
import Model.Agence;
import Model.Assocontratclient;
import Model.Assocontratconducteur;
import Model.Assocontratpai;
import Model.Assocontratsocie;
import Model.Assocontratvoiture;
import Model.Assurance;
import Model.Autre;
import Model.Autrrecet;
import Model.Category;
import Model.Client;
import Model.Coleur;
import Model.Conducteur;
import Model.Contrat;
import Model.Depenseberu;
import Model.Filtreair;
import Model.Filtrehuile;
import Model.Model;
import Model.Paiment;
import Model.Reservation;
import Model.Societe;
import Model.Sorticaisse;
import Model.Vidange;
import Model.Visite;
import Model.Voiture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;
import location_voiture.View.Index;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
/**
 *
 * @author SIM-Info
 */
public class Impleoperation implements Interoperation  {
  private static final Session session = NewHibernateUtil.getSessionFactory().openSession();
    @Override
    public void Addcat(Category cat) {
     Transaction tx = session.beginTransaction();
        session.save(cat);
        tx.commit();
        
        JOptionPane.showMessageDialog(null,"done");
    }

    @Override
    public void Addcolor(Coleur col) {
         Transaction tx = session.beginTransaction();
        session.save(col);
        tx.commit();
        
        JOptionPane.showMessageDialog(null,"done");
    }

    @Override
    public void Addmodel(Model mod) {
        Transaction tx = session.beginTransaction();
        session.save(mod);
        tx.commit();
        
        JOptionPane.showMessageDialog(null,"done");
    }

    @Override
    public void Addvoit(Voiture voiture) {
         Transaction tx = session.beginTransaction();
        session.save(voiture);
        tx.commit();
       
        JOptionPane.showMessageDialog(null,"done");
    }
    @Override
    public void Editvoiture(Voiture voit , Integer id) {
       Transaction tx = session.beginTransaction();
      Voiture voite = (Voiture) session.load(Voiture.class, id);
      voite.setCat(voit.getCat());
      voite.setCarteGris(voit.getCarteGris());
      voite.setChassis(voit.getChassis());
      voite.setClimatise(voit.getClimatise());
      voite.setCouleur(voit.getCouleur());
      voite.setImmat(voit.getImmat());
      voite.setKm(voit.getKm());
      voite.setMisCircu(voit.getMisCircu());
      voite.setModele(voit.getModele());
      voite.setNbrPlace(voit.getNbrPlace());
      voite.setPuissance(voit.getPuissance());
      
       session.update(voite); 
        tx.commit();
       
      JOptionPane.showMessageDialog(null,"done");
   
    }
    @Override
    public void Editassurance (Assurance assur ,Integer id){
         Transaction tx = session.beginTransaction();
      Assurance assu = (Assurance) session.load(Assurance.class, id);
      
      assu.setNumAssu(assur.getNumAssu());
      assu.setDateDeb(assur.getDateDeb());
      assu.setDateFin(assur.getDateFin());
      assu.setMontant(assur.getMontant());
      
       session.update(assu); 
        tx.commit();
       
      JOptionPane.showMessageDialog(null,"done");
    }
    @Override
    public void Editvisite (Visite visite , Integer id){
        Transaction tx = session.beginTransaction();
      Visite visit = (Visite) session.load(Visite.class, id);
      
      visit.setMontant(visite.getMontant());
      visit.setDateDeb(visite.getDateDeb());
      visit.setDateFin(visite.getDateFin());
      
      
       session.update(visit); 
        tx.commit();
       
      JOptionPane.showMessageDialog(null,"done");
    }
     @Override
    public void Editvidange (Vidange vidange , Integer id){
        Transaction tx = session.beginTransaction();
     Vidange vidan = (Vidange) session.load(Vidange.class, id);
      vidan.setDateEntre(vidange.getDateEntre());
      vidan.setKm(vidange.getKm());
      vidan.setMontant(vidange.getMontant());
    
      
      
       session.update(vidan); 
        tx.commit();
       
      JOptionPane.showMessageDialog(null,"done");
    }
     @Override
    public void Editfh (Filtrehuile fh , Integer id){
        Transaction tx = session.beginTransaction();
     Filtrehuile fhi = (Filtrehuile) session.load(Filtrehuile.class, id);
      fhi.setDate(fh.getDate());
      fhi.setKm(fh.getKm());
      fhi.setMontant(fh.getMontant());
    
      
      
       session.update(fhi); 
        tx.commit();
       
      JOptionPane.showMessageDialog(null,"done");
    }
    @Override
    public void Editfa (Filtreair fa , Integer id){
        Transaction tx = session.beginTransaction();
     Filtreair fai = (Filtreair) session.load(Filtreair.class, id);
      fai.setDate(fa.getDate());
      fai.setKm(fa.getKm());
      fai.setMontant(fa.getMontant());
    
      
      
       session.update(fai); 
        tx.commit();
       
      JOptionPane.showMessageDialog(null,"done");
    }
     @Override
    public void Editautre (Autre autre , Integer id){
        Transaction tx = session.beginTransaction();
     Autre autr = (Autre) session.load(Autre.class, id);
      autr.setDate(autre.getDate());
      autr.setKm(autre.getKm());
      autr.setMontant(autre.getMontant());
      autr.setRemarque(autre.getRemarque());
      
      
       session.update(autr); 
        tx.commit();
       
      JOptionPane.showMessageDialog(null,"done");
    }
@Override
public void Editkmvoiture(Integer id , Integer km){
     Transaction tx = session.beginTransaction();
      Voiture voite = (Voiture) session.load(Voiture.class, id);
     
      voite.setKm(km);

      
       session.update(voite); 
        tx.commit();
       
      JOptionPane.showMessageDialog(null,"done");
}
    @Override
    public void Deletevoiture(Integer id) {
        Transaction tx = session.beginTransaction();
        Voiture voit = (Voiture) session.load(Voiture.class,id);
            session.delete(voit);
            tx.commit();
            JOptionPane.showMessageDialog(null,"done");
    }
    @Override
     public void deleteassurance (Integer id){
         Transaction tx = session.beginTransaction();
        Assurance assur = (Assurance) session.load(Assurance.class,id);
            session.delete(assur);
            tx.commit();
            JOptionPane.showMessageDialog(null,"done");
     }
     @Override
             public void deletevisite (Integer id){
                  Transaction tx = session.beginTransaction();
        Visite visite = (Visite) session.load(Visite.class,id);
            session.delete(visite);
            tx.commit();
            JOptionPane.showMessageDialog(null,"done");
             }
             
             @Override
             public void deletevidange(Integer id){
                  Transaction tx = session.beginTransaction();
        Vidange vidan = (Vidange) session.load(Vidange.class,id);
            session.delete(vidan);
            tx.commit();
            JOptionPane.showMessageDialog(null,"done");
             }
             @Override
             public void deletefh(Integer id){
                 Transaction tx = session.beginTransaction();
        Filtrehuile fh = (Filtrehuile) session.load(Filtrehuile.class,id);
            session.delete(fh);
            tx.commit();
            JOptionPane.showMessageDialog(null,"done");
             }
             @Override
             public void deletefa(Integer id){
                 Transaction tx = session.beginTransaction();
        Filtreair fa = (Filtreair) session.load(Filtreair.class,id);
            session.delete(fa);
            tx.commit();
            JOptionPane.showMessageDialog(null,"done");
             }
             @Override
             public void deleteautre(Integer id){
                 Transaction tx = session.beginTransaction();
        Autre autre = (Autre) session.load(Autre.class,id);
            session.delete(autre);
            tx.commit();
            JOptionPane.showMessageDialog(null,"done");
             }

    @Override
    public List<Voiture> list() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Object> listmaint() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Object> listmaint(Integer id_voit) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Assurance> listassurance(Integer id_voit) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Visite> listvisite(Integer id_voit) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Vidange> listvidange(Integer id_voit) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Filtreair> listfiltrair(Integer id_voit) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Filtrehuile> listfiltrhuile(Integer id_voit) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Autre> listautre(Integer id_voit) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Object> listcontrat(Integer id_voit) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Addasurance(Assurance assur) {
         Transaction tx = session.beginTransaction();
        session.save(assur);
        tx.commit();
        
        JOptionPane.showMessageDialog(null,"done");
    }

    @Override
    public List<Assurance> listassurance2(String model) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Addvisite(Visite visite) {
        Transaction tx = session.beginTransaction();
        session.save(visite);
        tx.commit();
        
        JOptionPane.showMessageDialog(null,"done");
    }

    @Override
    public List<Visite> listvisite2(String model) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Addvidange(Vidange vidan) {
        Transaction tx = session.beginTransaction();
        session.save(vidan);
        tx.commit();
        
        JOptionPane.showMessageDialog(null,"done");
    }

    @Override
    public List<Vidange> listvidange2(String model) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Addfiltra(Filtreair filrair) {
        Transaction tx = session.beginTransaction();
        session.save(filrair);
        tx.commit();
        
        JOptionPane.showMessageDialog(null,"done");
    }

    @Override
    public List<Filtreair> listfiltrair2(String model) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Addfiltrh(Filtrehuile filrhuile) {
       Transaction tx = session.beginTransaction();
        session.save(filrhuile);
        tx.commit();
        
        JOptionPane.showMessageDialog(null,"done");
    }

    @Override
    public List<Filtrehuile> listfiltrhuile2(String model) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Autremaint(Autre autre) {
        
        Transaction tx = session.beginTransaction();
        
        session.save(autre);
        tx.commit();
    
        JOptionPane.showMessageDialog(null,"done");
    }

    @Override
    public List<Autre> listautre2(String model) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Addcontrat(Contrat contrat , Assocontratvoiture aa ) {
       Transaction tx = session.beginTransaction();
        session.save(contrat);
        session.save(aa);
        tx.commit();
        
        
    }
    @Override
 public void Addassocontratsocie(Societe socie , Assocontratsocie societ){
     Transaction tx = session.beginTransaction();
      List<Societe> soc = new ArrayList<Societe>()  ;;
         soc.add(socie);
         if(socie.getNom().isEmpty()){
         
        session.save(societ);
         } else {
           session.save(socie);
        session.save(societ);
         }
        tx.commit();
 }
 @Override
     public void Addassocontratpai(Paiment pai , Assocontratpai paye){
         Transaction tx = session.beginTransaction();
         
         
        session.save(pai);
        session.save(paye);
        tx.commit();
     }
     @Override
     public void Addassocontratconducteur(Conducteur conduc, Assocontratconducteur conducteur){
         Transaction tx = session.beginTransaction();
         List<Conducteur> con = new ArrayList<Conducteur>()  ;;
         con.add(conduc);
         if(conduc.getNompre()== null){
          
        session.save(conducteur);
         }else {
          session.save(conduc);
        session.save(conducteur);
         }
        tx.commit();
        
     }
     @Override
     public void Addassocontratclient(Client clie , Assocontratclient client){
         Transaction tx = session.beginTransaction();
         List<Client> cl = new ArrayList<Client>()  ;
         cl.add(clie);
         if(clie.getNomprenom()== null){
        
        session.save(client);
         }else {
            session.save(clie);
        session.save(client); 
         }
        tx.commit();
        JOptionPane.showMessageDialog(null,"client done");
     }
    
    @Override
    public List<Object> listcontrat() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Object> listarchive() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Editcontrat(Integer id_contrat) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Deletecontrat(Integer id_contrat) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Editfactcontrat(Integer id_contrat) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Deletearchive(Integer id_archive) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Addreserv(Reservation reserv) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Object> listreserv() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Editreserv(Integer id_reserv) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Deletereserv(Integer id_reserv) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Addsociete(Societe societe) {
         Transaction tx = session.beginTransaction();
         
        session.save(societe);
        tx.commit();
        
        JOptionPane.showMessageDialog(null,"done");
    }
@Override
    public void Deletesociete(Integer id) {
           Transaction tx = session.beginTransaction();
        Societe socie = (Societe) session.load(Societe.class,id);
            session.delete(socie);
            tx.commit();
           
        
        JOptionPane.showMessageDialog(null,"done");
    }
    @Override
    public void Deleteclient(Integer id) {
           Transaction tx = session.beginTransaction();
        Client client = (Client) session.load(Client.class,id);
            session.delete(client);
            tx.commit();
           
        
        JOptionPane.showMessageDialog(null,"done");
    }
    @Override
    public List<Societe> listsociete() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void AddContratsociti(Integer id_societe) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Object> listhistocontrat(Integer id_sociti) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Object> listhistofacture(Integer id_sociti) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Factcontratsociti(Integer id_contrat) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Editsociti(Societe societ , Integer id_sociti) {
        Transaction tx = session.beginTransaction();
      Societe socie = (Societe) session.load(Societe.class, id_sociti);
      socie.setNom(societ.getNom());
      socie.setEmail(societ.getEmail());
      socie.setMatFiscal(societ.getMatFiscal());
      socie.setTel(societ.getTel());
      socie.setAdresse(societ.getAdresse());
     
      
       session.update(socie); 
        tx.commit();
         JOptionPane.showMessageDialog(null,"done");
    }

    @Override
    public void Addclient(Client client) {
        Transaction tx = session.beginTransaction();
         
        session.save(client);
        tx.commit();
        
        JOptionPane.showMessageDialog(null,"done");
    }

    @Override
    public List<Client> listclient() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void AddContratclient(Integer id_client) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Object> listhistocontratclient(Integer id_client) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Object> listhistofactureclient(Integer id_client) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Factcontratclient(Integer id_contrat) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Editclient(Client client ,Integer id_client) {
        Transaction tx = session.beginTransaction();
      Client cli = (Client) session.load(Client.class, id_client);
      cli.setType(client.getType());
      cli.setIdentite(client.getIdentite());
      cli.setDelivre(client.getDelivre());
      cli.setLieuDelivr(client.getLieuDelivr());
      cli.setNomprenom(client.getNomprenom());
      cli.setTel(client.getTel());
      cli.setAdresse(client.getAdresse());
      cli.setEmail(client.getEmail());
      cli.setDateNaiss(client.getDateNaiss());
      cli.setNationalite(client.getNationalite());
      cli.setLieuNaiss(client.getLieuNaiss());
     
      
       session.update(cli); 
        tx.commit();
         JOptionPane.showMessageDialog(null,"done");
    }

    @Override
    public List<Object> listfact() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Editfacture(Integer id_facture) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Deletefacture(Integer id_facture) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Addpaiment(Paiment pai) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Object> listpaiment() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Editpai(Integer id_pai) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Deletepai(Integer id_pai) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Object> listrecete(String datedeb, String datefin, String model) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Object> listrecetvoit(String datedeb, String datefin, String model) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Object> listdepensevoit(String datedeb, String datefin, String model) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Depenseberu> listdepenseber(String datedeb, String datefin) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Adddepenseber(Depenseberu depber) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Addsorticaisse(Sorticaisse sorticaisse) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Sorticaisse> listsorticaisse(String datedeb, String datefin) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Addautrerecet(Autrrecet autrerecet) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Autrrecet> listautrrecet(String datedeb, String datefin) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Object> listcaisse(String datedeb, String datefin) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Object> listcautionnement(Integer id_contrat) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Object> listretourcautionnement(Integer id_contrat) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Paiment> Listrecetpaiclient(Integer id_pai) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Editautrerecet(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Editsorticaisse(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Editdepenseberu(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Object> Totaldepensvoit(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Object> Totalrecetvoit(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Object> Totalpairecet(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Deletesorticaisse(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Editpassword(Integer id_admin) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Editagence(Integer id_admin) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Category> Listcat() {
      
        Query q =session.createQuery("from Category" );
         return q.list();
        
   
    }
    
}
