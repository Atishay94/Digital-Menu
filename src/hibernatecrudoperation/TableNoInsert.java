package hibernatecrudoperation;
import hibernate.beans.TableNo;

import org.hibernate.cfg.Configuration;
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;
import java.util.Scanner;

public class TableNoInsert {
    public static void main(String[] args) {
       // Configuration c1=new Configuration();
        //Configuration c2=c1.configure();// use to load configuaration file
        
      //  SessionFactory sf=c2.buildSessionFactory();// used to execute cfg file
      SessionFactory sf=new Configuration().configure().buildSessionFactory();
        Session session =sf.openSession();
        
        Transaction tx=session.beginTransaction();//to take the permission
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter Table Number");
        int tableNo=sc.nextInt();
        TableNo tno=new TableNo(tableNo);
        session.save(tno);// replacement of the insert query 
        tx.commit();
        session.close();
         System.out.println("table No inserted !!!!!!1");
   }
}
