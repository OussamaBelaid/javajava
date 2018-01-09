/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package location_voiture.View;

import Controller.Impleoperation;
import Controller.NewHibernateUtil;
import Model.*;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.math.BigInteger;
import java.sql.Array;
import java.text.DateFormat;
import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javafx.util.Duration.hours;
import javax.imageio.ImageIO;
import javax.persistence.TemporalType;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListCellRenderer;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;
import javax.swing.text.JTextComponent;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import static org.hibernate.criterion.Restrictions.not;
import org.jdatepicker.JDateComponent;

/**
 *
 * @author SIM-Info
 */
public class Index extends javax.swing.JFrame {
Impleoperation operation ;
//private static final Session session = NewHibernateUtil.getSessionFactory().openSession();
private static Session session = null ;
private static Session sessions = null ;
private static String typcon = "" ;
private static Integer niden = null ;
private static String lieuid = "";
private static Date dtdel = null ;
private static Date dtnai = null ;
private static String np = "";
private static Integer permco= null ;
private static String lieperm = "";
private static List<JTextField> str = new ArrayList<JTextField>() ;
private static List<JTextField> num = new ArrayList<JTextField>() ;
private static List<JTextField> strdate = new ArrayList<JTextField>() ;
private static Integer id_clso = null ;


Boolean check = null ;
    /**
     * Creates new form Index
     */
    public Index() {
        initComponents();
       combolist();
        
        
        catvoituret();
        
        visittech();
       
list_cat();
upd_cat();
list_color();
tech_mod();
assur_mod();
rech_model();
list_mod();
upd_model();
catvoituret();
vidan_mod() ;
vidan_affi();
air_mod();
affi_air();
huille_affi();
huile_mod();
maint_join();
maint_mod();
upd_color();
autre_mod();
autre_affi();
list_societe();
client_affi();
//contrat_model();
heure_dep();
show_contrat();
        
 visite_show.getColumnModel().getColumn(0).setMinWidth(0);
   visite_show.getColumnModel().getColumn(0).setMaxWidth(0);
   visite_show.getColumnModel().getColumn(0).setWidth(0);
   
    vidange_show.getColumnModel().getColumn(0).setMinWidth(0);
   vidange_show.getColumnModel().getColumn(0).setMaxWidth(0);
   vidange_show.getColumnModel().getColumn(0).setWidth(0);
   
     fh_show.getColumnModel().getColumn(0).setMinWidth(0);
   fh_show.getColumnModel().getColumn(0).setMaxWidth(0);
   fh_show.getColumnModel().getColumn(0).setWidth(0);
   
     fa_show.getColumnModel().getColumn(0).setMinWidth(0);
   fa_show.getColumnModel().getColumn(0).setMaxWidth(0);
   fa_show.getColumnModel().getColumn(0).setWidth(0);
   
     autre_show.getColumnModel().getColumn(0).setMinWidth(0);
   autre_show.getColumnModel().getColumn(0).setMaxWidth(0);
   autre_show.getColumnModel().getColumn(0).setWidth(0);
   
   maint_join.getColumnModel().getColumn(0).setMinWidth(0);
   maint_join.getColumnModel().getColumn(0).setMaxWidth(0);
   maint_join.getColumnModel().getColumn(0).setWidth(0);
   
    autre_affi.getColumnModel().getColumn(0).setMinWidth(0);
  autre_affi.getColumnModel().getColumn(0).setMaxWidth(0);
  autre_affi.getColumnModel().getColumn(0).setWidth(0);
  
  assur_affich.getColumnModel().getColumn(0).setMinWidth(0);
  assur_affich.getColumnModel().getColumn(0).setMaxWidth(0);
  assur_affich.getColumnModel().getColumn(0).setWidth(0);
  
   affi_tech.getColumnModel().getColumn(0).setMinWidth(0);
  affi_tech.getColumnModel().getColumn(0).setMaxWidth(0);
  affi_tech.getColumnModel().getColumn(0).setWidth(0);
  
  vidan_affi.getColumnModel().getColumn(0).setMinWidth(0);
  vidan_affi.getColumnModel().getColumn(0).setMaxWidth(0);
  vidan_affi.getColumnModel().getColumn(0).setWidth(0);
  
    affi_air.getColumnModel().getColumn(0).setMinWidth(0);
  affi_air.getColumnModel().getColumn(0).setMaxWidth(0);
  affi_air.getColumnModel().getColumn(0).setWidth(0);
  
   huille_affi.getColumnModel().getColumn(0).setMinWidth(0);
  huille_affi.getColumnModel().getColumn(0).setMaxWidth(0);
  huille_affi.getColumnModel().getColumn(0).setWidth(0);
  
  list_societe.getColumnModel().getColumn(0).setMinWidth(0);
  list_societe.getColumnModel().getColumn(0).setMaxWidth(0);
  list_societe.getColumnModel().getColumn(0).setWidth(0);        
  
     client_affi.getColumnModel().getColumn(0).setMinWidth(0);
  client_affi.getColumnModel().getColumn(0).setMaxWidth(0);
  client_affi.getColumnModel().getColumn(0).setWidth(0);   
 
           soietcont_show.getColumnModel().getColumn(0).setMinWidth(0);
   soietcont_show.getColumnModel().getColumn(0).setMaxWidth(0);
   soietcont_show.getColumnModel().getColumn(0).setWidth(0);  
   
   sociefact_show.getColumnModel().getColumn(0).setMinWidth(0);
   sociefact_show.getColumnModel().getColumn(0).setMaxWidth(0);
   sociefact_show.getColumnModel().getColumn(0).setWidth(0);  
   
 /*   show_contrat.getColumnModel().getColumn(0).setMinWidth(0);
   show_contrat.getColumnModel().getColumn(0).setMaxWidth(0);
   show_contrat.getColumnModel().getColumn(0).setWidth(0);  */

autre_affi.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
assur_affich.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
affi_tech.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
vidan_affi.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
affi_air.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
huille_affi.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
soietcont_show.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
show_contrat.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

choose_contrat.setText("client");
        operation = new Impleoperation() ; 
    }
public void combolist() {

             sessions = NewHibernateUtil.getSessionFactory().openSession();
             Date dts = null ;

          LocalDate ds=LocalDateTime.now().toLocalDate();
           dts = java.sql.Date.valueOf(ds);
               //   JOptionPane.showMessageDialog(null,dts);
                  
         Query query_voit =sessions.createQuery("select v from Voiture  v where v.id not in(select a.voiture from Assurance a) or  v.id in (select a.voiture from Assurance a where a.dateFin =:dat)" );
    query_voit.setParameter("dat", dts);
          
         List <Voiture> voitu = query_voit.list();
         DefaultTableModel tables = (DefaultTableModel) assur_affich.getModel();
         tables.setRowCount(0);
          
         
         for(Voiture modes:voitu){
             Object[] objvoit = new Object [] {modes.getId() ,modes.getModele() ,modes.getImmat()};
             tables.addRow(objvoit);
         }
}    
/*static public class headercol  extends DefaultTableCellRenderer  {
     public headercol() {
         setOpaque(false);
     }
 
     public Component getTableCellRendererCompenet(JTable maint_join , Object value , Boolean selected , Boolean focused , int row , int column  ){
         super.getTableCellRendererComponent(maint_join, value, selected, focused, row, column);
         setBackground(Color.BLUE);
         return this ;
     }
     
}*/

public void visittech() {

             sessions = NewHibernateUtil.getSessionFactory().openSession();
             Date dts = null ;

          LocalDate ds=LocalDateTime.now().toLocalDate();
           dts = java.sql.Date.valueOf(ds);
               //   JOptionPane.showMessageDialog(null,dts);
                  
         Query query_voit =sessions.createQuery("select v from Voiture  v where v.id not in(select a.voiture from Visite a) or  v.id in (select a.voiture from Visite a where a.dateFin =:dat)" );
    query_voit.setParameter("dat", dts);
          
         List <Voiture> voitu = query_voit.list();
         DefaultTableModel tables = (DefaultTableModel) affi_tech.getModel();
         tables.setRowCount(0);
          Boolean a = null ;
         Boolean check = null ;
         for(Voiture modes:voitu){
             Object[] objvoit = new Object [] {modes.getId() ,modes.getModele() ,modes.getImmat()};
             tables.addRow(objvoit);
         }
}
public void maint_join() {

             sessions = NewHibernateUtil.getSessionFactory().openSession();
             Date dts = null ;

          LocalDate ds=LocalDateTime.now().toLocalDate();
           dts = java.sql.Date.valueOf(ds);
               //   JOptionPane.showMessageDialog(null,dts);
                  
         Query query_voit =sessions.createQuery("select  v.id , v.immat , v.modele , a.dateDeb , a.dateFin , s.dateDeb , s.dateFin , d.dateEntre , d.km from Voiture as  v left outer join v.assurances as a  left outer join v.visites as s   left outer join v.vidanges as d " );
  //  query_voit.setParameter("dat", dts);
          
         List <Object> voitu = query_voit.list();
      //   JOptionPane.showMessageDialog(null,voitu);
         DefaultTableModel tables = (DefaultTableModel) maint_join.getModel();
         tables.setRowCount(0);
          Boolean a = null ;
         Boolean check = null ;
       
        JOptionPane.showMessageDialog(null,voitu.size());
     for(int i =0 ; i< voitu.size() ; i++){
    
       
             Object[] objvoit = new Object [] {((Object[]) voitu.get(i))[0] ,((Object[]) voitu.get(i))[1],((Object[]) voitu.get(i))[2],((Object[]) voitu.get(i))[3],((Object[]) voitu.get(i))[4],((Object[]) voitu.get(i))[5],((Object[]) voitu.get(i))[6],((Object[]) voitu.get(i))[7] ,((Object[]) voitu.get(i))[8] , check };
             tables.addRow(objvoit);
      }
 
}
public void huille_affi() {

             sessions = NewHibernateUtil.getSessionFactory().openSession();
             Date dts = null ;

          LocalDate ds=LocalDateTime.now().toLocalDate();
           dts = java.sql.Date.valueOf(ds);
               //   JOptionPane.showMessageDialog(null,dts);
                  
         Query query_voit =sessions.createQuery("select v from Voiture  v where v.id not in(select a.voiture from Filtrehuile a) or  v.id in (select a.voiture from Filtrehuile a)" );
   
          
         List <Voiture> voitu = query_voit.list();
         DefaultTableModel tables = (DefaultTableModel) huille_affi.getModel();
         tables.setRowCount(0);
          Boolean a = null ;
         Boolean check = null ;
         for(Voiture modes:voitu){
             Object[] objvoit = new Object [] {modes.getId() ,modes.getModele() ,modes.getImmat()};
             tables.addRow(objvoit);
         }
}
public void autre_affi() {

             sessions = NewHibernateUtil.getSessionFactory().openSession();
             Date dts = null ;

          LocalDate ds=LocalDateTime.now().toLocalDate();
           dts = java.sql.Date.valueOf(ds);
               //   JOptionPane.showMessageDialog(null,dts);
                  
         Query query_voit =sessions.createQuery("select v from Voiture  v where v.id not in(select a.voiture from Autre a) or  v.id in (select a.voiture from Autre a)" );
   
          
         List <Voiture> voitu = query_voit.list();
         DefaultTableModel tables = (DefaultTableModel) autre_affi.getModel();
         tables.setRowCount(0);
          Boolean a = null ;
         Boolean check = null ;
         for(Voiture modes:voitu){
             Object[] objvoit = new Object [] {modes.getId(),modes.getModele() ,modes.getImmat()};
             tables.addRow(objvoit);
         }
}

public void vidan_affi() {

             sessions = NewHibernateUtil.getSessionFactory().openSession();
             Date dts = null ;

          LocalDate ds=LocalDateTime.now().toLocalDate();
           dts = java.sql.Date.valueOf(ds);
               //   JOptionPane.showMessageDialog(null,dts);
                  
         Query query_voit =sessions.createQuery("select v from Voiture  v where "
                 + "v.id not in(select a.voiture from Vidange a)or  v.id in (select a.voiture from Vidange a where a.km >= a.kmVidange) " );
   
          
         List <Voiture> voitu = query_voit.list();
         DefaultTableModel tables = (DefaultTableModel) vidan_affi.getModel();
         tables.setRowCount(0);
          Boolean a = null ;
         Boolean check = null ;
         for(Voiture modes:voitu){
             Object[] objvoit = new Object [] {modes.getId() ,modes.getModele() ,modes.getImmat()};
             tables.addRow(objvoit);
         }
}
     
     public void affi_air() {

             sessions = NewHibernateUtil.getSessionFactory().openSession();
             Date dts = null ;

          LocalDate ds=LocalDateTime.now().toLocalDate();
           dts = java.sql.Date.valueOf(ds);
               //   JOptionPane.showMessageDialog(null,dts);
                  
         Query query_voit =sessions.createQuery("select v from Voiture  v where "
                 + "v.id not in(select a.voiture from Filtreair a)or  v.id in (select a.voiture from Filtreair a) " );
   
          
         List <Voiture> voitu = query_voit.list();
         DefaultTableModel tables = (DefaultTableModel) affi_air.getModel();
         tables.setRowCount(0);
          Boolean a = null ;
         Boolean check = null ;
         for(Voiture modes:voitu){
             Object[] objvoit = new Object [] {modes.getId() ,modes.getModele() ,modes.getImmat()};
             tables.addRow(objvoit);
         }
}
     
     
      public void list_cat() {
    
         session = NewHibernateUtil.getSessionFactory().openSession();
         Query q =session.createQuery("from Category" );
         List <Category> cat = q.list();
         list_cat.removeAllItems();
         
         for(Category cati:cat){
             list_cat.addItem(cati.toString());
             
         }
     
     } 
      
      
      public void upd_cat() {
    
         session = NewHibernateUtil.getSessionFactory().openSession();
         Query q =session.createQuery("from Category" );
         List <Category> cat = q.list();
    
         upd_cat.removeAllItems();
         for(Category cati:cat){
             
             upd_cat.addItem(cati.toString());
         }
     
     } 
      
      
     public void list_color() { 
        session = NewHibernateUtil.getSessionFactory().openSession();
         Query qe =session.createQuery("from Coleur" );
         List <Coleur> cole = qe.list();
         list_color.removeAllItems();
         
         for(Coleur col:cole){
             list_color.addItem(col.toString());
             
         }
     }
     
      public void upd_color() { 
        session = NewHibernateUtil.getSessionFactory().openSession();
         Query qe =session.createQuery("from Coleur" );
         List <Coleur> cole = qe.list();
         upd_color.removeAllItems();
         
         for(Coleur col:cole){
             upd_color.addItem(col.toString());
             
         }
     }
     
     
     
      public void tech_mod() {
     session = NewHibernateUtil.getSessionFactory().openSession();
         Query query_rech =session.createQuery("from Model" );
         List <Model> model_rech = query_rech.list();
         
         tech_mod.removeAllItems();
          
          
          tech_mod.getModel().setSelectedItem("");
         for(Model rech:model_rech){
            
            
             tech_mod.addItem(rech.toString());
         }
      }
      
       public void maint_mod() {
     session = NewHibernateUtil.getSessionFactory().openSession();
         Query query_rech =session.createQuery("from Model" );
         List <Model> model_rech = query_rech.list();
         
         maint_mod.removeAllItems();
          
          
        
          maint_mod.getModel().setSelectedItem("");
         for(Model rech:model_rech){
            
            
             maint_mod.addItem(rech.toString());
         }
      }
      
      public void huile_mod() {
     session = NewHibernateUtil.getSessionFactory().openSession();
         Query query_rech =session.createQuery("from Model" );
         List <Model> model_rech = query_rech.list();
         
         huile_mod.removeAllItems();
          
          
         huile_mod.getModel().setSelectedItem("");
         for(Model rech:model_rech){
            
            
            huile_mod.addItem(rech.toString());
         }
      }
       public void autre_mod() {
     session = NewHibernateUtil.getSessionFactory().openSession();
         Query query_rech =session.createQuery("from Model" );
         List <Model> model_rech = query_rech.list();
         
         autre_mod.removeAllItems();
          
          
        autre_mod.getModel().setSelectedItem("");
         for(Model rech:model_rech){
            
            
            autre_mod.addItem(rech.toString());
         }
      }
      
       public void air_mod() {
     session = NewHibernateUtil.getSessionFactory().openSession();
         Query query_rech =session.createQuery("from Model" );
         List <Model> model_rech = query_rech.list();
         
         air_mod.removeAllItems();
          
          
          air_mod.getModel().setSelectedItem("");
         for(Model rech:model_rech){
            
            
             air_mod.addItem(rech.toString());
         }
      }
       public void vidan_mod() {
     session = NewHibernateUtil.getSessionFactory().openSession();
         Query query_rech =session.createQuery("from Model" );
         List <Model> model_rech = query_rech.list();
         
         vidan_mod.removeAllItems();
          
          
          vidan_mod.getModel().setSelectedItem("");
         for(Model rech:model_rech){
            
            
             vidan_mod.addItem(rech.toString());
         }
      }
      
      
      public void assur_mod() {
     session = NewHibernateUtil.getSessionFactory().openSession();
         Query query_rech =session.createQuery("from Model" );
         List <Model> model_rech = query_rech.list();
         
         assur_mod.removeAllItems();
          
          assur_mod.getModel().setSelectedItem("");
          
         for(Model rech:model_rech){
            
             
             assur_mod.addItem(rech.toString());
             
         }
      }
      
      
      
      
       public void rech_model() {
           try{
     session = NewHibernateUtil.getSessionFactory().openSession();
         Query query_rech =session.createQuery("from Model" );
         List <Model> model_rech = query_rech.list();
         rech_model.removeAllItems();
         
          rech_model.getModel().setSelectedItem("");
         for(Model rech:model_rech){
            
             rech_model.addItem(rech.toString());
          
         }
           }catch(Exception e){
               JOptionPane.showMessageDialog(null,"here");
           }
      }
    
     public void list_mod() {
         session = NewHibernateUtil.getSessionFactory().openSession();
         Query qi =session.createQuery("from Model" );
         List <Model> mod = qi.list();
         list_mod.removeAllItems();
         
         for(Model mode:mod){
             list_mod.addItem(mode.toString());
           
         }
         
    }   
     
         public void upd_model() {
         session = NewHibernateUtil.getSessionFactory().openSession();
         Query qi =session.createQuery("from Model" );
         List <Model> mod = qi.list();
        
         upd_model.removeAllItems();
         for(Model mode:mod){
             
             upd_model.addItem(mode.toString());
         }
         
    }
      public void catvoituret() {    
         session = NewHibernateUtil.getSessionFactory().openSession();
         Query query =session.createQuery("from Voiture" );
         List <Voiture> voit = query.list();
         DefaultTableModel table = (DefaultTableModel)voit_affiche.getModel();
         table.setRowCount(0);
          
         
         for(Voiture mode:voit){
             Object[] objvoit = new Object [] {mode.getModele() ,mode.getImmat()};
             table.addRow(objvoit);
         }
      }
         public void list_societe() {    
         session = NewHibernateUtil.getSessionFactory().openSession();
         Query query =session.createQuery("from Societe" );
         List <Societe> socie = query.list();
         DefaultTableModel table = (DefaultTableModel)list_societe.getModel();
         table.setRowCount(0);
          
         
         for(Societe mode:socie){
             Object[] objvoit = new Object [] {mode.getId() ,mode.getNom() , mode.getTel() , mode.getEmail()};
             table.addRow(objvoit);
         }
        
      }
    
      
         public void client_affi() {    
         session = NewHibernateUtil.getSessionFactory().openSession();
         Query query =session.createQuery("from Client" );
         List <Client> cli = query.list();
         DefaultTableModel table = (DefaultTableModel)client_affi.getModel();
         table.setRowCount(0);
          
         
         for(Client mode:cli){
             Object[] objvoit = new Object [] {mode.getId() ,mode.getNomprenom() , mode.getTel() , mode.getEmail()};
             table.addRow(objvoit);
         }
         
         }
         
         
         
         public void contrat_model(){
              session = NewHibernateUtil.getSessionFactory().openSession();

         Query qi =session.createQuery("select distinct m from Model m , Voiture v   where m.model in(select a.modele from Voiture a) and v.id not in (select a.voiture from Assocontratvoiture a)" );
         
         List <Model> mod = qi.list();
        // contrat_model.removeAllItems();
         edit_contrat_model.removeAllItems();
       //  contrat_model.addItem("");
         edit_contrat_model.addItem("");
         for(Model mode:mod){
          //   contrat_model.addItem(mode.getModel());
             edit_contrat_model.addItem(mode.getModel());
         }
        
         }
         public void heure_dep() {
         

/*heure_dep.removeAllItems();
heure_fin.removeAllItems();
       for (int i = 0; i < 24; ++i) {
    heure_dep.addItem(Integer.toString(i));
    heure_fin.addItem(Integer.toString(i));
             } */

     Calendar cal = Calendar.getInstance();
    SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
 cal.set(Calendar.HOUR_OF_DAY, 0);
    cal.set(Calendar.MINUTE, 0);
   

 /*   Date endHour = cal.getTime();
cal.set(Calendar.HOUR_OF_DAY, 23);
            cal.set(Calendar.MINUTE, 59);*/
              Calendar end = Calendar.getInstance();
            end.set(Calendar.HOUR_OF_DAY, 23);
            end.set(Calendar.MINUTE, 59);
     ArrayList<String> hours = new ArrayList<String>();
do {
       String interval = sdf.format(cal.getTime());
       cal.add(Calendar.MINUTE, 15);
        interval = sdf.format(cal.getTime());
        hours.add(interval);

       
    } while (cal.getTime().before(end.getTime()));

 for (int i = 0; i < hours.size(); ++i) {
      heure_dep.addItem(hours.get(i));
    heure_fin.addItem(hours.get(i));
    edit_heure_dep.addItem(hours.get(i));
    edit_heure_fin.addItem(hours.get(i));
 }
        }
  /**********************************************************************************verif champ*****************************************************************************************/       
    public void keyactioncontrat () {
         str.add(lieu_depart); str.add(lieu_retour) ; str.add(lieu_identite) ; str.add(nom_prenom) ; str.add(client_lieunaiss) ; str.add(client_adresse) ;
         str.add(client_nationalite) ;  str.add(identite_lieu) ;  str.add(prenom_nom) ; str.add(lieu_permis) ; str.add(identite_num); str.add(num_identite);
         
         num.add(km_dep); num.add(tel_client); num.add(montant_gatan); num.add(montant_pay); num.add(montant_pay);
             for(int i =0 ; i<str.size() ; i++){
        
                 str.get(i).addKeyListener(new KeyListener() {
                     
                    
                     @Override
                     public void keyPressed(KeyEvent ke) {
                       char mot = ke.getKeyChar();
                     }

                     @Override
                     public void keyTyped(KeyEvent ke) {
                        
                     }

                     @Override
                     public void keyReleased(KeyEvent ke) {
                 
                     }

                    
                 
             });
             
        
             }
             
             
             for(int j =0 ; j<num.size() ; j++){
        
                 num.get(j).addKeyListener(new KeyListener() {
                     
                    
                     @Override
                     public void keyPressed(KeyEvent e) {
                        Integer mot = e.getKeyCode();
                     }

                     @Override
                     public void keyTyped(KeyEvent e) {
                       
                     }

                     @Override
                     public void keyReleased(KeyEvent e) {
                 
                     }

                    
                 
             });
             
        
             }
    }     

               public void validationForName(char comp)
{
    
   /*String text=comp.getText().trim();
  if(comp.matches("^[a-z,A-Z]+"))
   {
      
   }
   else
   {
    JOptionPane.showMessageDialog(null,"insérer un lieu valide");
   }*/
   
}
 public void show_contrat() {
        sessions = NewHibernateUtil.getSessionFactory().openSession();
           

         
         
          Query query_voit =sessions.createQuery("select  c.id ,c.dateContrat ,cl.nomprenom ,cl.tel , voi.modele , voi.immat ,c.dateDep , c.heureDep , c.dateRet , c.heureRet  from Contrat as  c  , Voiture as voi , Client as cl  where (c.id in (select v.contrat from c.assocontratvoitures as v) and voi.id in (select k.voiture from c.assocontratvoitures as k)) and (c.id in (select s.contrat from c.assocontratclients as s) and cl.id in (select p.client from c.assocontratclients as p))" );
        
          
          
         List <Object> voitu = query_voit.list();
    
         DefaultTableModel tables = (DefaultTableModel) show_contrat.getModel();
         tables.setRowCount(0);
          Boolean a = null ;
         Boolean check = null ;
       
        
     for(int i =0 ; i< voitu.size() ; i++){
    
       
             Object[] objvoit = new Object [] {((Object[]) voitu.get(i))[0] ,((Object[]) voitu.get(i))[1],((Object[]) voitu.get(i))[2],((Object[]) voitu.get(i))[3],((Object[]) voitu.get(i))[4],((Object[]) voitu.get(i))[5],((Object[]) voitu.get(i))[6],((Object[]) voitu.get(i))[7] ,((Object[]) voitu.get(i))[8],((Object[]) voitu.get(i))[9]};
             tables.addRow(objvoit);
      }
    }

   public void show_contratsociete() {
        sessions = NewHibernateUtil.getSessionFactory().openSession();
           

         
          
        Query query_voit =sessions.createQuery("select  c.id ,c.dateContrat ,cl.nom ,cl.tel , voi.modele , voi.immat ,c.dateDep , c.heureDep , c.dateRet , c.heureRet , cl.id    from Contrat as  c  , Voiture as voi , Societe as cl  where (c.id in (select v.contrat from c.assocontratvoitures as v) and voi.id in (select k.voiture from c.assocontratvoitures as k)) and (c.id in (select s.contrat from c.assocontratsocies as s) and cl.id in (select p.societe from c.assocontratsocies as p))" );
   

         
          
          
         List <Object> voitu = query_voit.list();
    
         DefaultTableModel tables = (DefaultTableModel) show_contrat.getModel();
         tables.setRowCount(0);
          Boolean a = null ;
         Boolean check = null ;
       
        
     for(int i =0 ; i< voitu.size() ; i++){
    
       
             Object[] objvoit = new Object [] {((Object[]) voitu.get(i))[0] ,((Object[]) voitu.get(i))[1],((Object[]) voitu.get(i))[2],((Object[]) voitu.get(i))[3],((Object[]) voitu.get(i))[4],((Object[]) voitu.get(i))[5],((Object[]) voitu.get(i))[6],((Object[]) voitu.get(i))[7] ,((Object[]) voitu.get(i))[8],((Object[]) voitu.get(i))[9] };
             tables.addRow(objvoit);
      }
    }
   
   
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jButton1 = new javax.swing.JButton();
        jdialog_contrat = new javax.swing.JDialog();
        jLabel242 = new javax.swing.JLabel();
        type_identite3 = new javax.swing.JComboBox<>();
        jLabel243 = new javax.swing.JLabel();
        identite_num2 = new javax.swing.JTextField();
        jLabel244 = new javax.swing.JLabel();
        date_identite2 = new javax.swing.JTextField();
        jLabel245 = new javax.swing.JLabel();
        identite_lieu2 = new javax.swing.JTextField();
        jLabel246 = new javax.swing.JLabel();
        prenom_nom2 = new javax.swing.JTextField();
        jLabel247 = new javax.swing.JLabel();
        conducteur_permis2 = new javax.swing.JTextField();
        jLabel248 = new javax.swing.JLabel();
        date_permis2 = new javax.swing.JTextField();
        jLabel249 = new javax.swing.JLabel();
        lieu_permis2 = new javax.swing.JTextField();
        cond2_but = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        Container = new javax.swing.JPanel();
        Menu = new javax.swing.JPanel();
        lab_admin = new javax.swing.JLabel();
        lab_accueil = new javax.swing.JLabel();
        lab_voit = new javax.swing.JLabel();
        lab_maint = new javax.swing.JLabel();
        lab_contrat = new javax.swing.JLabel();
        lab_reser = new javax.swing.JLabel();
        lab_societ = new javax.swing.JLabel();
        lab_client = new javax.swing.JLabel();
        lab_fact = new javax.swing.JLabel();
        lab_pai = new javax.swing.JLabel();
        lab_finance = new javax.swing.JLabel();
        nav_close = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        menu_nav = new javax.swing.JPanel();
        menu_accueil = new javax.swing.JPanel();
        menu_voit = new javax.swing.JPanel();
        list_vehi = new javax.swing.JLabel();
        ajout_coleur = new javax.swing.JLabel();
        ajout_veh1 = new javax.swing.JLabel();
        ajout_model = new javax.swing.JLabel();
        ajout_cat = new javax.swing.JLabel();
        menu_societ = new javax.swing.JPanel();
        list_societ = new javax.swing.JLabel();
        ajout_societ = new javax.swing.JLabel();
        menu_reser = new javax.swing.JPanel();
        list_reser = new javax.swing.JLabel();
        ajout_reser = new javax.swing.JLabel();
        menu_contrat = new javax.swing.JPanel();
        list_contr = new javax.swing.JLabel();
        archive = new javax.swing.JLabel();
        ajout_contr = new javax.swing.JLabel();
        menu_maint = new javax.swing.JPanel();
        list_autre = new javax.swing.JLabel();
        list_maint = new javax.swing.JLabel();
        list_assur = new javax.swing.JLabel();
        list_visit = new javax.swing.JLabel();
        list_vidange = new javax.swing.JLabel();
        list_filtra = new javax.swing.JLabel();
        list_filtreh = new javax.swing.JLabel();
        menu_client = new javax.swing.JPanel();
        list_client = new javax.swing.JLabel();
        ajout_client = new javax.swing.JLabel();
        menu_fact = new javax.swing.JPanel();
        list_fact = new javax.swing.JLabel();
        menu_pai = new javax.swing.JPanel();
        list_pai = new javax.swing.JLabel();
        ajout_pai = new javax.swing.JLabel();
        menu_finance = new javax.swing.JPanel();
        caisse = new javax.swing.JLabel();
        list_recette = new javax.swing.JLabel();
        list_reccvoi = new javax.swing.JLabel();
        dep_voi = new javax.swing.JLabel();
        dep_ber = new javax.swing.JLabel();
        sortie_caisse = new javax.swing.JLabel();
        other_recc = new javax.swing.JLabel();
        menu_admin = new javax.swing.JPanel();
        list_pai1 = new javax.swing.JLabel();
        ajout_pai1 = new javax.swing.JLabel();
        affichage = new javax.swing.JPanel();
        accueil = new javax.swing.JPanel();
        list_voiture = new javax.swing.JPanel();
        rech_model = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        voit_affiche = new javax.swing.JTable();
        Edit_item = new javax.swing.JLabel();
        Delet_item = new javax.swing.JLabel();
        Ajout_voiture = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        voit_immat = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        voit_griss = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        voit_nbr = new javax.swing.JTextField();
        list_cat = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        voit_clim = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        voit_circu = new javax.swing.JTextField();
        list_mod = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        voit_chasis = new javax.swing.JTextField();
        voit_puiss = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        list_color = new javax.swing.JComboBox<>();
        voit_km = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        voit_save = new javax.swing.JButton();
        visite_technique = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        tech_mod = new javax.swing.JComboBox<>();
        jLabel31 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        affi_tech = new javax.swing.JTable();
        jLabel32 = new javax.swing.JLabel();
        visit_montant = new javax.swing.JTextField();
        debut_visit = new javax.swing.JFormattedTextField();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        fin_visit = new javax.swing.JFormattedTextField();
        boton_visit = new javax.swing.JButton();
        Ajout_model = new javax.swing.JPanel();
        model_voit = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        Ajout_cat = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        voit_cat = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        Ajout_col = new javax.swing.JPanel();
        color = new javax.swing.JButton();
        voit_color = new javax.swing.JTextField();
        jLabel195 = new javax.swing.JLabel();
        maint_list = new javax.swing.JPanel();
        maint_mod = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        maint_join = new javax.swing.JTable();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        show_maint = new javax.swing.JLabel();
        assurance = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        assur_mod = new javax.swing.JComboBox<>();
        jLabel25 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        assur_affich = new javax.swing.JTable();
        jLabel26 = new javax.swing.JLabel();
        num_assur = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        assur_montant = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        debut_assurance = new javax.swing.JFormattedTextField();
        fin_assurance = new javax.swing.JFormattedTextField();
        jLabel29 = new javax.swing.JLabel();
        boton_assur = new javax.swing.JButton();
        vidange = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        vidan_mod = new javax.swing.JComboBox<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        vidan_affi = new javax.swing.JTable();
        km_vidange = new javax.swing.JTextField();
        vidange_montant = new javax.swing.JTextField();
        date_entre = new javax.swing.JFormattedTextField();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        boton_vidange = new javax.swing.JButton();
        km_new = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        filtre_air = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        air_mod = new javax.swing.JComboBox<>();
        jScrollPane6 = new javax.swing.JScrollPane();
        affi_air = new javax.swing.JTable();
        date_entrefiltre = new javax.swing.JFormattedTextField();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        km_filtreair = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        filtr_mont = new javax.swing.JTextField();
        boton_filtreair = new javax.swing.JButton();
        filtre_huile = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        huile_mod = new javax.swing.JComboBox<>();
        jScrollPane7 = new javax.swing.JScrollPane();
        huille_affi = new javax.swing.JTable();
        date_filtreh = new javax.swing.JFormattedTextField();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        km_filtreh = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        filtreh_montant = new javax.swing.JTextField();
        boton_filtreh = new javax.swing.JButton();
        maint_autre = new javax.swing.JPanel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        autre_mod = new javax.swing.JComboBox<>();
        jScrollPane8 = new javax.swing.JScrollPane();
        autre_affi = new javax.swing.JTable();
        date_autre = new javax.swing.JFormattedTextField();
        jLabel53 = new javax.swing.JLabel();
        autre_montant = new javax.swing.JTextField();
        jLabel54 = new javax.swing.JLabel();
        km_autre = new javax.swing.JTextField();
        jLabel55 = new javax.swing.JLabel();
        boton_autremaint = new javax.swing.JButton();
        jLabel208 = new javax.swing.JLabel();
        jScrollPane25 = new javax.swing.JScrollPane();
        autre_remarq = new javax.swing.JTextArea();
        list_contrat = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        show_contrat = new javax.swing.JTable();
        jLabel56 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel57 = new javax.swing.JLabel();
        jLabel209 = new javax.swing.JLabel();
        jLabel220 = new javax.swing.JLabel();
        jLabel237 = new javax.swing.JLabel();
        jLabel236 = new javax.swing.JLabel();
        choose_contrat = new javax.swing.JTextField();
        add_contrat = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        contrat_model = new javax.swing.JComboBox<>();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        lieu_depart = new javax.swing.JTextField();
        jLabel65 = new javax.swing.JLabel();
        lieu_retour = new javax.swing.JTextField();
        jLabel66 = new javax.swing.JLabel();
        km_dep = new javax.swing.JTextField();
        jLabel67 = new javax.swing.JLabel();
        km_retour = new javax.swing.JTextField();
        contrat_imma = new javax.swing.JComboBox<>();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        montant_gatan = new javax.swing.JTextField();
        pay_type = new javax.swing.JComboBox<>();
        jLabel70 = new javax.swing.JLabel();
        montant_pay = new javax.swing.JTextField();
        type_pay = new javax.swing.JComboBox<>();
        jLabel71 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        observation = new javax.swing.JTextArea();
        jLabel72 = new javax.swing.JLabel();
        type_iden = new javax.swing.JComboBox<>();
        jLabel73 = new javax.swing.JLabel();
        num_identite = new javax.swing.JTextField();
        jLabel74 = new javax.swing.JLabel();
        identite_date = new javax.swing.JTextField();
        jLabel75 = new javax.swing.JLabel();
        lieu_identite = new javax.swing.JTextField();
        jLabel76 = new javax.swing.JLabel();
        nom_prenom = new javax.swing.JTextField();
        jLabel77 = new javax.swing.JLabel();
        tel_client = new javax.swing.JTextField();
        jLabel78 = new javax.swing.JLabel();
        client_naissance = new javax.swing.JTextField();
        client_lieunaiss = new javax.swing.JTextField();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        client_nationalite = new javax.swing.JTextField();
        jLabel81 = new javax.swing.JLabel();
        client_adresse = new javax.swing.JTextField();
        copier = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        type_identite = new javax.swing.JComboBox<>();
        jLabel82 = new javax.swing.JLabel();
        identite_num = new javax.swing.JTextField();
        jLabel83 = new javax.swing.JLabel();
        date_identite = new javax.swing.JTextField();
        jLabel84 = new javax.swing.JLabel();
        identite_lieu = new javax.swing.JTextField();
        prenom_nom = new javax.swing.JTextField();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        conducteur_permis = new javax.swing.JTextField();
        jLabel87 = new javax.swing.JLabel();
        date_permis = new javax.swing.JTextField();
        lieu_permis = new javax.swing.JTextField();
        jLabel88 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel89 = new javax.swing.JLabel();
        date_contrat = new javax.swing.JTextField();
        jLabel90 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        save = new javax.swing.JButton();
        id_contrat = new javax.swing.JTextField();
        type_contrat = new javax.swing.JTextField();
        conducteurtwo = new javax.swing.JButton();
        contrat_deb = new com.toedter.calendar.JDateChooser();
        contrat_retour = new com.toedter.calendar.JDateChooser();
        heure_fin = new javax.swing.JComboBox<>();
        heure_dep = new javax.swing.JComboBox<>();
        pai_day = new com.toedter.calendar.JDateChooser();
        id_cond1 = new javax.swing.JTextField();
        id_cond2 = new javax.swing.JTextField();
        contrat_archive = new javax.swing.JPanel();
        jLabel93 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        archive_table = new javax.swing.JTable();
        reserv_list = new javax.swing.JPanel();
        jLabel96 = new javax.swing.JLabel();
        jScrollPane12 = new javax.swing.JScrollPane();
        jTable10 = new javax.swing.JTable();
        jLabel111 = new javax.swing.JLabel();
        add_reserv = new javax.swing.JPanel();
        jLabel102 = new javax.swing.JLabel();
        date_reserv = new javax.swing.JTextField();
        jLabel95 = new javax.swing.JLabel();
        dep_reserv = new javax.swing.JTextField();
        jLabel97 = new javax.swing.JLabel();
        heure_depreserv = new javax.swing.JComboBox<>();
        jLabel98 = new javax.swing.JLabel();
        retour_reservation = new javax.swing.JTextField();
        jLabel99 = new javax.swing.JLabel();
        heure_retourreserv = new javax.swing.JComboBox<>();
        jLabel100 = new javax.swing.JLabel();
        model_reserv = new javax.swing.JComboBox<>();
        jLabel101 = new javax.swing.JLabel();
        imma_reserv = new javax.swing.JComboBox<>();
        nomprenom_reserv = new javax.swing.JTextField();
        jLabel103 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        reserv_tel = new javax.swing.JTextField();
        adresse_reserv = new javax.swing.JTextField();
        jLabel105 = new javax.swing.JLabel();
        email_reserv = new javax.swing.JTextField();
        jLabel106 = new javax.swing.JLabel();
        jScrollPane13 = new javax.swing.JScrollPane();
        remarq_reserv = new javax.swing.JTextArea();
        jLabel107 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jLabel108 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        jLabel110 = new javax.swing.JLabel();
        save_reserv = new javax.swing.JButton();
        company_list = new javax.swing.JPanel();
        jLabel112 = new javax.swing.JLabel();
        jScrollPane14 = new javax.swing.JScrollPane();
        list_societe = new javax.swing.JTable();
        societi_delete = new javax.swing.JLabel();
        societi_histo = new javax.swing.JLabel();
        societi_edit = new javax.swing.JLabel();
        societi_contrat = new javax.swing.JLabel();
        add_societe = new javax.swing.JPanel();
        jLabel113 = new javax.swing.JLabel();
        societe_nom = new javax.swing.JTextField();
        societe_tel = new javax.swing.JTextField();
        jLabel114 = new javax.swing.JLabel();
        jLabel115 = new javax.swing.JLabel();
        societe_email = new javax.swing.JTextField();
        societe_adresse = new javax.swing.JTextField();
        jLabel116 = new javax.swing.JLabel();
        societe_fiscal = new javax.swing.JTextField();
        jLabel117 = new javax.swing.JLabel();
        jLabel118 = new javax.swing.JLabel();
        save_societe = new javax.swing.JButton();
        jSeparator10 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();
        client_list = new javax.swing.JPanel();
        jScrollPane15 = new javax.swing.JScrollPane();
        client_affi = new javax.swing.JTable();
        jLabel119 = new javax.swing.JLabel();
        client_delete = new javax.swing.JLabel();
        client_edit = new javax.swing.JLabel();
        client_contrat = new javax.swing.JLabel();
        client_histo = new javax.swing.JLabel();
        add_client = new javax.swing.JPanel();
        client_type = new javax.swing.JComboBox<>();
        jLabel120 = new javax.swing.JLabel();
        client_num = new javax.swing.JTextField();
        jLabel121 = new javax.swing.JLabel();
        client_date = new javax.swing.JTextField();
        jLabel122 = new javax.swing.JLabel();
        client_lieu_identite = new javax.swing.JTextField();
        jLabel123 = new javax.swing.JLabel();
        client_nom = new javax.swing.JTextField();
        jLabel124 = new javax.swing.JLabel();
        client_tel = new javax.swing.JTextField();
        jLabel125 = new javax.swing.JLabel();
        client_naiss = new javax.swing.JTextField();
        jLabel126 = new javax.swing.JLabel();
        client_lieu_naiss = new javax.swing.JTextField();
        jLabel127 = new javax.swing.JLabel();
        natinalite_client = new javax.swing.JTextField();
        jLabel128 = new javax.swing.JLabel();
        adresse_client = new javax.swing.JTextField();
        jSeparator12 = new javax.swing.JSeparator();
        jSeparator13 = new javax.swing.JSeparator();
        jLabel129 = new javax.swing.JLabel();
        email_client = new javax.swing.JTextField();
        jLabel130 = new javax.swing.JLabel();
        save_client = new javax.swing.JButton();
        facturation = new javax.swing.JPanel();
        jScrollPane16 = new javax.swing.JScrollPane();
        jTable12 = new javax.swing.JTable();
        jLabel131 = new javax.swing.JLabel();
        list_paiement = new javax.swing.JPanel();
        jScrollPane17 = new javax.swing.JScrollPane();
        jTable13 = new javax.swing.JTable();
        jLabel132 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        add_pai = new javax.swing.JPanel();
        jLabel133 = new javax.swing.JLabel();
        num_cheque = new javax.swing.JTextField();
        jLabel134 = new javax.swing.JLabel();
        pai_mont = new javax.swing.JTextField();
        jLabel135 = new javax.swing.JLabel();
        date_pai = new javax.swing.JTextField();
        type_pay1 = new javax.swing.JComboBox<>();
        paiement_type = new javax.swing.JComboBox<>();
        type_identite1 = new javax.swing.JComboBox<>();
        jLabel136 = new javax.swing.JLabel();
        jLabel137 = new javax.swing.JLabel();
        jSeparator14 = new javax.swing.JSeparator();
        jSeparator15 = new javax.swing.JSeparator();
        jLabel138 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        finan_reccet = new javax.swing.JPanel();
        jLabel139 = new javax.swing.JLabel();
        deb_rech = new javax.swing.JTextField();
        jLabel140 = new javax.swing.JLabel();
        fin_rech = new javax.swing.JTextField();
        jLabel141 = new javax.swing.JLabel();
        model_rech = new javax.swing.JComboBox<>();
        recherche_recette = new javax.swing.JButton();
        jSeparator16 = new javax.swing.JSeparator();
        jSeparator17 = new javax.swing.JSeparator();
        jScrollPane18 = new javax.swing.JScrollPane();
        recette_table = new javax.swing.JTable();
        total_recette = new javax.swing.JLabel();
        jLabel144 = new javax.swing.JLabel();
        jLabel145 = new javax.swing.JLabel();
        jLabel146 = new javax.swing.JLabel();
        jLabel165 = new javax.swing.JLabel();
        recette_voiture = new javax.swing.JPanel();
        jLabel143 = new javax.swing.JLabel();
        deb_rech_voi = new javax.swing.JTextField();
        jLabel147 = new javax.swing.JLabel();
        fin_rech_voi = new javax.swing.JTextField();
        jLabel148 = new javax.swing.JLabel();
        model_rech_voi = new javax.swing.JComboBox<>();
        recherche_voit = new javax.swing.JButton();
        jSeparator19 = new javax.swing.JSeparator();
        jLabel149 = new javax.swing.JLabel();
        jScrollPane19 = new javax.swing.JScrollPane();
        recette_tvoit_table = new javax.swing.JTable();
        jSeparator18 = new javax.swing.JSeparator();
        jLabel150 = new javax.swing.JLabel();
        jLabel151 = new javax.swing.JLabel();
        voiture_deponse = new javax.swing.JPanel();
        jLabel152 = new javax.swing.JLabel();
        jLabel153 = new javax.swing.JLabel();
        deb_voi = new javax.swing.JTextField();
        jLabel154 = new javax.swing.JLabel();
        fin_voi = new javax.swing.JTextField();
        jLabel155 = new javax.swing.JLabel();
        model_voi = new javax.swing.JComboBox<>();
        rech_voi = new javax.swing.JButton();
        jLabel156 = new javax.swing.JLabel();
        jScrollPane20 = new javax.swing.JScrollPane();
        depense_voit = new javax.swing.JTable();
        jLabel157 = new javax.swing.JLabel();
        total_depense = new javax.swing.JLabel();
        jSeparator20 = new javax.swing.JSeparator();
        jSeparator21 = new javax.swing.JSeparator();
        jLabel164 = new javax.swing.JLabel();
        bereau_depense = new javax.swing.JPanel();
        jSeparator22 = new javax.swing.JSeparator();
        jLabel158 = new javax.swing.JLabel();
        deb_bereau = new javax.swing.JTextField();
        jLabel159 = new javax.swing.JLabel();
        jLabel160 = new javax.swing.JLabel();
        fin_bereau = new javax.swing.JTextField();
        rech_bereau = new javax.swing.JButton();
        jSeparator23 = new javax.swing.JSeparator();
        jLabel161 = new javax.swing.JLabel();
        jScrollPane21 = new javax.swing.JScrollPane();
        depense_bereau = new javax.swing.JTable();
        jLabel162 = new javax.swing.JLabel();
        total_depense_bereau = new javax.swing.JLabel();
        jLabel163 = new javax.swing.JLabel();
        ajout_bereau = new javax.swing.JButton();
        caisse_sortie = new javax.swing.JPanel();
        jLabel166 = new javax.swing.JLabel();
        jSeparator24 = new javax.swing.JSeparator();
        deb_sortie = new javax.swing.JTextField();
        jLabel167 = new javax.swing.JLabel();
        jLabel168 = new javax.swing.JLabel();
        fin_sortie = new javax.swing.JTextField();
        rech_sortie = new javax.swing.JButton();
        jSeparator25 = new javax.swing.JSeparator();
        jLabel169 = new javax.swing.JLabel();
        jScrollPane22 = new javax.swing.JScrollPane();
        sortie_list = new javax.swing.JTable();
        impri_sortie = new javax.swing.JLabel();
        jLabel171 = new javax.swing.JLabel();
        total_sortie = new javax.swing.JLabel();
        ajout_sortie = new javax.swing.JButton();
        caisse_autre = new javax.swing.JPanel();
        jLabel170 = new javax.swing.JLabel();
        jSeparator26 = new javax.swing.JSeparator();
        jLabel172 = new javax.swing.JLabel();
        deb_autre = new javax.swing.JTextField();
        jLabel173 = new javax.swing.JLabel();
        fin_autre = new javax.swing.JTextField();
        rech_autre = new javax.swing.JButton();
        jSeparator27 = new javax.swing.JSeparator();
        impri_autre = new javax.swing.JLabel();
        jLabel174 = new javax.swing.JLabel();
        jScrollPane23 = new javax.swing.JScrollPane();
        autre_list = new javax.swing.JTable();
        jLabel175 = new javax.swing.JLabel();
        total_autre = new javax.swing.JLabel();
        ajout_autre = new javax.swing.JButton();
        tot_caisse = new javax.swing.JPanel();
        jLabel176 = new javax.swing.JLabel();
        jSeparator28 = new javax.swing.JSeparator();
        deb_caisse = new javax.swing.JTextField();
        jLabel177 = new javax.swing.JLabel();
        jLabel178 = new javax.swing.JLabel();
        fin_caisse = new javax.swing.JTextField();
        rech_caisse = new javax.swing.JButton();
        jSeparator29 = new javax.swing.JSeparator();
        impri_caisse = new javax.swing.JLabel();
        jScrollPane24 = new javax.swing.JScrollPane();
        caisse_list = new javax.swing.JTable();
        revenus = new javax.swing.JLabel();
        jLabel180 = new javax.swing.JLabel();
        total_caisse = new javax.swing.JLabel();
        jLabel181 = new javax.swing.JLabel();
        jLabel182 = new javax.swing.JLabel();
        admin_pass = new javax.swing.JPanel();
        jLabel179 = new javax.swing.JLabel();
        login_admin = new javax.swing.JTextField();
        jLabel183 = new javax.swing.JLabel();
        actual_motpass = new javax.swing.JTextField();
        jLabel184 = new javax.swing.JLabel();
        new_pass = new javax.swing.JTextField();
        jLabel185 = new javax.swing.JLabel();
        confirm_new = new javax.swing.JTextField();
        edit_utilisateur = new javax.swing.JButton();
        jLabel186 = new javax.swing.JLabel();
        jSeparator30 = new javax.swing.JSeparator();
        jSeparator31 = new javax.swing.JSeparator();
        jLabel187 = new javax.swing.JLabel();
        comany_edit = new javax.swing.JPanel();
        jLabel142 = new javax.swing.JLabel();
        name_company = new javax.swing.JTextField();
        jLabel188 = new javax.swing.JLabel();
        jLabel189 = new javax.swing.JLabel();
        email_company = new javax.swing.JTextField();
        jLabel190 = new javax.swing.JLabel();
        adresse_company = new javax.swing.JTextField();
        jLabel191 = new javax.swing.JLabel();
        gsm_company = new javax.swing.JTextField();
        tel_company = new javax.swing.JTextField();
        jLabel192 = new javax.swing.JLabel();
        fax_company = new javax.swing.JTextField();
        jLabel193 = new javax.swing.JLabel();
        matricule_company = new javax.swing.JTextField();
        edit_company = new javax.swing.JButton();
        jLabel194 = new javax.swing.JLabel();
        jSeparator32 = new javax.swing.JSeparator();
        jSeparator33 = new javax.swing.JSeparator();
        edit_voit = new javax.swing.JPanel();
        jLabel196 = new javax.swing.JLabel();
        jLabel197 = new javax.swing.JLabel();
        upd_immat = new javax.swing.JTextField();
        jLabel198 = new javax.swing.JLabel();
        upd_gris = new javax.swing.JTextField();
        jLabel199 = new javax.swing.JLabel();
        upd_nbr = new javax.swing.JTextField();
        jLabel200 = new javax.swing.JLabel();
        upd_cat = new javax.swing.JComboBox<>();
        jLabel201 = new javax.swing.JLabel();
        upd_climatise = new javax.swing.JComboBox<>();
        jLabel202 = new javax.swing.JLabel();
        upd_circu = new javax.swing.JTextField();
        upd_km = new javax.swing.JTextField();
        jLabel203 = new javax.swing.JLabel();
        jLabel204 = new javax.swing.JLabel();
        upd_color = new javax.swing.JComboBox<>();
        upd_puiss = new javax.swing.JTextField();
        jLabel205 = new javax.swing.JLabel();
        upd_chasis = new javax.swing.JTextField();
        jLabel206 = new javax.swing.JLabel();
        jLabel207 = new javax.swing.JLabel();
        upd_model = new javax.swing.JComboBox<>();
        voit_upd = new javax.swing.JButton();
        upd_id = new javax.swing.JTextField();
        type_maint = new javax.swing.JPanel();
        all_show = new javax.swing.JTabbedPane();
        jScrollPane26 = new javax.swing.JScrollPane();
        assur_show = new javax.swing.JTable();
        jScrollPane27 = new javax.swing.JScrollPane();
        visite_show = new javax.swing.JTable();
        jScrollPane28 = new javax.swing.JScrollPane();
        vidange_show = new javax.swing.JTable();
        jScrollPane30 = new javax.swing.JScrollPane();
        fh_show = new javax.swing.JTable();
        jScrollPane31 = new javax.swing.JScrollPane();
        fa_show = new javax.swing.JTable();
        jScrollPane32 = new javax.swing.JScrollPane();
        autre_show = new javax.swing.JTable();
        jScrollPane29 = new javax.swing.JScrollPane();
        filtra_show = new javax.swing.JTable();
        show_maint1 = new javax.swing.JLabel();
        print_maint1 = new javax.swing.JLabel();
        j_immat = new javax.swing.JLabel();
        jLabel210 = new javax.swing.JLabel();
        j_modele = new javax.swing.JLabel();
        jLabel212 = new javax.swing.JLabel();
        j_immats = new javax.swing.JLabel();
        j_mod = new javax.swing.JLabel();
        edit_all = new javax.swing.JPanel();
        edit_numassur = new javax.swing.JTextField();
        label_num = new javax.swing.JLabel();
        label_datdeb = new javax.swing.JLabel();
        edit_datedeb = new javax.swing.JTextField();
        label_datefin = new javax.swing.JLabel();
        edit_datefin = new javax.swing.JTextField();
        label_remarque = new javax.swing.JLabel();
        edit_remar = new javax.swing.JTextField();
        jLabel215 = new javax.swing.JLabel();
        edit_montant = new javax.swing.JTextField();
        edit_entretien = new javax.swing.JTextField();
        date = new javax.swing.JLabel();
        labe_km = new javax.swing.JLabel();
        edit_km = new javax.swing.JTextField();
        edit_maint = new javax.swing.JButton();
        tab = new javax.swing.JTextField();
        edit_id = new javax.swing.JTextField();
        edit_societi = new javax.swing.JPanel();
        jSeparator34 = new javax.swing.JSeparator();
        societe_id = new javax.swing.JLabel();
        jLabel211 = new javax.swing.JLabel();
        edit_societe_nom = new javax.swing.JTextField();
        jLabel213 = new javax.swing.JLabel();
        edit_societe_tel = new javax.swing.JTextField();
        jLabel214 = new javax.swing.JLabel();
        edit_societe_email = new javax.swing.JTextField();
        jLabel216 = new javax.swing.JLabel();
        edit_societe_adresse = new javax.swing.JTextField();
        jLabel217 = new javax.swing.JLabel();
        edit_societe_fiscal = new javax.swing.JTextField();
        edit_societe = new javax.swing.JButton();
        jSeparator35 = new javax.swing.JSeparator();
        id_societ = new javax.swing.JTextField();
        societ_fact = new javax.swing.JPanel();
        nom_action = new javax.swing.JLabel();
        jSeparator36 = new javax.swing.JSeparator();
        jLabel218 = new javax.swing.JLabel();
        jLabel219 = new javax.swing.JLabel();
        matfis = new javax.swing.JLabel();
        soci_fiscal = new javax.swing.JTextField();
        soci_email = new javax.swing.JTextField();
        societe_n = new javax.swing.JTextField();
        jLabel221 = new javax.swing.JLabel();
        jLabel222 = new javax.swing.JLabel();
        soci_adresse = new javax.swing.JTextField();
        soci_tel = new javax.swing.JTextField();
        jLabel223 = new javax.swing.JLabel();
        jLabel224 = new javax.swing.JLabel();
        jScrollPane33 = new javax.swing.JScrollPane();
        soietcont_show = new javax.swing.JTable();
        jScrollPane34 = new javax.swing.JScrollPane();
        sociefact_show = new javax.swing.JTable();
        societe_impr = new javax.swing.JLabel();
        fact_societe = new javax.swing.JLabel();
        id_societfact = new javax.swing.JTextField();
        type_fact = new javax.swing.JTextField();
        edittt_client = new javax.swing.JPanel();
        jLabel225 = new javax.swing.JLabel();
        jSeparator37 = new javax.swing.JSeparator();
        editclient_type = new javax.swing.JComboBox<>();
        editclient_num = new javax.swing.JTextField();
        jLabel226 = new javax.swing.JLabel();
        jLabel227 = new javax.swing.JLabel();
        editclient_date = new javax.swing.JTextField();
        jLabel228 = new javax.swing.JLabel();
        editclient_lieu_identite = new javax.swing.JTextField();
        jLabel229 = new javax.swing.JLabel();
        jLabel230 = new javax.swing.JLabel();
        jLabel231 = new javax.swing.JLabel();
        jLabel232 = new javax.swing.JLabel();
        jLabel233 = new javax.swing.JLabel();
        jLabel234 = new javax.swing.JLabel();
        jLabel235 = new javax.swing.JLabel();
        editclient_nom = new javax.swing.JTextField();
        editclient_naiss = new javax.swing.JTextField();
        editnatinalite_client = new javax.swing.JTextField();
        editemail_client = new javax.swing.JTextField();
        editadresse_client = new javax.swing.JTextField();
        editclient_lieu_naiss = new javax.swing.JTextField();
        editclient_tel = new javax.swing.JTextField();
        jSeparator38 = new javax.swing.JSeparator();
        modif_client = new javax.swing.JButton();
        id_modif = new javax.swing.JTextField();
        Internal = new javax.swing.JPanel();
        edit_contrat = new javax.swing.JPanel();
        jLabel238 = new javax.swing.JLabel();
        edit_date_contrat = new javax.swing.JTextField();
        jLabel239 = new javax.swing.JLabel();
        jLabel240 = new javax.swing.JLabel();
        jLabel241 = new javax.swing.JLabel();
        edit_contrat_retour = new com.toedter.calendar.JDateChooser();
        edit_contrat_deb = new com.toedter.calendar.JDateChooser();
        jLabel250 = new javax.swing.JLabel();
        jLabel251 = new javax.swing.JLabel();
        edit_heure_fin = new javax.swing.JComboBox<>();
        edit_heure_dep = new javax.swing.JComboBox<>();
        edit_contrat_imma = new javax.swing.JComboBox<>();
        jLabel252 = new javax.swing.JLabel();
        edit_contrat_model = new javax.swing.JComboBox<>();
        jLabel253 = new javax.swing.JLabel();
        jLabel254 = new javax.swing.JLabel();
        jLabel255 = new javax.swing.JLabel();
        edit_km_dep = new javax.swing.JTextField();
        edit_lieu_depart = new javax.swing.JTextField();
        jLabel256 = new javax.swing.JLabel();
        jLabel257 = new javax.swing.JLabel();
        edit_km_retour = new javax.swing.JTextField();
        edit_lieu_retour = new javax.swing.JTextField();
        jLabel258 = new javax.swing.JLabel();
        edit_type_iden = new javax.swing.JComboBox<>();
        jLabel259 = new javax.swing.JLabel();
        edit_num_identite = new javax.swing.JTextField();
        jLabel260 = new javax.swing.JLabel();
        edit_identite_date = new javax.swing.JTextField();
        jLabel261 = new javax.swing.JLabel();
        edit_lieu_identite = new javax.swing.JTextField();
        jLabel262 = new javax.swing.JLabel();
        edit_nom_prenom = new javax.swing.JTextField();
        jLabel263 = new javax.swing.JLabel();
        edit_tel_client = new javax.swing.JTextField();
        jLabel264 = new javax.swing.JLabel();
        edit_client_naissance = new javax.swing.JTextField();
        jLabel265 = new javax.swing.JLabel();
        edit_lieu_naiss = new javax.swing.JTextField();
        jLabel266 = new javax.swing.JLabel();
        edit_client_nationalite = new javax.swing.JTextField();
        jLabel267 = new javax.swing.JLabel();
        edit_client_adresse = new javax.swing.JTextField();
        jLabel268 = new javax.swing.JLabel();
        jLabel269 = new javax.swing.JLabel();
        jLabel270 = new javax.swing.JLabel();
        jLabel271 = new javax.swing.JLabel();
        edit_pai_day = new com.toedter.calendar.JDateChooser();
        edit_montant_pay = new javax.swing.JTextField();
        edit_montant_gatan = new javax.swing.JTextField();
        edit_pay_gatan = new javax.swing.JComboBox<>();
        edit_type_pay = new javax.swing.JComboBox<>();
        jLabel272 = new javax.swing.JLabel();
        jScrollPane35 = new javax.swing.JScrollPane();
        edit_observation = new javax.swing.JTextArea();
        jLabel273 = new javax.swing.JLabel();
        edit_type_identite_conduc = new javax.swing.JComboBox<>();
        jLabel274 = new javax.swing.JLabel();
        edit_identite_num_conduc = new javax.swing.JTextField();
        jLabel275 = new javax.swing.JLabel();
        edit_date_identite_conduc = new javax.swing.JTextField();
        jLabel276 = new javax.swing.JLabel();
        edit_identite_lieu_conduc = new javax.swing.JTextField();
        jLabel277 = new javax.swing.JLabel();
        edit_prenom_nom_conduc = new javax.swing.JTextField();
        jLabel278 = new javax.swing.JLabel();
        edit_date_permis_conduc = new javax.swing.JTextField();
        jLabel279 = new javax.swing.JLabel();
        edit_conducteur_permis = new javax.swing.JTextField();
        jLabel280 = new javax.swing.JLabel();
        edit_lieu_permis_conduc = new javax.swing.JTextField();
        jLabel281 = new javax.swing.JLabel();
        edit_type_identite_conduc2 = new javax.swing.JComboBox<>();
        jLabel282 = new javax.swing.JLabel();
        edit_identite_num_conduc2 = new javax.swing.JTextField();
        jLabel283 = new javax.swing.JLabel();
        edit_date_identite_conduc2 = new javax.swing.JTextField();
        jLabel284 = new javax.swing.JLabel();
        edit_identite_lieu_conduc2 = new javax.swing.JTextField();
        jLabel285 = new javax.swing.JLabel();
        edit_prenom_nom_conduc2 = new javax.swing.JTextField();
        jLabel286 = new javax.swing.JLabel();
        edit_conducteur_permis_conduc2 = new javax.swing.JTextField();
        jLabel287 = new javax.swing.JLabel();
        edit_lieu_permis_conduc2 = new javax.swing.JTextField();
        jLabel288 = new javax.swing.JLabel();
        edit_date_permis_conduc2 = new javax.swing.JTextField();
        jLabel289 = new javax.swing.JLabel();
        edit_retour_causs = new javax.swing.JTextField();
        edit_contrat_butt = new javax.swing.JButton();
        jSeparator39 = new javax.swing.JSeparator();
        jSeparator40 = new javax.swing.JSeparator();
        jSeparator41 = new javax.swing.JSeparator();
        jSeparator42 = new javax.swing.JSeparator();
        edit_type_contrat = new javax.swing.JTextField();
        edit_id_contrat = new javax.swing.JTextField();
        jSeparator43 = new javax.swing.JSeparator();
        id_veh = new javax.swing.JTextField();
        id_cliso = new javax.swing.JTextField();
        id_pai = new javax.swing.JTextField();
        edit_id_conduc1 = new javax.swing.JTextField();
        edit_id_conduc2 = new javax.swing.JTextField();
        delete_cond2 = new javax.swing.JButton();
        check_del = new javax.swing.JTextField();

        jButton1.setText("Visite technique");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jdialog_contrat.setBounds(new java.awt.Rectangle(800, 400, 600, 450));
        jdialog_contrat.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel242.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel242.setForeground(new java.awt.Color(0, 51, 255));
        jLabel242.setText("Conducteur");
        jdialog_contrat.getContentPane().add(jLabel242, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 90, 20));

        type_identite3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CIN", "Passport", " " }));
        jdialog_contrat.getContentPane().add(type_identite3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 70, 30));

        jLabel243.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel243.setText("N° : ");
        jdialog_contrat.getContentPane().add(jLabel243, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, -1, 30));

        identite_num2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                identite_num2ActionPerformed(evt);
            }
        });
        jdialog_contrat.getContentPane().add(identite_num2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 110, 30));

        jLabel244.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel244.setText("date : ");
        jdialog_contrat.getContentPane().add(jLabel244, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, -1, 30));
        jdialog_contrat.getContentPane().add(date_identite2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, 110, 30));

        jLabel245.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel245.setText("a : ");
        jdialog_contrat.getContentPane().add(jLabel245, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, 30, 30));
        jdialog_contrat.getContentPane().add(identite_lieu2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 90, 120, 30));

        jLabel246.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel246.setText("Nom prénom/societé :");
        jdialog_contrat.getContentPane().add(jLabel246, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, 30));
        jdialog_contrat.getContentPane().add(prenom_nom2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 160, 30));

        jLabel247.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel247.setText("N° permis conduire:");
        jdialog_contrat.getContentPane().add(jLabel247, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, 30));
        jdialog_contrat.getContentPane().add(conducteur_permis2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 160, 30));

        jLabel248.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel248.setText("Date:");
        jdialog_contrat.getContentPane().add(jLabel248, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, -1, 30));
        jdialog_contrat.getContentPane().add(date_permis2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 180, 160, 40));

        jLabel249.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel249.setText("à :");
        jdialog_contrat.getContentPane().add(jLabel249, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, -1, 30));
        jdialog_contrat.getContentPane().add(lieu_permis2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 160, 30));

        cond2_but.setText("Valider");
        cond2_but.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cond2_butMouseClicked(evt);
            }
        });
        jdialog_contrat.getContentPane().add(cond2_but, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 330, -1, -1));

        jButton8.setText("Annuler");
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton8MouseClicked(evt);
            }
        });
        jdialog_contrat.getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 330, -1, -1));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Container.setBackground(new java.awt.Color(255, 255, 255));
        Container.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Menu.setBackground(new java.awt.Color(0, 102, 204));
        Menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lab_admin.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lab_admin.setForeground(new java.awt.Color(255, 255, 255));
        lab_admin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/location_voiture/image/icons8_Settings_30px.png"))); // NOI18N
        lab_admin.setText("  Administration");
        lab_admin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        lab_admin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lab_adminMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lab_adminMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lab_adminMouseExited(evt);
            }
        });
        Menu.add(lab_admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 650, 280, 40));

        lab_accueil.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lab_accueil.setForeground(new java.awt.Color(255, 255, 255));
        lab_accueil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/location_voiture/image/icons8_Home_30px.png"))); // NOI18N
        lab_accueil.setText("  Accueil");
        lab_accueil.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        lab_accueil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lab_accueilMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lab_accueilMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lab_accueilMouseExited(evt);
            }
        });
        Menu.add(lab_accueil, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 280, 40));

        lab_voit.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lab_voit.setForeground(new java.awt.Color(255, 255, 255));
        lab_voit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/location_voiture/image/icons8_SUV_30px.png"))); // NOI18N
        lab_voit.setText("  Voiture");
        lab_voit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        lab_voit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lab_voitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lab_voitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lab_voitMouseExited(evt);
            }
        });
        Menu.add(lab_voit, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 280, 40));

        lab_maint.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lab_maint.setForeground(new java.awt.Color(255, 255, 255));
        lab_maint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/location_voiture/image/icons8_Maintenance_30px.png"))); // NOI18N
        lab_maint.setText("  Maintenance");
        lab_maint.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        lab_maint.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lab_maintMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lab_maintMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lab_maintMouseExited(evt);
            }
        });
        Menu.add(lab_maint, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 280, 40));

        lab_contrat.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lab_contrat.setForeground(new java.awt.Color(255, 255, 255));
        lab_contrat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/location_voiture/image/icons8_Handshake_30px.png"))); // NOI18N
        lab_contrat.setText("  Contrat");
        lab_contrat.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        lab_contrat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lab_contratMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lab_contratMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lab_contratMouseExited(evt);
            }
        });
        Menu.add(lab_contrat, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 280, 40));

        lab_reser.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lab_reser.setForeground(new java.awt.Color(255, 255, 255));
        lab_reser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/location_voiture/image/icons8_Ticket_Purchase_30px.png"))); // NOI18N
        lab_reser.setText("  Réservation");
        lab_reser.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        lab_reser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lab_reserMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lab_reserMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lab_reserMouseExited(evt);
            }
        });
        Menu.add(lab_reser, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 280, 40));

        lab_societ.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lab_societ.setForeground(new java.awt.Color(255, 255, 255));
        lab_societ.setIcon(new javax.swing.ImageIcon(getClass().getResource("/location_voiture/image/icons8_User_Groups_30px.png"))); // NOI18N
        lab_societ.setText("  Societé");
        lab_societ.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        lab_societ.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lab_societMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lab_societMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lab_societMouseExited(evt);
            }
        });
        Menu.add(lab_societ, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 280, 40));

        lab_client.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lab_client.setForeground(new java.awt.Color(255, 255, 255));
        lab_client.setIcon(new javax.swing.ImageIcon(getClass().getResource("/location_voiture/image/icons8_Male_User_30px.png"))); // NOI18N
        lab_client.setText("  Client");
        lab_client.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        lab_client.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lab_clientMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lab_clientMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lab_clientMouseExited(evt);
            }
        });
        Menu.add(lab_client, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 280, 40));

        lab_fact.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lab_fact.setForeground(new java.awt.Color(255, 255, 255));
        lab_fact.setIcon(new javax.swing.ImageIcon(getClass().getResource("/location_voiture/image/icons8_Rent_30px.png"))); // NOI18N
        lab_fact.setText("  Facturation");
        lab_fact.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        lab_fact.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lab_factMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lab_factMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lab_factMouseExited(evt);
            }
        });
        Menu.add(lab_fact, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 280, 40));

        lab_pai.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lab_pai.setForeground(new java.awt.Color(255, 255, 255));
        lab_pai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/location_voiture/image/icons8_Paper_Money_30px.png"))); // NOI18N
        lab_pai.setText("  Paiement");
        lab_pai.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        lab_pai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lab_paiMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lab_paiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lab_paiMouseExited(evt);
            }
        });
        Menu.add(lab_pai, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 550, 280, 40));

        lab_finance.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lab_finance.setForeground(new java.awt.Color(255, 255, 255));
        lab_finance.setIcon(new javax.swing.ImageIcon(getClass().getResource("/location_voiture/image/icons8_Bill_30px.png"))); // NOI18N
        lab_finance.setText("  Etat Financiére");
        lab_finance.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        lab_finance.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lab_financeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lab_financeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lab_financeMouseExited(evt);
            }
        });
        Menu.add(lab_finance, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 600, 280, 40));

        Container.add(Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 280, 750));

        nav_close.setBackground(new java.awt.Color(102, 102, 102));
        nav_close.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/location_voiture/image/icons8_Minimize_Window_28px.png"))); // NOI18N
        nav_close.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1380, 0, 30, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/location_voiture/image/icons8_Close_Window_28px.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        nav_close.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1410, 0, 30, 30));

        Container.add(nav_close, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1450, 30));

        menu_nav.setBackground(new java.awt.Color(250, 95, 75));
        menu_nav.setLayout(new java.awt.CardLayout());

        menu_accueil.setBackground(new java.awt.Color(250, 95, 75));
        menu_accueil.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        menu_nav.add(menu_accueil, "menuacc");

        menu_voit.setBackground(new java.awt.Color(250, 95, 75));
        menu_voit.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        list_vehi.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        list_vehi.setForeground(new java.awt.Color(255, 255, 255));
        list_vehi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/location_voiture/image/icons8_List_28px.png"))); // NOI18N
        list_vehi.setText("Liste Véhicule");
        list_vehi.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        list_vehi.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        list_vehi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                list_vehiMouseClicked(evt);
            }
        });
        menu_voit.add(list_vehi, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 110, 100));

        ajout_coleur.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ajout_coleur.setForeground(new java.awt.Color(255, 255, 255));
        ajout_coleur.setIcon(new javax.swing.ImageIcon(getClass().getResource("/location_voiture/image/icons8_Fill_Color_28px.png"))); // NOI18N
        ajout_coleur.setText("Ajouter Couleur");
        ajout_coleur.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ajout_coleur.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ajout_coleur.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ajout_coleurMouseClicked(evt);
            }
        });
        menu_voit.add(ajout_coleur, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 0, 140, 100));

        ajout_veh1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ajout_veh1.setForeground(new java.awt.Color(255, 255, 255));
        ajout_veh1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/location_voiture/image/icons8_Add_28px.png"))); // NOI18N
        ajout_veh1.setText("Ajouter nouveau voiture");
        ajout_veh1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ajout_veh1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ajout_veh1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ajout_veh1MouseClicked(evt);
            }
        });
        menu_voit.add(ajout_veh1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 200, 100));

        ajout_model.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ajout_model.setForeground(new java.awt.Color(255, 255, 255));
        ajout_model.setIcon(new javax.swing.ImageIcon(getClass().getResource("/location_voiture/image/icons8_Module_28px.png"))); // NOI18N
        ajout_model.setText("Ajouter Modele");
        ajout_model.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ajout_model.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ajout_model.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ajout_modelMouseClicked(evt);
            }
        });
        menu_voit.add(ajout_model, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, 120, 100));

        ajout_cat.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ajout_cat.setForeground(new java.awt.Color(255, 255, 255));
        ajout_cat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/location_voiture/image/icons8_Category_28px.png"))); // NOI18N
        ajout_cat.setText("Ajouter Catégorie");
        ajout_cat.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ajout_cat.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ajout_cat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ajout_catMouseClicked(evt);
            }
        });
        menu_voit.add(ajout_cat, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 0, 140, 100));

        menu_nav.add(menu_voit, "menuvoit");

        menu_societ.setBackground(new java.awt.Color(250, 95, 75));
        menu_societ.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        list_societ.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        list_societ.setForeground(new java.awt.Color(255, 255, 255));
        list_societ.setIcon(new javax.swing.ImageIcon(getClass().getResource("/location_voiture/image/icons8_List_28px.png"))); // NOI18N
        list_societ.setText("Liste Societé");
        list_societ.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        list_societ.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        list_societ.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                list_societMouseClicked(evt);
            }
        });
        menu_societ.add(list_societ, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 110, 100));

        ajout_societ.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ajout_societ.setForeground(new java.awt.Color(255, 255, 255));
        ajout_societ.setIcon(new javax.swing.ImageIcon(getClass().getResource("/location_voiture/image/icons8_Add_28px.png"))); // NOI18N
        ajout_societ.setText("Ajouter nouveau societé");
        ajout_societ.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ajout_societ.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ajout_societ.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ajout_societMouseClicked(evt);
            }
        });
        menu_societ.add(ajout_societ, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, 200, 100));

        menu_nav.add(menu_societ, "menusociet");

        menu_reser.setBackground(new java.awt.Color(250, 95, 75));
        menu_reser.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        list_reser.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        list_reser.setForeground(new java.awt.Color(255, 255, 255));
        list_reser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/location_voiture/image/icons8_List_28px.png"))); // NOI18N
        list_reser.setText("Liste Réservation");
        list_reser.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        list_reser.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        list_reser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                list_reserMouseClicked(evt);
            }
        });
        menu_reser.add(list_reser, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 140, 100));

        ajout_reser.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ajout_reser.setForeground(new java.awt.Color(255, 255, 255));
        ajout_reser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/location_voiture/image/icons8_Add_28px.png"))); // NOI18N
        ajout_reser.setText("Ajouter nouveau réservation");
        ajout_reser.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ajout_reser.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ajout_reser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ajout_reserMouseClicked(evt);
            }
        });
        menu_reser.add(ajout_reser, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, 230, 100));

        menu_nav.add(menu_reser, "menureser");

        menu_contrat.setBackground(new java.awt.Color(250, 95, 75));
        menu_contrat.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        list_contr.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        list_contr.setForeground(new java.awt.Color(255, 255, 255));
        list_contr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/location_voiture/image/icons8_List_28px.png"))); // NOI18N
        list_contr.setText("Liste Contrat");
        list_contr.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        list_contr.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        list_contr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                list_contrMouseClicked(evt);
            }
        });
        menu_contrat.add(list_contr, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 110, 100));

        archive.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        archive.setForeground(new java.awt.Color(255, 255, 255));
        archive.setIcon(new javax.swing.ImageIcon(getClass().getResource("/location_voiture/image/icons8_Archive_Folder_28px.png"))); // NOI18N
        archive.setText("Archive");
        archive.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        archive.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        archive.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                archiveMouseClicked(evt);
            }
        });
        menu_contrat.add(archive, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 0, 60, 100));

        ajout_contr.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ajout_contr.setForeground(new java.awt.Color(255, 255, 255));
        ajout_contr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/location_voiture/image/icons8_Add_28px.png"))); // NOI18N
        ajout_contr.setText("Ajouter nouveau contrat");
        ajout_contr.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ajout_contr.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ajout_contr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ajout_contrMouseClicked(evt);
            }
        });
        menu_contrat.add(ajout_contr, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, 200, 100));

        menu_nav.add(menu_contrat, "menucontr");

        menu_maint.setBackground(new java.awt.Color(250, 95, 75));
        menu_maint.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        list_autre.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        list_autre.setForeground(new java.awt.Color(255, 255, 255));
        list_autre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/location_voiture/image/icons8_More_28px.png"))); // NOI18N
        list_autre.setText("Autre");
        list_autre.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        list_autre.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        list_autre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                list_autreMouseClicked(evt);
            }
        });
        menu_maint.add(list_autre, new org.netbeans.lib.awtextra.AbsoluteConstraints(792, 0, 50, 100));

        list_maint.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        list_maint.setForeground(new java.awt.Color(255, 255, 255));
        list_maint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/location_voiture/image/icons8_List_28px.png"))); // NOI18N
        list_maint.setText("Liste Maintenance");
        list_maint.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        list_maint.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        list_maint.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                list_maintMouseClicked(evt);
            }
        });
        menu_maint.add(list_maint, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 150, 100));

        list_assur.setBackground(new java.awt.Color(255, 255, 255));
        list_assur.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        list_assur.setForeground(new java.awt.Color(255, 255, 255));
        list_assur.setIcon(new javax.swing.ImageIcon(getClass().getResource("/location_voiture/image/icons8_Car_Insurance_28px.png"))); // NOI18N
        list_assur.setText("Assurance");
        list_assur.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        list_assur.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        list_assur.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                list_assurMouseClicked(evt);
            }
        });
        menu_maint.add(list_assur, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 80, 100));

        list_visit.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        list_visit.setForeground(new java.awt.Color(255, 255, 255));
        list_visit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/location_voiture/image/icons8_Car_Service_28px.png"))); // NOI18N
        list_visit.setText("Visite Technique");
        list_visit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        list_visit.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        list_visit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                list_visitMouseClicked(evt);
            }
        });
        menu_maint.add(list_visit, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, -1, 100));

        list_vidange.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        list_vidange.setForeground(new java.awt.Color(255, 255, 255));
        list_vidange.setIcon(new javax.swing.ImageIcon(getClass().getResource("/location_voiture/image/icons8_Car_Theft_28px.png"))); // NOI18N
        list_vidange.setText("Vidange");
        list_vidange.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        list_vidange.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        list_vidange.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                list_vidangeMouseClicked(evt);
            }
        });
        menu_maint.add(list_vidange, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, -1, 100));

        list_filtra.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        list_filtra.setForeground(new java.awt.Color(255, 255, 255));
        list_filtra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/location_voiture/image/icons8_Air_28px.png"))); // NOI18N
        list_filtra.setText("Filtre a air");
        list_filtra.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        list_filtra.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        list_filtra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                list_filtraMouseClicked(evt);
            }
        });
        menu_maint.add(list_filtra, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, -1, 100));

        list_filtreh.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        list_filtreh.setForeground(new java.awt.Color(255, 255, 255));
        list_filtreh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/location_voiture/image/icons8_Filter_28px.png"))); // NOI18N
        list_filtreh.setText("Filtre a huile");
        list_filtreh.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        list_filtreh.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        list_filtreh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                list_filtrehMouseClicked(evt);
            }
        });
        menu_maint.add(list_filtreh, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 0, -1, 100));

        menu_nav.add(menu_maint, "menumaint");

        menu_client.setBackground(new java.awt.Color(250, 95, 75));
        menu_client.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        list_client.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        list_client.setForeground(new java.awt.Color(255, 255, 255));
        list_client.setIcon(new javax.swing.ImageIcon(getClass().getResource("/location_voiture/image/icons8_List_28px.png"))); // NOI18N
        list_client.setText("Liste Client");
        list_client.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        list_client.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        list_client.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                list_clientMouseClicked(evt);
            }
        });
        menu_client.add(list_client, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 90, 100));

        ajout_client.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ajout_client.setForeground(new java.awt.Color(255, 255, 255));
        ajout_client.setIcon(new javax.swing.ImageIcon(getClass().getResource("/location_voiture/image/icons8_Add_28px.png"))); // NOI18N
        ajout_client.setText("Ajouter nouveau client");
        ajout_client.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ajout_client.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ajout_client.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ajout_clientMouseClicked(evt);
            }
        });
        menu_client.add(ajout_client, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, 180, 100));

        menu_nav.add(menu_client, "menucli");

        menu_fact.setBackground(new java.awt.Color(250, 95, 75));
        menu_fact.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        list_fact.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        list_fact.setForeground(new java.awt.Color(255, 255, 255));
        list_fact.setIcon(new javax.swing.ImageIcon(getClass().getResource("/location_voiture/image/icons8_List_28px.png"))); // NOI18N
        list_fact.setText("Liste facture");
        list_fact.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        list_fact.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        list_fact.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                list_factMouseClicked(evt);
            }
        });
        menu_fact.add(list_fact, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 100, 100));

        menu_nav.add(menu_fact, "menufact");

        menu_pai.setBackground(new java.awt.Color(250, 95, 75));
        menu_pai.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        list_pai.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        list_pai.setForeground(new java.awt.Color(255, 255, 255));
        list_pai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/location_voiture/image/icons8_List_28px.png"))); // NOI18N
        list_pai.setText("Liste paiement");
        list_pai.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        list_pai.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        list_pai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                list_paiMouseClicked(evt);
            }
        });
        menu_pai.add(list_pai, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 120, 100));

        ajout_pai.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ajout_pai.setForeground(new java.awt.Color(255, 255, 255));
        ajout_pai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/location_voiture/image/icons8_Add_28px.png"))); // NOI18N
        ajout_pai.setText("Ajouter paiement");
        ajout_pai.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ajout_pai.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ajout_pai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ajout_paiMouseClicked(evt);
            }
        });
        menu_pai.add(ajout_pai, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, 140, 100));

        menu_nav.add(menu_pai, "menupai");

        menu_finance.setBackground(new java.awt.Color(250, 95, 75));
        menu_finance.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        caisse.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        caisse.setForeground(new java.awt.Color(255, 255, 255));
        caisse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/location_voiture/image/icons8_Cash_Register_28px.png"))); // NOI18N
        caisse.setText("Caisse");
        caisse.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        caisse.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        caisse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                caisseMouseClicked(evt);
            }
        });
        menu_finance.add(caisse, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 0, 60, 100));

        list_recette.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        list_recette.setForeground(new java.awt.Color(255, 255, 255));
        list_recette.setIcon(new javax.swing.ImageIcon(getClass().getResource("/location_voiture/image/icons8_Money_Bag_28px.png"))); // NOI18N
        list_recette.setText("Recette");
        list_recette.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        list_recette.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        list_recette.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                list_recetteMouseClicked(evt);
            }
        });
        menu_finance.add(list_recette, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 60, 100));

        list_reccvoi.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        list_reccvoi.setForeground(new java.awt.Color(255, 255, 255));
        list_reccvoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/location_voiture/image/icons8_Money_28px.png"))); // NOI18N
        list_reccvoi.setText("Recette par voiture ");
        list_reccvoi.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        list_reccvoi.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        list_reccvoi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                list_reccvoiMouseClicked(evt);
            }
        });
        menu_finance.add(list_reccvoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 160, 100));

        dep_voi.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        dep_voi.setForeground(new java.awt.Color(255, 255, 255));
        dep_voi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/location_voiture/image/icons8_Card_Payment_30px_1.png"))); // NOI18N
        dep_voi.setText("Dépense voiture ");
        dep_voi.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        dep_voi.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        dep_voi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dep_voiMouseClicked(evt);
            }
        });
        menu_finance.add(dep_voi, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 140, 100));

        dep_ber.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        dep_ber.setForeground(new java.awt.Color(255, 255, 255));
        dep_ber.setIcon(new javax.swing.ImageIcon(getClass().getResource("/location_voiture/image/icons8_Front_Desk_30px_1.png"))); // NOI18N
        dep_ber.setText("Dépense bereau ");
        dep_ber.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        dep_ber.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        dep_ber.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dep_berMouseClicked(evt);
            }
        });
        menu_finance.add(dep_ber, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, 140, 100));

        sortie_caisse.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        sortie_caisse.setForeground(new java.awt.Color(255, 255, 255));
        sortie_caisse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/location_voiture/image/icons8_Checkout_28px.png"))); // NOI18N
        sortie_caisse.setText("Sortie caisse");
        sortie_caisse.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        sortie_caisse.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        sortie_caisse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sortie_caisseMouseClicked(evt);
            }
        });
        menu_finance.add(sortie_caisse, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 0, 100, 100));

        other_recc.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        other_recc.setForeground(new java.awt.Color(255, 255, 255));
        other_recc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/location_voiture/image/icons8_More_28px.png"))); // NOI18N
        other_recc.setText("Autre recettes");
        other_recc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        other_recc.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        other_recc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                other_reccMouseClicked(evt);
            }
        });
        menu_finance.add(other_recc, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 0, 110, 100));

        menu_nav.add(menu_finance, "menufin");

        menu_admin.setBackground(new java.awt.Color(250, 95, 75));
        menu_admin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        list_pai1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        list_pai1.setForeground(new java.awt.Color(255, 255, 255));
        list_pai1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/location_voiture/image/icons8_Edit_Account_28px.png"))); // NOI18N
        list_pai1.setText("Modifier mot de passe");
        list_pai1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        list_pai1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        list_pai1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                list_pai1MouseClicked(evt);
            }
        });
        menu_admin.add(list_pai1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 180, 100));

        ajout_pai1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ajout_pai1.setForeground(new java.awt.Color(255, 255, 255));
        ajout_pai1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/location_voiture/image/icons8_News_28px.png"))); // NOI18N
        ajout_pai1.setText("Info agence");
        ajout_pai1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ajout_pai1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ajout_pai1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ajout_pai1MouseClicked(evt);
            }
        });
        menu_admin.add(ajout_pai1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, 100, 100));

        menu_nav.add(menu_admin, "menuadmin");

        Container.add(menu_nav, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, 1170, 100));

        affichage.setLayout(new java.awt.CardLayout());

        accueil.setBackground(new java.awt.Color(255, 255, 255));
        accueil.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        affichage.add(accueil, "accueil");

        list_voiture.setBackground(new java.awt.Color(255, 255, 255));
        list_voiture.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rech_model.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rech_modelActionPerformed(evt);
            }
        });
        list_voiture.add(rech_model, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 40, 160, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Modèle :");
        list_voiture.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, 60, 20));

        voit_affiche.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Modèle", "Immatriculation"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(voit_affiche);

        list_voiture.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 1170, -1));

        Edit_item.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Edit_item.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photo/Tableicon/icons8_Edit_File_30px.png"))); // NOI18N
        Edit_item.setText("Edit");
        Edit_item.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Edit_item.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Edit_item.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Edit_itemMouseClicked(evt);
            }
        });
        list_voiture.add(Edit_item, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 80, 40, 70));

        Delet_item.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Delet_item.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photo/Tableicon/icons8_Delete_File_30px.png"))); // NOI18N
        Delet_item.setText("Delete");
        Delet_item.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Delet_item.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Delet_item.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Delet_itemMouseClicked(evt);
            }
        });
        list_voiture.add(Delet_item, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 80, -1, 70));

        affichage.add(list_voiture, "liste");

        Ajout_voiture.setBackground(new java.awt.Color(255, 255, 255));
        Ajout_voiture.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Ajout véhicule :");
        Ajout_voiture.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 100, 40));
        Ajout_voiture.add(voit_immat, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 200, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Immatriculation : ");
        Ajout_voiture.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 120, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("N° carte gris     :");
        Ajout_voiture.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 110, 30));
        Ajout_voiture.add(voit_griss, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 200, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Catégorie          : ");
        Ajout_voiture.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 120, 30));
        Ajout_voiture.add(voit_nbr, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 200, 30));

        list_cat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        Ajout_voiture.add(list_cat, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, 120, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Nbre de place    : ");
        Ajout_voiture.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 120, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Climatisé           : ");
        Ajout_voiture.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 120, 30));

        voit_clim.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Oui", "Non" }));
        Ajout_voiture.add(voit_clim, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, -1, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Date de mis en circulation    : ");
        Ajout_voiture.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 200, 30));
        Ajout_voiture.add(voit_circu, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 350, 200, 30));

        Ajout_voiture.add(list_mod, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 110, 140, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Modèle             : ");
        Ajout_voiture.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 110, 140, 30));
        Ajout_voiture.add(voit_chasis, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 160, 200, 30));
        Ajout_voiture.add(voit_puiss, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 200, 200, 30));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Puissance         :");
        Ajout_voiture.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 200, 110, 30));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("N° chassis        : ");
        Ajout_voiture.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 160, 120, 30));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Couleur            : ");
        Ajout_voiture.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 250, 130, 30));

        Ajout_voiture.add(list_color, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 250, 150, 30));
        Ajout_voiture.add(voit_km, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 300, 200, 30));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("KM                    :");
        Ajout_voiture.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 300, 120, 30));

        voit_save.setBackground(new java.awt.Color(153, 153, 153));
        voit_save.setText("Enregistrer");
        voit_save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                voit_saveMouseClicked(evt);
            }
        });
        voit_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voit_saveActionPerformed(evt);
            }
        });
        Ajout_voiture.add(voit_save, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 460, 230, 50));

        affichage.add(Ajout_voiture, "ajout");

        visite_technique.setBackground(new java.awt.Color(255, 255, 255));
        visite_technique.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel30.setText("Visite Technique : ");
        visite_technique.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 130, 50));

        tech_mod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tech_modActionPerformed(evt);
            }
        });
        visite_technique.add(tech_mod, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 90, 140, 30));

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel31.setText("Modéle : ");
        visite_technique.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 100, -1, -1));

        affi_tech.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Modéle", "Immatriculation"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(affi_tech);
        if (affi_tech.getColumnModel().getColumnCount() > 0) {
            affi_tech.getColumnModel().getColumn(0).setResizable(false);
            affi_tech.getColumnModel().getColumn(0).setPreferredWidth(50);
            affi_tech.getColumnModel().getColumn(1).setResizable(false);
            affi_tech.getColumnModel().getColumn(2).setResizable(false);
        }

        visite_technique.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 1170, 130));

        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel32.setText("Montant : ");
        visite_technique.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 100, 40));
        visite_technique.add(visit_montant, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, 180, 40));
        visite_technique.add(debut_visit, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 450, 180, 40));

        jLabel33.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel33.setText("Date de début : ");
        visite_technique.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 450, 130, 40));

        jLabel34.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel34.setText("Date de fin : ");
        visite_technique.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(379, 440, 80, 40));
        visite_technique.add(fin_visit, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 440, 170, 40));

        boton_visit.setText("Enregistrer");
        boton_visit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_visitMouseClicked(evt);
            }
        });
        visite_technique.add(boton_visit, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 530, 240, 50));

        affichage.add(visite_technique, "visit");

        Ajout_model.setBackground(new java.awt.Color(255, 255, 255));
        Ajout_model.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        model_voit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        model_voit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                model_voitActionPerformed(evt);
            }
        });
        Ajout_model.add(model_voit, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 270, 50));

        jButton2.setText("Enregistrer");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        Ajout_model.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 150, 40));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("Nom de modèle :");
        Ajout_model.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 130, 50));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("Ajouter Modèle :");
        Ajout_model.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 180, 40));

        affichage.add(Ajout_model, "model");

        Ajout_cat.setBackground(new java.awt.Color(255, 255, 255));
        Ajout_cat.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setText("Ajouter Catégorie :");
        Ajout_cat.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 180, 40));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setText("Nom de Catégorie :");
        Ajout_cat.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 130, 50));

        voit_cat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        voit_cat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voit_catActionPerformed(evt);
            }
        });
        Ajout_cat.add(voit_cat, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 270, 50));

        jButton3.setText("Enregistrer");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        Ajout_cat.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 150, 40));

        affichage.add(Ajout_cat, "cati");

        Ajout_col.setBackground(new java.awt.Color(255, 255, 255));
        Ajout_col.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        color.setText("Valider");
        color.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                colorMouseClicked(evt);
            }
        });
        Ajout_col.add(color, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 300, 50));

        voit_color.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voit_colorActionPerformed(evt);
            }
        });
        Ajout_col.add(voit_color, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 230, 40));

        jLabel195.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel195.setText("Couleur :");
        Ajout_col.add(jLabel195, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, 60));

        affichage.add(Ajout_col, "coleur");

        maint_list.setBackground(new java.awt.Color(255, 255, 255));
        maint_list.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        maint_mod.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        maint_mod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maint_modActionPerformed(evt);
            }
        });
        maint_list.add(maint_mod, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 60, 130, 30));

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setText("Modèle : ");
        maint_list.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 64, 80, 20));

        jScrollPane2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        maint_join.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Immatriculation", "Modèle", "D.début", "D.fin", "D.début", "D.fin", "D.entretien", "KM", "action"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(maint_join);
        if (maint_join.getColumnModel().getColumnCount() > 0) {
            maint_join.getColumnModel().getColumn(0).setResizable(false);
            maint_join.getColumnModel().getColumn(1).setResizable(false);
            maint_join.getColumnModel().getColumn(2).setResizable(false);
            maint_join.getColumnModel().getColumn(3).setResizable(false);
            maint_join.getColumnModel().getColumn(4).setResizable(false);
            maint_join.getColumnModel().getColumn(5).setResizable(false);
            maint_join.getColumnModel().getColumn(6).setResizable(false);
            maint_join.getColumnModel().getColumn(7).setResizable(false);
            maint_join.getColumnModel().getColumn(8).setResizable(false);
            maint_join.getColumnModel().getColumn(9).setResizable(false);
            maint_join.getColumnModel().getColumn(9).setPreferredWidth(80);
        }

        maint_list.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 1170, 500));

        jLabel21.setOpaque(true);
        jLabel21.setBackground(new java.awt.Color(153, 153, 153));
        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Vidange");
        jLabel21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        maint_list.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 110, 240, 40));

        jLabel22.setOpaque(true);
        jLabel22.setBackground(new java.awt.Color(153, 153, 153));
        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Assurance");
        jLabel22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        maint_list.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, 230, 40));

        jLabel23.setOpaque(true);
        jLabel23.setBackground(new java.awt.Color(153, 153, 153));
        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Visite Technique");
        jLabel23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        maint_list.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 110, 230, 40));

        show_maint.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        show_maint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photo/Tableicon/icons8_View_30px.png"))); // NOI18N
        show_maint.setText("Historique");
        show_maint.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        show_maint.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        show_maint.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                show_maintMouseClicked(evt);
            }
        });
        maint_list.add(show_maint, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 20, 60, 70));

        affichage.add(maint_list, "maintlist");

        assurance.setBackground(new java.awt.Color(255, 255, 255));
        assurance.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel24.setText("Assurance : ");
        assurance.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 140, 50));

        assur_mod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assur_modActionPerformed(evt);
            }
        });
        assurance.add(assur_mod, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 90, 110, 30));

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel25.setText("Modéle : ");
        assurance.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 100, -1, -1));

        assur_affich.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Modéle", "Immatriculation"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(assur_affich);
        if (assur_affich.getColumnModel().getColumnCount() > 0) {
            assur_affich.getColumnModel().getColumn(0).setResizable(false);
            assur_affich.getColumnModel().getColumn(0).setPreferredWidth(50);
            assur_affich.getColumnModel().getColumn(1).setResizable(false);
            assur_affich.getColumnModel().getColumn(2).setResizable(false);
        }

        assurance.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 1170, 130));

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel26.setText("N° : ");
        assurance.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, -1, 40));
        assurance.add(num_assur, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, 170, 40));

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel27.setText("Montant : ");
        assurance.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(394, 360, 100, 40));
        assurance.add(assur_montant, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 360, 170, 40));

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel28.setText("Date de début : ");
        assurance.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 450, 130, 40));
        assurance.add(debut_assurance, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 450, 170, 40));
        assurance.add(fin_assurance, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 440, 170, 40));

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel29.setText("Date de fin : ");
        assurance.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(379, 440, 80, 40));

        boton_assur.setText("Enregistrer");
        boton_assur.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_assurMouseClicked(evt);
            }
        });
        assurance.add(boton_assur, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 530, 240, 50));

        affichage.add(assurance, "assurance");

        vidange.setBackground(new java.awt.Color(255, 255, 255));
        vidange.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel35.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel35.setText("Vidange : ");
        vidange.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 70, 50));

        jLabel36.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel36.setText("Modéle : ");
        vidange.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 100, -1, -1));

        vidan_mod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vidan_modActionPerformed(evt);
            }
        });
        vidange.add(vidan_mod, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 90, 130, 30));

        vidan_affi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Modèle", "Immatriculation"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(vidan_affi);
        if (vidan_affi.getColumnModel().getColumnCount() > 0) {
            vidan_affi.getColumnModel().getColumn(0).setResizable(false);
            vidan_affi.getColumnModel().getColumn(0).setPreferredWidth(50);
            vidan_affi.getColumnModel().getColumn(1).setResizable(false);
            vidan_affi.getColumnModel().getColumn(2).setResizable(false);
        }

        vidange.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 1170, 130));
        vidange.add(km_vidange, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, 170, 40));
        vidange.add(vidange_montant, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 360, 170, 40));
        vidange.add(date_entre, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 290, 170, 40));

        jLabel37.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel37.setText("KM : ");
        vidange.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, -1, 40));

        jLabel38.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel38.setText("Date d'entretien : ");
        vidange.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 290, 130, 40));

        jLabel40.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel40.setText("Montant : ");
        vidange.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(394, 360, 100, 40));

        boton_vidange.setText("Enregistrer");
        boton_vidange.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_vidangeMouseClicked(evt);
            }
        });
        vidange.add(boton_vidange, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 460, 240, 50));
        vidange.add(km_new, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 360, 170, 40));

        jLabel41.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel41.setText("KM vidange : ");
        vidange.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 360, -1, 40));

        affichage.add(vidange, "vidange");

        filtre_air.setBackground(new java.awt.Color(255, 255, 255));
        filtre_air.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel39.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel39.setText("Filtre a air : ");
        filtre_air.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 70, 50));

        jLabel42.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel42.setText("Modéle : ");
        filtre_air.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 100, -1, -1));

        air_mod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                air_modActionPerformed(evt);
            }
        });
        filtre_air.add(air_mod, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 90, 120, 30));

        affi_air.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Modèlen", "Immatriculation"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane6.setViewportView(affi_air);
        if (affi_air.getColumnModel().getColumnCount() > 0) {
            affi_air.getColumnModel().getColumn(0).setResizable(false);
            affi_air.getColumnModel().getColumn(0).setPreferredWidth(50);
            affi_air.getColumnModel().getColumn(1).setResizable(false);
            affi_air.getColumnModel().getColumn(2).setResizable(false);
        }

        filtre_air.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 1170, 130));
        filtre_air.add(date_entrefiltre, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 290, 170, 40));

        jLabel43.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel43.setText("Date d'entretien : ");
        filtre_air.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 290, 130, 40));

        jLabel44.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel44.setText("KM : ");
        filtre_air.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, -1, 40));
        filtre_air.add(km_filtreair, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, 170, 40));

        jLabel45.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel45.setText("Montant : ");
        filtre_air.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(394, 360, 100, 40));
        filtre_air.add(filtr_mont, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 360, 170, 40));

        boton_filtreair.setText("Enregistrer");
        boton_filtreair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_filtreairMouseClicked(evt);
            }
        });
        filtre_air.add(boton_filtreair, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 440, 240, 50));

        affichage.add(filtre_air, "filtreair");

        filtre_huile.setBackground(new java.awt.Color(255, 255, 255));
        filtre_huile.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel46.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel46.setText("Filtre a huile : ");
        filtre_huile.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 90, 50));

        jLabel47.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel47.setText("Modéle : ");
        filtre_huile.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 100, -1, -1));

        huile_mod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                huile_modActionPerformed(evt);
            }
        });
        filtre_huile.add(huile_mod, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 90, 140, 30));

        huille_affi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Modèle", "Immatriculation"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane7.setViewportView(huille_affi);
        if (huille_affi.getColumnModel().getColumnCount() > 0) {
            huille_affi.getColumnModel().getColumn(0).setResizable(false);
            huille_affi.getColumnModel().getColumn(0).setPreferredWidth(50);
            huille_affi.getColumnModel().getColumn(1).setResizable(false);
            huille_affi.getColumnModel().getColumn(2).setResizable(false);
        }

        filtre_huile.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 1170, 130));
        filtre_huile.add(date_filtreh, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 290, 170, 40));

        jLabel48.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel48.setText("Date d'entretien : ");
        filtre_huile.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 290, 130, 40));

        jLabel49.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel49.setText("KM : ");
        filtre_huile.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, -1, 40));
        filtre_huile.add(km_filtreh, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, 170, 40));

        jLabel50.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel50.setText("Montant : ");
        filtre_huile.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(394, 360, 100, 40));
        filtre_huile.add(filtreh_montant, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 360, 170, 40));

        boton_filtreh.setText("Enregistrer");
        boton_filtreh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_filtrehMouseClicked(evt);
            }
        });
        filtre_huile.add(boton_filtreh, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 530, 240, 50));

        affichage.add(filtre_huile, "filtreh");

        maint_autre.setBackground(new java.awt.Color(255, 255, 255));
        maint_autre.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel51.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel51.setText("Autre : ");
        maint_autre.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 90, 50));

        jLabel52.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel52.setText("Modéle : ");
        maint_autre.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 100, -1, -1));

        autre_mod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                autre_modActionPerformed(evt);
            }
        });
        maint_autre.add(autre_mod, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 90, 130, 30));

        autre_affi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Modèle", "Immatriculation"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane8.setViewportView(autre_affi);
        if (autre_affi.getColumnModel().getColumnCount() > 0) {
            autre_affi.getColumnModel().getColumn(0).setResizable(false);
            autre_affi.getColumnModel().getColumn(1).setResizable(false);
            autre_affi.getColumnModel().getColumn(2).setResizable(false);
        }

        maint_autre.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 1170, 250));
        maint_autre.add(date_autre, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 410, 170, 40));

        jLabel53.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel53.setText("Date d'entretien : ");
        maint_autre.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 410, 130, 40));
        maint_autre.add(autre_montant, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 410, 170, 40));

        jLabel54.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel54.setText("Remarque : ");
        maint_autre.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 470, 100, 40));
        maint_autre.add(km_autre, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 470, 170, 40));

        jLabel55.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel55.setText("KM : ");
        maint_autre.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 470, -1, 40));

        boton_autremaint.setText("Enregistrer");
        boton_autremaint.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_autremaintMouseClicked(evt);
            }
        });
        maint_autre.add(boton_autremaint, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 590, 240, 50));

        jLabel208.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel208.setText("Montant : ");
        maint_autre.add(jLabel208, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 410, 100, 40));

        autre_remarq.setColumns(20);
        autre_remarq.setRows(5);
        jScrollPane25.setViewportView(autre_remarq);

        maint_autre.add(jScrollPane25, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 470, -1, -1));

        affichage.add(maint_autre, "maintautre");

        list_contrat.setBackground(new java.awt.Color(255, 255, 255));
        list_contrat.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        show_contrat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "D.contrat", "Client", "Tél", "Modele", "Imma", "D.départ", "Heure", "D.retour", "Heure"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        show_contrat.setGridColor(new java.awt.Color(0, 0, 255));
        jScrollPane9.setViewportView(show_contrat);
        if (show_contrat.getColumnModel().getColumnCount() > 0) {
            show_contrat.getColumnModel().getColumn(0).setResizable(false);
            show_contrat.getColumnModel().getColumn(1).setResizable(false);
            show_contrat.getColumnModel().getColumn(2).setResizable(false);
            show_contrat.getColumnModel().getColumn(3).setResizable(false);
            show_contrat.getColumnModel().getColumn(4).setResizable(false);
            show_contrat.getColumnModel().getColumn(5).setResizable(false);
            show_contrat.getColumnModel().getColumn(6).setResizable(false);
            show_contrat.getColumnModel().getColumn(7).setResizable(false);
            show_contrat.getColumnModel().getColumn(8).setResizable(false);
            show_contrat.getColumnModel().getColumn(9).setResizable(false);
        }

        list_contrat.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 1170, 520));

        jLabel56.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(0, 102, 204));
        jLabel56.setText("Liste Contrats");
        list_contrat.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 120, 40));

        jButton4.setText("Contrat Societé");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        list_contrat.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 40, -1, 40));

        jButton6.setText("Contrat Client");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });
        list_contrat.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 40, -1, 40));

        jLabel57.setText(":");
        list_contrat.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10, 30, 40));
        jLabel57.setVisible(false);

        jLabel209.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photo/Tableicon/icons8_Edit_File_30px.png"))); // NOI18N
        jLabel209.setText("Edit");
        jLabel209.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel209.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jLabel209.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel209MouseClicked(evt);
            }
        });
        list_contrat.add(jLabel209, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 60, -1, -1));

        jLabel220.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photo/Tableicon/icons8_Delete_File_30px.png"))); // NOI18N
        jLabel220.setText("Delete");
        jLabel220.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel220.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        list_contrat.add(jLabel220, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 60, -1, -1));

        jLabel237.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photo/Tableicon/icons8_Stack_of_Money_30px.png"))); // NOI18N
        jLabel237.setText("Factiration");
        jLabel237.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel237.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        list_contrat.add(jLabel237, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 60, -1, -1));

        jLabel236.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photo/Tableicon/icons8_Archive_30px.png"))); // NOI18N
        jLabel236.setText("Archive");
        jLabel236.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel236.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        list_contrat.add(jLabel236, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 60, -1, -1));
        list_contrat.add(choose_contrat, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 10, 70, -1));
        choose_contrat.setVisible(false);

        affichage.add(list_contrat, "list_contrat");

        add_contrat.setBackground(new java.awt.Color(255, 255, 255));
        add_contrat.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add_contrat.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 590, 10));

        jLabel58.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel58.setText("Heure : ");
        add_contrat.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, 50, 30));

        jLabel59.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel59.setText("Date départ : ");
        add_contrat.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 90, -1));

        jLabel60.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel60.setText("Date retour : ");
        add_contrat.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 90, -1));

        jLabel61.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel61.setText("Heure : ");
        add_contrat.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, 50, 30));

        contrat_model.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                contrat_modelMouseClicked(evt);
            }
        });
        contrat_model.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contrat_modelActionPerformed(evt);
            }
        });
        add_contrat.add(contrat_model, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 140, 30));

        jLabel62.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel62.setText("Modèle        : ");
        add_contrat.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 90, -1));

        jLabel63.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel63.setText("Immatriculation : ");
        add_contrat.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, 120, -1));

        jLabel64.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel64.setText("Lieu de départ : ");
        add_contrat.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 100, -1));

        lieu_depart.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lieu_departKeyPressed(evt);
            }
        });
        add_contrat.add(lieu_depart, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 140, 30));

        jLabel65.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel65.setText("lieu de retour : ");
        add_contrat.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, 100, -1));
        add_contrat.add(lieu_retour, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 220, 150, 30));

        jLabel66.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel66.setText("KM de départ : ");
        add_contrat.add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 100, -1));
        add_contrat.add(km_dep, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 140, 30));

        jLabel67.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel67.setText("KM de retour : ");
        add_contrat.add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 270, 100, -1));
        add_contrat.add(km_retour, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 270, 150, 30));

        add_contrat.add(contrat_imma, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 170, 140, 30));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        add_contrat.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 40, 10, 540));
        add_contrat.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 40, 590, 10));

        jLabel68.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel68.setForeground(new java.awt.Color(0, 51, 255));
        jLabel68.setText("Paiement");
        add_contrat.add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 90, 20));

        jLabel69.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel69.setText("Montant de la gatantie déposée :");
        add_contrat.add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 200, -1));
        add_contrat.add(montant_gatan, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 350, 90, 30));

        pay_type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ESP", "cart bleu", "chèque" }));
        add_contrat.add(pay_type, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 350, -1, -1));

        jLabel70.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel70.setText("Montant de paiement:");
        add_contrat.add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 200, -1));
        add_contrat.add(montant_pay, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 400, 90, 30));

        type_pay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ESP", "cart bleu", "chèque" }));
        add_contrat.add(type_pay, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 400, -1, -1));

        jLabel71.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel71.setText("Observation:");
        add_contrat.add(jLabel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 490, 120, 30));

        observation.setColumns(20);
        observation.setRows(5);
        jScrollPane10.setViewportView(observation);

        add_contrat.add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 450, -1, 70));

        jLabel72.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel72.setText("Date de paiement:");
        add_contrat.add(jLabel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 200, -1));

        type_iden.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CIN", "Passport", " " }));
        add_contrat.add(type_iden, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 90, 70, 30));

        jLabel73.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel73.setText("N° : ");
        add_contrat.add(jLabel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 90, -1, 30));

        num_identite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num_identiteActionPerformed(evt);
            }
        });
        add_contrat.add(num_identite, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 90, 110, 30));

        jLabel74.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel74.setText("date : ");
        add_contrat.add(jLabel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 90, -1, 30));
        add_contrat.add(identite_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 90, 110, 30));

        jLabel75.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel75.setText("a : ");
        add_contrat.add(jLabel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 90, 30, 30));
        add_contrat.add(lieu_identite, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 90, 120, 30));

        jLabel76.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel76.setText("Nom prénom/societé :");
        add_contrat.add(jLabel76, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 130, -1, 30));
        add_contrat.add(nom_prenom, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 130, 160, 30));

        jLabel77.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel77.setText("Lieu naissance:");
        add_contrat.add(jLabel77, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 180, -1, 30));
        add_contrat.add(tel_client, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 130, 160, 30));

        jLabel78.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel78.setText("Date naissance:");
        add_contrat.add(jLabel78, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 180, -1, 30));
        add_contrat.add(client_naissance, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 180, 160, 30));
        add_contrat.add(client_lieunaiss, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 180, 160, 30));

        jLabel79.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel79.setText("tel:");
        add_contrat.add(jLabel79, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 130, 20, 30));

        jLabel80.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel80.setText("nationalité :");
        add_contrat.add(jLabel80, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 230, -1, 30));
        add_contrat.add(client_nationalite, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 230, 160, 30));

        jLabel81.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel81.setText("Adresse:");
        add_contrat.add(jLabel81, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 230, -1, 30));
        add_contrat.add(client_adresse, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 230, 160, 30));

        copier.setText("copier");
        copier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                copierMouseClicked(evt);
            }
        });
        add_contrat.add(copier, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 280, -1, -1));
        add_contrat.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 310, 590, 10));
        add_contrat.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 590, 10));

        type_identite.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CIN", "Passport", " " }));
        add_contrat.add(type_identite, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 350, 70, 30));

        jLabel82.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel82.setText("N° : ");
        add_contrat.add(jLabel82, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 350, -1, 30));

        identite_num.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                identite_numActionPerformed(evt);
            }
        });
        add_contrat.add(identite_num, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 350, 110, 30));

        jLabel83.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel83.setText("date : ");
        add_contrat.add(jLabel83, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 350, -1, 30));
        add_contrat.add(date_identite, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 350, 110, 30));

        jLabel84.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel84.setText("a : ");
        add_contrat.add(jLabel84, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 350, 30, 30));
        add_contrat.add(identite_lieu, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 350, 120, 30));
        add_contrat.add(prenom_nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 400, 160, 30));

        jLabel85.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel85.setText("Nom prénom/societé :");
        add_contrat.add(jLabel85, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 400, -1, 30));

        jLabel86.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel86.setText("N° permis conduire:");
        add_contrat.add(jLabel86, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 440, -1, 30));
        add_contrat.add(conducteur_permis, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 450, 160, 30));

        jLabel87.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel87.setText("Date:");
        add_contrat.add(jLabel87, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 440, -1, 30));
        add_contrat.add(date_permis, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 440, 160, 40));
        add_contrat.add(lieu_permis, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 500, 160, 30));

        jLabel88.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel88.setText("à :");
        add_contrat.add(jLabel88, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 490, -1, 30));
        add_contrat.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 580, 590, 10));
        add_contrat.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 580, 590, 10));

        jLabel89.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel89.setText("Date de contrat :");
        add_contrat.add(jLabel89, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 110, -1));

        date_contrat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                date_contratActionPerformed(evt);
            }
        });
        add_contrat.add(date_contrat, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 170, 20));

        jLabel90.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel90.setForeground(new java.awt.Color(0, 51, 255));
        jLabel90.setText("Véhicule");
        add_contrat.add(jLabel90, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 44, 160, 20));

        jLabel91.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel91.setForeground(new java.awt.Color(0, 51, 255));
        jLabel91.setText("Locateur/Client");
        add_contrat.add(jLabel91, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 50, 160, 20));

        jLabel92.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel92.setForeground(new java.awt.Color(0, 51, 255));
        jLabel92.setText("Conducteur");
        add_contrat.add(jLabel92, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 320, 90, 20));

        save.setText("Sauvegarder");
        save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveMouseClicked(evt);
            }
        });
        add_contrat.add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 600, 220, 40));
        add_contrat.add(id_contrat, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10, 80, -1));
        id_contrat.setVisible(false);
        add_contrat.add(type_contrat, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 10, 40, -1));
        type_contrat.setVisible(false);

        conducteurtwo.setText("Ajout 2éme conducteur");
        conducteurtwo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                conducteurtwoMouseClicked(evt);
            }
        });
        add_contrat.add(conducteurtwo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 550, -1, -1));
        add_contrat.add(contrat_deb, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 130, -1));
        add_contrat.add(contrat_retour, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 130, -1));

        add_contrat.add(heure_fin, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 120, 100, 30));

        add_contrat.add(heure_dep, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 70, 100, 30));
        add_contrat.add(pai_day, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 450, 120, -1));
        add_contrat.add(id_cond1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 10, 40, -1));
        id_cond1.setVisible(false);
        add_contrat.add(id_cond2, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 10, 50, -1));
        id_cond2.setVisible(false);

        affichage.add(add_contrat, "ajout_contrat");

        contrat_archive.setBackground(new java.awt.Color(255, 255, 255));
        contrat_archive.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel93.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel93.setText("Imprimer");
        contrat_archive.add(jLabel93, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 80, 40));

        jLabel57.setOpaque(true);
        jLabel94.setBackground(new java.awt.Color(153, 153, 153));
        jLabel94.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel94.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel94.setText("Voiture");
        jLabel94.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        contrat_archive.add(jLabel94, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 80, 230, 40));

        archive_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "D.contrat", "Client", "Tél", "Modele", "Imma", "D.départ", "Heure", "D.retour", "Heure", "Action"
            }
        ));
        archive_table.setGridColor(new java.awt.Color(0, 0, 255));
        jScrollPane11.setViewportView(archive_table);

        contrat_archive.add(jScrollPane11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 1170, 520));

        affichage.add(contrat_archive, "contrat_archive");

        reserv_list.setBackground(new java.awt.Color(255, 255, 255));
        reserv_list.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel57.setOpaque(true);
        jLabel96.setBackground(new java.awt.Color(153, 153, 153));
        jLabel96.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel96.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel96.setText("Voiture");
        jLabel96.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        reserv_list.add(jLabel96, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 80, 230, 40));

        jTable10.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "D.Réser", "Client", "Tél", "Modele", "Imma", "D.départ", "Heure", "D.retour", "Heure", "Action"
            }
        ));
        jTable10.setGridColor(new java.awt.Color(0, 0, 255));
        jScrollPane12.setViewportView(jTable10);

        reserv_list.add(jScrollPane12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 1170, 530));

        jLabel111.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel111.setText("Liste Réservation :");
        reserv_list.add(jLabel111, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 24, 150, 20));

        affichage.add(reserv_list, "reserv_list");

        add_reserv.setBackground(new java.awt.Color(255, 255, 255));
        add_reserv.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel102.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel102.setForeground(new java.awt.Color(0, 51, 204));
        jLabel102.setText("Locateur :");
        add_reserv.add(jLabel102, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 80, -1));

        date_reserv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                date_reservActionPerformed(evt);
            }
        });
        add_reserv.add(date_reserv, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 170, 40));

        jLabel95.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel95.setText("Date départ : ");
        add_reserv.add(jLabel95, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 90, -1));
        add_reserv.add(dep_reserv, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 140, 30));

        jLabel97.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel97.setText("Heure : ");
        add_reserv.add(jLabel97, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, 50, 30));

        add_reserv.add(heure_depreserv, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 140, 90, 30));

        jLabel98.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel98.setText("Date retour : ");
        add_reserv.add(jLabel98, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 90, -1));
        add_reserv.add(retour_reservation, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 140, 30));

        jLabel99.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel99.setText("Heure : ");
        add_reserv.add(jLabel99, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, 50, 30));

        add_reserv.add(heure_retourreserv, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 200, 90, 30));

        jLabel100.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel100.setText("Modèle        : ");
        add_reserv.add(jLabel100, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 90, -1));

        add_reserv.add(model_reserv, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 140, 30));

        jLabel101.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel101.setText("Immatriculation : ");
        add_reserv.add(jLabel101, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, 110, -1));

        add_reserv.add(imma_reserv, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 250, 140, 30));
        add_reserv.add(nomprenom_reserv, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, 160, 30));

        jLabel103.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel103.setText("Nom prénom/societé :");
        add_reserv.add(jLabel103, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, -1, 30));

        jLabel104.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel104.setText("tel:");
        add_reserv.add(jLabel104, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 350, 20, 30));
        add_reserv.add(reserv_tel, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 350, 160, 30));
        add_reserv.add(adresse_reserv, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 400, 160, 30));

        jLabel105.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel105.setText("Adresse:");
        add_reserv.add(jLabel105, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 400, -1, 30));
        add_reserv.add(email_reserv, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 410, 160, 30));

        jLabel106.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel106.setText("Remarque :");
        add_reserv.add(jLabel106, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 500, 100, 30));

        remarq_reserv.setColumns(20);
        remarq_reserv.setRows(5);
        jScrollPane13.setViewportView(remarq_reserv);

        add_reserv.add(jScrollPane13, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 470, -1, 70));

        jLabel107.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel107.setText("E-mail :");
        add_reserv.add(jLabel107, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, 80, 30));
        add_reserv.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 1170, 10));
        add_reserv.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1170, 10));

        jLabel108.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel108.setText("Date de contrat :");
        add_reserv.add(jLabel108, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 110, -1));

        jLabel109.setOpaque(true);
        jLabel109.setBackground(new java.awt.Color(255, 255, 255));
        jLabel109.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel109.setText("Ajouter Réservation :");
        add_reserv.add(jLabel109, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 180, 20));

        jLabel109.setOpaque(true);
        jLabel110.setBackground(new java.awt.Color(255, 255, 255));
        jLabel110.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel110.setForeground(new java.awt.Color(0, 51, 204));
        jLabel110.setText("Réservation :");
        add_reserv.add(jLabel110, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 110, 20));

        save_reserv.setText("Enregistrer");
        add_reserv.add(save_reserv, new org.netbeans.lib.awtextra.AbsoluteConstraints(473, 563, 190, 50));

        affichage.add(add_reserv, "add_reserv");

        company_list.setBackground(new java.awt.Color(255, 255, 255));
        company_list.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel112.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel112.setText("Liste societé : ");
        company_list.add(jLabel112, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 120, 30));

        list_societe.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "societé", "tél", "E-mail"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane14.setViewportView(list_societe);
        if (list_societe.getColumnModel().getColumnCount() > 0) {
            list_societe.getColumnModel().getColumn(0).setResizable(false);
            list_societe.getColumnModel().getColumn(1).setResizable(false);
            list_societe.getColumnModel().getColumn(2).setResizable(false);
            list_societe.getColumnModel().getColumn(3).setResizable(false);
        }

        company_list.add(jScrollPane14, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 120, 1170, 530));

        societi_delete.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        societi_delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photo/Tableicon/icons8_Delete_File_30px.png"))); // NOI18N
        societi_delete.setText("Delete");
        societi_delete.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        societi_delete.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        societi_delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                societi_deleteMouseClicked(evt);
            }
        });
        company_list.add(societi_delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 30, 40, 70));

        societi_histo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        societi_histo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photo/Tableicon/icons8_View_30px.png"))); // NOI18N
        societi_histo.setText("Historique");
        societi_histo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        societi_histo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        societi_histo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                societi_histoMouseClicked(evt);
            }
        });
        company_list.add(societi_histo, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 30, 60, 70));

        societi_edit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        societi_edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photo/Tableicon/icons8_Edit_File_30px.png"))); // NOI18N
        societi_edit.setText("Edit");
        societi_edit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        societi_edit.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        societi_edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                societi_editMouseClicked(evt);
            }
        });
        company_list.add(societi_edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 30, 40, 70));

        societi_contrat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        societi_contrat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photo/Tableicon/icons8_Handshake_30px_2.png"))); // NOI18N
        societi_contrat.setText("Ajout Contrat");
        societi_contrat.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        societi_contrat.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        societi_contrat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                societi_contratMouseClicked(evt);
            }
        });
        company_list.add(societi_contrat, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 30, 90, 70));

        affichage.add(company_list, "societe_list");

        add_societe.setBackground(new java.awt.Color(255, 255, 255));
        add_societe.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel113.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel113.setText("Nom de la societé :");
        add_societe.add(jLabel113, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 120, 30));
        add_societe.add(societe_nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, 160, 30));
        add_societe.add(societe_tel, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 170, 160, 30));

        jLabel114.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel114.setText("Adresse:");
        add_societe.add(jLabel114, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 230, 60, 30));

        jLabel115.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel115.setText("E-mail :");
        add_societe.add(jLabel115, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, 80, 30));
        add_societe.add(societe_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, 160, 30));
        add_societe.add(societe_adresse, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 230, 160, 30));

        jLabel116.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel116.setText("Ajouter Societé : ");
        add_societe.add(jLabel116, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 150, 30));
        add_societe.add(societe_fiscal, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 280, 160, 30));

        jLabel117.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel117.setText("Matricule fiscale:");
        add_societe.add(jLabel117, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 130, 30));

        jLabel118.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel118.setText("tel:");
        add_societe.add(jLabel118, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 170, 20, 30));

        save_societe.setText("Enregistrer");
        save_societe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                save_societeMouseClicked(evt);
            }
        });
        add_societe.add(save_societe, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 400, 180, 40));
        add_societe.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 1170, 10));
        add_societe.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 92, 1170, 10));

        affichage.add(add_societe, "add_societe");

        client_list.setBackground(new java.awt.Color(255, 255, 255));
        client_list.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane15.setBackground(new java.awt.Color(255, 255, 255));

        client_affi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nom&prénom", "Tél", "E-mail"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane15.setViewportView(client_affi);
        if (client_affi.getColumnModel().getColumnCount() > 0) {
            client_affi.getColumnModel().getColumn(0).setResizable(false);
            client_affi.getColumnModel().getColumn(1).setResizable(false);
            client_affi.getColumnModel().getColumn(2).setResizable(false);
            client_affi.getColumnModel().getColumn(3).setResizable(false);
        }

        client_list.add(jScrollPane15, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 100, 1170, 550));

        jLabel119.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel119.setText("Liste client : ");
        client_list.add(jLabel119, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 110, 40));

        client_delete.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        client_delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photo/Tableicon/icons8_Delete_File_30px.png"))); // NOI18N
        client_delete.setText("Delete");
        client_delete.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        client_delete.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        client_delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                client_deleteMouseClicked(evt);
            }
        });
        client_list.add(client_delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 30, 40, 70));

        client_edit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        client_edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photo/Tableicon/icons8_Edit_File_30px.png"))); // NOI18N
        client_edit.setText("Edit");
        client_edit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        client_edit.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        client_edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                client_editMouseClicked(evt);
            }
        });
        client_list.add(client_edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 30, 40, 70));

        client_contrat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        client_contrat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photo/Tableicon/icons8_Handshake_30px_2.png"))); // NOI18N
        client_contrat.setText("Ajout Contrat");
        client_contrat.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        client_contrat.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        client_contrat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                client_contratMouseClicked(evt);
            }
        });
        client_list.add(client_contrat, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 30, 90, 70));

        client_histo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        client_histo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photo/Tableicon/icons8_View_30px.png"))); // NOI18N
        client_histo.setText("Historique");
        client_histo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        client_histo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        client_histo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                client_histoMouseClicked(evt);
            }
        });
        client_list.add(client_histo, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 30, 60, 70));

        affichage.add(client_list, "list_client");

        add_client.setBackground(new java.awt.Color(255, 255, 255));
        add_client.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        client_type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CIN", "Passport", " " }));
        add_client.add(client_type, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 70, 30));

        jLabel120.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel120.setText("N° : ");
        add_client.add(jLabel120, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, -1, 30));
        add_client.add(client_num, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, 110, 30));

        jLabel121.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel121.setText("Délivré le  : ");
        add_client.add(jLabel121, new org.netbeans.lib.awtextra.AbsoluteConstraints(471, 110, 80, 30));
        add_client.add(client_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 110, 110, 30));

        jLabel122.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel122.setText("a : ");
        add_client.add(jLabel122, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 110, 30, 30));
        add_client.add(client_lieu_identite, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 110, 120, 30));

        jLabel123.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel123.setText("Nom prénom:");
        add_client.add(jLabel123, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 90, 30));
        add_client.add(client_nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, 160, 30));

        jLabel124.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel124.setText("tel :");
        add_client.add(jLabel124, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 170, 30, 30));
        add_client.add(client_tel, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 170, 160, 30));

        jLabel125.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel125.setText("Date naissance:");
        add_client.add(jLabel125, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, -1, 30));
        add_client.add(client_naiss, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, 160, 30));

        jLabel126.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel126.setText("Lieu naissance:");
        add_client.add(jLabel126, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 210, -1, 30));

        client_lieu_naiss.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                client_lieu_naissActionPerformed(evt);
            }
        });
        add_client.add(client_lieu_naiss, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 210, 160, 30));

        jLabel127.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel127.setText("nationalité :");
        add_client.add(jLabel127, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 70, 30));
        add_client.add(natinalite_client, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, 160, 30));

        jLabel128.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel128.setText("Adresse:");
        add_client.add(jLabel128, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 250, -1, 30));
        add_client.add(adresse_client, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 250, 160, 30));
        add_client.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 1180, 10));
        add_client.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 1180, 10));

        jLabel129.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel129.setText("Ajouter client");
        add_client.add(jLabel129, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 110, 40));
        add_client.add(email_client, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 290, 160, 30));

        jLabel130.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel130.setText("E-mail :");
        add_client.add(jLabel130, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, -1, 30));

        save_client.setText("Enregistrer");
        save_client.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                save_clientMouseClicked(evt);
            }
        });
        add_client.add(save_client, new org.netbeans.lib.awtextra.AbsoluteConstraints(433, 390, 200, 50));

        affichage.add(add_client, "add_client");

        facturation.setBackground(new java.awt.Color(255, 255, 255));
        facturation.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable12.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "D.facture", "client", "Débit", "Action"
            }
        ));
        jScrollPane16.setViewportView(jTable12);

        facturation.add(jScrollPane16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 1170, 500));

        jLabel131.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel131.setText("Liste facture");
        facturation.add(jLabel131, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 90, 30));

        affichage.add(facturation, "list_fact");

        list_paiement.setBackground(new java.awt.Color(255, 255, 255));
        list_paiement.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable13.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Date", "N° Contrat", "Client", "Montant", "Action"
            }
        ));
        jScrollPane17.setViewportView(jTable13);

        list_paiement.add(jScrollPane17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 1170, 90));

        jLabel132.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel132.setText("Liste paiement : ");
        list_paiement.add(jLabel132, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 150, 30));
        list_paiement.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 490, -1, -1));

        affichage.add(list_paiement, "list_pai");

        add_pai.setBackground(new java.awt.Color(255, 255, 255));
        add_pai.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel133.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel133.setText("Contrat:");
        add_pai.add(jLabel133, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 210, 60, -1));
        add_pai.add(num_cheque, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 150, 110, -1));

        jLabel134.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel134.setText("Montant de paiement:");
        add_pai.add(jLabel134, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 150, 140, -1));
        add_pai.add(pai_mont, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 150, 100, -1));

        jLabel135.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel135.setText("Date de paiement:");
        add_pai.add(jLabel135, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 150, 120, -1));
        add_pai.add(date_pai, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 150, 110, -1));

        add_pai.add(type_pay1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, -1, -1));

        paiement_type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ESP", "cart bleu", "chèque" }));
        add_pai.add(paiement_type, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, -1, -1));

        type_identite1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        add_pai.add(type_identite1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 210, 70, -1));

        jLabel136.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel136.setText("N° chèque/ticket:");
        add_pai.add(jLabel136, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, 120, -1));

        jLabel137.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel137.setText("Client:");
        add_pai.add(jLabel137, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, 40, -1));
        add_pai.add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 1170, 10));
        add_pai.add(jSeparator15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 92, 1170, 10));

        jLabel138.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel138.setText("Ajouter Paiement :");
        add_pai.add(jLabel138, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 150, 30));

        jButton5.setText("Enregistrer");
        add_pai.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(453, 280, 190, 40));

        affichage.add(add_pai, "add_pai");

        finan_reccet.setBackground(new java.awt.Color(255, 255, 255));
        finan_reccet.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel139.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel139.setText("Date Debut :");
        finan_reccet.add(jLabel139, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, 80, -1));
        finan_reccet.add(deb_rech, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, 140, -1));

        jLabel140.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel140.setText("Date fin :");
        finan_reccet.add(jLabel140, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 60, 60, -1));
        finan_reccet.add(fin_rech, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 60, 140, -1));

        jLabel141.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel141.setText("Modéle:");
        finan_reccet.add(jLabel141, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 60, 50, -1));

        finan_reccet.add(model_rech, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 60, 100, -1));

        recherche_recette.setText("Recherche");
        recherche_recette.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recherche_recetteActionPerformed(evt);
            }
        });
        finan_reccet.add(recherche_recette, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 120, -1, -1));
        finan_reccet.add(jSeparator16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 1170, 10));
        finan_reccet.add(jSeparator17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1170, 10));

        recette_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N° Contrat", "Client", "Modele", "Immatriculation", "Montant", "Action"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane18.setViewportView(recette_table);
        if (recette_table.getColumnModel().getColumnCount() > 0) {
            recette_table.getColumnModel().getColumn(4).setHeaderValue("Montant");
            recette_table.getColumnModel().getColumn(5).setHeaderValue("Action");
        }

        finan_reccet.add(jScrollPane18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 1170, 320));

        total_recette.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        finan_reccet.add(total_recette, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 610, 180, 30));

        jLabel144.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel144.setText("Total");
        jLabel144.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        finan_reccet.add(jLabel144, new org.netbeans.lib.awtextra.AbsoluteConstraints(746, 610, 180, 30));

        jLabel145.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel145.setForeground(new java.awt.Color(0, 51, 204));
        jLabel145.setText("Rapport Journalier de Recettes et Versements : ");
        finan_reccet.add(jLabel145, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 390, 30));

        jLabel146.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel146.setForeground(new java.awt.Color(0, 51, 204));
        jLabel146.setText("Recette : ");
        finan_reccet.add(jLabel146, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 110, 30));

        jLabel165.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel165.setForeground(new java.awt.Color(0, 51, 204));
        jLabel165.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photo/icons8_Print_48px.png"))); // NOI18N
        jLabel165.setText("Imprimer");
        finan_reccet.add(jLabel165, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 180, 140, 60));

        affichage.add(finan_reccet, "fin_rec");

        recette_voiture.setBackground(new java.awt.Color(255, 255, 255));
        recette_voiture.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel143.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel143.setText("Date Debut :");
        recette_voiture.add(jLabel143, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 80, -1));
        recette_voiture.add(deb_rech_voi, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, 140, -1));

        jLabel147.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel147.setText("Date fin :");
        recette_voiture.add(jLabel147, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 100, 60, -1));
        recette_voiture.add(fin_rech_voi, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 100, 140, -1));

        jLabel148.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel148.setText("Modéle:");
        recette_voiture.add(jLabel148, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 100, 50, -1));

        recette_voiture.add(model_rech_voi, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 100, 100, -1));

        recherche_voit.setText("Recherche");
        recherche_voit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recherche_voitActionPerformed(evt);
            }
        });
        recette_voiture.add(recherche_voit, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 160, -1, -1));
        recette_voiture.add(jSeparator19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 1170, 10));

        jLabel149.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel149.setForeground(new java.awt.Color(0, 51, 204));
        jLabel149.setText("Recette par voiture : ");
        recette_voiture.add(jLabel149, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 170, 30));

        recette_tvoit_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Modele", "Immatriculation", "Montant", "Action"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane19.setViewportView(recette_tvoit_table);

        recette_voiture.add(jScrollPane19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 1170, 400));
        recette_voiture.add(jSeparator18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1170, 10));

        jLabel150.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel150.setForeground(new java.awt.Color(0, 51, 204));
        jLabel150.setText("Recette : ");
        recette_voiture.add(jLabel150, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 110, 30));

        jLabel151.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel151.setForeground(new java.awt.Color(0, 51, 204));
        jLabel151.setText("Recherche : ");
        recette_voiture.add(jLabel151, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 110, 30));

        affichage.add(recette_voiture, "rec_voiture");

        voiture_deponse.setBackground(new java.awt.Color(255, 255, 255));
        voiture_deponse.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel152.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel152.setForeground(new java.awt.Color(0, 51, 204));
        jLabel152.setText("Recherche : ");
        voiture_deponse.add(jLabel152, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 120, 40));

        jLabel153.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel153.setText("Date Debut :");
        voiture_deponse.add(jLabel153, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, 80, -1));
        voiture_deponse.add(deb_voi, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, 140, -1));

        jLabel154.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel154.setText("Date fin :");
        voiture_deponse.add(jLabel154, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 50, 60, -1));
        voiture_deponse.add(fin_voi, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 50, 140, -1));

        jLabel155.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel155.setText("Modéle:");
        voiture_deponse.add(jLabel155, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 50, 50, -1));

        voiture_deponse.add(model_voi, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 50, 100, -1));

        rech_voi.setText("Recherche");
        rech_voi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rech_voiActionPerformed(evt);
            }
        });
        voiture_deponse.add(rech_voi, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 110, -1, -1));

        jLabel156.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel156.setForeground(new java.awt.Color(0, 51, 204));
        jLabel156.setText("Dépense voiture : ");
        voiture_deponse.add(jLabel156, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 150, 30));

        depense_voit.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Modele", "Immatriculation", "Montant", "Action"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane20.setViewportView(depense_voit);

        voiture_deponse.add(jScrollPane20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 1170, 340));

        jLabel157.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel157.setText("Total");
        jLabel157.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        voiture_deponse.add(jLabel157, new org.netbeans.lib.awtextra.AbsoluteConstraints(746, 610, 180, 30));

        total_depense.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        voiture_deponse.add(total_depense, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 610, 180, 30));
        voiture_deponse.add(jSeparator20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 1170, 10));
        voiture_deponse.add(jSeparator21, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 1080, 10));

        jLabel164.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel164.setForeground(new java.awt.Color(0, 51, 204));
        jLabel164.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photo/icons8_Print_48px.png"))); // NOI18N
        jLabel164.setText("Imprimer");
        voiture_deponse.add(jLabel164, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 160, 140, 60));

        affichage.add(voiture_deponse, "voit_dep");

        bereau_depense.setBackground(new java.awt.Color(255, 255, 255));
        bereau_depense.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        bereau_depense.add(jSeparator22, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 1080, 10));

        jLabel158.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel158.setForeground(new java.awt.Color(0, 51, 204));
        jLabel158.setText("Recherche : ");
        bereau_depense.add(jLabel158, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 110, 40));
        bereau_depense.add(deb_bereau, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 60, 140, -1));

        jLabel159.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel159.setText("Date Debut :");
        bereau_depense.add(jLabel159, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, 80, -1));

        jLabel160.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel160.setText("Date fin :");
        bereau_depense.add(jLabel160, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 60, 60, -1));
        bereau_depense.add(fin_bereau, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 60, 140, -1));

        rech_bereau.setText("Recherche");
        rech_bereau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rech_bereauActionPerformed(evt);
            }
        });
        bereau_depense.add(rech_bereau, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 120, -1, -1));
        bereau_depense.add(jSeparator23, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 1170, 10));

        jLabel161.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel161.setForeground(new java.awt.Color(0, 51, 204));
        jLabel161.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photo/icons8_Print_48px.png"))); // NOI18N
        jLabel161.setText("Imprimer");
        bereau_depense.add(jLabel161, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 170, 140, 60));

        depense_bereau.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Montant", "Remarque", "Action"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane21.setViewportView(depense_bereau);

        bereau_depense.add(jScrollPane21, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 1170, 340));

        jLabel162.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel162.setText("Total");
        jLabel162.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        bereau_depense.add(jLabel162, new org.netbeans.lib.awtextra.AbsoluteConstraints(746, 610, 180, 30));

        total_depense_bereau.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        bereau_depense.add(total_depense_bereau, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 610, 180, 30));

        jLabel163.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel163.setForeground(new java.awt.Color(0, 51, 204));
        jLabel163.setText("Dépense bereau : ");
        bereau_depense.add(jLabel163, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 150, 30));

        ajout_bereau.setText("Ajouter");
        bereau_depense.add(ajout_bereau, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 190, 190, 40));

        affichage.add(bereau_depense, "dep_ber");

        caisse_sortie.setBackground(new java.awt.Color(255, 255, 255));
        caisse_sortie.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel166.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel166.setForeground(new java.awt.Color(0, 51, 204));
        jLabel166.setText("Recherche : ");
        caisse_sortie.add(jLabel166, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 110, 40));
        caisse_sortie.add(jSeparator24, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 1080, 10));
        caisse_sortie.add(deb_sortie, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 60, 140, -1));

        jLabel167.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel167.setText("Date Debut :");
        caisse_sortie.add(jLabel167, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, 80, -1));

        jLabel168.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel168.setText("Date fin :");
        caisse_sortie.add(jLabel168, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 60, 60, -1));
        caisse_sortie.add(fin_sortie, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 60, 140, -1));

        rech_sortie.setText("Recherche");
        rech_sortie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rech_sortieActionPerformed(evt);
            }
        });
        caisse_sortie.add(rech_sortie, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 120, -1, -1));
        caisse_sortie.add(jSeparator25, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 1170, 10));

        jLabel169.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel169.setForeground(new java.awt.Color(0, 51, 204));
        jLabel169.setText("Sortie caisse : ");
        caisse_sortie.add(jLabel169, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 150, 30));

        sortie_list.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Montant", "Remarque", "Action"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane22.setViewportView(sortie_list);

        caisse_sortie.add(jScrollPane22, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 1170, 340));

        impri_sortie.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        impri_sortie.setForeground(new java.awt.Color(0, 51, 204));
        impri_sortie.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photo/icons8_Print_48px.png"))); // NOI18N
        impri_sortie.setText("Imprimer");
        caisse_sortie.add(impri_sortie, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 170, 140, 60));

        jLabel171.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel171.setText("Total");
        jLabel171.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        caisse_sortie.add(jLabel171, new org.netbeans.lib.awtextra.AbsoluteConstraints(746, 610, 180, 30));

        total_sortie.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        caisse_sortie.add(total_sortie, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 610, 180, 30));

        ajout_sortie.setText("Ajouter");
        caisse_sortie.add(ajout_sortie, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 190, 190, 40));

        affichage.add(caisse_sortie, "caisse_sortie");

        caisse_autre.setBackground(new java.awt.Color(255, 255, 255));
        caisse_autre.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel170.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel170.setForeground(new java.awt.Color(0, 51, 204));
        jLabel170.setText("Recherche : ");
        caisse_autre.add(jLabel170, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 110, 40));
        caisse_autre.add(jSeparator26, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 1080, 10));

        jLabel172.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel172.setText("Date Debut :");
        caisse_autre.add(jLabel172, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, 80, -1));
        caisse_autre.add(deb_autre, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 60, 140, -1));

        jLabel173.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel173.setText("Date fin :");
        caisse_autre.add(jLabel173, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 60, 60, -1));
        caisse_autre.add(fin_autre, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 60, 140, -1));

        rech_autre.setText("Recherche");
        rech_autre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rech_autreActionPerformed(evt);
            }
        });
        caisse_autre.add(rech_autre, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 120, -1, -1));
        caisse_autre.add(jSeparator27, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 1170, 10));

        impri_autre.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        impri_autre.setForeground(new java.awt.Color(0, 51, 204));
        impri_autre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photo/icons8_Print_48px.png"))); // NOI18N
        impri_autre.setText("Imprimer");
        caisse_autre.add(impri_autre, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 170, 140, 60));

        jLabel174.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel174.setForeground(new java.awt.Color(0, 51, 204));
        jLabel174.setText("caisse : ");
        caisse_autre.add(jLabel174, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 150, 30));

        autre_list.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Montant", "Remarque", "Action"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane23.setViewportView(autre_list);

        caisse_autre.add(jScrollPane23, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 1170, 340));

        jLabel175.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel175.setText("Total");
        jLabel175.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        caisse_autre.add(jLabel175, new org.netbeans.lib.awtextra.AbsoluteConstraints(746, 610, 180, 30));

        total_autre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        caisse_autre.add(total_autre, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 610, 180, 30));

        ajout_autre.setText("Ajouter");
        caisse_autre.add(ajout_autre, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 190, 190, 40));

        affichage.add(caisse_autre, "caiss_autr");

        tot_caisse.setBackground(new java.awt.Color(255, 255, 255));
        tot_caisse.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel176.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel176.setForeground(new java.awt.Color(0, 51, 204));
        jLabel176.setText("Recherche : ");
        tot_caisse.add(jLabel176, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 40));
        tot_caisse.add(jSeparator28, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 1090, 10));
        tot_caisse.add(deb_caisse, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 60, 140, -1));

        jLabel177.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel177.setText("Date Debut :");
        tot_caisse.add(jLabel177, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, 80, -1));

        jLabel178.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel178.setText("Date fin :");
        tot_caisse.add(jLabel178, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 60, 60, -1));
        tot_caisse.add(fin_caisse, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 60, 140, -1));

        rech_caisse.setText("Recherche");
        rech_caisse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rech_caisseActionPerformed(evt);
            }
        });
        tot_caisse.add(rech_caisse, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 120, 170, -1));
        tot_caisse.add(jSeparator29, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 1170, 10));

        impri_caisse.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        impri_caisse.setForeground(new java.awt.Color(0, 51, 204));
        impri_caisse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photo/icons8_Print_48px.png"))); // NOI18N
        impri_caisse.setText("Imprimer");
        tot_caisse.add(impri_caisse, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 170, 140, 60));

        caisse_list.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "T.recettes", "T.cautionnement", "Autre Recette", "Dépense voiture", "T.retour cautionnement", "T.dépense bereau", "T.sortie caisse"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane24.setViewportView(caisse_list);

        tot_caisse.add(jScrollPane24, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 1170, 300));

        revenus.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        revenus.setForeground(new java.awt.Color(0, 51, 204));
        tot_caisse.add(revenus, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, 200, 30));

        jLabel180.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel180.setText("Total");
        jLabel180.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tot_caisse.add(jLabel180, new org.netbeans.lib.awtextra.AbsoluteConstraints(746, 610, 180, 30));

        total_caisse.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tot_caisse.add(total_caisse, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 610, 180, 30));

        jLabel181.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel181.setForeground(new java.awt.Color(0, 51, 204));
        jLabel181.setText("caisse : ");
        tot_caisse.add(jLabel181, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 150, 30));

        jLabel182.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel182.setForeground(new java.awt.Color(0, 51, 204));
        jLabel182.setText("Revenus définitis due avant : ");
        tot_caisse.add(jLabel182, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 240, 30));

        affichage.add(tot_caisse, "tot_caisse");

        admin_pass.setBackground(new java.awt.Color(255, 255, 255));
        admin_pass.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel179.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel179.setText("Modifier le Mot de passe");
        admin_pass.add(jLabel179, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 280, -1));
        admin_pass.add(login_admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, 140, -1));

        jLabel183.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel183.setText("Mot de passe actiuel :");
        admin_pass.add(jLabel183, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 140, -1));
        admin_pass.add(actual_motpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, 140, -1));

        jLabel184.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel184.setText("Nouceau mot de passe :");
        admin_pass.add(jLabel184, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 150, -1));
        admin_pass.add(new_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, 140, -1));

        jLabel185.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel185.setText("Confirmé le nouveau mot de passe :");
        admin_pass.add(jLabel185, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 240, -1));
        admin_pass.add(confirm_new, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, 140, -1));

        edit_utilisateur.setText("Valider");
        admin_pass.add(edit_utilisateur, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 320, 230, 40));

        jLabel186.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel186.setForeground(new java.awt.Color(0, 51, 255));
        jLabel186.setText("Utilisateur");
        admin_pass.add(jLabel186, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 62, 80, 30));
        admin_pass.add(jSeparator30, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 1170, 10));
        admin_pass.add(jSeparator31, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 1080, 10));

        jLabel187.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel187.setText("Login :");
        admin_pass.add(jLabel187, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 80, -1));

        affichage.add(admin_pass, "admin_pass");

        comany_edit.setBackground(new java.awt.Color(255, 255, 255));
        comany_edit.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel142.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel142.setForeground(new java.awt.Color(0, 51, 204));
        jLabel142.setText("Info :");
        comany_edit.add(jLabel142, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 40, 40));
        comany_edit.add(name_company, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 160, 30));

        jLabel188.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel188.setText("tel:");
        comany_edit.add(jLabel188, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 20, 30));

        jLabel189.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel189.setText("E-mail :");
        comany_edit.add(jLabel189, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 80, 30));
        comany_edit.add(email_company, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, 160, 30));

        jLabel190.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel190.setText("Adresse:");
        comany_edit.add(jLabel190, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 60, 30));
        comany_edit.add(adresse_company, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 160, 30));

        jLabel191.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel191.setText("GSM:");
        comany_edit.add(jLabel191, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 170, 130, 30));
        comany_edit.add(gsm_company, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 170, 160, 30));
        comany_edit.add(tel_company, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 160, 30));

        jLabel192.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel192.setText("fax:");
        comany_edit.add(jLabel192, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, 30));
        comany_edit.add(fax_company, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, 160, 30));

        jLabel193.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel193.setText("Matricule fiscale:");
        comany_edit.add(jLabel193, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 220, 130, 30));
        comany_edit.add(matricule_company, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 220, 160, 30));

        edit_company.setText("Valider");
        comany_edit.add(edit_company, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 393, 230, 40));

        jLabel194.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel194.setText("Nom de la societé :");
        comany_edit.add(jLabel194, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 120, 30));
        comany_edit.add(jSeparator32, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 1170, 10));
        comany_edit.add(jSeparator33, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 1120, 10));

        affichage.add(comany_edit, "company_edit");

        edit_voit.setBackground(new java.awt.Color(255, 255, 255));
        edit_voit.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel196.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel196.setText("Update véhicule :");
        edit_voit.add(jLabel196, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 120, 40));

        jLabel197.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel197.setText("Immatriculation : ");
        edit_voit.add(jLabel197, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 120, 30));
        edit_voit.add(upd_immat, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 200, 30));

        jLabel198.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel198.setText("N° carte gris     :");
        edit_voit.add(jLabel198, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 110, 30));
        edit_voit.add(upd_gris, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 200, 30));

        jLabel199.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel199.setText("Nbre de place    : ");
        edit_voit.add(jLabel199, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 120, 30));
        edit_voit.add(upd_nbr, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 200, 30));

        jLabel200.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel200.setText("Catégorie          : ");
        edit_voit.add(jLabel200, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 120, 30));

        upd_cat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        edit_voit.add(upd_cat, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, 120, 30));

        jLabel201.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel201.setText("Climatisé           : ");
        edit_voit.add(jLabel201, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 120, 30));

        upd_climatise.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Oui", "Non" }));
        edit_voit.add(upd_climatise, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, -1, 30));

        jLabel202.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel202.setText("Date de mis en circulation    : ");
        edit_voit.add(jLabel202, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 200, 30));
        edit_voit.add(upd_circu, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 350, 200, 30));
        edit_voit.add(upd_km, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 300, 200, 30));

        jLabel203.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel203.setText("KM                    :");
        edit_voit.add(jLabel203, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 300, 120, 30));

        jLabel204.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel204.setText("Couleur            : ");
        edit_voit.add(jLabel204, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 250, 130, 30));

        edit_voit.add(upd_color, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 250, 150, 30));
        edit_voit.add(upd_puiss, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 200, 200, 30));

        jLabel205.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel205.setText("Puissance         :");
        edit_voit.add(jLabel205, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 200, 110, 30));
        edit_voit.add(upd_chasis, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 160, 200, 30));

        jLabel206.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel206.setText("N° chassis        : ");
        edit_voit.add(jLabel206, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 160, 120, 30));

        jLabel207.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel207.setText("Modèle             : ");
        edit_voit.add(jLabel207, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 110, 140, 30));

        edit_voit.add(upd_model, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 110, 140, 30));

        voit_upd.setBackground(new java.awt.Color(153, 153, 153));
        voit_upd.setText("Enregistrer");
        voit_upd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                voit_updMouseClicked(evt);
            }
        });
        edit_voit.add(voit_upd, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 460, 230, 50));
        edit_voit.add(upd_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 30, -1));
        upd_id.setVisible(false);

        affichage.add(edit_voit, "edit_voit");

        type_maint.setBackground(new java.awt.Color(255, 255, 255));
        type_maint.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        assur_show.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N°", "D.debut", "D.fin", "Montant", "action"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        assur_show.setPreferredSize(new java.awt.Dimension(350, 150));
        jScrollPane26.setViewportView(assur_show);
        if (assur_show.getColumnModel().getColumnCount() > 0) {
            assur_show.getColumnModel().getColumn(0).setResizable(false);
            assur_show.getColumnModel().getColumn(1).setResizable(false);
            assur_show.getColumnModel().getColumn(2).setResizable(false);
            assur_show.getColumnModel().getColumn(3).setResizable(false);
            assur_show.getColumnModel().getColumn(4).setResizable(false);
            assur_show.getColumnModel().getColumn(4).setPreferredWidth(50);
        }

        all_show.addTab("Assurance", jScrollPane26);

        visite_show.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "D.debut", "D.fin", "Montant", "Action"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane27.setViewportView(visite_show);
        if (visite_show.getColumnModel().getColumnCount() > 0) {
            visite_show.getColumnModel().getColumn(0).setResizable(false);
            visite_show.getColumnModel().getColumn(0).setPreferredWidth(0);
            visite_show.getColumnModel().getColumn(1).setResizable(false);
            visite_show.getColumnModel().getColumn(2).setResizable(false);
            visite_show.getColumnModel().getColumn(3).setResizable(false);
            visite_show.getColumnModel().getColumn(4).setResizable(false);
            visite_show.getColumnModel().getColumn(4).setPreferredWidth(50);
        }

        all_show.addTab("Visite Technique", jScrollPane27);

        vidange_show.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Date entretien", "KM", "Montant", "Action"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane28.setViewportView(vidange_show);
        if (vidange_show.getColumnModel().getColumnCount() > 0) {
            vidange_show.getColumnModel().getColumn(0).setResizable(false);
            vidange_show.getColumnModel().getColumn(0).setPreferredWidth(0);
            vidange_show.getColumnModel().getColumn(1).setResizable(false);
            vidange_show.getColumnModel().getColumn(2).setResizable(false);
            vidange_show.getColumnModel().getColumn(3).setResizable(false);
            vidange_show.getColumnModel().getColumn(4).setResizable(false);
            vidange_show.getColumnModel().getColumn(4).setPreferredWidth(50);
        }

        all_show.addTab("Vidange", jScrollPane28);

        fh_show.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Date entretien", "KM", "Montant", "Action"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane30.setViewportView(fh_show);
        if (fh_show.getColumnModel().getColumnCount() > 0) {
            fh_show.getColumnModel().getColumn(0).setResizable(false);
            fh_show.getColumnModel().getColumn(0).setPreferredWidth(0);
            fh_show.getColumnModel().getColumn(1).setResizable(false);
            fh_show.getColumnModel().getColumn(2).setResizable(false);
            fh_show.getColumnModel().getColumn(3).setResizable(false);
            fh_show.getColumnModel().getColumn(4).setResizable(false);
            fh_show.getColumnModel().getColumn(4).setPreferredWidth(50);
        }

        all_show.addTab("Filtre a huile", jScrollPane30);

        fa_show.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Date entretien", "KM", "Montant", "Action"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane31.setViewportView(fa_show);
        if (fa_show.getColumnModel().getColumnCount() > 0) {
            fa_show.getColumnModel().getColumn(0).setResizable(false);
            fa_show.getColumnModel().getColumn(0).setPreferredWidth(0);
            fa_show.getColumnModel().getColumn(1).setResizable(false);
            fa_show.getColumnModel().getColumn(2).setResizable(false);
            fa_show.getColumnModel().getColumn(3).setResizable(false);
            fa_show.getColumnModel().getColumn(4).setResizable(false);
            fa_show.getColumnModel().getColumn(4).setPreferredWidth(50);
        }

        all_show.addTab("Filtre a air", jScrollPane31);

        autre_show.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Date entretien", "KM", "Montant", "Remarque", "Action"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane32.setViewportView(autre_show);
        if (autre_show.getColumnModel().getColumnCount() > 0) {
            autre_show.getColumnModel().getColumn(0).setResizable(false);
            autre_show.getColumnModel().getColumn(0).setPreferredWidth(0);
            autre_show.getColumnModel().getColumn(1).setResizable(false);
            autre_show.getColumnModel().getColumn(2).setResizable(false);
            autre_show.getColumnModel().getColumn(3).setResizable(false);
            autre_show.getColumnModel().getColumn(4).setResizable(false);
            autre_show.getColumnModel().getColumn(5).setResizable(false);
        }

        all_show.addTab("Autre", jScrollPane32);

        filtra_show.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Client", "Date debut", "Date fin", "Durée", "Kilométrage", "Paimenet", "date paiment"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        filtra_show.setPreferredSize(new java.awt.Dimension(300, 150));
        jScrollPane29.setViewportView(filtra_show);
        if (filtra_show.getColumnModel().getColumnCount() > 0) {
            filtra_show.getColumnModel().getColumn(0).setResizable(false);
            filtra_show.getColumnModel().getColumn(1).setResizable(false);
            filtra_show.getColumnModel().getColumn(2).setResizable(false);
            filtra_show.getColumnModel().getColumn(3).setResizable(false);
            filtra_show.getColumnModel().getColumn(4).setResizable(false);
            filtra_show.getColumnModel().getColumn(5).setResizable(false);
            filtra_show.getColumnModel().getColumn(6).setResizable(false);
        }

        all_show.addTab("Listes des Contrats", jScrollPane29);

        type_maint.add(all_show, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 1160, 470));

        show_maint1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        show_maint1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photo/Tableicon/icons8_View_30px.png"))); // NOI18N
        show_maint1.setText("Edit");
        show_maint1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        show_maint1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        show_maint1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                show_maint1MouseClicked(evt);
            }
        });
        type_maint.add(show_maint1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 20, 40, 70));

        print_maint1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        print_maint1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photo/Tableicon/icons8_Delete_File_30px.png"))); // NOI18N
        print_maint1.setText("Delete");
        print_maint1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        print_maint1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        print_maint1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                print_maint1MouseClicked(evt);
            }
        });
        type_maint.add(print_maint1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 20, 40, 70));

        j_immat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        type_maint.add(j_immat, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 40, -1, -1));

        jLabel210.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel210.setText("Modèle :");
        type_maint.add(jLabel210, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 40, -1, -1));

        j_modele.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        type_maint.add(j_modele, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 40, -1, -1));

        jLabel212.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel212.setText("Immatriculation :");
        type_maint.add(jLabel212, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 40, -1, -1));

        j_immats.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        j_immats.setText("jLabel209");
        type_maint.add(j_immats, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 40, -1, -1));

        j_mod.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        j_mod.setText("jLabel209");
        type_maint.add(j_mod, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, -1, -1));

        affichage.add(type_maint, "show_maint");

        edit_all.setBackground(new java.awt.Color(255, 255, 255));
        edit_all.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        edit_numassur.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        edit_all.add(edit_numassur, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 130, 30));

        label_num.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label_num.setText("N° assurance");
        edit_all.add(label_num, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 90, 20));

        label_datdeb.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label_datdeb.setText("Date debut");
        edit_all.add(label_datdeb, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 70, 20));

        edit_datedeb.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        edit_all.add(edit_datedeb, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 130, 30));

        label_datefin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label_datefin.setText("date fin");
        edit_all.add(label_datefin, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 340, -1, 20));

        edit_datefin.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        edit_all.add(edit_datefin, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 340, 130, 30));

        label_remarque.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label_remarque.setText("Remarque");
        edit_all.add(label_remarque, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 400, -1, 20));

        edit_remar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        edit_all.add(edit_remar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 400, 130, 30));

        jLabel215.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel215.setText("Montant");
        edit_all.add(jLabel215, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 200, -1, 20));

        edit_montant.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        edit_all.add(edit_montant, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 200, 130, 30));

        edit_entretien.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        edit_all.add(edit_entretien, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 130, 130, 30));

        date.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        date.setText("Date entretien");
        edit_all.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 140, -1, 20));

        labe_km.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labe_km.setText("KM");
        edit_all.add(labe_km, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 270, -1, 20));

        edit_km.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        edit_all.add(edit_km, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 270, 130, 30));

        edit_maint.setText("Valider");
        edit_maint.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                edit_maintMouseClicked(evt);
            }
        });
        edit_all.add(edit_maint, new org.netbeans.lib.awtextra.AbsoluteConstraints(403, 520, 210, 40));

        tab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabActionPerformed(evt);
            }
        });
        edit_all.add(tab, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 50, 30));

        edit_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_idActionPerformed(evt);
            }
        });
        edit_all.add(edit_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 50, 30));

        affichage.add(edit_all, "edit_all");

        edit_societi.setBackground(new java.awt.Color(255, 255, 255));
        edit_societi.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        edit_societi.add(jSeparator34, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 92, 1170, 10));

        societe_id.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        societe_id.setText("Modifié Societé : ");
        edit_societi.add(societe_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 150, 30));

        jLabel211.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel211.setText("Nom de la societé :");
        edit_societi.add(jLabel211, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 120, 30));
        edit_societi.add(edit_societe_nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, 160, 30));

        jLabel213.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel213.setText("tel:");
        edit_societi.add(jLabel213, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 170, 20, 30));
        edit_societi.add(edit_societe_tel, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 170, 160, 30));

        jLabel214.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel214.setText("E-mail :");
        edit_societi.add(jLabel214, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, 80, 30));
        edit_societi.add(edit_societe_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, 160, 30));

        jLabel216.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel216.setText("Adresse:");
        edit_societi.add(jLabel216, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 230, 60, 30));
        edit_societi.add(edit_societe_adresse, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 230, 160, 30));

        jLabel217.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel217.setText("Matricule fiscale:");
        edit_societi.add(jLabel217, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 130, 30));
        edit_societi.add(edit_societe_fiscal, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 280, 160, 30));

        edit_societe.setText("Enregistrer");
        edit_societe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                edit_societeMouseClicked(evt);
            }
        });
        edit_societi.add(edit_societe, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 400, 180, 40));
        edit_societi.add(jSeparator35, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 1170, 10));

        id_societ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_societActionPerformed(evt);
            }
        });
        edit_societi.add(id_societ, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 30, 30));
        id_societ.setVisible(false);

        affichage.add(edit_societi, "edit_societ");

        societ_fact.setBackground(new java.awt.Color(255, 255, 255));
        societ_fact.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nom_action.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nom_action.setForeground(new java.awt.Color(0, 102, 255));
        nom_action.setText("Societé ");
        societ_fact.add(nom_action, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 30));
        societ_fact.add(jSeparator36, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 1120, 10));

        jLabel218.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel218.setText("Nom:");
        societ_fact.add(jLabel218, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 40, 20));

        jLabel219.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel219.setText("E-mail :");
        societ_fact.add(jLabel219, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 30, 50, 20));

        matfis.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        matfis.setText("Matricule fiscale:");
        societ_fact.add(matfis, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 110, 20));
        societ_fact.add(soci_fiscal, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 160, 30));
        societ_fact.add(soci_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 30, 160, 30));
        societ_fact.add(societe_n, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 160, 30));

        jLabel221.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel221.setText("tel:");
        societ_fact.add(jLabel221, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, 20, 20));

        jLabel222.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel222.setText("Adresse:");
        societ_fact.add(jLabel222, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 30, 60, 20));
        societ_fact.add(soci_adresse, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 30, 160, 30));
        societ_fact.add(soci_tel, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, 160, 30));

        jLabel223.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel223.setForeground(new java.awt.Color(0, 102, 255));
        jLabel223.setText("Historique de contrat");
        societ_fact.add(jLabel223, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 170, 30));

        jLabel224.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel224.setForeground(new java.awt.Color(0, 102, 255));
        jLabel224.setText("Historique des facture");
        societ_fact.add(jLabel224, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 180, 30));

        soietcont_show.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "idcontrat", "N°", "Modèle", "Immatricule", "D.départ", "D.retour", "Montant total", "Montant payé"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane33.setViewportView(soietcont_show);
        if (soietcont_show.getColumnModel().getColumnCount() > 0) {
            soietcont_show.getColumnModel().getColumn(0).setResizable(false);
            soietcont_show.getColumnModel().getColumn(1).setResizable(false);
            soietcont_show.getColumnModel().getColumn(2).setResizable(false);
            soietcont_show.getColumnModel().getColumn(3).setResizable(false);
            soietcont_show.getColumnModel().getColumn(4).setResizable(false);
            soietcont_show.getColumnModel().getColumn(5).setResizable(false);
            soietcont_show.getColumnModel().getColumn(6).setResizable(false);
            soietcont_show.getColumnModel().getColumn(7).setResizable(false);
        }

        societ_fact.add(jScrollPane33, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 1170, 180));

        sociefact_show.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "idfact", "N°", "D.Facture", "Client", "Débit"
            }
        ));
        jScrollPane34.setViewportView(sociefact_show);

        societ_fact.add(jScrollPane34, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 1170, 220));

        societe_impr.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        societe_impr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photo/Tableicon/icons8_Print_30px_1.png"))); // NOI18N
        societe_impr.setText("Imprimer");
        societe_impr.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        societe_impr.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        societe_impr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                societe_imprMouseClicked(evt);
            }
        });
        societ_fact.add(societe_impr, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 80, 60, 70));

        fact_societe.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        fact_societe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photo/Tableicon/icons8_Rent_30px_2.png"))); // NOI18N
        fact_societe.setText("Facture");
        fact_societe.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        fact_societe.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        fact_societe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fact_societeMouseClicked(evt);
            }
        });
        societ_fact.add(fact_societe, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 80, 50, 70));
        societ_fact.add(id_societfact, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 30, 40, -1));
        id_societfact.setVisible(false);
        societ_fact.add(type_fact, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, 70, -1));
        type_fact.setVisible(false);

        affichage.add(societ_fact, "societe_fact");

        edittt_client.setBackground(new java.awt.Color(255, 255, 255));
        edittt_client.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel225.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel225.setText("Modifier client");
        edittt_client.add(jLabel225, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 130, 40));
        edittt_client.add(jSeparator37, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 1180, 10));

        editclient_type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CIN", "Passport", " " }));
        edittt_client.add(editclient_type, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 70, 30));
        edittt_client.add(editclient_num, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, 110, 30));

        jLabel226.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel226.setText("N° : ");
        edittt_client.add(jLabel226, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, -1, 30));

        jLabel227.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel227.setText("Délivré le  : ");
        edittt_client.add(jLabel227, new org.netbeans.lib.awtextra.AbsoluteConstraints(471, 110, 80, 30));
        edittt_client.add(editclient_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 110, 110, 30));

        jLabel228.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel228.setText("a : ");
        edittt_client.add(jLabel228, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 110, 30, 30));
        edittt_client.add(editclient_lieu_identite, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 110, 120, 30));

        jLabel229.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel229.setText("Nom prénom:");
        edittt_client.add(jLabel229, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 90, 30));

        jLabel230.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel230.setText("Date naissance:");
        edittt_client.add(jLabel230, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, -1, 30));

        jLabel231.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel231.setText("nationalité :");
        edittt_client.add(jLabel231, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 70, 30));

        jLabel232.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel232.setText("E-mail :");
        edittt_client.add(jLabel232, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, -1, 30));

        jLabel233.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel233.setText("Adresse:");
        edittt_client.add(jLabel233, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 250, -1, 30));

        jLabel234.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel234.setText("Lieu naissance:");
        edittt_client.add(jLabel234, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 210, -1, 30));

        jLabel235.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel235.setText("tel :");
        edittt_client.add(jLabel235, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 170, 30, 30));
        edittt_client.add(editclient_nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, 160, 30));
        edittt_client.add(editclient_naiss, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, 160, 30));
        edittt_client.add(editnatinalite_client, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, 160, 30));
        edittt_client.add(editemail_client, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 290, 160, 30));
        edittt_client.add(editadresse_client, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 250, 160, 30));

        editclient_lieu_naiss.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editclient_lieu_naissActionPerformed(evt);
            }
        });
        edittt_client.add(editclient_lieu_naiss, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 210, 160, 30));
        edittt_client.add(editclient_tel, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 170, 160, 30));
        edittt_client.add(jSeparator38, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 1180, 10));

        modif_client.setText("Enregistrer");
        modif_client.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modif_clientMouseClicked(evt);
            }
        });
        edittt_client.add(modif_client, new org.netbeans.lib.awtextra.AbsoluteConstraints(433, 390, 200, 50));
        edittt_client.add(id_modif, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 30, 40, -1));
        id_modif.setVisible(false);

        affichage.add(edittt_client, "editt_client");

        Internal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        affichage.add(Internal, "card42");

        edit_contrat.setBackground(new java.awt.Color(255, 255, 255));
        edit_contrat.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel238.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel238.setText("Date de contrat :");
        edit_contrat.add(jLabel238, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 110, 30));

        edit_date_contrat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_date_contratActionPerformed(evt);
            }
        });
        edit_contrat.add(edit_date_contrat, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 170, 30));

        jLabel239.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel239.setForeground(new java.awt.Color(0, 51, 255));
        jLabel239.setText("Véhicule");
        edit_contrat.add(jLabel239, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 34, 50, 30));

        jLabel240.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel240.setText("Date départ : ");
        edit_contrat.add(jLabel240, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 90, -1));

        jLabel241.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel241.setText("Date retour : ");
        edit_contrat.add(jLabel241, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 90, -1));
        edit_contrat.add(edit_contrat_retour, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 130, -1));
        edit_contrat.add(edit_contrat_deb, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 130, -1));

        jLabel250.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel250.setText("Heure : ");
        edit_contrat.add(jLabel250, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, 50, 30));

        jLabel251.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel251.setText("Heure : ");
        edit_contrat.add(jLabel251, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 50, 30));

        edit_contrat.add(edit_heure_fin, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 100, 30));

        edit_contrat.add(edit_heure_dep, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, 100, 30));

        edit_contrat.add(edit_contrat_imma, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 60, 140, 30));

        jLabel252.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel252.setText("Immatriculation : ");
        edit_contrat.add(jLabel252, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 70, 110, -1));

        edit_contrat_model.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                edit_contrat_modelMouseClicked(evt);
            }
        });
        edit_contrat_model.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_contrat_modelActionPerformed(evt);
            }
        });
        edit_contrat.add(edit_contrat_model, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 60, 140, 30));

        jLabel253.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel253.setText("Modèle : ");
        edit_contrat.add(jLabel253, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, 60, -1));

        jLabel254.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel254.setText("Lieu de départ : ");
        edit_contrat.add(jLabel254, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 67, 100, 20));

        jLabel255.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel255.setText("KM de départ : ");
        edit_contrat.add(jLabel255, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 120, 100, -1));
        edit_contrat.add(edit_km_dep, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 110, 140, 30));

        edit_lieu_depart.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                edit_lieu_departKeyPressed(evt);
            }
        });
        edit_contrat.add(edit_lieu_depart, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 60, 150, 30));

        jLabel256.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel256.setText("lieu de retour : ");
        edit_contrat.add(jLabel256, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 120, 100, -1));

        jLabel257.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel257.setText("KM de retour : ");
        edit_contrat.add(jLabel257, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 120, 100, -1));
        edit_contrat.add(edit_km_retour, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 110, 150, 30));
        edit_contrat.add(edit_lieu_retour, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 110, 150, 30));

        jLabel258.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel258.setForeground(new java.awt.Color(0, 51, 255));
        jLabel258.setText("Locateur/Client");
        edit_contrat.add(jLabel258, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 160, 20));

        edit_type_iden.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CIN", "Passport", " " }));
        edit_contrat.add(edit_type_iden, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 70, 30));

        jLabel259.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel259.setText("N° : ");
        edit_contrat.add(jLabel259, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, -1, 30));

        edit_num_identite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_num_identiteActionPerformed(evt);
            }
        });
        edit_contrat.add(edit_num_identite, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 110, 30));

        jLabel260.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel260.setText("date : ");
        edit_contrat.add(jLabel260, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, -1, 30));
        edit_contrat.add(edit_identite_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 300, 110, 30));

        jLabel261.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel261.setText("a : ");
        edit_contrat.add(jLabel261, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 300, 30, 30));
        edit_contrat.add(edit_lieu_identite, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 300, 120, 30));

        jLabel262.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel262.setText("Nom prénom/societé :");
        edit_contrat.add(jLabel262, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 300, -1, 30));
        edit_contrat.add(edit_nom_prenom, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 300, 160, 30));

        jLabel263.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel263.setText("tel:");
        edit_contrat.add(jLabel263, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 300, 20, 30));
        edit_contrat.add(edit_tel_client, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 300, 160, 30));

        jLabel264.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel264.setText("Date naissance:");
        edit_contrat.add(jLabel264, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, -1, 30));
        edit_contrat.add(edit_client_naissance, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, 160, 30));

        jLabel265.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel265.setText("Lieu naissance:");
        edit_contrat.add(jLabel265, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 350, -1, 30));
        edit_contrat.add(edit_lieu_naiss, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 350, 160, 30));

        jLabel266.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel266.setText("nationalité :");
        edit_contrat.add(jLabel266, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 350, -1, 30));
        edit_contrat.add(edit_client_nationalite, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 350, 160, 30));

        jLabel267.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel267.setText("Adresse:");
        edit_contrat.add(jLabel267, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 350, -1, 30));
        edit_contrat.add(edit_client_adresse, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 350, 160, 30));

        jLabel268.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel268.setForeground(new java.awt.Color(0, 51, 255));
        jLabel268.setText("Paiement");
        edit_contrat.add(jLabel268, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 90, 20));

        jLabel269.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel269.setText("Montant de la gatantie déposée :");
        edit_contrat.add(jLabel269, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 200, -1));

        jLabel270.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel270.setText("Montant de paiement:");
        edit_contrat.add(jLabel270, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 200, -1));

        jLabel271.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel271.setText("Date de paiement:");
        edit_contrat.add(jLabel271, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 180, 120, -1));
        edit_contrat.add(edit_pai_day, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 180, 120, -1));
        edit_contrat.add(edit_montant_pay, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 90, 30));
        edit_contrat.add(edit_montant_gatan, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, 90, 30));

        edit_pay_gatan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ESP", "cart bleu", "chèque" }));
        edit_contrat.add(edit_pay_gatan, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, -1, -1));

        edit_type_pay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ESP", "cart bleu", "chèque" }));
        edit_contrat.add(edit_type_pay, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, -1, -1));

        jLabel272.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel272.setText("Observation:");
        edit_contrat.add(jLabel272, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 170, 90, 40));

        edit_observation.setColumns(20);
        edit_observation.setRows(5);
        jScrollPane35.setViewportView(edit_observation);

        edit_contrat.add(jScrollPane35, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 180, -1, 70));

        jLabel273.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel273.setForeground(new java.awt.Color(0, 51, 255));
        jLabel273.setText("Conducteur");
        edit_contrat.add(jLabel273, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 90, 20));

        edit_type_identite_conduc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CIN", "Passport", " " }));
        edit_contrat.add(edit_type_identite_conduc, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 70, 30));

        jLabel274.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel274.setText("N° : ");
        edit_contrat.add(jLabel274, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 420, -1, 30));

        edit_identite_num_conduc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_identite_num_conducActionPerformed(evt);
            }
        });
        edit_contrat.add(edit_identite_num_conduc, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 420, 110, 30));

        jLabel275.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel275.setText("date : ");
        edit_contrat.add(jLabel275, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 420, -1, 30));
        edit_contrat.add(edit_date_identite_conduc, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 420, 110, 30));

        jLabel276.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel276.setText("a : ");
        edit_contrat.add(jLabel276, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 420, 30, 30));
        edit_contrat.add(edit_identite_lieu_conduc, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 420, 120, 30));

        jLabel277.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel277.setText("Nom prénom/societé :");
        edit_contrat.add(jLabel277, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 420, -1, 30));
        edit_contrat.add(edit_prenom_nom_conduc, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 420, 160, 30));

        jLabel278.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel278.setText("Date:");
        edit_contrat.add(jLabel278, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 460, -1, 30));
        edit_contrat.add(edit_date_permis_conduc, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 460, 160, 30));

        jLabel279.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel279.setText("N° permis conduire:");
        edit_contrat.add(jLabel279, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 420, -1, 30));
        edit_contrat.add(edit_conducteur_permis, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 420, 160, 30));

        jLabel280.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel280.setText("à :");
        edit_contrat.add(jLabel280, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, -1, 30));
        edit_contrat.add(edit_lieu_permis_conduc, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, 160, 30));

        jLabel281.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel281.setForeground(new java.awt.Color(0, 51, 255));
        jLabel281.setText("Conducteur 2");
        edit_contrat.add(jLabel281, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 510, 90, 20));

        edit_type_identite_conduc2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CIN", "Passport", " " }));
        edit_contrat.add(edit_type_identite_conduc2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 540, 70, 30));

        jLabel282.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel282.setText("N° : ");
        edit_contrat.add(jLabel282, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 540, -1, 30));

        edit_identite_num_conduc2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_identite_num_conduc2ActionPerformed(evt);
            }
        });
        edit_contrat.add(edit_identite_num_conduc2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 540, 110, 30));

        jLabel283.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel283.setText("date : ");
        edit_contrat.add(jLabel283, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 540, -1, 30));
        edit_contrat.add(edit_date_identite_conduc2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 540, 110, 30));

        jLabel284.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel284.setText("a : ");
        edit_contrat.add(jLabel284, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 540, 30, 30));
        edit_contrat.add(edit_identite_lieu_conduc2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 540, 120, 30));

        jLabel285.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel285.setText("Nom prénom/societé :");
        edit_contrat.add(jLabel285, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 540, -1, 30));
        edit_contrat.add(edit_prenom_nom_conduc2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 540, 160, 30));

        jLabel286.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel286.setText("N° permis conduire:");
        edit_contrat.add(jLabel286, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 540, -1, 30));
        edit_contrat.add(edit_conducteur_permis_conduc2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 540, 160, 30));

        jLabel287.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel287.setText("à :");
        edit_contrat.add(jLabel287, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 580, -1, 30));
        edit_contrat.add(edit_lieu_permis_conduc2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 580, 160, 30));

        jLabel288.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel288.setText("Date:");
        edit_contrat.add(jLabel288, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 580, -1, 30));
        edit_contrat.add(edit_date_permis_conduc2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 580, 160, 30));

        jLabel289.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel289.setText("Retour de cautionnement");
        edit_contrat.add(jLabel289, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 230, 160, -1));
        edit_contrat.add(edit_retour_causs, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 220, 130, 30));

        edit_contrat_butt.setText("Valider");
        edit_contrat_butt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                edit_contrat_buttMouseClicked(evt);
            }
        });
        edit_contrat.add(edit_contrat_butt, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 620, 250, 30));

        jSeparator39.setBackground(new java.awt.Color(0, 51, 153));
        edit_contrat.add(jSeparator39, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 520, 1080, 10));

        jSeparator40.setBackground(new java.awt.Color(0, 51, 153));
        edit_contrat.add(jSeparator40, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 52, 1110, 10));

        jSeparator41.setBackground(new java.awt.Color(0, 51, 204));
        edit_contrat.add(jSeparator41, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 1110, 10));

        jSeparator42.setBackground(new java.awt.Color(0, 102, 204));
        edit_contrat.add(jSeparator42, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 400, 1090, 10));
        edit_contrat.add(edit_type_contrat, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 10, 70, -1));
        edit_type_contrat.setVisible(false);
        edit_contrat.add(edit_id_contrat, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 10, 50, -1));
        edit_id_contrat.setVisible(false);

        jSeparator43.setBackground(new java.awt.Color(0, 51, 204));
        edit_contrat.add(jSeparator43, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 1070, 10));
        edit_contrat.add(id_veh, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 10, -1, -1));
        id_veh.setVisible(false);
        edit_contrat.add(id_cliso, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 10, -1, -1));
        id_cliso.setVisible(false);
        edit_contrat.add(id_pai, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 10, -1, -1));
        id_pai.setVisible(false);
        edit_contrat.add(edit_id_conduc1, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 10, -1, -1));
        edit_id_conduc1.setVisible(false);
        edit_contrat.add(edit_id_conduc2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 10, -1, -1));
        edit_id_conduc2.setVisible(false);

        delete_cond2.setText("Supprimé conducteur 2");
        edit_contrat.add(delete_cond2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 600, 150, 30));
        edit_contrat.add(check_del, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, -1, -1));
        check_del.setVisible(false);

        affichage.add(edit_contrat, "edit_contrat");

        Container.add(affichage, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 1170, 650));

        getContentPane().add(Container, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1450, 780));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void lab_accueilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab_accueilMouseClicked
        CardLayout cardLayout = (CardLayout) menu_nav.getLayout();
         cardLayout.show(menu_nav, "menuacc");
          CardLayout cardLayout1 = (CardLayout) affichage.getLayout();
     cardLayout1.show(affichage, "accueil");
    }//GEN-LAST:event_lab_accueilMouseClicked

    private void lab_voitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab_voitMouseClicked
        CardLayout cardLayout = (CardLayout) menu_nav.getLayout();
         cardLayout.show(menu_nav, "menuvoit");
          CardLayout cardLayout1 = (CardLayout) affichage.getLayout();
     cardLayout1.show(affichage, "liste");
      //rech_model();
     //   catvoituret();
    }//GEN-LAST:event_lab_voitMouseClicked

    private void lab_maintMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab_maintMouseClicked
        CardLayout cardLayout = (CardLayout) menu_nav.getLayout();
         cardLayout.show(menu_nav, "menumaint");
       CardLayout cardLayout1 = (CardLayout) affichage.getLayout();
     cardLayout1.show(affichage, "maintlist");
    }//GEN-LAST:event_lab_maintMouseClicked

    private void lab_contratMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab_contratMouseClicked
        CardLayout cardLayout = (CardLayout) menu_nav.getLayout();
         cardLayout.show(menu_nav, "menucontr");
         CardLayout cardLayout1 = (CardLayout) affichage.getLayout();
     cardLayout1.show(affichage, "list_contrat");
    }//GEN-LAST:event_lab_contratMouseClicked

    private void lab_reserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab_reserMouseClicked
        CardLayout cardLayout = (CardLayout) menu_nav.getLayout();
         cardLayout.show(menu_nav, "menureser");
            CardLayout cardLayout1 = (CardLayout) affichage.getLayout();
     cardLayout1.show(affichage, "reserv_list");
    }//GEN-LAST:event_lab_reserMouseClicked

    private void lab_societMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab_societMouseClicked
         CardLayout cardLayout = (CardLayout) menu_nav.getLayout();
         cardLayout.show(menu_nav, "menusociet");
           CardLayout cardLayout1 = (CardLayout) affichage.getLayout();
     cardLayout1.show(affichage, "societe_list");
    }//GEN-LAST:event_lab_societMouseClicked

    private void lab_clientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab_clientMouseClicked
       CardLayout cardLayout = (CardLayout) menu_nav.getLayout();
         cardLayout.show(menu_nav, "menucli");
          CardLayout cardLayout1 = (CardLayout) affichage.getLayout();
     cardLayout1.show(affichage, "list_client");
    }//GEN-LAST:event_lab_clientMouseClicked

    private void lab_factMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab_factMouseClicked
        CardLayout cardLayout = (CardLayout) menu_nav.getLayout();
         cardLayout.show(menu_nav, "menufact");
                CardLayout cardLayout1 = (CardLayout) affichage.getLayout();
     cardLayout1.show(affichage, "list_fact");
    }//GEN-LAST:event_lab_factMouseClicked

    private void lab_paiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab_paiMouseClicked
       CardLayout cardLayout = (CardLayout) menu_nav.getLayout();
         cardLayout.show(menu_nav, "menupai");
            CardLayout cardLayout1 = (CardLayout) affichage.getLayout();
     cardLayout1.show(affichage, "list_pai");
    }//GEN-LAST:event_lab_paiMouseClicked

    private void lab_financeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab_financeMouseClicked
       CardLayout cardLayout = (CardLayout) menu_nav.getLayout();
         cardLayout.show(menu_nav, "menufin");
              CardLayout cardLayout1 = (CardLayout) affichage.getLayout();
     cardLayout1.show(affichage, "fin_rec");
    }//GEN-LAST:event_lab_financeMouseClicked

    private void lab_adminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab_adminMouseClicked
         CardLayout cardLayout = (CardLayout) menu_nav.getLayout();
         cardLayout.show(menu_nav, "menuadmin");
             CardLayout cardLayout1 = (CardLayout) affichage.getLayout();
     cardLayout1.show(affichage, "admin_pass");
    }//GEN-LAST:event_lab_adminMouseClicked

    private void lab_accueilMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab_accueilMouseEntered
        lab_accueil.setForeground(Color.BLACK);
        lab_accueil.setIcon(new ImageIcon("D:/project/Location_voiture/src/Photo/icons8_Home_30px_1.png"));
    }//GEN-LAST:event_lab_accueilMouseEntered

    private void lab_accueilMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab_accueilMouseExited
        lab_accueil.setForeground(Color.WHITE);
        lab_accueil.setIcon(new ImageIcon("D:/project/Location_voiture/src/location_voiture/image/icons8_Home_30px.png"));
    }//GEN-LAST:event_lab_accueilMouseExited

    private void lab_voitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab_voitMouseEntered
         lab_voit.setForeground(Color.BLACK);
        lab_voit.setIcon(new ImageIcon("D:/project/Location_voiture/src/Photo/icons8_SUV_30px_1.png"));
    }//GEN-LAST:event_lab_voitMouseEntered

    private void lab_voitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab_voitMouseExited
        lab_voit.setForeground(Color.WHITE);
        lab_voit.setIcon(new ImageIcon("D:/project/Location_voiture/src/location_voiture/image/icons8_SUV_30px.png"));
    }//GEN-LAST:event_lab_voitMouseExited

    private void lab_maintMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab_maintMouseEntered
        lab_maint.setForeground(Color.BLACK);
        lab_maint.setIcon(new ImageIcon("D:/project/Location_voiture/src/Photo/icons8_Maintenance_30px_1.png"));
    }//GEN-LAST:event_lab_maintMouseEntered

    private void lab_maintMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab_maintMouseExited
        lab_maint.setForeground(Color.WHITE);
        lab_maint.setIcon(new ImageIcon("D:/project/Location_voiture/src/location_voiture/image/icons8_Maintenance_30px.png"));
    }//GEN-LAST:event_lab_maintMouseExited

    private void lab_contratMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab_contratMouseEntered
         lab_contrat.setForeground(Color.BLACK);
        lab_contrat.setIcon(new ImageIcon("D:/project/Location_voiture/src/Photo/icons8_Handshake_30px_1.png"));
    }//GEN-LAST:event_lab_contratMouseEntered

    private void lab_contratMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab_contratMouseExited
       lab_contrat.setForeground(Color.WHITE);
        lab_contrat.setIcon(new ImageIcon("D:/project/Location_voiture/src/location_voiture/image/icons8_Handshake_30px.png"));
    }//GEN-LAST:event_lab_contratMouseExited

    private void lab_reserMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab_reserMouseEntered
        lab_reser.setForeground(Color.BLACK);
        lab_reser.setIcon(new ImageIcon("D:/project/Location_voiture/src/Photo/icons8_Ticket_Purchase_30px_1.png"));
    }//GEN-LAST:event_lab_reserMouseEntered

    private void lab_reserMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab_reserMouseExited
        lab_reser.setForeground(Color.WHITE);
        lab_reser.setIcon(new ImageIcon("D:/project/Location_voiture/src/location_voiture/image/icons8_Ticket_Purchase_30px.png"));
    }//GEN-LAST:event_lab_reserMouseExited

    private void lab_societMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab_societMouseEntered
       lab_societ.setForeground(Color.BLACK);
        lab_societ.setIcon(new ImageIcon("D:/project/Location_voiture/src/Photo/icons8_User_Groups_30px_1.png"));
    }//GEN-LAST:event_lab_societMouseEntered

    private void lab_societMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab_societMouseExited
     lab_societ.setForeground(Color.WHITE);
        lab_societ.setIcon(new ImageIcon("D:/project/Location_voiture/src/location_voiture/image/icons8_User_Groups_30px.png"));
    }//GEN-LAST:event_lab_societMouseExited

    private void lab_clientMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab_clientMouseEntered
       lab_client.setForeground(Color.BLACK);
        lab_client.setIcon(new ImageIcon("D:/project/Location_voiture/src/Photo/icons8_Male_User_30px_1.png"));
    }//GEN-LAST:event_lab_clientMouseEntered

    private void lab_clientMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab_clientMouseExited
       lab_client.setForeground(Color.WHITE);
        lab_client.setIcon(new ImageIcon("D:/project/Location_voiture/src/location_voiture/image/icons8_Male_User_30px.png"));
    }//GEN-LAST:event_lab_clientMouseExited

    private void lab_factMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab_factMouseEntered
          lab_fact.setForeground(Color.BLACK);
        lab_fact.setIcon(new ImageIcon("D:/project/Location_voiture/src/Photo/icons8_Bill_30px_1.png"));
    }//GEN-LAST:event_lab_factMouseEntered

    private void lab_factMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab_factMouseExited
          lab_fact.setForeground(Color.WHITE);
        lab_fact.setIcon(new ImageIcon("D:/project/Location_voiture/src/location_voiture/image/icons8_Bill_30px.png"));
    }//GEN-LAST:event_lab_factMouseExited

    private void lab_paiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab_paiMouseEntered
          lab_pai.setForeground(Color.BLACK);
        lab_pai.setIcon(new ImageIcon("D:/project/Location_voiture/src/Photo/icons8_Paper_Money_30px_1.png"));
    }//GEN-LAST:event_lab_paiMouseEntered

    private void lab_paiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab_paiMouseExited
         lab_pai.setForeground(Color.WHITE);
        lab_pai.setIcon(new ImageIcon("D:/project/Location_voiture/src/location_voiture/image/icons8_Paper_Money_30px.png"));
    }//GEN-LAST:event_lab_paiMouseExited

    private void lab_financeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab_financeMouseEntered
               lab_finance.setForeground(Color.BLACK);
       lab_finance.setIcon(new ImageIcon("D:/project/Location_voiture/src/Photo/icons8_Rent_30px_1.png"));
    }//GEN-LAST:event_lab_financeMouseEntered

    private void lab_financeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab_financeMouseExited
          lab_finance.setForeground(Color.WHITE);
        lab_finance.setIcon(new ImageIcon("D:/project/Location_voiture/src/location_voiture/image/icons8_Rent_30px.png"));
    }//GEN-LAST:event_lab_financeMouseExited

    private void lab_adminMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab_adminMouseEntered
            lab_admin.setForeground(Color.BLACK);
        lab_admin.setIcon(new ImageIcon("D:/project/Location_voiture/src/Photo/icons8_Settings_30px_1.png"));
    }//GEN-LAST:event_lab_adminMouseEntered

    private void lab_adminMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab_adminMouseExited
        lab_admin.setForeground(Color.WHITE);
        lab_admin.setIcon(new ImageIcon("D:/project/Location_voiture/src/location_voiture/image/icons8_Settings_30px.png"));
    }//GEN-LAST:event_lab_adminMouseExited

    private void voit_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voit_saveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_voit_saveActionPerformed

    private void ajout_veh1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ajout_veh1MouseClicked
      // JLabel label = (JLabel)evt.getSource();
       //JPanel labelPanel = (JPanel)label.getParent();
     // JPanel cardLayoutPanel = (JPanel)labelPanel.getParent();
        CardLayout cardLayout = (CardLayout) affichage.getLayout();
     cardLayout.show(affichage, "ajout");
      //   list_cat();
        //  list_mod();
        //  list_color();


    }//GEN-LAST:event_ajout_veh1MouseClicked

    private void list_vehiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_list_vehiMouseClicked
         CardLayout cardLayout = (CardLayout) affichage.getLayout();
     cardLayout.show(affichage, "liste");
   // catvoituret();
  //  rech_model();
          
       
    }//GEN-LAST:event_list_vehiMouseClicked

    private void model_voitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_model_voitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_model_voitActionPerformed

    private void voit_catActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voit_catActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_voit_catActionPerformed

    private void ajout_modelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ajout_modelMouseClicked
        CardLayout cardLayout = (CardLayout) affichage.getLayout();
     cardLayout.show(affichage, "model");
    }//GEN-LAST:event_ajout_modelMouseClicked

    private void ajout_catMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ajout_catMouseClicked
 CardLayout cardLayout = (CardLayout) affichage.getLayout();
     cardLayout.show(affichage, "cati");        // TODO add your handling code here:
    }//GEN-LAST:event_ajout_catMouseClicked

    private void ajout_coleurMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ajout_coleurMouseClicked
    CardLayout cardLayout = (CardLayout) affichage.getLayout();
     cardLayout.show(affichage, "coleur");
    }//GEN-LAST:event_ajout_coleurMouseClicked

    private void list_maintMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_list_maintMouseClicked
       CardLayout cardLayout = (CardLayout) affichage.getLayout();
     cardLayout.show(affichage, "maintlist");
    }//GEN-LAST:event_list_maintMouseClicked

    private void list_assurMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_list_assurMouseClicked
          CardLayout cardLayout = (CardLayout) affichage.getLayout();
     cardLayout.show(affichage, "assurance");
    // assur_mod();
     //combolist();
    }//GEN-LAST:event_list_assurMouseClicked

    private void list_visitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_list_visitMouseClicked
          CardLayout cardLayout = (CardLayout) affichage.getLayout();
     cardLayout.show(affichage, "visit");
   //  tech_mod();
    // visittech();
    }//GEN-LAST:event_list_visitMouseClicked

    private void list_filtraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_list_filtraMouseClicked
      CardLayout cardLayout = (CardLayout) affichage.getLayout();
     cardLayout.show(affichage, "filtreair");
    }//GEN-LAST:event_list_filtraMouseClicked

    private void list_filtrehMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_list_filtrehMouseClicked
     CardLayout cardLayout = (CardLayout) affichage.getLayout();
     cardLayout.show(affichage, "filtreh");
    }//GEN-LAST:event_list_filtrehMouseClicked

    private void list_autreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_list_autreMouseClicked
    CardLayout cardLayout = (CardLayout) affichage.getLayout();
     cardLayout.show(affichage, "maintautre");
    }//GEN-LAST:event_list_autreMouseClicked

    private void list_vidangeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_list_vidangeMouseClicked
       CardLayout cardLayout = (CardLayout) affichage.getLayout();
     cardLayout.show(affichage, "vidange");
    }//GEN-LAST:event_list_vidangeMouseClicked

    private void list_contrMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_list_contrMouseClicked
        CardLayout cardLayout = (CardLayout) affichage.getLayout();
     cardLayout.show(affichage, "list_contrat");
    }//GEN-LAST:event_list_contrMouseClicked

    private void date_contratActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_date_contratActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_date_contratActionPerformed

    private void ajout_contrMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ajout_contrMouseClicked
      CardLayout cardLayout = (CardLayout) affichage.getLayout();
     cardLayout.show(affichage, "ajout_contrat");
    }//GEN-LAST:event_ajout_contrMouseClicked

    private void archiveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_archiveMouseClicked
        CardLayout cardLayout = (CardLayout) affichage.getLayout();
     cardLayout.show(affichage, "contrat_archive");
    }//GEN-LAST:event_archiveMouseClicked

    private void list_reserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_list_reserMouseClicked
         CardLayout cardLayout = (CardLayout) affichage.getLayout();
     cardLayout.show(affichage, "reserv_list");
    }//GEN-LAST:event_list_reserMouseClicked

    private void date_reservActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_date_reservActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_date_reservActionPerformed

    private void ajout_reserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ajout_reserMouseClicked
        CardLayout cardLayout = (CardLayout) affichage.getLayout();
     cardLayout.show(affichage, "add_reserv");
    }//GEN-LAST:event_ajout_reserMouseClicked

    private void list_societMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_list_societMouseClicked
      CardLayout cardLayout = (CardLayout) affichage.getLayout();
     cardLayout.show(affichage, "societe_list");
    }//GEN-LAST:event_list_societMouseClicked

    private void ajout_societMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ajout_societMouseClicked
       CardLayout cardLayout = (CardLayout) affichage.getLayout();
     cardLayout.show(affichage, "add_societe");
    }//GEN-LAST:event_ajout_societMouseClicked

    private void list_clientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_list_clientMouseClicked
         CardLayout cardLayout = (CardLayout) affichage.getLayout();
     cardLayout.show(affichage, "list_client");
    }//GEN-LAST:event_list_clientMouseClicked

    private void client_lieu_naissActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_client_lieu_naissActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_client_lieu_naissActionPerformed

    private void ajout_clientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ajout_clientMouseClicked
          CardLayout cardLayout = (CardLayout) affichage.getLayout();
     cardLayout.show(affichage, "add_client");
    }//GEN-LAST:event_ajout_clientMouseClicked

    private void list_factMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_list_factMouseClicked
             CardLayout cardLayout = (CardLayout) affichage.getLayout();
     cardLayout.show(affichage, "list_fact");
    }//GEN-LAST:event_list_factMouseClicked

    private void list_paiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_list_paiMouseClicked
          CardLayout cardLayout = (CardLayout) affichage.getLayout();
     cardLayout.show(affichage, "list_pai");
    }//GEN-LAST:event_list_paiMouseClicked

    private void ajout_paiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ajout_paiMouseClicked
         CardLayout cardLayout = (CardLayout) affichage.getLayout();
     cardLayout.show(affichage, "add_pai");
    }//GEN-LAST:event_ajout_paiMouseClicked

    private void recherche_recetteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recherche_recetteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_recherche_recetteActionPerformed

    private void list_recetteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_list_recetteMouseClicked
          CardLayout cardLayout = (CardLayout) affichage.getLayout();
     cardLayout.show(affichage, "fin_rec");
    }//GEN-LAST:event_list_recetteMouseClicked

    private void recherche_voitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recherche_voitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_recherche_voitActionPerformed

    private void list_reccvoiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_list_reccvoiMouseClicked
              CardLayout cardLayout = (CardLayout) affichage.getLayout();
     cardLayout.show(affichage, "rec_voiture");
    }//GEN-LAST:event_list_reccvoiMouseClicked

    private void rech_voiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rech_voiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rech_voiActionPerformed

    private void dep_voiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dep_voiMouseClicked
           CardLayout cardLayout = (CardLayout) affichage.getLayout();
     cardLayout.show(affichage, "voit_dep");
    }//GEN-LAST:event_dep_voiMouseClicked

    private void rech_bereauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rech_bereauActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rech_bereauActionPerformed

    private void dep_berMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dep_berMouseClicked
         CardLayout cardLayout = (CardLayout) affichage.getLayout();
     cardLayout.show(affichage, "dep_ber");
    }//GEN-LAST:event_dep_berMouseClicked

    private void rech_sortieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rech_sortieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rech_sortieActionPerformed

    private void rech_autreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rech_autreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rech_autreActionPerformed

    private void sortie_caisseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sortie_caisseMouseClicked
         CardLayout cardLayout = (CardLayout) affichage.getLayout();
     cardLayout.show(affichage, "caisse_sortie");
    }//GEN-LAST:event_sortie_caisseMouseClicked

    private void other_reccMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_other_reccMouseClicked
            CardLayout cardLayout = (CardLayout) affichage.getLayout();
     cardLayout.show(affichage, "caiss_autr");
    }//GEN-LAST:event_other_reccMouseClicked

    private void rech_caisseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rech_caisseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rech_caisseActionPerformed

    private void caisseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_caisseMouseClicked
               CardLayout cardLayout = (CardLayout) affichage.getLayout();
     cardLayout.show(affichage, "tot_caisse");
    }//GEN-LAST:event_caisseMouseClicked

    private void list_pai1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_list_pai1MouseClicked
            CardLayout cardLayout1 = (CardLayout) affichage.getLayout();
     cardLayout1.show(affichage, "admin_pass");
    }//GEN-LAST:event_list_pai1MouseClicked

    private void ajout_pai1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ajout_pai1MouseClicked
               CardLayout cardLayout1 = (CardLayout) affichage.getLayout();
     cardLayout1.show(affichage, "company_edit");
    }//GEN-LAST:event_ajout_pai1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        Model voit_model = null ;
        String model = model_voit.getText();
        voit_model = new Model (model);
        operation.Addmodel(voit_model);
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        Category cati = null ;
        String cat = voit_cat.getText();
        cati = new Category (cat);
        operation.Addcat(cati);
        
    }//GEN-LAST:event_jButton3MouseClicked

    private void colorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_colorMouseClicked
      Coleur color = null ; 
      String cole = voit_color.getText();
      color = new Coleur(cole);
      operation.Addcolor(color);
        
       
    }//GEN-LAST:event_colorMouseClicked

    private void voit_colorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voit_colorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_voit_colorActionPerformed

    private void voit_saveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_voit_saveMouseClicked
        Voiture voiture = new Voiture() ; 
        voiture.setImmat(voit_immat.getText());
        voiture.setCarteGris(voit_griss.getText());
        voiture.setNbrPlace(Integer.parseInt(voit_nbr.getText()));
        voiture.setCat(list_cat.getSelectedItem().toString());
        try {
         SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
          Date date = formatter.parse(voit_circu.getText());
          voiture.setMisCircu(date);
        }catch(Exception e) {
            
        }
        voiture.setModele(list_mod.getSelectedItem().toString());
        voiture.setChassis(voit_chasis.getText());
        voiture.setPuissance(Integer.parseInt(voit_puiss.getText()));
        voiture.setCouleur(list_color.getSelectedItem().toString());
        voiture.setKm(Integer.parseInt(voit_km.getText()));
        voiture.setClimatise(voit_clim.getSelectedItem().toString());
       operation.Addvoit(voiture);
    }//GEN-LAST:event_voit_saveMouseClicked

    private void Edit_itemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Edit_itemMouseClicked
       
       
           int i  = voit_affiche.getSelectedRow();
           if(i > -1){
           TableModel table = voit_affiche.getModel();
           String immat = table.getValueAt(i, 1).toString();
            session = NewHibernateUtil.getSessionFactory().openSession();
           
              Query q =session.createQuery("from Voiture where immat=:imm" );
              q.setParameter("imm",immat);
              List<Voiture> voit = q.list();
             
              for(Voiture voitur : voit){
                 upd_immat.setText( voitur.getImmat());
                 String id = Integer.toString(voitur.getId());
                 upd_id.setText(id);
                 upd_gris.setText(voitur.getCarteGris());
                 String nbrplace = Integer.toString(voitur.getNbrPlace());
                 upd_nbr.setText(nbrplace);
                 Format formatter = new SimpleDateFormat("yyyy/MM/dd");
                 String s = formatter.format(voitur.getMisCircu());
                 upd_circu.setText(s);
                 upd_chasis.setText(voitur.getChassis());
                 String puissance = Integer.toString(voitur.getPuissance());
                 upd_puiss.setText(puissance);
                 String km = Integer.toString(voitur.getKm());
                 upd_km.setText(km); 
              }
              
              
               CardLayout cardLayout1 = (CardLayout) affichage.getLayout();
           cardLayout1.show(affichage, "edit_voit");
              
            
           } else {
               JOptionPane.showMessageDialog(null,"No row selected");
    }
           
    }//GEN-LAST:event_Edit_itemMouseClicked

    private void Delet_itemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Delet_itemMouseClicked
       int i  = voit_affiche.getSelectedRow();
           if(i > -1){
           TableModel table = voit_affiche.getModel();
            String immat = table.getValueAt(i, 1).toString();
            Query q =session.createQuery("from Voiture where immat=:imm" );
              q.setParameter("imm",immat);
              q.setFirstResult(0);
              q.setMaxResults(1);
              List<Voiture> voit = q.list();
             for(Voiture voitur : voit){
            operation.Deletevoiture(voitur.getId());
             }
             CardLayout cardLayout = (CardLayout) affichage.getLayout();
     cardLayout.show(affichage, "liste");
     combolist();
           } else {
               JOptionPane.showMessageDialog(null,"No row selected");
    }
    }//GEN-LAST:event_Delet_itemMouseClicked

@SuppressWarnings("empty-statement")
    private void voit_updMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_voit_updMouseClicked
       Voiture voitu = new Voiture() ;
      Integer id = Integer.parseInt(this.upd_id.getText());
       
       voitu.setCarteGris(this.upd_gris.getText());
       voitu.setNbrPlace(Integer.parseInt(this.upd_nbr.getText()));
       voitu.setImmat(this.upd_immat.getText());
       voitu.setCat(this.upd_cat.getSelectedItem().toString());
       voitu.setClimatise(this.upd_climatise.getSelectedItem().toString());
       try{
         SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
          Date date = formatter.parse(this.upd_circu.getText());
          voitu.setMisCircu(date);
       }catch (Exception e){
           
       }
       voitu.setModele(this.upd_model.getSelectedItem().toString());
       voitu.setChassis(this.upd_chasis.getText());
       voitu.setPuissance(Integer.parseInt(this.upd_puiss.getText()));
       voitu.setCouleur(this.upd_color.getSelectedItem().toString());
       voitu.setKm(Integer.parseInt(this.upd_km.getText()));
      
       operation.Editvoiture(voitu,id);
        CardLayout cardLayout = (CardLayout) affichage.getLayout();
     cardLayout.show(affichage, "liste");
     combolist();
    
     
    }//GEN-LAST:event_voit_updMouseClicked
public void actionPerformed (ActionEvent e){
    
}
    private void rech_modelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rech_modelActionPerformed
  if(rech_model.getSelectedItem().equals("")){
  
  }
  else {
      String a = rech_model.getSelectedItem().toString();
 // JOptionPane.showMessageDialog(null,a);
   session = NewHibernateUtil.getSessionFactory().openSession(); 
       Query query_table =session.createQuery("from Voiture where modele=:imm" );
             query_table.setParameter("imm",a); 
              List<Voiture> voitu = query_table.list();
            
            DefaultTableModel tables = (DefaultTableModel) voit_affiche.getModel();
       
         tables.setRowCount(0);
         for(Voiture mod:voitu){
             Object[] objvoit = new Object [] {mod.getModele() ,mod.getImmat()};
             tables.addRow(objvoit);
        
          }
  }
    }//GEN-LAST:event_rech_modelActionPerformed

    private void assur_modActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assur_modActionPerformed
        if(assur_mod.getSelectedItem().equals("")){
  
  }
  else {
      String a = assur_mod.getSelectedItem().toString();
      Date dts = null ;

          LocalDate ds=LocalDateTime.now().toLocalDate();
           dts = java.sql.Date.valueOf(ds);
//  JOptionPane.showMessageDialog(null,a);
   session = NewHibernateUtil.getSessionFactory().openSession(); 
       Query query_table =session.createQuery("select distinct v from Voiture v  where v.modele=:imm and "
               + "(v.id not in (select a.voiture from Assurance a) or v.id in ( select a.voiture from Assurance a where a.dateFin =:dat))" );
             query_table.setParameter("imm",a); 
             query_table.setParameter("dat", dts);
              List<Voiture> voitu = query_table.list();
            
            DefaultTableModel tables = (DefaultTableModel) assur_affich.getModel();
       
         tables.setRowCount(0);
         for(Voiture mod:voitu){
             Object[] objvoit = new Object [] {mod.getId() , mod.getModele() ,mod.getImmat()};
             tables.addRow(objvoit);
        
          }
  }
    }//GEN-LAST:event_assur_modActionPerformed

    private void boton_assurMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_assurMouseClicked
     // Integer i = null  ;
    
     Voiture voit = new Voiture();
     Integer id = null ;

        if(assur_affich.getSelectedRow() > -1){
     int[] row  = assur_affich.getSelectedRows();
         for (int i = 0; i < row.length; i++) {
    
      Integer num = Integer.parseInt(assur_affich.getValueAt(row[i], 0).toString());
        
           
             
             voit.setId(num);
          Assurance assur = new Assurance();
     try {
             SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
          Date date = formatter.parse(this.debut_assurance.getText());
          Date date1 = formatter.parse(this.fin_assurance.getText());
          assur.setDateDeb(date);
          assur.setDateFin(date1);
      } catch (ParseException e) {
          
      }
      assur.setNumAssu(Integer.parseInt(num_assur.getText()));
      assur.setMontant(Float.parseFloat(assur_montant.getText()));
      assur.setVoiture(voit);
      voit.getAssurances().add(assur);
     
      operation.Addasurance(assur);

         }
         }
      
        combolist();
      
      
    }//GEN-LAST:event_boton_assurMouseClicked

    private void tech_modActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tech_modActionPerformed
        if(tech_mod.getSelectedItem().equals("")){
  
  }
  else {
      String a = tech_mod.getSelectedItem().toString();
      Date dts = null ;

          LocalDate ds=LocalDateTime.now().toLocalDate();
           dts = java.sql.Date.valueOf(ds);
 // JOptionPane.showMessageDialog(null,a);
   session = NewHibernateUtil.getSessionFactory().openSession(); 
       Query query_table =session.createQuery("select distinct v from Voiture v  where v.modele=:imm and (v.id not in (select k.voiture from Visite k) or v.id in ( select k.voiture FROM  Visite k where k.dateFin=:dat))" );
             query_table.setParameter("imm",a); 
             query_table.setParameter("dat", dts);
              List<Voiture> voitu = query_table.list();
            
            DefaultTableModel tables = (DefaultTableModel) affi_tech.getModel();
       
         tables.setRowCount(0);
         for(Voiture mod:voitu){
             Object[] objvoit = new Object [] {mod.getId() , mod.getModele() ,mod.getImmat()};
             tables.addRow(objvoit);
        
          }
  }
    }//GEN-LAST:event_tech_modActionPerformed

    private void boton_visitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_visitMouseClicked
       
     Voiture voit = new Voiture();
     Integer id = null ;
       for(int i=0 ; i<affi_tech.getRowCount(); i++) {
           try {
           if(affi_tech.getValueAt(i, 0).toString() != null){
        Boolean checked = Boolean.valueOf(affi_tech.getValueAt(i, 0).toString());
     
        if(checked){
                String col = affi_tech.getValueAt(i, 2).toString();
         
             Query query = session.createQuery("SELECT e.id FROM Voiture e WHERE e.immat=:col");
             query.setParameter("col", col);
              id = (Integer) query.uniqueResult();
             
             voit.setId(id);

         
        }
           }else {
            JOptionPane.showMessageDialog(null,"please check the car you want to set assurance");
        }
           }catch(Exception e){
               
           }
    }
       
       
       
         
        if(affi_tech.getSelectedRow() > -1){
     int[] row  = affi_tech.getSelectedRows();
         for (int i = 0; i < row.length; i++) {
    
      Integer num = Integer.parseInt(affi_tech.getValueAt(row[i], 0).toString());
        
           
             
             voit.setId(num);
         Visite visite = new Visite();
           try {
             SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
          Date date = formatter.parse(debut_visit.getText());
          Date date1 = formatter.parse(fin_visit.getText());
          visite.setDateDeb(date);
          
          visite.setDateFin(date1);
      } catch (ParseException e) {
          JOptionPane.showMessageDialog(null,"please insert a correct date");
      }
      
      visite.setMontant(Float.parseFloat(visit_montant.getText()));
      
      visite.setVoiture(voit);
      voit.getVisites().add(visite);
     
      operation.Addvisite(visite);
      
             
      
           
          
         }
         }
      visittech();  
      
      
      
      
      
    }//GEN-LAST:event_boton_visitMouseClicked

    private void vidan_modActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vidan_modActionPerformed
         if(vidan_mod.getSelectedItem().equals("")){
  
  }
  else {
      String a = vidan_mod.getSelectedItem().toString();
      Date dts = null ;

          LocalDate ds=LocalDateTime.now().toLocalDate();
           dts = java.sql.Date.valueOf(ds);
  //JOptionPane.showMessageDialog(null,a);
   session = NewHibernateUtil.getSessionFactory().openSession(); 
       Query query_table =session.createQuery("select distinct v from Voiture v  "
               + "where v.modele=:imm and (v.id not in (select k.voiture from Vidange k) or v.id in ( select k.voiture FROM Voiture v , Vidange k where k.kmVidange >= v.km ))" );
             query_table.setParameter("imm",a); 
            
              List<Voiture> voitu = query_table.list();
            
            DefaultTableModel tables = (DefaultTableModel) vidan_affi.getModel();
       Boolean cheks  = null ;
         tables.setRowCount(0);
         for(Voiture mod:voitu){
             Object[] objvoit = new Object [] {mod.getId() , mod.getModele() ,mod.getImmat()};
             tables.addRow(objvoit);
        
          }
  }
    }//GEN-LAST:event_vidan_modActionPerformed

    private void boton_vidangeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_vidangeMouseClicked
        
     Voiture voit = new Voiture();
     Integer id = null ;
   
       
          
        if(vidan_affi.getSelectedRow() > -1){
     int[] row  = vidan_affi.getSelectedRows();
         for (int i = 0; i < row.length; i++) {
    
      Integer num = Integer.parseInt(vidan_affi.getValueAt(row[i], 0).toString());
        
           
             
             voit.setId(num);
       Vidange vidange = new Vidange();
      try {
             SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
          Date date = formatter.parse(date_entre.getText());
          
          vidange.setDateEntre(date);
          
          
      } catch (ParseException e) {
          JOptionPane.showMessageDialog(null,"please insert a correct date");
      }
      Integer km = Integer.parseInt(km_vidange.getText());
      vidange.setKmVidange(Integer.parseInt(km_new.getText()));
       vidange.setMontant(Integer.parseInt(vidange_montant.getText()));
      vidange.setKm(Integer.parseInt(km_vidange.getText()));
      vidange.setVoiture(voit);
      voit.getVidanges().add(vidange);
     
      operation.Addvidange(vidange);
       operation.Editkmvoiture(id, km);
      
             
      
           
          
         }
         } else {
            JOptionPane.showMessageDialog(null,"please check the car you want to set vidange");
        }
        vidan_affi();
       
       
    }//GEN-LAST:event_boton_vidangeMouseClicked

    private void air_modActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_air_modActionPerformed
        if(air_mod.getSelectedItem().equals("")){
  
  }
  else {
      String a = air_mod.getSelectedItem().toString();
      Date dts = null ;

          LocalDate ds=LocalDateTime.now().toLocalDate();
           dts = java.sql.Date.valueOf(ds);
 // JOptionPane.showMessageDialog(null,a);
   session = NewHibernateUtil.getSessionFactory().openSession(); 
       Query query_table =session.createQuery("select distinct v from Voiture v  "
               + "where v.modele=:imm and (v.id not in (select k.voiture from Filtreair k) or v.id in ( select k.voiture FROM Filtreair k ))" );
             query_table.setParameter("imm",a); 
            
              List<Voiture> voitu = query_table.list();
            
            DefaultTableModel tables = (DefaultTableModel) affi_air.getModel();
       Boolean cheks  = null ;
         tables.setRowCount(0);
         for(Voiture mod:voitu){
             Object[] objvoit = new Object [] {mod.getId() , mod.getModele() ,mod.getImmat()};
             tables.addRow(objvoit);
        
          }
  }
    }//GEN-LAST:event_air_modActionPerformed

    private void boton_filtreairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_filtreairMouseClicked

     Voiture voit = new Voiture();
     Integer id = null ;
    
        if(affi_air.getSelectedRow() > -1){
     int[] row  = affi_air.getSelectedRows();
         for (int i = 0; i < row.length; i++) {
    
      Integer num = Integer.parseInt(affi_air.getValueAt(row[i], 0).toString());
        
           
             
             voit.setId(num);
                Filtreair air = new Filtreair();
     try {
             SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
          Date date = formatter.parse(date_entrefiltre.getText());
          
          air.setDate(date);
          
          
      } catch (Exception e) {
          JOptionPane.showMessageDialog(null,"please insert a correct date");
      }
      
      air.setKm(Integer.parseInt(km_filtreair.getText()));
       air.setMontant(Integer.parseInt(filtr_mont.getText()));
      
      air.setVoiture(voit);
      voit.getFiltreairs().add(air);
     
      operation.Addfiltra(air);
 
         }
         }else {
            JOptionPane.showMessageDialog(null,"please check the car you want to set assurance");
}
          affi_air();
       
    }//GEN-LAST:event_boton_filtreairMouseClicked

    private void huile_modActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_huile_modActionPerformed
            if(huile_mod.getSelectedItem().equals("")){
  
  }
  else {
      String a = huile_mod.getSelectedItem().toString();
      Date dts = null ;

          LocalDate ds=LocalDateTime.now().toLocalDate();
           dts = java.sql.Date.valueOf(ds);
  JOptionPane.showMessageDialog(null,a);
   session = NewHibernateUtil.getSessionFactory().openSession(); 
       Query query_table =session.createQuery("select distinct v from Voiture v  "
               + "where v.modele=:imm and (v.id not in (select k.voiture from Filtrehuile k) or v.id in ( select k.voiture FROM Filtrehuile k ))" );
             query_table.setParameter("imm",a); 
            
              List<Voiture> voitu = query_table.list();
            
            DefaultTableModel tables = (DefaultTableModel) huille_affi.getModel();
       Boolean cheks  = null ;
         tables.setRowCount(0);
         for(Voiture mod:voitu){
             Object[] objvoit = new Object [] {mod.getId() , mod.getModele() ,mod.getImmat()};
             tables.addRow(objvoit);
        
          }
  }
    }//GEN-LAST:event_huile_modActionPerformed

    private void boton_filtrehMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_filtrehMouseClicked
       
     Voiture voit = new Voiture();
     Integer id = null ;
 
        if(huille_affi.getSelectedRow() > -1){
     int[] row  = huille_affi.getSelectedRows();
         for (int i = 0; i < row.length; i++) {
    
      Integer num = Integer.parseInt(huille_affi.getValueAt(row[i], 0).toString());
        
           
             
             voit.setId(num);
          Filtrehuile huile = new Filtrehuile();
     try {
             SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
          Date date = formatter.parse(date_filtreh.getText());
          
         huile.setDate(date);
          
          
      } catch (ParseException e) {
          JOptionPane.showMessageDialog(null,"please insert a correct date");
      }
      
      huile.setKm(Integer.parseInt(km_filtreh.getText()));
       huile.setMontant(Integer.parseInt(filtreh_montant.getText()));
      
      huile.setVoiture(voit);
      voit.getFiltrehuiles().add(huile);
     
      operation.Addfiltrh(huile);
 
          
         }
         }else {
            JOptionPane.showMessageDialog(null,"please check the car you want to set assurance");
        }
       
       huille_affi();
       
    }//GEN-LAST:event_boton_filtrehMouseClicked

    private void autre_modActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_autre_modActionPerformed
      if(autre_mod.getSelectedItem().equals("")){
  
  }
  else {
      String a = autre_mod.getSelectedItem().toString();
      Date dts = null ;

          LocalDate ds=LocalDateTime.now().toLocalDate();
           dts = java.sql.Date.valueOf(ds);
  //JOptionPane.showMessageDialog(null,a);
   session = NewHibernateUtil.getSessionFactory().openSession(); 
       Query query_table =session.createQuery("select distinct v from Voiture v  "
               + "where v.modele=:imm and (v.id not in (select k.voiture from Autre k) or v.id in ( select k.voiture FROM Autre k ))" );
             query_table.setParameter("imm",a); 
            
              List<Voiture> voitu = query_table.list();
            
            DefaultTableModel tables = (DefaultTableModel) autre_affi.getModel();
       Boolean cheks  = null ;
         tables.setRowCount(0);
         for(Voiture mod:voitu){
             Object[] objvoit = new Object [] {mod.getId(), mod.getModele() ,mod.getImmat()};
             tables.addRow(objvoit);
        
          }
  }
    }//GEN-LAST:event_autre_modActionPerformed

    private void boton_autremaintMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_autremaintMouseClicked
        
         
        
        
      //Autre autre = new Autre();
     Voiture voit = new Voiture();
     Integer id = null ;
        if(autre_affi.getSelectedRow() > -1){
     int[] row  = autre_affi.getSelectedRows();
         for (int i = 0; i < row.length; i++) {
    
      Integer num = Integer.parseInt(autre_affi.getValueAt(row[i], 0).toString());
        
           
             
             voit.setId(num);
         Autre autre = new Autre();
      try {
             SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
          Date date = formatter.parse(date_autre.getText());
          
         autre.setDate(date);
          
          
      } catch (Exception e) {
          JOptionPane.showMessageDialog(null,"please insert a correct date");
      }
      
      autre.setKm(Integer.parseInt(km_autre.getText()));
       autre.setMontant(Float.parseFloat(autre_montant.getText()));
      autre.setRemarque(autre_remarq.getText());
      autre.setVoiture(voit);
      voit.getAutres().add(autre);
      operation.Autremaint(autre);
      
             
      
           
          
         }
         }
       autre_affi();
       
    }//GEN-LAST:event_boton_autremaintMouseClicked
    
    private void maint_modActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maint_modActionPerformed
       
           if(maint_mod.getSelectedIndex() == -1){
  
  }
 else {
      String a = maint_mod.getSelectedItem().toString();
 
   session = NewHibernateUtil.getSessionFactory().openSession(); 
   //   Query query_table =session.createQuery("select distinct v from Voiture v  where v.modele=:imm and (v.id not in (select k.voiture from Autre k) or v.id in ( select k.voiture FROM Autre k ))" );
      Query query_voit =sessions.createQuery("select v.immat , v.modele , a.dateDeb , a.dateFin , s.dateDeb , s.dateFin , d.dateEntre , d.km from Voiture v left join v.assurances a  left join v.visites s  left join v.vidanges d   where v.modele=:imm" );
  // 
             query_voit.setParameter("imm",a); 
            
              List<Object> voitu = query_voit.list();
            
            DefaultTableModel tables = (DefaultTableModel) maint_join.getModel();
       Boolean cheks  = null ;
         tables.setRowCount(0);
        
         for(int i =0 ; i< voitu.size() ; i++){
    
       
             Object[] objvoit = new Object [] {((Object[]) voitu.get(i))[0] ,((Object[]) voitu.get(i))[1],((Object[]) voitu.get(i))[2],((Object[]) voitu.get(i))[3],((Object[]) voitu.get(i))[4],((Object[]) voitu.get(i))[5],((Object[]) voitu.get(i))[6],((Object[]) voitu.get(i))[7] , cheks };
             tables.addRow(objvoit);
      }
  }
             
    }//GEN-LAST:event_maint_modActionPerformed

    private void show_maintMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_show_maintMouseClicked
       int k  = maint_join.getSelectedRow();
       Integer id = null ;
           if(k > -1){
           TableModel table = maint_join.getModel();
          Integer num =Integer.parseInt(table.getValueAt(k, 0).toString());
           String immat = table.getValueAt(k, 1).toString();
           String modele = table.getValueAt(k, 1).toString();
            session = NewHibernateUtil.getSessionFactory().openSession();
         
            j_mod.setText(modele);
             j_immats.setText(immat);
          
              
        
               
                Query query_assur =sessions.createQuery("select   a.numAssu ,a.dateDeb , a.dateFin , a.montant  from Voiture v left outer join v.assurances a on (a.voiture.id=:id ) where v.id=:id ");
               query_assur.setParameter("id",num);
                List <Object> assur = query_assur.list();
                
                Query query_visite =sessions.createQuery("select s.id ,  s.dateDeb , s.dateFin , s.montant   from Voiture v left outer join v.visites s on (s.voiture.id=:id)  where v.id=:id ");
               query_visite.setParameter("id",num);
                List <Object> visite = query_visite.list();
                
                Query query_vidange =sessions.createQuery("select vi.id , vi.dateEntre , vi.km , vi.montant   from Voiture v  left outer join v.vidanges vi on (vi.voiture.id=:id) where v.id=:id ");
               query_vidange.setParameter("id",num);
                List <Object> vidange = query_vidange.list();
                
                Query query_fh =sessions.createQuery("select fh.id , fh.date , fh.km , fh.montant   from Voiture v  left outer join v.filtrehuiles fh on (fh.voiture.id=:id)  where v.id=:id ");
               query_fh.setParameter("id",num);
                List <Object> fh = query_fh.list();
                
                 Query query_fa =sessions.createQuery("select fa.id , fa.date ,fa.km , fa.montant   from Voiture v   left outer join  v.filtreairs fa on (fa.voiture.id=:id)   where v.id=:id ");
               query_fa.setParameter("id",num);
                List <Object> fa = query_fa.list();
                
                  Query query_autre =sessions.createQuery("select au.id , au.date , au.km , au.montant , au.remarque  from Voiture v  left outer join v.autres au on (au.voiture.id=:id) where v.id=:id ");
               query_autre.setParameter("id",num);
                List <Object> autre = query_autre.list();
                
                
                
                
          
        // JOptionPane.showMessageDialog(null,voitu);
         DefaultTableModel tables = (DefaultTableModel) assur_show.getModel();
          DefaultTableModel table_visite = (DefaultTableModel) visite_show.getModel();
          DefaultTableModel table_vidange = (DefaultTableModel) vidange_show.getModel();
           DefaultTableModel table_fh = (DefaultTableModel) fh_show.getModel();
            DefaultTableModel table_fa = (DefaultTableModel) fa_show.getModel();
              DefaultTableModel table_autre = (DefaultTableModel) autre_show.getModel();
           table_visite.setRowCount(0);
           table_vidange.setRowCount(0);
           table_fa.setRowCount(0);
            table_fh.setRowCount(0);
            table_autre.setRowCount(0);
         tables.setRowCount(0);
          Boolean a = null ;
         Boolean check = null ;
      // ((Object[]) voitu.get(i))[4],((Object[]) voitu.get(i))[5],((Object[]) voitu.get(i))[6],((Object[]) voitu.get(i))[7] ,
      //  JOptionPane.showMessageDialog(null,voitu.size());
    
          for(int m =0 ; m< assur.size() ; m++){
                Object[] objassur = new Object [] {((Object[]) assur.get(m))[0] ,((Object[]) assur.get(m))[1],((Object[]) assur.get(m))[2],((Object[]) assur.get(m))[3], check };
                  tables.addRow(objassur);
       
      }    
              
          for(int m =0 ; m< visite.size() ; m++){
    
             Object[] objvisite = new Object [] {((Object[]) visite.get(m))[0] ,((Object[]) visite.get(m))[1],((Object[]) visite.get(m))[2] ,((Object[]) visite.get(m))[3],  check };
             table_visite.addRow(objvisite);
             
      }    
          
          
           for(int m =0 ; m< vidange.size() ; m++){
           
             Object[] objvidange = new Object [] {((Object[]) vidange.get(m))[0] ,((Object[]) vidange.get(m))[1],((Object[]) vidange.get(m))[2] ,((Object[]) vidange.get(m))[3],  check };
             table_vidange.addRow(objvidange);
            
      }    
                  for(int m =0 ; m< fh.size() ; m++){
            
              Object[] objfh = new Object [] {((Object[]) fh.get(m))[0] ,((Object[]) fh.get(m))[1],((Object[]) fh.get(m))[2] ,((Object[]) fh.get(m))[3],  check };
             table_fh.addRow(objfh);
           
      }    
                  
                  
                  for(int m =0 ; m< fa.size() ; m++){
          
             Object[] objfa = new Object [] {((Object[]) fa.get(m))[0] ,((Object[]) fa.get(m))[1],((Object[]) fa.get(m))[2] ,((Object[]) fa.get(m))[3] ,  check };
             table_fa.addRow(objfa);
          
      }    
                  
                  
                  for(int m =0 ; m< autre.size() ; m++){
              
            Object[] objautre = new Object [] {((Object[]) autre.get(m))[0] ,((Object[]) autre.get(m))[1],((Object[]) autre.get(m))[2] ,((Object[]) autre.get(m))[3], ((Object[]) autre.get(m))[4], check };
             table_autre.addRow(objautre);
      }    
          
               CardLayout cardLayout1 = (CardLayout) affichage.getLayout();
           cardLayout1.show(affichage, "show_maint");
           
              
            
           } else {
               JOptionPane.showMessageDialog(null,"No row selected");
    }
        
        
       
    }//GEN-LAST:event_show_maintMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
int aa = all_show.getSelectedIndex() ;
    JOptionPane.showMessageDialog(null,aa);
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void show_maint1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_show_maint1MouseClicked
      int aa = all_show.getSelectedIndex() ;
      //  JOptionPane.showMessageDialog(null,aa);
        tab.setText(Integer.toString(aa));
      Assurance assur = new Assurance();
      Vidange vidan = new Vidange();
      Filtrehuile fh = new Filtrehuile();
      Filtreair fa = new Filtreair();
      Visite visite = new Visite();
      Autre autre = new Autre();
      if(aa == 0){
          int i  = assur_show.getSelectedRow();
           if(i > -1){
           TableModel table = assur_show.getModel();
           Integer num = Integer.parseInt(table.getValueAt(i, 0).toString());
           
            session = NewHibernateUtil.getSessionFactory().openSession();
           
              Query q =session.createQuery("from Assurance where num_assu=:imm" );
              q.setParameter("imm",num);
              List<Assurance> voit = q.list();
             
             for(Assurance assu:voit){
                  edit_numassur.setText(Integer.toString(assu.getNumAssu()));
               
                  String id = Integer.toString(assu.getId());
                  edit_id.setText(id);
                  edit_datedeb.setText(assu.getDateDeb().toString());
              
                  edit_datefin.setText(assu.getDateFin().toString());
               
                  String nbrplace = Float.toString(assu.getMontant());
                  edit_montant.setText(nbrplace);
                  Format formatter = new SimpleDateFormat("yyyy-MM-dd");
                  String deb = formatter.format(assu.getDateDeb());
                  edit_datedeb.setText(deb);
                  String fin = formatter.format(assu.getDateFin());
                  
              
                  edit_datefin.setText(fin);
                  edit_remar.setVisible(false);
                  edit_km.setVisible(false);
                  edit_entretien.setVisible(false);
                  tab.setVisible(false);
                  label_remarque.setVisible(false);
                  labe_km.setVisible(false);
                  date.setVisible(false);
                  tab.setVisible(false);
                  edit_id.setVisible(false);
           }
                 CardLayout cardLayout1 = (CardLayout) affichage.getLayout();
           cardLayout1.show(affichage, "edit_all");
           }
      } else if (aa == 1){
          int i  = visite_show.getSelectedRow();
       
           if(i > -1){
           TableModel table = visite_show.getModel();
          Integer num = Integer.parseInt(table.getValueAt(i, 0).toString());
            JOptionPane.showMessageDialog(null,num);
            session = NewHibernateUtil.getSessionFactory().openSession();
           
              Query q =session.createQuery("from Visite   where id=:id" );
              q.setParameter("id",num);
              List<Visite> voit = q.list();
             
            for(Visite visit:voit){
                 //for(int m =0 ; m< voit.size() ; m++){  
           //    JOptionPane.showMessageDialog(null,tab.getText());
                
                  String id =Integer.toString(visit.getId());
                  edit_id.setText(id);
                    JOptionPane.showMessageDialog(null,id);
                  String montant =Float.toString(visit.getMontant());
                  edit_montant.setText(montant);
                  
                  Format formatter = new SimpleDateFormat("yyyy-MM-dd");
                  String deb = formatter.format(visit.getDateDeb());
                  edit_datedeb.setText(deb);
                  String fin = formatter.format(visit.getDateFin());
                  edit_datefin.setText(fin);
                  
                  
                  edit_remar.setVisible(false);
                  edit_km.setVisible(false);
                  edit_entretien.setVisible(false);
                  tab.setVisible(false);
                  label_remarque.setVisible(false);
                  labe_km.setVisible(false);
                  date.setVisible(false);
                  tab.setVisible(false);
                  edit_id.setVisible(false);
                  edit_numassur.setVisible(false);
           }
                 CardLayout cardLayout1 = (CardLayout) affichage.getLayout();
           cardLayout1.show(affichage, "edit_all");
           }
      } else if (aa == 2) {
           int i  = vidange_show.getSelectedRow();
       
           if(i > -1){
           TableModel table = vidange_show.getModel();
          Integer num = Integer.parseInt(table.getValueAt(i, 0).toString());
            JOptionPane.showMessageDialog(null,num);
            session = NewHibernateUtil.getSessionFactory().openSession();
           
              Query q =session.createQuery("from Vidange   where id=:id" );
              q.setParameter("id",num);
              List<Vidange> voit = q.list();
             
            for(Vidange vida:voit){
                 //for(int m =0 ; m< voit.size() ; m++){  
           //    JOptionPane.showMessageDialog(null,tab.getText());
                
                  String id =Integer.toString(vida.getId());
                  edit_id.setText(id);
                    JOptionPane.showMessageDialog(null,id);
                  String montant =Float.toString(vida.getMontant());
                  edit_montant.setText(montant);
                  
                  Format formatter = new SimpleDateFormat("yyyy-MM-dd");
                  String deb = formatter.format(vida.getDateEntre());
                  edit_entretien.setText(deb);
                    String km =Integer.toString(vidan.getKm());
                  edit_km.setText(km);
                  
                  
                  edit_remar.setVisible(false);
                //  edit_km.setVisible(false);
                 // edit_entretien.setVisible(false);
                  tab.setVisible(false);
                  
               //   labe_km.setVisible(false);
                  edit_datedeb.setVisible(false);
                  edit_datefin.setVisible(false);
                  edit_id.setVisible(false);
                  edit_numassur.setVisible(false);
                  
                  label_remarque.setVisible(false);
                  label_num.setVisible(false);
                  label_datdeb.setVisible(false);
                  label_datefin.setVisible(false);
                  
           }
                 CardLayout cardLayout1 = (CardLayout) affichage.getLayout();
           cardLayout1.show(affichage, "edit_all");
           }
      }else if(aa == 3){
          int i  = fh_show.getSelectedRow();
       
           if(i > -1){
           TableModel table = fh_show.getModel();
          Integer num = Integer.parseInt(table.getValueAt(i, 0).toString());
            JOptionPane.showMessageDialog(null,num);
            session = NewHibernateUtil.getSessionFactory().openSession();
           
              Query q =session.createQuery("from Filtrehuile   where id=:id" );
              q.setParameter("id",num);
              List<Filtrehuile> voit = q.list();
             
            for(Filtrehuile filtrh:voit){
                 //for(int m =0 ; m< voit.size() ; m++){  
           //    JOptionPane.showMessageDialog(null,tab.getText());
                
                  String id =Integer.toString(filtrh.getId());
                  edit_id.setText(id);
                    JOptionPane.showMessageDialog(null,id);
                  String montant =Float.toString(filtrh.getMontant());
                  edit_montant.setText(montant);
                  
                  Format formatter = new SimpleDateFormat("yyyy-MM-dd");
                  String deb = formatter.format(filtrh.getDate());
                  edit_entretien.setText(deb);
                    String km =Integer.toString(filtrh.getKm());
                  edit_km.setText(km);
                  
                  
                  edit_remar.setVisible(false);
                //  edit_km.setVisible(false);
                 // edit_entretien.setVisible(false);
                  tab.setVisible(false);
                  
               //   labe_km.setVisible(false);
                  edit_datedeb.setVisible(false);
                  edit_datefin.setVisible(false);
                  edit_id.setVisible(false);
                  edit_numassur.setVisible(false);
                  
                  label_remarque.setVisible(false);
                  label_num.setVisible(false);
                  label_datdeb.setVisible(false);
                  label_datefin.setVisible(false);
                  
           }
                 CardLayout cardLayout1 = (CardLayout) affichage.getLayout();
           cardLayout1.show(affichage, "edit_all");
           }
      }else if (aa == 4){
          int i  = fa_show.getSelectedRow();
       
           if(i > -1){
           TableModel table = fa_show.getModel();
          Integer num = Integer.parseInt(table.getValueAt(i, 0).toString());
            JOptionPane.showMessageDialog(null,num);
            session = NewHibernateUtil.getSessionFactory().openSession();
           
              Query q =session.createQuery("from Filtreair   where id=:id" );
              q.setParameter("id",num);
              List<Filtreair> voit = q.list();
             
            for(Filtreair filtra:voit){
                 //for(int m =0 ; m< voit.size() ; m++){  
           //    JOptionPane.showMessageDialog(null,tab.getText());
                
                  String id =Integer.toString(filtra.getId());
                  edit_id.setText(id);
                    JOptionPane.showMessageDialog(null,id);
                  String montant =Float.toString(filtra.getMontant());
                  edit_montant.setText(montant);
                  
                  Format formatter = new SimpleDateFormat("yyyy-MM-dd");
                  String deb = formatter.format(filtra.getDate());
                  edit_entretien.setText(deb);
                    String km =Integer.toString(filtra.getKm());
                  edit_km.setText(km);
                  
                  
                  edit_remar.setVisible(false);
                //  edit_km.setVisible(false);
                 // edit_entretien.setVisible(false);
                  tab.setVisible(false);
                  
               //   labe_km.setVisible(false);
                  edit_datedeb.setVisible(false);
                  edit_datefin.setVisible(false);
                  edit_id.setVisible(false);
                  edit_numassur.setVisible(false);
                  
                  label_remarque.setVisible(false);
                  label_num.setVisible(false);
                  label_datdeb.setVisible(false);
                  label_datefin.setVisible(false);
                  
           }
                 CardLayout cardLayout1 = (CardLayout) affichage.getLayout();
           cardLayout1.show(affichage, "edit_all");
           }
      }else if (aa == 5) {
           int i  = autre_show.getSelectedRow();
       
           if(i > -1){
           TableModel table = autre_show.getModel();
          Integer num = Integer.parseInt(table.getValueAt(i, 0).toString());
            JOptionPane.showMessageDialog(null,num);
            session = NewHibernateUtil.getSessionFactory().openSession();
           
              Query q =session.createQuery("from Autre   where id=:id" );
              q.setParameter("id",num);
              List<Autre> voit = q.list();
             
            for(Autre aut:voit){
                 //for(int m =0 ; m< voit.size() ; m++){  
           //    JOptionPane.showMessageDialog(null,tab.getText());
                
                  String id =Integer.toString(aut.getId());
                  edit_id.setText(id);
                    JOptionPane.showMessageDialog(null,id);
                  String montant =Float.toString(aut.getMontant());
                  edit_montant.setText(montant);
                  
                  Format formatter = new SimpleDateFormat("yyyy-MM-dd");
                  String deb = formatter.format(aut.getDate());
                  edit_entretien.setText(deb);
                    String km =Integer.toString(aut.getKm());
                  edit_km.setText(km);
                  String remar = aut.getRemarque();
                  edit_remar.setText(remar);
                  
                 // edit_remar.setVisible(false);
                //  edit_km.setVisible(false);
                 // edit_entretien.setVisible(false);
                  tab.setVisible(false);
                  
               //   labe_km.setVisible(false);
                  edit_datedeb.setVisible(false);
                  edit_datefin.setVisible(false);
                  edit_id.setVisible(false);
                  edit_numassur.setVisible(false);
                  
                //  label_remarque.setVisible(false);
                  label_num.setVisible(false);
                  label_datdeb.setVisible(false);
                  label_datefin.setVisible(false);
                  
           }
                 CardLayout cardLayout1 = (CardLayout) affichage.getLayout();
           cardLayout1.show(affichage, "edit_all");
           }
      }
    }//GEN-LAST:event_show_maint1MouseClicked

    private void print_maint1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_print_maint1MouseClicked
     int p = JOptionPane.showConfirmDialog(null,"Voulez-vous supprimer ce champs ?","Delete",JOptionPane.YES_NO_OPTION);
     if (p== 0){
        Integer verif = all_show.getSelectedIndex() ;
       
    switch (verif) {
        case 0:
            {
                int i  = assur_show.getSelectedRow();
                if(i > -1){
                    TableModel table = assur_show.getModel();
                    Integer num = Integer.parseInt(table.getValueAt(i, 0).toString());
                    
                    session = NewHibernateUtil.getSessionFactory().openSession();
                    
                    Query q =session.createQuery("from Assurance where num_assu=:imm" );
                    q.setParameter("imm",num);
                    List<Assurance> voit = q.list();
                    voit.forEach((assur) -> {
                        operation.deleteassurance(assur.getId());
                    });
                }else {
                    JOptionPane.showMessageDialog(null,"Please select a row");
                }    break;
            }
        case 1:
            {
                int i  = visite_show.getSelectedRow();
                if(i > -1){
                    TableModel table = visite_show.getModel();
                    Integer num = Integer.parseInt(table.getValueAt(i, 0).toString());
                    
                    
                    operation.deletevisite(num);
                } else {
                    JOptionPane.showMessageDialog(null,"Please select a row");
                }    break;
            }
        case 2:
            {
                int i  = vidange_show.getSelectedRow();
                if(i > -1){
                    TableModel table = vidange_show.getModel();
                    Integer num = Integer.parseInt(table.getValueAt(i, 0).toString());
                    
                    
                    operation.deletevidange(num);
                } else {
                    JOptionPane.showMessageDialog(null,"Please select a row");
                }    break;
            }
        case 3:
            {
                int i  = fh_show.getSelectedRow();
                if(i > -1){
                    TableModel table = fh_show.getModel();
                    Integer num = Integer.parseInt(table.getValueAt(i, 0).toString());
                    
                    
                    operation.deletefh(num);
                } else {
                    JOptionPane.showMessageDialog(null,"Please select a row");
                }    break;
            }
        case 4:
            {
                int i  = fa_show.getSelectedRow();
                if(i > -1){
                    TableModel table = fa_show.getModel();
                    Integer num = Integer.parseInt(table.getValueAt(i, 0).toString());
                    
                    
                    operation.deletefa(num);
                } else {
                    JOptionPane.showMessageDialog(null,"Please select a row");
                }    break;
            }
        case 5:
            {
                int i  = autre_show.getSelectedRow();
                if(i > -1){
                    TableModel table = autre_show.getModel();
                    Integer num = Integer.parseInt(table.getValueAt(i, 0).toString());
                    
                    
                    operation.deleteautre(num);
                } else {
                    JOptionPane.showMessageDialog(null,"Please select a row");
                }    break;
            }
        default:
            break;
    }
     }
    }//GEN-LAST:event_print_maint1MouseClicked

    private void tabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tabActionPerformed

    private void edit_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edit_idActionPerformed

    private void edit_maintMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_edit_maintMouseClicked
      Integer verif= Integer.parseInt(tab.getText());
      if (verif == 0){
          Assurance assur = new Assurance();
          assur.setNumAssu(Integer.parseInt(edit_numassur.getText()));
         try { 
          SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
          Date datedeb = formatter.parse(edit_datedeb.getText());
          assur.setDateDeb(datedeb);
          Date datefin = formatter.parse(edit_datefin.getText());
          assur.setDateFin(datefin);
         }catch(ParseException e){
             
         }
         assur.setMontant(Float.parseFloat(edit_montant.getText()));
         Integer id = Integer.parseInt(edit_id.getText());
         operation.Editassurance(assur, id);
         
         
      } else if (verif == 1){
          Visite visite = new Visite();
          try {
           SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
          Date datedeb = formatter.parse(edit_datedeb.getText());
          visite.setDateDeb(datedeb);
           Date datefin = formatter.parse(edit_datefin.getText());
          visite.setDateFin(datefin);
          }catch(ParseException e){
              
          }
          visite.setMontant(Float.parseFloat(edit_montant.getText()));
          Integer id = Integer.parseInt(edit_id.getText());
      } else if (verif == 2){
          Vidange vidange = new Vidange();
          try {
              SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
              Date dateentre = formatter.parse(edit_entretien.getText());
          vidange.setDateEntre(dateentre);
              
          }catch(ParseException e){
              
          }
          vidange.setKm(Integer.parseInt(edit_km.getText()));
          vidange.setMontant(Float.parseFloat(edit_montant.getText()));
          Integer id = Integer.parseInt(edit_id.getText());
          operation.Editvidange(vidange, id);
      }else if (verif == 3){
          Filtrehuile fh = new Filtrehuile();
          try {
              SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
              Date date_entre = formatter.parse(edit_entretien.getText());
          fh.setDate(date_entre);
              
          }catch(ParseException e){
              
          }
          fh.setKm(Integer.parseInt(edit_km.getText()));
          fh.setMontant(Float.parseFloat(edit_montant.getText()));
          Integer id = Integer.parseInt(edit_id.getText());
          operation.Editfh(fh, id);
      } else if (verif == 4){
          Filtreair fa = new Filtreair();
          try {
              SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
              Date date_entre = formatter.parse(edit_entretien.getText());
          fa.setDate(date_entre);
              
          }catch(ParseException e){
              
          }
          fa.setKm(Integer.parseInt(edit_km.getText()));
          fa.setMontant(Float.parseFloat(edit_montant.getText()));
          Integer id = Integer.parseInt(edit_id.getText());
          operation.Editfa(fa, id);
      } else if (verif == 5){
           Autre aut = new Autre();
          try {
              SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
              Date date_entre = formatter.parse(edit_entretien.getText());
          aut.setDate(date_entre);
              
          }catch(ParseException e){
              
          }
          aut.setKm(Integer.parseInt(edit_km.getText()));
          aut.setMontant(Float.parseFloat(edit_montant.getText()));
          aut.setRemarque(edit_remar.getText());
          Integer id = Integer.parseInt(edit_id.getText());
          operation.Editautre(aut, id);
      }
    }//GEN-LAST:event_edit_maintMouseClicked

    private void save_societeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_save_societeMouseClicked
         Societe societe = new Societe() ; 
      
        societe.setNom(societe_nom.getText());
        societe.setEmail(societe_email.getText());
        societe.setMatFiscal(societe_fiscal.getText());
        societe.setTel(Integer.parseInt(societe_tel.getText()));
        societe.setAdresse(societe_adresse.getText());
        
       operation.Addsociete(societe);
    }//GEN-LAST:event_save_societeMouseClicked

    private void societi_deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_societi_deleteMouseClicked
       int i  = list_societe.getSelectedRow();
           if(i > -1){
        int p = JOptionPane.showConfirmDialog(null,"Voulez-vous supprimer ce champs ?","Delete",JOptionPane.YES_NO_OPTION);
     if (p== 0){
   
                int ik  = list_societe.getSelectedRow();
                if(ik > -1){
                    TableModel table = list_societe.getModel();
                    Integer num = Integer.parseInt(table.getValueAt(ik, 0).toString());
                    
                    
                    
                        operation.Deletesociete(num);
                    
                }else {
                    JOptionPane.showMessageDialog(null,"Please select a row");
                }   
     }
     }else {
                    JOptionPane.showMessageDialog(null,"Please select a row");
                }  
    }//GEN-LAST:event_societi_deleteMouseClicked

    private void societi_histoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_societi_histoMouseClicked
int i  = list_societe.getSelectedRow();
           if(i > -1){
          TableModel table = list_societe.getModel();
           Integer num = Integer.parseInt(table.getValueAt(i, 0).toString());
           
            session = NewHibernateUtil.getSessionFactory().openSession();
           
              Query q =session.createQuery("from Societe where id=:id" );
              q.setParameter("id",num);
              List<Societe> socie = q.list();
             type_fact.setText("societe");
             for(Societe so:socie){
               
                  id_societfact.setText(Integer.toString(so.getId()));
                  soci_adresse.setText(so.getAdresse());
                  soci_email.setText(so.getEmail());
                  soci_fiscal.setText(so.getMatFiscal());
                  soci_tel.setText(Long.toString(so.getTel()));
                 societe_n.setText(so.getNom());
                 
             }
               CardLayout cardLayout1 = (CardLayout) affichage.getLayout();
           cardLayout1.show(affichage, "societe_fact");
           }else {
                    JOptionPane.showMessageDialog(null,"Please select a row");
                }  
           
    }//GEN-LAST:event_societi_histoMouseClicked

    private void societi_editMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_societi_editMouseClicked
         int i  = list_societe.getSelectedRow();
           if(i > -1){
          TableModel table = list_societe.getModel();
           Integer num = Integer.parseInt(table.getValueAt(i, 0).toString());
           
            session = NewHibernateUtil.getSessionFactory().openSession();
           
              Query q =session.createQuery("from Societe where id=:id" );
              q.setParameter("id",num);
              List<Societe> socie = q.list();
             
             for(Societe so:socie){
               
                  id_societ.setText(Integer.toString(so.getId()));
                  edit_societe_nom.setText(so.getNom());
                  edit_societe_email.setText(so.getEmail());
                  edit_societe_fiscal.setText(so.getMatFiscal());
                  edit_societe_tel.setText(Long.toString(so.getTel()));
                  edit_societe_adresse.setText(so.getAdresse());
                 
             }
               CardLayout cardLayout1 = (CardLayout) affichage.getLayout();
           cardLayout1.show(affichage, "edit_societ");
           }else {
                    JOptionPane.showMessageDialog(null,"Please select a row");
                }  
           
    }//GEN-LAST:event_societi_editMouseClicked

    private void societi_contratMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_societi_contratMouseClicked
        int i  = list_societe.getSelectedRow();
           if(i > -1){
          TableModel table = list_societe.getModel();
           Integer num = Integer.parseInt(table.getValueAt(i, 0).toString());
           
            session = NewHibernateUtil.getSessionFactory().openSession();
           
              Query q =session.createQuery("from Societe where id=:id" );
              q.setParameter("id",num);
              List<Societe> socie = q.list();
             type_contrat.setText("societe");
             for(Societe so:socie){
               
                 id_contrat.setText(Integer.toString(so.getId()));
                  nom_prenom.setText(so.getNom());
                  
                  num_identite.setText(so.getMatFiscal());
                 tel_client.setText(Long.toString(so.getTel()));
                  client_adresse.setText(so.getAdresse());
                 
             }
               CardLayout cardLayout1 = (CardLayout) affichage.getLayout();
           cardLayout1.show(affichage, "ajout_contrat");
           }else {
                    JOptionPane.showMessageDialog(null,"Please select a row");
                }  
    }//GEN-LAST:event_societi_contratMouseClicked

    private void edit_societeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_edit_societeMouseClicked
            Integer id = Integer.parseInt(id_societ.getText());
        Societe socie = new Societe();
        
        socie.setNom(edit_societe_nom.getText());
        socie.setEmail(edit_societe_email.getText());
        socie.setMatFiscal(edit_societe_fiscal.getText());
        socie.setTel(Integer.parseInt(edit_societe_tel.getText()));
        socie.setAdresse(edit_societe_adresse.getText());
         
         operation.Editsociti(socie, id);
         
         
         
    }//GEN-LAST:event_edit_societeMouseClicked

    private void id_societActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_societActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_societActionPerformed

    private void societe_imprMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_societe_imprMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_societe_imprMouseClicked

    private void fact_societeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fact_societeMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_fact_societeMouseClicked

    private void save_clientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_save_clientMouseClicked
        Client client = new Client() ; 
        client.setType(client_type.getSelectedItem().toString());
        client.setIdentite(Integer.parseInt(client_num.getText()));

        try {
         SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
          Date date = formatter.parse(client_date.getText());
          client.setDelivre(date);
           Date datenaiss = formatter.parse(client_naiss.getText());
          client.setDateNaiss(datenaiss);
        }catch(ParseException e) {
            
        }
        client.setLieuDelivr(client_lieu_identite.getText());
        client.setNomprenom(client_nom.getText());
        client.setNationalite(natinalite_client.getText());
        client.setEmail(email_client.getText());
        client.setTel(Integer.parseInt(client_tel.getText()));
        client.setLieuNaiss(client_lieu_naiss.getText());
        client.setAdresse(adresse_client.getText());
     
       operation.Addclient(client);
        CardLayout cardLayout1 = (CardLayout) affichage.getLayout();
           cardLayout1.show(affichage, "add_client");
    }//GEN-LAST:event_save_clientMouseClicked

    private void client_deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_client_deleteMouseClicked
        int p = JOptionPane.showConfirmDialog(null,"Voulez-vous supprimer ce champs ?","Delete",JOptionPane.YES_NO_OPTION);
     if (p== 0){
   
                int i  = client_affi.getSelectedRow();
                if(i > -1){
                    TableModel table = client_affi.getModel();
                    Integer num = Integer.parseInt(table.getValueAt(i, 0).toString());
                    
                    
                    
                        operation.Deleteclient(num);
                    
                }else {
                    JOptionPane.showMessageDialog(null,"Please select a row");
                }   
     }
    }//GEN-LAST:event_client_deleteMouseClicked

    private void client_editMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_client_editMouseClicked
           int i  = client_affi.getSelectedRow();
           if(i > -1){
          TableModel table = client_affi.getModel();
           Integer num = Integer.parseInt(table.getValueAt(i, 0).toString());
           
            session = NewHibernateUtil.getSessionFactory().openSession();
           
              Query q =session.createQuery("from Client where id=:id" );
              q.setParameter("id",num);
              List<Client> cli = q.list();
             type_contrat.setText("client");
             for(Client so:cli){
                 id_modif.setText(Integer.toString(so.getId()));
                  editclient_type.setSelectedItem(so.getType());
               editclient_num.setText(Long.toString(so.getIdentite()));
               editclient_date.setText(so.getDelivre().toString());
               editclient_lieu_identite.setText(so.getDelivre().toString());
               editclient_nom.setText(so.getNomprenom());
               editclient_naiss.setText(so.getDateNaiss().toString());
               editnatinalite_client.setText(so.getNationalite());
               editemail_client.setText(so.getEmail());
                editclient_tel.setText(Long.toString(so.getTel()));
                editclient_lieu_naiss.setText(so.getLieuNaiss());
                editadresse_client.setText(so.getAdresse());
                 
             }
               CardLayout cardLayout1 = (CardLayout) affichage.getLayout();
           cardLayout1.show(affichage, "editt_client");
           }else {
                    JOptionPane.showMessageDialog(null,"Please select a row");
                }  
           
    }//GEN-LAST:event_client_editMouseClicked

    private void client_contratMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_client_contratMouseClicked
       int i  = client_affi.getSelectedRow();
           if(i > -1){
          TableModel table = client_affi.getModel();
           Integer num = Integer.parseInt(table.getValueAt(i, 0).toString());
           
            session = NewHibernateUtil.getSessionFactory().openSession();
           
              Query q =session.createQuery("from Client where id=:id" );
              q.setParameter("id",num);
              List<Client> cli = q.list();
             
             for(Client so:cli){
              id_contrat.setText(so.getId().toString());
               type_iden.setSelectedItem(so.getType());
               num_identite.setText(Long.toString(so.getIdentite()));
               identite_date.setText(so.getDelivre().toString());
               lieu_identite.setText(so.getLieuDelivr());
               nom_prenom.setText(so.getNomprenom());
               client_naissance.setText(so.getDateNaiss().toString());
               client_nationalite.setText(so.getNationalite());
        
                tel_client.setText(Long.toString(so.getTel()));
                client_lieunaiss.setText(so.getLieuNaiss());
                client_adresse.setText(so.getAdresse());
             }
               CardLayout cardLayout1 = (CardLayout) affichage.getLayout();
           cardLayout1.show(affichage, "ajout_contrat");
           }else {
                    JOptionPane.showMessageDialog(null,"Please select a row");
                }  
           
    }//GEN-LAST:event_client_contratMouseClicked

    private void client_histoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_client_histoMouseClicked
      
       int i  = client_affi.getSelectedRow();
           if(i > -1){
          TableModel table = client_affi.getModel();
           Integer num = Integer.parseInt(table.getValueAt(i, 0).toString());
           
            session = NewHibernateUtil.getSessionFactory().openSession();
           
              Query q =session.createQuery("from Client where id=:id" );
              q.setParameter("id",num);
              List<Client> socie = q.list();
             type_fact.setText("societe");
             for(Client so:socie){
               
                  id_societfact.setText(Integer.toString(so.getId()));
                  soci_adresse.setText(so.getAdresse());
                  soci_email.setText(so.getEmail());
                 
                  soci_tel.setText(Long.toString(so.getTel()));
                 societe_n.setText(so.getNomprenom());
                 
             }
              type_fact.setText("client");
       nom_action.setText("Client");
       
       soci_fiscal.setVisible(false);
       matfis.setVisible(false);
               CardLayout cardLayout1 = (CardLayout) affichage.getLayout();
           cardLayout1.show(affichage, "societe_fact");
           }else {
                    JOptionPane.showMessageDialog(null,"Please select a row");
                }  
           
      
    }//GEN-LAST:event_client_histoMouseClicked

    private void editclient_lieu_naissActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editclient_lieu_naissActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editclient_lieu_naissActionPerformed

    private void modif_clientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modif_clientMouseClicked
       Integer id = Integer.parseInt(id_modif.getText());
    
         
         
         
         
         
           Client client = new Client() ; 
        client.setType(editclient_type.getSelectedItem().toString());
        client.setIdentite(Integer.parseInt(editclient_num.getText()));

        try {
         SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
          Date date = formatter.parse(editclient_date.getText());
          client.setDelivre(date);
           Date datenaiss = formatter.parse(editclient_naiss.getText());
          client.setDateNaiss(datenaiss);
        }catch(ParseException e) {
            
        }
        client.setLieuDelivr(editclient_lieu_identite.getText());
        client.setNomprenom(editclient_nom.getText());
        client.setNationalite(editnatinalite_client.getText());
        client.setEmail(editemail_client.getText());
        client.setTel(Integer.parseInt(editclient_tel.getText()));
        client.setLieuNaiss(editclient_lieu_naiss.getText());
        client.setAdresse(editadresse_client.getText());
     
       operation.Editclient(client, id);
        CardLayout cardLayout1 = (CardLayout) affichage.getLayout();
           cardLayout1.show(affichage, "add_client");
    }//GEN-LAST:event_modif_clientMouseClicked

    private void contrat_modelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contrat_modelActionPerformed
      try {
        contrat_imma.removeAllItems();
        String a = contrat_model.getSelectedItem().toString();
 // JOptionPane.showMessageDialog(null,a);
 
   session = NewHibernateUtil.getSessionFactory().openSession(); 
       Query query_table =session.createQuery("from Voiture v where v.modele=:imm" );
   //  Query query_table =session.createQuery("select cv.voiture.modele  from Voiture as v , Contrat ctr , ctr.assocontratvoitures as cs , v.assocontratvoitures as cv  where v.id not in (select cv.voiture from  cv) or v.id  in (select cs.voiture  from  cs where (cs.contrat.dateDep not between :deb and :ret) and (cs.contrat.dateRet not between :deb and :ret)  ) " );
            
     query_table.setParameter("imm",a); 
                
           /*  query_table.setFirstResult(0);
              query_table.setMaxResults(1);*/
              
              List<Voiture> voitu = query_table.list();
            
           
       
         
         for(Voiture mod:voitu){
             contrat_imma.addItem(mod.getImmat());
           
          }
        
      }catch(Exception e){
         contrat_model.getMouseListeners();
      }
         
         
    }//GEN-LAST:event_contrat_modelActionPerformed

    private void conducteurtwoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_conducteurtwoMouseClicked
      jdialog_contrat.setVisible(true);
    }//GEN-LAST:event_conducteurtwoMouseClicked

    private void num_identiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num_identiteActionPerformed
      String socie = num_identite.getText();
      Integer client = Integer.parseInt(num_identite.getText());
        List<Societe> societe = null ;
        List<Client> cli = null ;
      
    //   identite_date.setText("aaaa");
     try{
          /* Query query_client =session.createQuery("select a.id from Client a where a.identite=:iden" );
             query_client.setParameter("iden",Integer.parseInt(socie)); 
         idclient=(long) query_client.uniqueResult();*/
          Query query_clientlist =session.createQuery("from Client v where v.identite=:idcl " );
             query_clientlist.setParameter("idcl",Long.parseLong(socie)); 
             cli = query_clientlist.list();
    }catch(NumberFormatException e){
        JOptionPane.showMessageDialog(null,e);
    }
    try {
       /* Query query_socie =session.createQuery("select v.id from Societe v where v.matFiscal=:fisc" );
             query_socie.setParameter("fisc",socie); 
            idsocie=(Integer) query_socie.uniqueResult(); */
              Query query_socielist =session.createQuery("from Societe v where v.matFiscal=:idso " );
             query_socielist.setParameter("idso",socie); 
            societe = query_socielist.list();
    }
    catch(Exception e){
        
    }
       
             if(societe.size()>0){
                
                 for(Societe mods:societe){
              
                        nom_prenom.setText(mods.getNom());
                        tel_client.setText(Long.toString(mods.getTel()));
                        client_adresse.setText(mods.getAdresse());
                         id_contrat.setText(Integer.toString(mods.getId()));
                        type_contrat.setText("societe");
                        client_naissance.setText("");
                        client_lieunaiss.setText("");
                        client_nationalite.setText("");
                        identite_date.setText("");
                        lieu_identite.setText("");
                    JOptionPane.showMessageDialog(null, type_contrat.getText());
                 }
                 
             }
             
             else if (cli.size()>0){
                
            for(Client mod:cli){
              
                        nom_prenom.setText(mod.getNomprenom());
                        tel_client.setText(Long.toString(mod.getTel()));
                        client_adresse.setText(mod.getAdresse());
                        type_iden.setSelectedItem(mod.getType());
                        identite_date.setText(mod.getDelivre().toString());
                        lieu_identite.setText(mod.getLieuDelivr());
                        client_naissance.setText(mod.getDateNaiss().toString());
                        client_lieunaiss.setText(mod.getLieuNaiss());
                        client_nationalite.setText(mod.getNationalite());
                        id_contrat.setText(Integer.toString(mod.getId()));
                        type_contrat.setText("client");
                    JOptionPane.showMessageDialog(null, type_contrat.getText());
                     JOptionPane.showMessageDialog(null, mod.getId().toString());
                 }
             } else {
                 id_contrat.setText("");
                 JOptionPane.showMessageDialog(null, id_contrat.getText());
                  JOptionPane.showMessageDialog(null, type_contrat.getText());
             }
             
    }//GEN-LAST:event_num_identiteActionPerformed

    
        
    private void saveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveMouseClicked
    
        
        
        Contrat contrat = new Contrat();
        Client client = new Client();
        Paiment pai = new Paiment();
        Voiture voiture = new Voiture();
        Conducteur cond1 = new Conducteur();
         Conducteur cond2 = new Conducteur();
        Societe societe = new Societe();
        Assocontratvoiture aa = new Assocontratvoiture();
        Assocontratclient cliasso = new Assocontratclient();
         Assocontratpai clipaye = new Assocontratpai();
         Assocontratsocie asssocie = new Assocontratsocie();
         Assocontratconducteur assocond = new Assocontratconducteur();
         Assocontratconducteur assocond2 = new Assocontratconducteur();
      try {   
         try {
         SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
          Date dateco = formatter.parse(date_contrat.getText());
          contrat.setDateContrat(dateco);
         }catch(ParseException e){
             
         }
         contrat.setDateDep(contrat_deb.getDate());
         contrat.setDateRet(contrat_retour.getDate());
         java.sql.Time dep = null;
         java.sql.Time ret = null ;
         try {
           SimpleDateFormat format = new SimpleDateFormat("hh:mm");
           dep = new java.sql.Time(format.parse(heure_dep.getSelectedItem().toString()).getTime());
           ret = new java.sql.Time(format.parse(heure_fin.getSelectedItem().toString()).getTime());
           JOptionPane.showMessageDialog(null,heure_dep.getSelectedItem());
          JOptionPane.showMessageDialog(null,dep);
          JOptionPane.showMessageDialog(null,ret);
          contrat.setHeureDep(dep);
          contrat.setHeureRet(ret);
         }catch(HeadlessException | ParseException e){
             
         }
         JOptionPane.showMessageDialog(null,dep);
          JOptionPane.showMessageDialog(null,ret);
         contrat.setLieuDep(lieu_depart.getText());
         contrat.setLieuRetour(lieu_retour.getText());
         contrat.setKmDep(Integer.parseInt(km_dep.getText()));
       //  contrat.setKmRetour(Integer.parseInt(km_retour.getText()));
         
         String immat = contrat_imma.getSelectedItem().toString();
         
         Query query_table =session.createQuery("select v.id from Voiture v where v.immat=:imm" );
             query_table.setParameter("imm",immat); 
            
             Integer id =(Integer) query_table.uniqueResult();
// try {            
 if (id != null){
   voiture.setId(id);
aa.setContrat(contrat);
aa.setVoiture(voiture);
operation.Addcontrat(contrat , aa);
 }else {
      JOptionPane.showMessageDialog(null, "pas de voiture disponible");
 }

          if (null != type_contrat.getText())switch (type_contrat.getText()) {
        case "societe":
            societe.setId(Integer.parseInt(id_contrat.getText()));
            asssocie.setContrat(contrat);
            asssocie.setSociete(societe);
            operation.Addassocontratsocie(societe, asssocie);
            break;
        case "client":
            client.setId(Integer.parseInt(id_contrat.getText()));
            cliasso.setContrat(contrat);
            cliasso.setClient(client);
            operation.Addassocontratclient(client, cliasso);
            JOptionPane.showMessageDialog(null, "send information to imp");
            break;
        case "":
           // String verif =num_identite.getText();
            //   Query query_client =session.createQuery("select v.id from Client v where v.identite:imm" );
            //  query_client.setParameter("imm",verif);
            //  Integer idcli =(Integer) query_client.uniqueResult();
            client.setType(type_iden.getSelectedItem().toString());
            client.setIdentite(Integer.parseInt(num_identite.getText()));
            try {
                SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
                Date dateclient = formatter.parse(identite_date.getText());
                client.setDelivre(dateclient);
                Date datenaiss = formatter.parse(client_naissance.getText());
                client.setDateNaiss(datenaiss);
            }catch(ParseException e){
                
            } 
            client.setLieuDelivr(lieu_identite.getText());
            client.setNomprenom(nom_prenom.getText());
            client.setTel(Integer.parseInt(tel_client.getText()));
            client.setLieuNaiss(client_lieunaiss.getText());
            client.setAdresse(client_adresse.getText());
            client.setNationalite(client_nationalite.getText());
            client.setEmail("");
            cliasso.setContrat(contrat);
            cliasso.setClient(client);
            operation.Addassocontratclient(client , cliasso);
            JOptionPane.showMessageDialog(null, "send all");
            break;
        default:
            break;
    }
              
              /****************paiment*********************/
       pai.setTypeGatan(pay_type.getSelectedItem().toString());
       pai.setTypePay(type_pay.getSelectedItem().toString());
       pai.setGatanti(Float.parseFloat(montant_gatan.getText()));
       pai.setPay(Float.parseFloat(montant_pay.getText()));
       pai.setDatePay(pai_day.getDate());
       pai.setRemarque(observation.getText());
        clipaye.setContrat(contrat);
        clipaye.setPaiment(pai);
        operation.Addassocontratpai(pai, clipaye);
        
        
       
       
       
         /****************Conducteur*********************/
      
      
            /*    Query query_cond =session.createQuery("select v.id from Conducteur v where v.identite=:imm" );
           query_cond.setParameter("imm",verifcond); 
           Integer idcond =(Integer) query_cond.uniqueResult();*/
              if(id_cond1.getText().isEmpty() == false){
                   Integer verifcond = Integer.parseInt(id_cond1.getText());
                cond1.setId(verifcond);
                assocond.setConducteur(cond1);
                assocond.setContrat(contrat);
                operation.Addassocontratconducteur(cond1, assocond);
              }else {
                  cond1.setType(type_identite.getSelectedItem().toString());
                  cond1.setIdentite(Integer.parseInt(identite_num.getText()));
                cond1.setRealisIdenti(identite_lieu.getText());
                  try {
         SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
          Date datecond = formatter.parse(date_identite.getText());
          cond1.setDateIdent(datecond);
          Date datenaissc = formatter.parse(date_permis.getText());
          cond1.setDateperm(datenaissc);
         }catch(ParseException e){
             
         }
            cond1.setNompre(prenom_nom.getText());
            cond1.setNpermis(Integer.parseInt(conducteur_permis.getText()));
            cond1.setPermisDelivr(lieu_permis.getText());
            
            assocond.setConducteur(cond1);
            assocond.setContrat(contrat);
            operation.Addassocontratconducteur(cond1, assocond);
            
            
            
                    
              }
 /*}catch(Exception e){
     JOptionPane.showMessageDialog(null,"not complete");
 }*/
         if(niden != null && lieuid != "" && dtdel != null && dtnai != null && np != "" && permco != null){
              if(id_cond2.getText().isEmpty() == false){
             Integer verifcond = Integer.parseInt(id_cond2.getText());
                cond2.setId(verifcond);
                assocond2.setConducteur(cond2);
                assocond2.setContrat(contrat);
                operation.Addassocontratconducteur(cond2, assocond2);
              }else {
                  cond2.setType(typcon);
                  cond2.setIdentite(niden);
                cond2.setRealisIdenti(lieuid);
                
                cond2.setDateIdent(dtdel);
                cond2.setDateperm(dtnai);
            cond2.setNompre(np);
            cond2.setNpermis(permco);
            cond2.setPermisDelivr(lieperm);
            cond2.setDateperm(dtdel);
            assocond2.setConducteur(cond2);
            assocond2.setContrat(contrat);
            operation.Addassocontratconducteur(cond2, assocond2);
            
             
         }
         }
 
         
         
         
         
      } catch (HeadlessException | NumberFormatException e){
                JOptionPane.showMessageDialog(null,"il faut que vous saisie tou les champ");
               }


lieu_depart.setText("");
lieu_retour.setText("");
km_dep.setText("");

id_contrat.setText("");

lieu_identite.setText("");
nom_prenom.setText("");
tel_client.setText("");
client_lieunaiss.setText("");
client_adresse.setText("");
client_nationalite.setText("");

montant_gatan.setText("");
montant_pay.setText("");

observation.setText("");
id_cond1.setText("");

identite_num.setText("");
identite_lieu.setText("");
date_identite.setText("");
date_permis.setText("");
conducteur_permis.setText("");
prenom_nom.setText("");
lieu_permis.setText("");

 

      
    }//GEN-LAST:event_saveMouseClicked
/*conducteur 1 automatique get information*/
    private void identite_numActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_identite_numActionPerformed
        Long conduc = Long.parseLong(identite_num.getText());
           
           List<Conducteur> cond = null ;
           try {
            Query query_condlist =session.createQuery("from Conducteur v where v.identite=:idcon " );
             query_condlist.setParameter("idcon",conduc); 
            cond = query_condlist.list();
           }catch (Exception e){
                   
                   }
           
           if(cond.size()>0){
                
            for(Conducteur mode:cond){
                prenom_nom.setText(mode.getNompre());
                       
                        type_iden.setSelectedItem(mode.getType());
                        date_identite.setText(mode.getDateIdent().toString());
                        identite_lieu.setText(mode.getRealisIdenti());
                         date_permis.setText(mode.getDateperm().toString());
                        id_cond1.setText(Integer.toString(mode.getId()));
                        conducteur_permis.setText(Long.toString(mode.getNpermis()));
                        lieu_permis.setText(mode.getPermisDelivr());
             }
            
            
             }else {
               id_cond1.setText("");
                 JOptionPane.showMessageDialog(null, id_cond1.getText());
           }
    }//GEN-LAST:event_identite_numActionPerformed
/*Conducteur 2 automatique get information */
    private void identite_num2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_identite_num2ActionPerformed
        Long conduc = Long.parseLong(identite_num2.getText());
           
           List<Conducteur> cond = null ;
           try {
            Query query_condlist =session.createQuery("from Conducteur v where v.identite=:idcon " );
             query_condlist.setParameter("idcon",conduc); 
            cond = query_condlist.list();
           }catch (Exception e){
                   
                   }
           
           if(cond.size()>0){
                
            for(Conducteur mode:cond){
               prenom_nom2.setText(mode.getNompre());
                       
                        type_identite3.setSelectedItem(mode.getType());
                        date_identite2.setText(mode.getDateIdent().toString());
                        identite_lieu2.setText(mode.getRealisIdenti());
                         date_permis2.setText(mode.getDateperm().toString());
                        id_cond2.setText(Integer.toString(mode.getId()));
                        conducteur_permis2.setText(Long.toString(mode.getNpermis()));
                        lieu_permis2.setText(mode.getPermisDelivr());
             }
            
            
             }else {
               id_cond2.setText("");
                 JOptionPane.showMessageDialog(null, id_cond2.getText());
           }
           
    
  
    }//GEN-LAST:event_identite_num2ActionPerformed
/*conducteur 2 option*/
    private void jButton8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseClicked
       jdialog_contrat.setVisible(false);
       identite_num2.setText("");
            identite_lieu2.setText("");
            date_identite2.setText("");
             date_permis2.setText("");
             prenom_nom2.setText("");        
              conducteur_permis2.setText("");
                      lieu_permis2.setText("");
    }//GEN-LAST:event_jButton8MouseClicked

    private void cond2_butMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cond2_butMouseClicked
     
                   
                   
              
              typcon = type_identite3.getSelectedItem().toString();
               niden=Integer.parseInt(identite_num2.getText());
                lieuid=identite_lieu2.getText();
                  try {
         SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
          dtdel= formatter.parse(date_identite2.getText());
          
          dtnai= formatter.parse(date_permis2.getText());
         
         }catch(ParseException el){
             
         }
            np=prenom_nom2.getText();
            permco=Integer.parseInt(conducteur_permis2.getText());
            lieperm=lieu_permis2.getText();
            
            
            identite_num2.setText("");
            identite_lieu2.setText("");
            date_identite2.setText("");
             date_permis2.setText("");
             prenom_nom2.setText("");        
              conducteur_permis2.setText("");
                      lieu_permis2.setText("");
                   jdialog_contrat.setVisible(false);
       
    }//GEN-LAST:event_cond2_butMouseClicked
/*copy from client to conducteur*/
    private void copierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_copierMouseClicked
       type_identite.setSelectedItem(type_iden.getSelectedItem());
        identite_num.setText(num_identite.getText());
            identite_lieu.setText(lieu_identite.getText());
            date_identite.setText(identite_date.getText());
             date_permis.setText("");
             prenom_nom.setText(nom_prenom.getText());        
              conducteur_permis.setText("");
                      lieu_permis.setText("");
                  id_cond1.setText(id_contrat.getText());
                 
                       
                        
                        
                  
                       
                       
                      
                       
                             
                       
                      
                       
                       
                      
    }//GEN-LAST:event_copierMouseClicked

    private void lieu_departKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lieu_departKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_lieu_departKeyPressed

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
       show_contrat();
       choose_contrat.setText("client");
    }//GEN-LAST:event_jButton6MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        show_contratsociete();
        choose_contrat.setText("societe");
    }//GEN-LAST:event_jButton4MouseClicked

    private void edit_date_contratActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_date_contratActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edit_date_contratActionPerformed

    private void edit_contrat_modelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_contrat_modelActionPerformed
     try{
        edit_contrat_imma.removeAllItems();
        String a = edit_contrat_model.getSelectedItem().toString();
           
 // JOptionPane.showMessageDialog(null,a);
   session = NewHibernateUtil.getSessionFactory().openSession(); 
       Query query_table =session.createQuery("from Voiture v where v.modele=:imm" );
             query_table.setParameter("imm",a); 
             
              
              List<Voiture> voitu = query_table.list();
            
           
         
         
         for(Voiture mod:voitu){
             edit_contrat_imma.addItem(mod.getImmat());
           
          }
     }catch(Exception e){
         edit_contrat_model.getMouseListeners();
     }
    }//GEN-LAST:event_edit_contrat_modelActionPerformed

    private void edit_lieu_departKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edit_lieu_departKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_edit_lieu_departKeyPressed

    private void edit_num_identiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_num_identiteActionPerformed
         String socie = edit_num_identite.getText();
         id_clso = Integer.parseInt(edit_id_contrat.getText());
   
      List<Societe> societe = null ;
        List<Client> cli = null ;
      
   
    if(edit_type_contrat.getText().equals("client")){
        
        
     try{
          
          Query query_clientlist =session.createQuery("from Client v where v.identite=:idcl " );
             query_clientlist.setParameter("idcl",Long.parseLong(socie)); 
             cli = query_clientlist.list();
    }catch(NumberFormatException e){
        JOptionPane.showMessageDialog(null,e);
    }
   
    
    if (cli.size()>0){
                
            for(Client mod:cli){
              
                        edit_nom_prenom.setText(mod.getNomprenom());
                        edit_tel_client.setText(Long.toString(mod.getTel()));
                        edit_client_adresse.setText(mod.getAdresse());
                        edit_type_iden.setSelectedItem(mod.getType());
                        edit_identite_date.setText(mod.getDelivre().toString());
                        edit_lieu_identite.setText(mod.getLieuDelivr());
                        edit_client_naissance.setText(mod.getDateNaiss().toString());
                        edit_lieu_naiss.setText(mod.getLieuNaiss());
                        edit_client_nationalite.setText(mod.getNationalite());
                       id_cliso.setText(Integer.toString(mod.getId()));
                       
                    
                     JOptionPane.showMessageDialog(null, mod.getId().toString());
                 }
             } else {
                id_cliso.setText("");
                 JOptionPane.showMessageDialog(null, id_contrat.getText());
                  JOptionPane.showMessageDialog(null, type_contrat.getText());
             }
    }else if (edit_type_contrat.getText().equals("societe")){
         try {
       
              Query query_socielist =session.createQuery("from Societe v where v.matFiscal=:idso " );
             query_socielist.setParameter("idso",socie); 
            societe = query_socielist.list();
    }
    catch(Exception e){
         JOptionPane.showMessageDialog(null,e);
    }
          
             if(societe.size()>0){
                
                 for(Societe mods:societe){
              
                        edit_nom_prenom.setText(mods.getNom());
                        edit_tel_client.setText(Long.toString(mods.getTel()));
                        edit_client_adresse.setText(mods.getAdresse());
                         id_cliso.setText(Integer.toString(mods.getId()));
                        
                        client_naissance.setText("");
                        client_lieunaiss.setText("");
                        client_nationalite.setText("");
                        identite_date.setText("");
                        lieu_identite.setText("");
                    JOptionPane.showMessageDialog(null, "company exist");
                 }
                 
             }else {
                
                  JOptionPane.showMessageDialog(null, "le numéro fiscale saisie est inconnue , s'il vos plait ajouter une societé dans societé => ajout , puis revenir ici pour poursuivre votre démarche");
             }
    }
    }//GEN-LAST:event_edit_num_identiteActionPerformed

    private void edit_identite_num_conducActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_identite_num_conducActionPerformed
    Long conduc = Long.parseLong(edit_identite_num_conduc.getText());
           
           List<Conducteur> cond = null ;
           try {
            Query query_condlist =session.createQuery("from Conducteur v where v.identite=:idcon " );
             query_condlist.setParameter("idcon",conduc); 
            cond = query_condlist.list();
           }catch (Exception e){
                   
                   }
           
           if(cond.size()>0){
                
            for(Conducteur mode:cond){
                edit_prenom_nom_conduc.setText(mode.getNompre());
                       
                        edit_type_identite_conduc.setSelectedItem(mode.getType());
                        edit_date_identite_conduc.setText(mode.getDateIdent().toString());
                        edit_identite_lieu_conduc.setText(mode.getRealisIdenti());
                         edit_date_permis_conduc.setText(mode.getDateperm().toString());
                        edit_id_conduc1.setText(Integer.toString(mode.getId()));
                        edit_conducteur_permis.setText(Long.toString(mode.getNpermis()));
                        edit_lieu_permis_conduc.setText(mode.getPermisDelivr());
             }
            
            
             }else {
               edit_id_conduc1.setText("");
                 JOptionPane.showMessageDialog(null, edit_id_conduc1.getText());
           }


    
    }//GEN-LAST:event_edit_identite_num_conducActionPerformed

    private void edit_identite_num_conduc2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_identite_num_conduc2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edit_identite_num_conduc2ActionPerformed

    private void jLabel209MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel209MouseClicked
          int k  = show_contrat.getSelectedRow();
           if(k > -1){
           TableModel table = show_contrat.getModel();
          Integer num =Integer.parseInt(table.getValueAt(k, 0).toString());
           List <Object> voitu = new ArrayList<Object>();
         if (choose_contrat.getText().equals("client")) { 
            session = NewHibernateUtil.getSessionFactory().openSession();
             Query query_voit =sessions.createQuery(" select distinct a.contrat.id , a.voiture.id  , s.client.id , pai.paiment.id , conc.conducteur.id , conc2.conducteur.id from Contrat as c , Voiture as voi left outer join c.assocontratvoitures as a    left outer join c.assocontratclients as s    left outer join c.assocontratpais as pai   left outer join c.assocontratconducteurs as conc  left outer join c.assocontratconducteurs as conc2   where c.id=:idc  " );
 
        query_voit.setParameter("idc", num);
         voitu = query_voit.list();
         }else {
        Query query_voit =sessions.createQuery(" select distinct a.contrat.id , a.voiture.id  , s.societe.id , pai.paiment.id , conc.conducteur.id , conc2.conducteur.id from Contrat as c , Voiture as voi left outer join c.assocontratvoitures as a    left outer join c.assocontratsocies as s    left outer join c.assocontratpais as pai   left outer join c.assocontratconducteurs as conc  left outer join c.assocontratconducteurs as conc2   where c.id=:idc  " );
 
        query_voit.setParameter("idc", num);          
          voitu = query_voit.list();
         }
     JOptionPane.showMessageDialog(null,voitu.toArray());
         DefaultTableModel tables = (DefaultTableModel) show_contrat.getModel();
         tables.setRowCount(0);
        
       
        
     for(int i =0 ; i< voitu.size() ; i++){
    Integer cont = Integer.parseInt(((Object[]) voitu.get(i))[0].toString());
    Integer vo = Integer.parseInt(((Object[]) voitu.get(i))[1].toString()); 
   Integer clisoc = Integer.parseInt(((Object[]) voitu.get(i))[2].toString());
    Integer pa = Integer.parseInt(((Object[]) voitu.get(i))[3].toString());
    Integer cond1 = Integer.parseInt(((Object[]) voitu.get(i))[4].toString());
    Integer cond2 = Integer.parseInt(((Object[]) voitu.get(i))[5].toString());
    Query query_cont =sessions.createQuery("from Contrat c where c.id=:cont");
    query_cont.setParameter("cont", cont);
     List<Contrat> co = query_cont.list();
     edit_id_contrat.setText(Integer.toString(cont));
    Query query_voitu =sessions.createQuery("from Voiture c where c.id=:cont");
    query_voitu.setParameter("cont", vo);
     List<Voiture> vot = query_voitu.list();
     if (choose_contrat.getText().equals("client")){
        Query query_cli =sessions.createQuery("from Client c where c.id=:cont");
    query_cli.setParameter("cont", clisoc);
     List<Client> client = query_cli.list();
      for(Client ct:client){
        edit_type_iden.setSelectedItem(ct.getType());
        edit_num_identite.setText(Long.toString(ct.getIdentite()));
        edit_identite_date.setText(ct.getDelivre().toString());
        edit_lieu_identite.setText(ct.getLieuDelivr());
        edit_nom_prenom.setText(ct.getNomprenom());
        edit_tel_client.setText(Long.toString(ct.getTel()));
        edit_client_naissance.setText(ct.getDateNaiss().toString());
        edit_lieu_naiss.setText(ct.getLieuNaiss());
        edit_client_nationalite.setText(ct.getNationalite());
        edit_client_adresse.setText(ct.getAdresse());
        
        id_cliso.setText(Integer.toString(ct.getId()));
    }
     }else if (choose_contrat.getText().equals("societe")) {
         Query query_clis =sessions.createQuery("from Societe c where c.id=:cont");
    query_clis.setParameter("cont", clisoc);
     List<Societe> socie = query_clis.list();
     for(Societe cte:socie){
        
        edit_num_identite.setText(cte.getMatFiscal());
       
       
        edit_nom_prenom.setText(cte.getNom());
        edit_tel_client.setText(Long.toString(cte.getTel()));
       
      
        
        edit_client_adresse.setText(cte.getAdresse());
        
        id_cliso.setText(Integer.toString(cte.getId()));
    }
     }
       Query query_pai =sessions.createQuery("from Paiment c where c.id=:cont");
    query_pai.setParameter("cont", pa);
     List<Paiment> paim = query_pai.list();
     
       Query query_cond1 =sessions.createQuery("from Conducteur c where c.id=:cont");
    query_cond1.setParameter("cont", cond1);
     List<Conducteur> conduc1 = query_cond1.list();
     
     Query query_cond2 =sessions.createQuery("from Conducteur c where c.id=:cont");
    query_cond2.setParameter("cont", cond2);
     List<Conducteur> conduc2 = query_cond2.list();
     
    for(Contrat contr:co){
        edit_date_contrat.setText(contr.getDateContrat().toString());
        edit_contrat_deb.setDate(contr.getDateDep());
        edit_contrat_retour.setDate(contr.getDateRet());
       SimpleDateFormat form = new SimpleDateFormat("HH:mm");
        edit_heure_dep.setSelectedItem(form.format(contr.getHeureDep()));
        edit_heure_fin.setSelectedItem(form.format(contr.getHeureRet()));
        edit_km_dep.setText(Integer.toString(contr.getKmDep()));
        edit_lieu_depart.setText(contr.getLieuDep());
        edit_lieu_retour.setText(contr.getLieuRetour());
    }
    for(Voiture vd:vot){
       // edit_contrat_model.setSelectedItem(vd.getModele());
        edit_contrat_model.addItem(vd.getModele());
        id_veh.setText(Integer.toString(vd.getId()));
    }
    for(Paiment paime : paim){
        edit_montant_gatan.setText(Float.toString(paime.getGatanti()));
        edit_montant_pay.setText(Float.toString(paime.getPay()));
        edit_pay_gatan.setSelectedItem(paime.getTypeGatan());
        edit_type_pay.setSelectedItem(paime.getTypePay());
        edit_pai_day.setDate(paime.getDatePay());
        edit_observation.setText(paime.getRemarque());
        
        id_pai.setText(Integer.toString(paime.getId()));
    }
    for(Conducteur cnd :conduc1){
        edit_type_identite_conduc.setSelectedItem(cnd.getType());
        edit_identite_num_conduc.setText(Long.toString(cnd.getIdentite()));
        edit_date_identite_conduc.setText(cnd.getDateIdent().toString());
        edit_identite_lieu_conduc.setText(cnd.getRealisIdenti());
        edit_prenom_nom_conduc.setText(cnd.getNompre());
        edit_conducteur_permis.setText(Long.toString(cnd.getNpermis()));
        edit_lieu_permis_conduc.setText(cnd.getPermisDelivr());
        edit_date_permis_conduc.setText(cnd.getDateperm().toString());
        
        edit_id_conduc1.setText(Integer.toString(cnd.getId()));
    }
    for(Conducteur cnde :conduc2){
        edit_type_identite_conduc2.setSelectedItem(cnde.getType());
        edit_identite_num_conduc2.setText(Long.toString(cnde.getIdentite()));
        edit_date_identite_conduc2.setText(cnde.getDateIdent().toString());
        edit_identite_lieu_conduc2.setText(cnde.getRealisIdenti());
        edit_prenom_nom_conduc2.setText(cnde.getNompre());
        edit_conducteur_permis_conduc2.setText(Long.toString(cnde.getNpermis()));
        edit_lieu_permis_conduc2.setText(cnde.getPermisDelivr());
        edit_date_permis_conduc2.setText(cnde.getDateperm().toString());
        edit_id_conduc2.setText(Integer.toString(cnde.getId()));
    }
    edit_type_contrat.setText(choose_contrat.getText());
  
        /*     Object[] objvoit = new Object [] {((Object[]) voitu.get(i))[0] ,((Object[]) voitu.get(i))[1],((Object[]) voitu.get(i))[2],((Object[]) voitu.get(i))[3],((Object[]) voitu.get(i))[4],((Object[]) voitu.get(i))[5],((Object[]) voitu.get(i))[6],((Object[]) voitu.get(i))[7] ,((Object[]) voitu.get(i))[8],((Object[]) voitu.get(i))[9] };
             tables.addRow(objvoit);*/
      }
      CardLayout cardLayout1 = (CardLayout) affichage.getLayout();
           cardLayout1.show(affichage, "edit_contrat");
           }
    }//GEN-LAST:event_jLabel209MouseClicked

    private void edit_contrat_buttMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_edit_contrat_buttMouseClicked
         Contrat contrat = new Contrat();
        Client client = new Client();
        Paiment pai = new Paiment();
        Voiture voiture = new Voiture();
        Conducteur cond1 = new Conducteur();
         Conducteur cond2 = new Conducteur();
        Societe societe = new Societe();
        Assocontratvoiture aa = new Assocontratvoiture();
        Assocontratclient cliasso = new Assocontratclient();
         Assocontratpai clipaye = new Assocontratpai();
         Assocontratsocie asssocie = new Assocontratsocie();
         Assocontratconducteur assocond = new Assocontratconducteur();
         Assocontratconducteur assocond2 = new Assocontratconducteur();
       
      try {   
         try {
         SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
          Date dateco = formatter.parse(edit_date_contrat.getText());
          contrat.setDateContrat(dateco);
         }catch(ParseException e){
             
         }
         contrat.setDateDep(edit_contrat_deb.getDate());
         contrat.setDateRet(edit_contrat_retour.getDate());
         java.sql.Time dep = null;
         java.sql.Time ret = null ;
         try {
           SimpleDateFormat format = new SimpleDateFormat("hh:mm");
           dep = new java.sql.Time(format.parse(edit_heure_dep.getSelectedItem().toString()).getTime());
           ret = new java.sql.Time(format.parse(edit_heure_fin.getSelectedItem().toString()).getTime());
        
         
          contrat.setHeureDep(dep);
          contrat.setHeureRet(ret);
         }catch(HeadlessException | ParseException e){
             
         }
        
         contrat.setLieuDep(edit_lieu_depart.getText());
         contrat.setLieuRetour(edit_lieu_retour.getText());
         contrat.setKmDep(Integer.parseInt(edit_km_dep.getText()));
         contrat.setKmRetour(Integer.parseInt(edit_km_retour.getText()));
       //  contrat.setKmRetour(Integer.parseInt(km_retour.getText()));
         
         String immat = edit_contrat_imma.getSelectedItem().toString();
         Integer ids = Integer.parseInt(edit_id_contrat.getText());
          JOptionPane.showMessageDialog(null,"id contr = "+ids);
         Query query_table =session.createQuery("select v.id from Voiture v where v.immat=:imm" );
             query_table.setParameter("imm",immat); 
            
             Integer id =(Integer) query_table.uniqueResult();
             JOptionPane.showMessageDialog(null,"id veh = "+id);
              Query query_asso =session.createQuery("select v.id from Assocontratvoiture v where v.contrat.id=:ids" );
             query_asso.setParameter("ids",ids); 
            
             Integer idasso =(Integer) query_asso.uniqueResult();
              JOptionPane.showMessageDialog(null,"id asso = "+idasso);
             
 if (id != null){
   voiture.setId(id);
   contrat.setId(ids);
   aa.setId(idasso);
   
//aa.setContrat(contrat);
aa.setVoiture(voiture);
operation.Editcontratvoit(contrat , aa);
 }else {
      JOptionPane.showMessageDialog(null, "pas de voiture disponible");
 }
  /**************************************************/
 if (null != edit_type_contrat.getText())switch (edit_type_contrat.getText()) {
      /**************************************************/
        case "societe":
             /**************************************************/
            Query query_assosoc =session.createQuery("select v.id from Assocontratsocie v where v.contrat.id=:ids" );
             query_assosoc.setParameter("ids",ids); 
            
             Integer idassosoc =(Integer) query_assosoc.uniqueResult();
                    
                      societe.setNom(edit_nom_prenom.getText());
                      societe.setTel(Long.parseLong(edit_tel_client.getText()));
                        societe.setAdresse(edit_client_adresse.getText());
                        
                        edit_client_naissance.setText("");
                        edit_lieu_naiss.setText("");
                        edit_client_nationalite.setText("");
                        edit_identite_date.setText("");
                        edit_lieu_identite.setText("");
             societe.setId(Integer.parseInt(id_cliso.getText()));            
            asssocie.setId(idassosoc);
            asssocie.setSociete(societe);
            operation.Editcontratsocie(societe, asssocie);
            break;
             /**************************************************/
        case "client":
             /**************************************************/
            if((!(id_cliso.getText().equals("")))){
            Query query_assocli =session.createQuery("select v.id from Assocontratclient v where v.contrat.id=:ids" );
             query_assocli.setParameter("ids",ids); 
            
             Integer idassocli =(Integer) query_assocli.uniqueResult();
            client.setType(edit_type_iden.getSelectedItem().toString());
            client.setIdentite(Integer.parseInt(edit_num_identite.getText()));
            try {
                SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
                Date dateclient = formatter.parse(edit_identite_date.getText());
                client.setDelivre(dateclient);
                Date datenaiss = formatter.parse(edit_client_naissance.getText());
                client.setDateNaiss(datenaiss);
            }catch(ParseException e){
                
            } 
            client.setLieuDelivr(edit_lieu_identite.getText());
            client.setNomprenom(edit_nom_prenom.getText());
            client.setTel(Integer.parseInt(edit_tel_client.getText()));
            client.setLieuNaiss(edit_lieu_naiss.getText());
            client.setAdresse(edit_client_adresse.getText());
            client.setNationalite(edit_client_nationalite.getText());
            client.setEmail("");
            
            client.setId(Integer.parseInt(id_cliso.getText()));
            cliasso.setId(idassocli);
            cliasso.setClient(client);
            operation.Editcontratclient(client, cliasso , "edit");
            JOptionPane.showMessageDialog(null, "edit the same client");
            
           
            
                 /**************************************************/
            }else if(id_cliso.getText().equals("")){
                 /**************************************************/
                 Query query_assocli =session.createQuery("select v.id from Assocontratclient v where v.contrat.id=:ids" );
             query_assocli.setParameter("ids",ids); 
            
             Integer idassocli2 =(Integer) query_assocli.uniqueResult();
             
                 client.setType(edit_type_iden.getSelectedItem().toString());
            client.setIdentite(Integer.parseInt(edit_num_identite.getText()));
            try {
                SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
                Date dateclient = formatter.parse(edit_identite_date.getText());
                client.setDelivre(dateclient);
                Date datenaiss = formatter.parse(edit_client_naissance.getText());
                client.setDateNaiss(datenaiss);
            }catch(ParseException e){
                
            } 
            client.setLieuDelivr(edit_lieu_identite.getText());
            client.setNomprenom(edit_nom_prenom.getText());
            client.setTel(Integer.parseInt(edit_tel_client.getText()));
            client.setLieuNaiss(edit_lieu_naiss.getText());
            client.setAdresse(edit_client_adresse.getText());
            client.setNationalite(edit_client_nationalite.getText());
            client.setEmail("");
            
            cliasso.setId(idassocli2);
            cliasso.setClient(client);
            operation.Editcontratclient(client, cliasso , "addedit");
            JOptionPane.showMessageDialog(null, "edit with new client client");
            }
            break;
            
        
        default:
            break;
    }
  /***********************************************************************************************************************/
 
 /**************************************************************conducteur modif********************************************************************/
 /**************************************************************conducteur modif********************************************************************/

 if(edit_id_conduc1.getText().isEmpty() == false){
     if((!(edit_id_conduc1.getText().equals("")))){
            Query query_assocond1 =session.createQuery("select v.id from Assocontratconducteur v where v.contrat.id=:ids" );
             query_assocond1.setParameter("ids",ids); 
            
             Integer idassocond1 =(Integer) query_assocond1.uniqueResult();
                 cond1.setType(edit_type_identite_conduc.getSelectedItem().toString());
                  cond1.setIdentite(Integer.parseInt(edit_identite_num_conduc.getText()));
                cond1.setRealisIdenti(edit_identite_lieu_conduc.getText());
                  try {
         SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
          Date datecond = formatter.parse(edit_date_identite_conduc.getText());
          cond1.setDateIdent(datecond);
          Date datenaissc = formatter.parse(edit_date_permis_conduc.getText());
          cond1.setDateperm(datenaissc);
         }catch(ParseException e){
             
         }
            cond1.setNompre(edit_prenom_nom_conduc.getText());
            cond1.setNpermis(Integer.parseInt(edit_conducteur_permis.getText()));
            cond1.setPermisDelivr(edit_lieu_permis_conduc.getText());
                cond1.setId(idassocond1);
                assocond.setConducteur(cond1);
               
                operation.Editcontratconduc1(cond1, assocond , "editcond");
                
                
              }else if(edit_id_conduc1.getText().equals("")) {
                  
                  
                   Query query_assocond1 =session.createQuery("select v.id from Assocontratconducteur v where v.contrat.id=:ids" );
             query_assocond1.setParameter("ids",ids); 
            
             Integer idassocond11 =(Integer) query_assocond1.uniqueResult();
             
                 cond1.setType(edit_type_identite_conduc.getSelectedItem().toString());
                  cond1.setIdentite(Integer.parseInt(edit_identite_num_conduc.getText()));
                cond1.setRealisIdenti(edit_identite_lieu_conduc.getText());
                  try {
         SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
          Date datecond = formatter.parse(edit_date_identite_conduc.getText());
          cond1.setDateIdent(datecond);
          Date datenaissc = formatter.parse(edit_date_permis_conduc.getText());
          cond1.setDateperm(datenaissc);
         }catch(ParseException e){
             
         }
            cond1.setNompre(edit_prenom_nom_conduc.getText());
            cond1.setNpermis(Integer.parseInt(edit_conducteur_permis.getText()));
            cond1.setPermisDelivr(edit_lieu_permis_conduc.getText());
            assocond.setId(idassocond11);
            assocond.setConducteur(cond1);
            
            operation.Editcontratconduc1(cond1, assocond , "addcond");
            
              }
 
 }
 /*****************************************************************************************************************/
  /*****************************************************************************************************************/
 
 /**************************************************************************conducteur2 modif*******************************************************/
 /**************************************************************************conducteur2 modif*******************************************************/
  if(check_del.getText().equals("")){
 if(edit_id_conduc2.getText().isEmpty() == false){
     if((!(edit_id_conduc2.getText().equals("")))){
            Query query_assocond2 =session.createQuery("select v.id from Assocontratconducteur v where v.contrat.id=:ids" );
             query_assocond2.setParameter("ids",ids); 
            
             Integer idassocond2 =(Integer) query_assocond2.uniqueResult();
                 cond2.setType(edit_type_identite_conduc2.getSelectedItem().toString());
                  cond2.setIdentite(Integer.parseInt(edit_identite_num_conduc2.getText()));
                cond2.setRealisIdenti(edit_identite_lieu_conduc2.getText());
                  try {
         SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
          Date datecond = formatter.parse(edit_date_identite_conduc2.getText());
          cond2.setDateIdent(datecond);
          Date datenaissc = formatter.parse(edit_date_permis_conduc2.getText());
          cond2.setDateperm(datenaissc);
         }catch(ParseException e){
             
         }
            cond2.setNompre(edit_prenom_nom_conduc2.getText());
            cond2.setNpermis(Integer.parseInt(edit_conducteur_permis_conduc2.getText()));
            cond2.setPermisDelivr(edit_lieu_permis_conduc2.getText());
                cond2.setId(idassocond2);
                assocond2.setConducteur(cond2);
               
                operation.Editcontratconduc2(cond2, assocond2 , "editcond2");
                
                
              }else if(edit_id_conduc2.getText().equals("")) {
                  
                  
                   Query query_assocond2 =session.createQuery("select v.id from Assocontratconducteur v where v.contrat.id=:ids" );
             query_assocond2.setParameter("ids",ids); 
            
             Integer idassocond12 =(Integer) query_assocond2.uniqueResult();
             
                 cond2.setType(edit_type_identite_conduc2.getSelectedItem().toString());
                  cond2.setIdentite(Integer.parseInt(edit_identite_num_conduc2.getText()));
                cond2.setRealisIdenti(edit_identite_lieu_conduc2.getText());
                  try {
         SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
          Date datecond = formatter.parse(edit_date_identite_conduc2.getText());
          cond2.setDateIdent(datecond);
          Date datenaissc = formatter.parse(edit_date_permis_conduc2.getText());
          cond2.setDateperm(datenaissc);
         }catch(ParseException e){
             
         }
            cond2.setNompre(edit_prenom_nom_conduc.getText());
            cond2.setNpermis(Integer.parseInt(edit_conducteur_permis_conduc2.getText()));
            cond2.setPermisDelivr(edit_lieu_permis_conduc2.getText());
            assocond2.setId(idassocond12);
            assocond2.setConducteur(cond2);
            
            operation.Editcontratconduc2(cond2, assocond2 , "addcond2");
            
              }
 
 }
  }else if(check_del.getText().equals("delete")) {
      
  }
  
   pai.setTypeGatan(edit_pay_gatan.getSelectedItem().toString());
       pai.setTypePay(edit_type_pay.getSelectedItem().toString());
       pai.setGatanti(Float.parseFloat(edit_montant_gatan.getText()));
       pai.setPay(Float.parseFloat(edit_montant_pay.getText()));
       pai.setDatePay(edit_pai_day.getDate());
       pai.setRemarque(edit_observation.getText());
        clipaye.setContrat(contrat);
        clipaye.setPaiment(pai);
        operation.Addassocontratpai(pai, clipaye);
 /*************************************************************************************************************************************************************/
 /*************************************************************************************************************************************************************/
 
      }catch(HeadlessException | NumberFormatException e){
          
      }
    }//GEN-LAST:event_edit_contrat_buttMouseClicked

    private void contrat_modelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contrat_modelMouseClicked
      if(evt.getButton() == MouseEvent.BUTTON1) {
          try{
        contrat_model.removeAllItems();;
      
        Date deb = contrat_deb.getDate();
  Date ret= contrat_retour.getDate();
   session = NewHibernateUtil.getSessionFactory().openSession(); 
    
   Query query_table =session.createQuery("select distinct  m from Voiture as v , Contrat ctr , Model as m where ((v.id not in (select cv.voiture from  v.assocontratvoitures as cv)) or (v.id  in (select cs.voiture  from  ctr.assocontratvoitures as cs where (cs.contrat.dateDep<:deb and cs.contrat.dateRet <:deb) or (cs.contrat.dateDep>:ret and cs.contrat.dateRet>:ret))  )) and v.modele=m.model " );
       
        
     query_table.setDate("deb",deb); 
            query_table.setDate("ret",ret); 
         
              
              List<Model> voitu = query_table.list();
        
           
       
         
         for(Model mod:voitu){
             contrat_model.addItem(mod.getModel());
           
          }
      }catch(Exception e){
           //   contrat_model.getMouseListeners();
              }
      }
    }//GEN-LAST:event_contrat_modelMouseClicked

    private void edit_contrat_modelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_edit_contrat_modelMouseClicked
       if(evt.getButton() == MouseEvent.BUTTON1) {
          try{
        edit_contrat_model.removeAllItems();;
      
        Date deb = edit_contrat_deb.getDate();
  Date ret= edit_contrat_retour.getDate();
   session = NewHibernateUtil.getSessionFactory().openSession(); 
    
   Query query_table =session.createQuery("select distinct  m from Voiture as v , Contrat ctr , Model as m where ((v.id not in (select cv.voiture from  v.assocontratvoitures as cv)) or (v.id  in (select cs.voiture  from  ctr.assocontratvoitures as cs where (cs.contrat.dateDep<:deb and cs.contrat.dateRet <:deb) or (cs.contrat.dateDep>:ret and cs.contrat.dateRet>:ret))  )) and v.modele=m.model " );
       
        
     query_table.setDate("deb",deb); 
            query_table.setDate("ret",ret); 
         
              
              List<Model> voitu = query_table.list();
        
           
       
         
         for(Model mod:voitu){
             edit_contrat_model.addItem(mod.getModel());
           
          }
      }catch(Exception e){
              edit_contrat_model.getMouseListeners();
              }
      }
    }//GEN-LAST:event_edit_contrat_modelMouseClicked
   
      



  /*     */
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Index().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Ajout_cat;
    private javax.swing.JPanel Ajout_col;
    private javax.swing.JPanel Ajout_model;
    private javax.swing.JPanel Ajout_voiture;
    private javax.swing.JPanel Container;
    private javax.swing.JLabel Delet_item;
    private javax.swing.JLabel Edit_item;
    private javax.swing.JPanel Internal;
    private javax.swing.JPanel Menu;
    private javax.swing.JPanel accueil;
    private javax.swing.JTextField actual_motpass;
    private javax.swing.JPanel add_client;
    private javax.swing.JPanel add_contrat;
    private javax.swing.JPanel add_pai;
    private javax.swing.JPanel add_reserv;
    private javax.swing.JPanel add_societe;
    private javax.swing.JPanel admin_pass;
    private javax.swing.JTextField adresse_client;
    private javax.swing.JTextField adresse_company;
    private javax.swing.JTextField adresse_reserv;
    private javax.swing.JTable affi_air;
    private javax.swing.JTable affi_tech;
    private javax.swing.JPanel affichage;
    private javax.swing.JComboBox<String> air_mod;
    private javax.swing.JButton ajout_autre;
    private javax.swing.JButton ajout_bereau;
    private javax.swing.JLabel ajout_cat;
    private javax.swing.JLabel ajout_client;
    private javax.swing.JLabel ajout_coleur;
    private javax.swing.JLabel ajout_contr;
    private javax.swing.JLabel ajout_model;
    private javax.swing.JLabel ajout_pai;
    private javax.swing.JLabel ajout_pai1;
    private javax.swing.JLabel ajout_reser;
    private javax.swing.JLabel ajout_societ;
    private javax.swing.JButton ajout_sortie;
    private javax.swing.JLabel ajout_veh1;
    private javax.swing.JTabbedPane all_show;
    private javax.swing.JLabel archive;
    private javax.swing.JTable archive_table;
    private javax.swing.JTable assur_affich;
    private javax.swing.JComboBox<String> assur_mod;
    private javax.swing.JTextField assur_montant;
    private javax.swing.JTable assur_show;
    private javax.swing.JPanel assurance;
    private javax.swing.JTable autre_affi;
    private javax.swing.JTable autre_list;
    private javax.swing.JComboBox<String> autre_mod;
    private javax.swing.JTextField autre_montant;
    private javax.swing.JTextArea autre_remarq;
    private javax.swing.JTable autre_show;
    private javax.swing.JPanel bereau_depense;
    private javax.swing.JButton boton_assur;
    private javax.swing.JButton boton_autremaint;
    private javax.swing.JButton boton_filtreair;
    private javax.swing.JButton boton_filtreh;
    private javax.swing.JButton boton_vidange;
    private javax.swing.JButton boton_visit;
    private javax.swing.JLabel caisse;
    private javax.swing.JPanel caisse_autre;
    private javax.swing.JTable caisse_list;
    private javax.swing.JPanel caisse_sortie;
    private javax.swing.JTextField check_del;
    private javax.swing.JTextField choose_contrat;
    private javax.swing.JTextField client_adresse;
    private javax.swing.JTable client_affi;
    private javax.swing.JLabel client_contrat;
    private javax.swing.JTextField client_date;
    private javax.swing.JLabel client_delete;
    private javax.swing.JLabel client_edit;
    private javax.swing.JLabel client_histo;
    private javax.swing.JTextField client_lieu_identite;
    private javax.swing.JTextField client_lieu_naiss;
    private javax.swing.JTextField client_lieunaiss;
    private javax.swing.JPanel client_list;
    private javax.swing.JTextField client_naiss;
    private javax.swing.JTextField client_naissance;
    private javax.swing.JTextField client_nationalite;
    private javax.swing.JTextField client_nom;
    private javax.swing.JTextField client_num;
    private javax.swing.JTextField client_tel;
    private javax.swing.JComboBox<String> client_type;
    private javax.swing.JButton color;
    private javax.swing.JPanel comany_edit;
    private javax.swing.JPanel company_list;
    private javax.swing.JButton cond2_but;
    private javax.swing.JTextField conducteur_permis;
    private javax.swing.JTextField conducteur_permis2;
    private javax.swing.JButton conducteurtwo;
    private javax.swing.JTextField confirm_new;
    private javax.swing.JPanel contrat_archive;
    private com.toedter.calendar.JDateChooser contrat_deb;
    private javax.swing.JComboBox<String> contrat_imma;
    private javax.swing.JComboBox<String> contrat_model;
    private com.toedter.calendar.JDateChooser contrat_retour;
    private javax.swing.JButton copier;
    private javax.swing.JLabel date;
    private javax.swing.JFormattedTextField date_autre;
    private javax.swing.JTextField date_contrat;
    private javax.swing.JFormattedTextField date_entre;
    private javax.swing.JFormattedTextField date_entrefiltre;
    private javax.swing.JFormattedTextField date_filtreh;
    private javax.swing.JTextField date_identite;
    private javax.swing.JTextField date_identite2;
    private javax.swing.JTextField date_pai;
    private javax.swing.JTextField date_permis;
    private javax.swing.JTextField date_permis2;
    private javax.swing.JTextField date_reserv;
    private javax.swing.JTextField deb_autre;
    private javax.swing.JTextField deb_bereau;
    private javax.swing.JTextField deb_caisse;
    private javax.swing.JTextField deb_rech;
    private javax.swing.JTextField deb_rech_voi;
    private javax.swing.JTextField deb_sortie;
    private javax.swing.JTextField deb_voi;
    private javax.swing.JFormattedTextField debut_assurance;
    private javax.swing.JFormattedTextField debut_visit;
    private javax.swing.JButton delete_cond2;
    private javax.swing.JLabel dep_ber;
    private javax.swing.JTextField dep_reserv;
    private javax.swing.JLabel dep_voi;
    private javax.swing.JTable depense_bereau;
    private javax.swing.JTable depense_voit;
    private javax.swing.JPanel edit_all;
    private javax.swing.JTextField edit_client_adresse;
    private javax.swing.JTextField edit_client_naissance;
    private javax.swing.JTextField edit_client_nationalite;
    private javax.swing.JButton edit_company;
    private javax.swing.JTextField edit_conducteur_permis;
    private javax.swing.JTextField edit_conducteur_permis_conduc2;
    private javax.swing.JPanel edit_contrat;
    private javax.swing.JButton edit_contrat_butt;
    private com.toedter.calendar.JDateChooser edit_contrat_deb;
    private javax.swing.JComboBox<String> edit_contrat_imma;
    private javax.swing.JComboBox<String> edit_contrat_model;
    private com.toedter.calendar.JDateChooser edit_contrat_retour;
    private javax.swing.JTextField edit_date_contrat;
    private javax.swing.JTextField edit_date_identite_conduc;
    private javax.swing.JTextField edit_date_identite_conduc2;
    private javax.swing.JTextField edit_date_permis_conduc;
    private javax.swing.JTextField edit_date_permis_conduc2;
    private javax.swing.JTextField edit_datedeb;
    private javax.swing.JTextField edit_datefin;
    private javax.swing.JTextField edit_entretien;
    private javax.swing.JComboBox<String> edit_heure_dep;
    private javax.swing.JComboBox<String> edit_heure_fin;
    private javax.swing.JTextField edit_id;
    private javax.swing.JTextField edit_id_conduc1;
    private javax.swing.JTextField edit_id_conduc2;
    private javax.swing.JTextField edit_id_contrat;
    private javax.swing.JTextField edit_identite_date;
    private javax.swing.JTextField edit_identite_lieu_conduc;
    private javax.swing.JTextField edit_identite_lieu_conduc2;
    private javax.swing.JTextField edit_identite_num_conduc;
    private javax.swing.JTextField edit_identite_num_conduc2;
    private javax.swing.JTextField edit_km;
    private javax.swing.JTextField edit_km_dep;
    private javax.swing.JTextField edit_km_retour;
    private javax.swing.JTextField edit_lieu_depart;
    private javax.swing.JTextField edit_lieu_identite;
    private javax.swing.JTextField edit_lieu_naiss;
    private javax.swing.JTextField edit_lieu_permis_conduc;
    private javax.swing.JTextField edit_lieu_permis_conduc2;
    private javax.swing.JTextField edit_lieu_retour;
    private javax.swing.JButton edit_maint;
    private javax.swing.JTextField edit_montant;
    private javax.swing.JTextField edit_montant_gatan;
    private javax.swing.JTextField edit_montant_pay;
    private javax.swing.JTextField edit_nom_prenom;
    private javax.swing.JTextField edit_num_identite;
    private javax.swing.JTextField edit_numassur;
    private javax.swing.JTextArea edit_observation;
    private com.toedter.calendar.JDateChooser edit_pai_day;
    private javax.swing.JComboBox<String> edit_pay_gatan;
    private javax.swing.JTextField edit_prenom_nom_conduc;
    private javax.swing.JTextField edit_prenom_nom_conduc2;
    private javax.swing.JTextField edit_remar;
    private javax.swing.JTextField edit_retour_causs;
    private javax.swing.JButton edit_societe;
    private javax.swing.JTextField edit_societe_adresse;
    private javax.swing.JTextField edit_societe_email;
    private javax.swing.JTextField edit_societe_fiscal;
    private javax.swing.JTextField edit_societe_nom;
    private javax.swing.JTextField edit_societe_tel;
    private javax.swing.JPanel edit_societi;
    private javax.swing.JTextField edit_tel_client;
    private javax.swing.JTextField edit_type_contrat;
    private javax.swing.JComboBox<String> edit_type_iden;
    private javax.swing.JComboBox<String> edit_type_identite_conduc;
    private javax.swing.JComboBox<String> edit_type_identite_conduc2;
    private javax.swing.JComboBox<String> edit_type_pay;
    private javax.swing.JButton edit_utilisateur;
    private javax.swing.JPanel edit_voit;
    private javax.swing.JTextField editadresse_client;
    private javax.swing.JTextField editclient_date;
    private javax.swing.JTextField editclient_lieu_identite;
    private javax.swing.JTextField editclient_lieu_naiss;
    private javax.swing.JTextField editclient_naiss;
    private javax.swing.JTextField editclient_nom;
    private javax.swing.JTextField editclient_num;
    private javax.swing.JTextField editclient_tel;
    private javax.swing.JComboBox<String> editclient_type;
    private javax.swing.JTextField editemail_client;
    private javax.swing.JTextField editnatinalite_client;
    private javax.swing.JPanel edittt_client;
    private javax.swing.JTextField email_client;
    private javax.swing.JTextField email_company;
    private javax.swing.JTextField email_reserv;
    private javax.swing.JTable fa_show;
    private javax.swing.JLabel fact_societe;
    private javax.swing.JPanel facturation;
    private javax.swing.JTextField fax_company;
    private javax.swing.JTable fh_show;
    private javax.swing.JTextField filtr_mont;
    private javax.swing.JTable filtra_show;
    private javax.swing.JPanel filtre_air;
    private javax.swing.JPanel filtre_huile;
    private javax.swing.JTextField filtreh_montant;
    private javax.swing.JFormattedTextField fin_assurance;
    private javax.swing.JTextField fin_autre;
    private javax.swing.JTextField fin_bereau;
    private javax.swing.JTextField fin_caisse;
    private javax.swing.JTextField fin_rech;
    private javax.swing.JTextField fin_rech_voi;
    private javax.swing.JTextField fin_sortie;
    private javax.swing.JFormattedTextField fin_visit;
    private javax.swing.JTextField fin_voi;
    private javax.swing.JPanel finan_reccet;
    private javax.swing.JTextField gsm_company;
    private javax.swing.JComboBox<String> heure_dep;
    private javax.swing.JComboBox<String> heure_depreserv;
    private javax.swing.JComboBox<String> heure_fin;
    private javax.swing.JComboBox<String> heure_retourreserv;
    private javax.swing.JComboBox<String> huile_mod;
    private javax.swing.JTable huille_affi;
    private javax.swing.JTextField id_cliso;
    private javax.swing.JTextField id_cond1;
    private javax.swing.JTextField id_cond2;
    private javax.swing.JTextField id_contrat;
    private javax.swing.JTextField id_modif;
    private javax.swing.JTextField id_pai;
    private javax.swing.JTextField id_societ;
    private javax.swing.JTextField id_societfact;
    private javax.swing.JTextField id_veh;
    private javax.swing.JTextField identite_date;
    private javax.swing.JTextField identite_lieu;
    private javax.swing.JTextField identite_lieu2;
    private javax.swing.JTextField identite_num;
    private javax.swing.JTextField identite_num2;
    private javax.swing.JComboBox<String> imma_reserv;
    private javax.swing.JLabel impri_autre;
    private javax.swing.JLabel impri_caisse;
    private javax.swing.JLabel impri_sortie;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton8;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel127;
    private javax.swing.JLabel jLabel128;
    private javax.swing.JLabel jLabel129;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel130;
    private javax.swing.JLabel jLabel131;
    private javax.swing.JLabel jLabel132;
    private javax.swing.JLabel jLabel133;
    private javax.swing.JLabel jLabel134;
    private javax.swing.JLabel jLabel135;
    private javax.swing.JLabel jLabel136;
    private javax.swing.JLabel jLabel137;
    private javax.swing.JLabel jLabel138;
    private javax.swing.JLabel jLabel139;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel140;
    private javax.swing.JLabel jLabel141;
    private javax.swing.JLabel jLabel142;
    private javax.swing.JLabel jLabel143;
    private javax.swing.JLabel jLabel144;
    private javax.swing.JLabel jLabel145;
    private javax.swing.JLabel jLabel146;
    private javax.swing.JLabel jLabel147;
    private javax.swing.JLabel jLabel148;
    private javax.swing.JLabel jLabel149;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel150;
    private javax.swing.JLabel jLabel151;
    private javax.swing.JLabel jLabel152;
    private javax.swing.JLabel jLabel153;
    private javax.swing.JLabel jLabel154;
    private javax.swing.JLabel jLabel155;
    private javax.swing.JLabel jLabel156;
    private javax.swing.JLabel jLabel157;
    private javax.swing.JLabel jLabel158;
    private javax.swing.JLabel jLabel159;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel160;
    private javax.swing.JLabel jLabel161;
    private javax.swing.JLabel jLabel162;
    private javax.swing.JLabel jLabel163;
    private javax.swing.JLabel jLabel164;
    private javax.swing.JLabel jLabel165;
    private javax.swing.JLabel jLabel166;
    private javax.swing.JLabel jLabel167;
    private javax.swing.JLabel jLabel168;
    private javax.swing.JLabel jLabel169;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel170;
    private javax.swing.JLabel jLabel171;
    private javax.swing.JLabel jLabel172;
    private javax.swing.JLabel jLabel173;
    private javax.swing.JLabel jLabel174;
    private javax.swing.JLabel jLabel175;
    private javax.swing.JLabel jLabel176;
    private javax.swing.JLabel jLabel177;
    private javax.swing.JLabel jLabel178;
    private javax.swing.JLabel jLabel179;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel180;
    private javax.swing.JLabel jLabel181;
    private javax.swing.JLabel jLabel182;
    private javax.swing.JLabel jLabel183;
    private javax.swing.JLabel jLabel184;
    private javax.swing.JLabel jLabel185;
    private javax.swing.JLabel jLabel186;
    private javax.swing.JLabel jLabel187;
    private javax.swing.JLabel jLabel188;
    private javax.swing.JLabel jLabel189;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel190;
    private javax.swing.JLabel jLabel191;
    private javax.swing.JLabel jLabel192;
    private javax.swing.JLabel jLabel193;
    private javax.swing.JLabel jLabel194;
    private javax.swing.JLabel jLabel195;
    private javax.swing.JLabel jLabel196;
    private javax.swing.JLabel jLabel197;
    private javax.swing.JLabel jLabel198;
    private javax.swing.JLabel jLabel199;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel200;
    private javax.swing.JLabel jLabel201;
    private javax.swing.JLabel jLabel202;
    private javax.swing.JLabel jLabel203;
    private javax.swing.JLabel jLabel204;
    private javax.swing.JLabel jLabel205;
    private javax.swing.JLabel jLabel206;
    private javax.swing.JLabel jLabel207;
    private javax.swing.JLabel jLabel208;
    private javax.swing.JLabel jLabel209;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel210;
    private javax.swing.JLabel jLabel211;
    private javax.swing.JLabel jLabel212;
    private javax.swing.JLabel jLabel213;
    private javax.swing.JLabel jLabel214;
    private javax.swing.JLabel jLabel215;
    private javax.swing.JLabel jLabel216;
    private javax.swing.JLabel jLabel217;
    private javax.swing.JLabel jLabel218;
    private javax.swing.JLabel jLabel219;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel220;
    private javax.swing.JLabel jLabel221;
    private javax.swing.JLabel jLabel222;
    private javax.swing.JLabel jLabel223;
    private javax.swing.JLabel jLabel224;
    private javax.swing.JLabel jLabel225;
    private javax.swing.JLabel jLabel226;
    private javax.swing.JLabel jLabel227;
    private javax.swing.JLabel jLabel228;
    private javax.swing.JLabel jLabel229;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel230;
    private javax.swing.JLabel jLabel231;
    private javax.swing.JLabel jLabel232;
    private javax.swing.JLabel jLabel233;
    private javax.swing.JLabel jLabel234;
    private javax.swing.JLabel jLabel235;
    private javax.swing.JLabel jLabel236;
    private javax.swing.JLabel jLabel237;
    private javax.swing.JLabel jLabel238;
    private javax.swing.JLabel jLabel239;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel240;
    private javax.swing.JLabel jLabel241;
    private javax.swing.JLabel jLabel242;
    private javax.swing.JLabel jLabel243;
    private javax.swing.JLabel jLabel244;
    private javax.swing.JLabel jLabel245;
    private javax.swing.JLabel jLabel246;
    private javax.swing.JLabel jLabel247;
    private javax.swing.JLabel jLabel248;
    private javax.swing.JLabel jLabel249;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel250;
    private javax.swing.JLabel jLabel251;
    private javax.swing.JLabel jLabel252;
    private javax.swing.JLabel jLabel253;
    private javax.swing.JLabel jLabel254;
    private javax.swing.JLabel jLabel255;
    private javax.swing.JLabel jLabel256;
    private javax.swing.JLabel jLabel257;
    private javax.swing.JLabel jLabel258;
    private javax.swing.JLabel jLabel259;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel260;
    private javax.swing.JLabel jLabel261;
    private javax.swing.JLabel jLabel262;
    private javax.swing.JLabel jLabel263;
    private javax.swing.JLabel jLabel264;
    private javax.swing.JLabel jLabel265;
    private javax.swing.JLabel jLabel266;
    private javax.swing.JLabel jLabel267;
    private javax.swing.JLabel jLabel268;
    private javax.swing.JLabel jLabel269;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel270;
    private javax.swing.JLabel jLabel271;
    private javax.swing.JLabel jLabel272;
    private javax.swing.JLabel jLabel273;
    private javax.swing.JLabel jLabel274;
    private javax.swing.JLabel jLabel275;
    private javax.swing.JLabel jLabel276;
    private javax.swing.JLabel jLabel277;
    private javax.swing.JLabel jLabel278;
    private javax.swing.JLabel jLabel279;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel280;
    private javax.swing.JLabel jLabel281;
    private javax.swing.JLabel jLabel282;
    private javax.swing.JLabel jLabel283;
    private javax.swing.JLabel jLabel284;
    private javax.swing.JLabel jLabel285;
    private javax.swing.JLabel jLabel286;
    private javax.swing.JLabel jLabel287;
    private javax.swing.JLabel jLabel288;
    private javax.swing.JLabel jLabel289;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane20;
    private javax.swing.JScrollPane jScrollPane21;
    private javax.swing.JScrollPane jScrollPane22;
    private javax.swing.JScrollPane jScrollPane23;
    private javax.swing.JScrollPane jScrollPane24;
    private javax.swing.JScrollPane jScrollPane25;
    private javax.swing.JScrollPane jScrollPane26;
    private javax.swing.JScrollPane jScrollPane27;
    private javax.swing.JScrollPane jScrollPane28;
    private javax.swing.JScrollPane jScrollPane29;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane30;
    private javax.swing.JScrollPane jScrollPane31;
    private javax.swing.JScrollPane jScrollPane32;
    private javax.swing.JScrollPane jScrollPane33;
    private javax.swing.JScrollPane jScrollPane34;
    private javax.swing.JScrollPane jScrollPane35;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator18;
    private javax.swing.JSeparator jSeparator19;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator20;
    private javax.swing.JSeparator jSeparator21;
    private javax.swing.JSeparator jSeparator22;
    private javax.swing.JSeparator jSeparator23;
    private javax.swing.JSeparator jSeparator24;
    private javax.swing.JSeparator jSeparator25;
    private javax.swing.JSeparator jSeparator26;
    private javax.swing.JSeparator jSeparator27;
    private javax.swing.JSeparator jSeparator28;
    private javax.swing.JSeparator jSeparator29;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator30;
    private javax.swing.JSeparator jSeparator31;
    private javax.swing.JSeparator jSeparator32;
    private javax.swing.JSeparator jSeparator33;
    private javax.swing.JSeparator jSeparator34;
    private javax.swing.JSeparator jSeparator35;
    private javax.swing.JSeparator jSeparator36;
    private javax.swing.JSeparator jSeparator37;
    private javax.swing.JSeparator jSeparator38;
    private javax.swing.JSeparator jSeparator39;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator40;
    private javax.swing.JSeparator jSeparator41;
    private javax.swing.JSeparator jSeparator42;
    private javax.swing.JSeparator jSeparator43;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTable jTable10;
    private javax.swing.JTable jTable12;
    private javax.swing.JTable jTable13;
    private javax.swing.JLabel j_immat;
    private javax.swing.JLabel j_immats;
    private javax.swing.JLabel j_mod;
    private javax.swing.JLabel j_modele;
    private javax.swing.JDialog jdialog_contrat;
    private javax.swing.JTextField km_autre;
    private javax.swing.JTextField km_dep;
    private javax.swing.JTextField km_filtreair;
    private javax.swing.JTextField km_filtreh;
    private javax.swing.JTextField km_new;
    private javax.swing.JTextField km_retour;
    private javax.swing.JTextField km_vidange;
    private javax.swing.JLabel lab_accueil;
    private javax.swing.JLabel lab_admin;
    private javax.swing.JLabel lab_client;
    private javax.swing.JLabel lab_contrat;
    private javax.swing.JLabel lab_fact;
    private javax.swing.JLabel lab_finance;
    private javax.swing.JLabel lab_maint;
    private javax.swing.JLabel lab_pai;
    private javax.swing.JLabel lab_reser;
    private javax.swing.JLabel lab_societ;
    private javax.swing.JLabel lab_voit;
    private javax.swing.JLabel labe_km;
    private javax.swing.JLabel label_datdeb;
    private javax.swing.JLabel label_datefin;
    private javax.swing.JLabel label_num;
    private javax.swing.JLabel label_remarque;
    private javax.swing.JTextField lieu_depart;
    private javax.swing.JTextField lieu_identite;
    private javax.swing.JTextField lieu_permis;
    private javax.swing.JTextField lieu_permis2;
    private javax.swing.JTextField lieu_retour;
    private javax.swing.JLabel list_assur;
    private javax.swing.JLabel list_autre;
    private javax.swing.JComboBox<Object> list_cat;
    private javax.swing.JLabel list_client;
    private javax.swing.JComboBox<String> list_color;
    private javax.swing.JLabel list_contr;
    private javax.swing.JPanel list_contrat;
    private javax.swing.JLabel list_fact;
    private javax.swing.JLabel list_filtra;
    private javax.swing.JLabel list_filtreh;
    private javax.swing.JLabel list_maint;
    private javax.swing.JComboBox<String> list_mod;
    private javax.swing.JLabel list_pai;
    private javax.swing.JLabel list_pai1;
    private javax.swing.JPanel list_paiement;
    private javax.swing.JLabel list_reccvoi;
    private javax.swing.JLabel list_recette;
    private javax.swing.JLabel list_reser;
    private javax.swing.JLabel list_societ;
    private javax.swing.JTable list_societe;
    private javax.swing.JLabel list_vehi;
    private javax.swing.JLabel list_vidange;
    private javax.swing.JLabel list_visit;
    private javax.swing.JPanel list_voiture;
    private javax.swing.JTextField login_admin;
    private javax.swing.JPanel maint_autre;
    private javax.swing.JTable maint_join;
    private javax.swing.JPanel maint_list;
    private javax.swing.JComboBox<String> maint_mod;
    private javax.swing.JLabel matfis;
    private javax.swing.JTextField matricule_company;
    private javax.swing.JPanel menu_accueil;
    private javax.swing.JPanel menu_admin;
    private javax.swing.JPanel menu_client;
    private javax.swing.JPanel menu_contrat;
    private javax.swing.JPanel menu_fact;
    private javax.swing.JPanel menu_finance;
    private javax.swing.JPanel menu_maint;
    private javax.swing.JPanel menu_nav;
    private javax.swing.JPanel menu_pai;
    private javax.swing.JPanel menu_reser;
    private javax.swing.JPanel menu_societ;
    private javax.swing.JPanel menu_voit;
    private javax.swing.JComboBox<String> model_rech;
    private javax.swing.JComboBox<String> model_rech_voi;
    private javax.swing.JComboBox<String> model_reserv;
    private javax.swing.JComboBox<String> model_voi;
    private javax.swing.JTextField model_voit;
    private javax.swing.JButton modif_client;
    private javax.swing.JTextField montant_gatan;
    private javax.swing.JTextField montant_pay;
    private javax.swing.JTextField name_company;
    private javax.swing.JTextField natinalite_client;
    private javax.swing.JPanel nav_close;
    private javax.swing.JTextField new_pass;
    private javax.swing.JLabel nom_action;
    private javax.swing.JTextField nom_prenom;
    private javax.swing.JTextField nomprenom_reserv;
    private javax.swing.JTextField num_assur;
    private javax.swing.JTextField num_cheque;
    private javax.swing.JTextField num_identite;
    private javax.swing.JTextArea observation;
    private javax.swing.JLabel other_recc;
    private com.toedter.calendar.JDateChooser pai_day;
    private javax.swing.JTextField pai_mont;
    private javax.swing.JComboBox<String> paiement_type;
    private javax.swing.JComboBox<String> pay_type;
    private javax.swing.JTextField prenom_nom;
    private javax.swing.JTextField prenom_nom2;
    private javax.swing.JLabel print_maint1;
    private javax.swing.JTable recette_table;
    private javax.swing.JTable recette_tvoit_table;
    private javax.swing.JPanel recette_voiture;
    private javax.swing.JButton rech_autre;
    private javax.swing.JButton rech_bereau;
    private javax.swing.JButton rech_caisse;
    private javax.swing.JComboBox<String> rech_model;
    private javax.swing.JButton rech_sortie;
    private javax.swing.JButton rech_voi;
    private javax.swing.JButton recherche_recette;
    private javax.swing.JButton recherche_voit;
    private javax.swing.JTextArea remarq_reserv;
    private javax.swing.JPanel reserv_list;
    private javax.swing.JTextField reserv_tel;
    private javax.swing.JTextField retour_reservation;
    private javax.swing.JLabel revenus;
    private javax.swing.JButton save;
    private javax.swing.JButton save_client;
    private javax.swing.JButton save_reserv;
    private javax.swing.JButton save_societe;
    private javax.swing.JTable show_contrat;
    private javax.swing.JLabel show_maint;
    private javax.swing.JLabel show_maint1;
    private javax.swing.JTextField soci_adresse;
    private javax.swing.JTextField soci_email;
    private javax.swing.JTextField soci_fiscal;
    private javax.swing.JTextField soci_tel;
    private javax.swing.JTable sociefact_show;
    private javax.swing.JPanel societ_fact;
    private javax.swing.JTextField societe_adresse;
    private javax.swing.JTextField societe_email;
    private javax.swing.JTextField societe_fiscal;
    private javax.swing.JLabel societe_id;
    private javax.swing.JLabel societe_impr;
    private javax.swing.JTextField societe_n;
    private javax.swing.JTextField societe_nom;
    private javax.swing.JTextField societe_tel;
    private javax.swing.JLabel societi_contrat;
    private javax.swing.JLabel societi_delete;
    private javax.swing.JLabel societi_edit;
    private javax.swing.JLabel societi_histo;
    private javax.swing.JTable soietcont_show;
    private javax.swing.JLabel sortie_caisse;
    private javax.swing.JTable sortie_list;
    private javax.swing.JTextField tab;
    private javax.swing.JComboBox<String> tech_mod;
    private javax.swing.JTextField tel_client;
    private javax.swing.JTextField tel_company;
    private javax.swing.JPanel tot_caisse;
    private javax.swing.JLabel total_autre;
    private javax.swing.JLabel total_caisse;
    private javax.swing.JLabel total_depense;
    private javax.swing.JLabel total_depense_bereau;
    private javax.swing.JLabel total_recette;
    private javax.swing.JLabel total_sortie;
    private javax.swing.JTextField type_contrat;
    private javax.swing.JTextField type_fact;
    private javax.swing.JComboBox<String> type_iden;
    private javax.swing.JComboBox<String> type_identite;
    private javax.swing.JComboBox<String> type_identite1;
    private javax.swing.JComboBox<String> type_identite3;
    private javax.swing.JPanel type_maint;
    private javax.swing.JComboBox<String> type_pay;
    private javax.swing.JComboBox<String> type_pay1;
    private javax.swing.JComboBox<Object> upd_cat;
    private javax.swing.JTextField upd_chasis;
    private javax.swing.JTextField upd_circu;
    private javax.swing.JComboBox<String> upd_climatise;
    private javax.swing.JComboBox<String> upd_color;
    private javax.swing.JTextField upd_gris;
    private javax.swing.JTextField upd_id;
    private javax.swing.JTextField upd_immat;
    private javax.swing.JTextField upd_km;
    private javax.swing.JComboBox<String> upd_model;
    private javax.swing.JTextField upd_nbr;
    private javax.swing.JTextField upd_puiss;
    private javax.swing.JTable vidan_affi;
    private javax.swing.JComboBox<String> vidan_mod;
    private javax.swing.JPanel vidange;
    private javax.swing.JTextField vidange_montant;
    private javax.swing.JTable vidange_show;
    private javax.swing.JTextField visit_montant;
    private javax.swing.JTable visite_show;
    private javax.swing.JPanel visite_technique;
    private javax.swing.JTable voit_affiche;
    private javax.swing.JTextField voit_cat;
    private javax.swing.JTextField voit_chasis;
    private javax.swing.JTextField voit_circu;
    private javax.swing.JComboBox<String> voit_clim;
    private javax.swing.JTextField voit_color;
    private javax.swing.JTextField voit_griss;
    private javax.swing.JTextField voit_immat;
    private javax.swing.JTextField voit_km;
    private javax.swing.JTextField voit_nbr;
    private javax.swing.JTextField voit_puiss;
    private javax.swing.JButton voit_save;
    private javax.swing.JButton voit_upd;
    private javax.swing.JPanel voiture_deponse;
    // End of variables declaration//GEN-END:variables
}
