package hibernatecrudoperation;
import hibernate.beans.AdminLogin;

import org.hibernate.cfg.Configuration;
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;
import java.util.Scanner;


public class AdminUpdateRecord {
    public static void main(String[] args) {
      SessionFactory sf=new Configuration().configure().buildSessionFactory();
        Session session =sf.openSession();
        
        Transaction tx=session.beginTransaction();//to take the permission
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter your ID  ");
        String loginId=sc.next();
        System.out.println("Enter Old Password");
         String pass=sc.next();
         System.out.println("Enter new Password");
         String pass1=sc.next();
         System.out.println("Enter Confirm Password");
         String pass2=sc.next();
         if(pass1.equals(pass2)){
       AdminLogin adl=(AdminLogin)session.get(AdminLogin.class,loginId);
        adl.setPassword(pass2);
        session.update(adl);
        tx.commit();
        //adl.add(Restrictions.eq("password","pass2"));
        //List<AdminLogin> data=adl.list();
               // for(AdminLogin records:data){
            
                    System.out.println("record updated  !!!!!");
            
                    
                    
                }
        }
}
        //}
        /*
        if(adl==null){
            System.out.println("No record To load to search");
        }
        else{
            System.out.println(adl.getLoginId()+"  "+adl.getPassword());
            System.out.println("----- INDEX ------");
            System.out.println("1. Password");
            System.out.println("2. Exit");
            byte choice=sc.nextByte();
            switch(choice)
            {
                case 1: {
                    System.out.println("Enter Update Password");
                    String pass=sc.next();
                    adl.setPassword(pass);
                    session.update(adl);
                    System.out.println("record updated  !!!!!");
              }
            }
        }
        session.close();*/
       
