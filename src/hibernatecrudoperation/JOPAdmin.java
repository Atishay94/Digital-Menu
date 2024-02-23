package hibernatecrudoperation;
import hibernate.beans.AdminLogin;
import hibernate.beans.Desert;
import javax.swing.JOptionPane;
import org.hibernate.cfg.Configuration;
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;

public class JOPAdmin {
    public static void main(String[] args) {
       // Configuration c1=new Configuration();
        //Configuration c2=c1.configure();// use to load configuaration file
        
      //  SessionFactory sf=c2.buildSessionFactory();// used to execute cfg file
      SessionFactory sf=new Configuration().configure().buildSessionFactory();
        Session session =sf.openSession();
        Transaction tx=session.beginTransaction();//to take the permission
        JOptionPane.showMessageDialog(null,"Welcome");
        String id=JOptionPane.showInputDialog("Enter your id");
        
        String pass=JOptionPane.showInputDialog("Enter password ");
        AdminLogin adl=new AdminLogin(id,pass);
        
        session.save(adl);// replacement of the insert query 
        //session.save(des);// replacement of the insert query 
        tx.commit();
        session.close();
        
        System.out.println("inserted Data !!!!!!1");
   }
}
