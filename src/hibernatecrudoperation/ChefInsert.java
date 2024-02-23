package hibernatecrudoperation;
import hibernate.beans.ChefBeans;

import org.hibernate.cfg.Configuration;
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;
import java.util.Scanner;

public class ChefInsert {
    public static void main(String[] args) {
       
      SessionFactory sf=new Configuration().configure().buildSessionFactory();
        Session session =sf.openSession();
        
        Transaction tx=session.beginTransaction();//to take the permission
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter your ID");
        String loginId=sc.next();
        System.out.println("Enter your Eight digits password");
        String password=sc.next();
        ChefBeans adl=new ChefBeans(loginId, password);
        session.save(adl);// replacement of the insert query 
        tx.commit();
        session.close();
         System.out.println("inserted Data !!!!!!1");
   }
}
