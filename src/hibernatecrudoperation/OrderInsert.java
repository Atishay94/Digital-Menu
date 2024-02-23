package hibernatecrudoperation;
import hibernate.beans.Order;

import org.hibernate.cfg.Configuration;
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;
import java.util.Scanner;

public class OrderInsert {
    public static void main(String[] args) {
       // Configuration c1=new Configuration();
        //Configuration c2=c1.configure();// use to load configuaration file
        
      //  SessionFactory sf=c2.buildSessionFactory();// used to execute cfg file
      SessionFactory sf=new Configuration().configure().buildSessionFactory();
        Session session =sf.openSession();
        
        Transaction tx=session.beginTransaction();//to take the permission
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Mobile No");
        long contactNo=sc.nextLong();
        System.out.println("Enter your Name");
        String customerName=sc.next();
        System.out.println(" Enter Table No");
        int tableNo=sc.nextInt();
        System.out.println("Enter Dish Name");
        String dishName=sc.next();
        System.out.println("Enter Dish Price");
        String price=sc.next();
        System.out.println("Enter your opnion/review");
        String review=sc.next();/*
        
        Criteria crit = session.createCriteria(Order.class);
        List<Order> data=crit.list();
        for(Order ref:data){*/
        Order ord=new Order(contactNo, customerName,tableNo, dishName, price, review);
        session.save(ord);// replacement of the insert query 
        tx.commit();
        
         System.out.println("inserted Data !!!!!!1");
        }
   }

