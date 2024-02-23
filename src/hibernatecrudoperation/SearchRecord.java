package hibernatecrudoperation;
import hibernate.beans.AdminLogin;
import hibernate.beans.Desert;

import org.hibernate.cfg.Configuration;
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;
import java.util.Scanner;

public class SearchRecord {
    public static void main(String[] args) {
       // Configuration c1=new Configuration();
        //Configuration c2=c1.configure();// use to load configuaration file
        
      //  SessionFactory sf=c2.buildSessionFactory();// used to execute cfg file
      SessionFactory sf=new Configuration().configure().buildSessionFactory();
        Session session =sf.openSession();
        
        Transaction tx=session.beginTransaction();//to take the permission
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter your ID  ");
        String loginId=sc.next();
        AdminLogin adl=(AdminLogin)session.get(AdminLogin.class,loginId);
        if(adl==null){
            System.out.println("No record To load to search");
        }
        else{
            System.out.println(adl.getLoginId()+"  "+adl.getPassword());
        }
        session.close();
        }
}
