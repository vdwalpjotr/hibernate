

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;
import xml.*;


public class Tester {
    public static void main(String[] args) {
//        Configuration cfg = new Configuration().configure();
//
//        SchemaExport ex = new SchemaExport(cfg);
//        ex.create(true, true);

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        WoEntity wo = new WoEntity();
        wo.setAddress("Esdoornlaan 446");
        wo.setBouwJaar(1994);
        wo.setMkid(9106);
        wo.setCity("Groningen");
        wo.setPc("9741MC");
        wo.setSoortObject(2);
        wo.setSoortBouw(1);
        wo.setSoortWoning(1);
        wo.setTypeWoning(1);
        int id = (int) session.save(wo);
        System.out.println("Bericht met id " + id + " is toegevoegd.");


        tx.commit();
        session.close();


    }
}


