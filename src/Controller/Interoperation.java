/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import Model.* ;
import java.util.List;
/**
 *
 * @author SIM-Info
 */
public interface Interoperation {
    /* gestion de voiture*/
    public void Addcat (Category cat);
    public void Addcolor (Coleur col);
     public void Addmodel (Model mod);
     public void Addvoit(Voiture voiture);
     public List<Category> Listcat();
     public void Editvoiture(Voiture voit , Integer id);
     public void Editkmvoiture(Integer id , Integer km); 
     public void Deletevoiture(Integer id); 
     public List <Voiture> list ();
     
      /* gestion de maintenance dashboard*/
      public List<Object> listmaint ();
      public List<Object> listmaint (Integer id_voit);
      public List<Assurance> listassurance (Integer id_voit);
       public List<Visite> listvisite (Integer id_voit);
        public List<Vidange> listvidange (Integer id_voit);
         public List<Filtreair> listfiltrair (Integer id_voit);
            public List<Filtrehuile> listfiltrhuile (Integer id_voit);
             public List<Autre> listautre (Integer id_voit);
             public List<Object> listcontrat(Integer id_voit);
             /*      Edit maintenca component       */
             public void Editassurance (Assurance assur , Integer id);
             public void Editvisite (Visite visite , Integer id);
             public void Editvidange(Vidange vidange , Integer id);
             public void Editfh(Filtrehuile fh , Integer id);
             public void Editfa(Filtreair fa , Integer id);
             public void Editautre(Autre autre , Integer id);
             /*     Delete maintenance compenet            */
             public void deleteassurance (Integer id);
             public void deletevisite (Integer id);
             public void deletevidange(Integer id);
             public void deletefh(Integer id);
             public void deletefa(Integer id);
             public void deleteautre(Integer id);
        /* gestion de maintenance type*/      
      public void Addasurance(Assurance assur);
          public List<Assurance> listassurance2 (String model);
     public void Addvisite(Visite visite);
      public List<Visite> listvisite2 (String model);
     public void Addvidange(Vidange vidan);
     public List<Vidange> listvidange2 (String model);
     public void Addfiltra(Filtreair filrair);
      public List<Filtreair> listfiltrair2 (String model);
     public void Addfiltrh(Filtrehuile filrhuile);
    public List<Filtrehuile> listfiltrhuile2 (String model);
     public void Autremaint(Autre autre);
     public List<Autre> listautre2 (String model);
     
        /* gestion de contrat*/
     public void Addcontrat(Contrat contrat , Assocontratvoiture aa );
     public List<Object> listcontrat();
     public List<Object> listarchive();
     public void Editcontrat (Integer id_contrat , Contrat contr);
     public void Editcontratvoit (Contrat contr ,Assocontratvoiture assovoi );
      public void Editcontratpai (Integer id_contrat , Integer id_voit);
      public void Editcontratconduc1 (Conducteur cond1 , Assocontratconducteur assocond , String type);
      public void Editcontratconduc2 (Conducteur cond2 , Assocontratconducteur assocond2 , String type);
      public void Editcontratclient (Client cl ,Assocontratclient cli , String type );
       public void Editcontratsocie (Societe soci , Assocontratsocie so);
     public void Deletecontrat (Integer id_contrat);
     public void Editfactcontrat (Integer id_contrat);
     public void Deletearchive (Integer id_archive);
     public void Addassocontratsocie(Societe socie , Assocontratsocie societ);
     public void Addassocontratpai(Paiment pai , Assocontratpai paye);
     public void Addassocontratconducteur(Conducteur conduc, Assocontratconducteur conducteur);
     public void Addassocontratclient(Client clie , Assocontratclient client);
      /* gestion de reservation*/
      public void Addreserv(Reservation reserv);
     public List<Object> listreserv();
       public void Editreserv (Integer id_reserv);
     public void Deletereserv (Integer id_reserv);
     
      /* gestion de societe*/
     public void Addsociete(Societe societe);
     public List<Societe> listsociete();
     public void AddContratsociti (Integer id_societe);
     public List<Object> listhistocontrat(Integer id_sociti);
     public List<Object> listhistofacture(Integer id_sociti);
       public void Factcontratsociti (Integer id_contrat);
       public void Editsociti (Societe societ , Integer id_sociti);
       public void Deletesociete(Integer id);
      /* gestion de client*/
      public void Addclient(Client client);
     public List<Client> listclient();
      public void AddContratclient (Integer id_client);
     public List<Object> listhistocontratclient(Integer id_client);
     public List<Object> listhistofactureclient(Integer id_client);
       public void Factcontratclient (Integer id_contrat);
       public void Editclient (Client client , Integer id_client);
       public void Deleteclient (Integer id);
      /* gestion de facture*/
       public List<Object> listfact();
       public void Editfacture (Integer id_facture);
       public void Deletefacture(Integer id_facture);
        /* gestion de paimenet*/
        public void Addpaiment(Paiment pai);
     public List<Object> listpaiment();
     public void Editpai (Integer id_pai);
     public void Deletepai (Integer id_pai);
      /* gestion de finance*/
     public List<Object> listrecete(String datedeb , String datefin , String model);
      public List<Object> listrecetvoit(String datedeb , String datefin , String model);
       public List<Object> listdepensevoit(String datedeb , String datefin , String model);
        public List<Depenseberu> listdepenseber(String datedeb , String datefin);
         public void Adddepenseber(Depenseberu depber);
        public void Addsorticaisse(Sorticaisse sorticaisse);
         public List<Sorticaisse> listsorticaisse(String datedeb , String datefin);
     public void Addautrerecet(Autrrecet autrerecet);
        public List<Autrrecet> listautrrecet(String datedeb , String datefin);
         public List<Object> listcaisse(String datedeb , String datefin);
          public List<Object> listcautionnement(Integer id_contrat);
           public List<Object> listretourcautionnement(Integer id_contrat);
           
           public List<Paiment> Listrecetpaiclient(Integer id_pai);
           
          public void Editautrerecet(Integer id); 
          public void Editsorticaisse(Integer id); 
          public void Editdepenseberu(Integer id); 
          
          public List<Object> Totaldepensvoit(Integer id);
          public List<Object> Totalrecetvoit(Integer id);
          public List<Object> Totalpairecet(Integer id);
          
          public void Deletesorticaisse(Integer id); 
          
          /*administration*/
          public void Editpassword (Integer id_admin);
          public void Editagence (Integer id_admin);
}
         