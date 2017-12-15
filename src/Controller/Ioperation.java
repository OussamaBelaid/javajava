/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.*;

import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;
import location_voiture.View.Index;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author SIM-Info
 */

public class Ioperation {
    private static final Session session = NewHibernateUtil.getSessionFactory().openSession();
    public void registre(Agence agence){
        //SessionFactory sesion = NewHibernateUtil.getSessionFactory();
       // Session session ; 
        //session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        session.save(agence);
        tx.commit();
        session.close();
        JOptionPane.showMessageDialog(null,"done");
        
    }
    public void check (Long cin , String motpass){
       // SessionFactory sesion = NewHibernateUtil.getSessionFactory();
       // Session session ; 
       // session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        Query q =session.createQuery("from Agence where adminCin=:cinr and motPass=:mp");
        q.setParameter("cinr",cin);
        q.setParameter("mp",motpass);
        List<Agence> agen = q.list();
        Iterator<Agence> iter = agen.iterator();
        tx.commit();
         session.close();
        if(iter.hasNext()){
           
                Index mm = new Index();
                mm.show();
        }else {
             JOptionPane.showMessageDialog(null,"err");
        }
     
       
    }
}
