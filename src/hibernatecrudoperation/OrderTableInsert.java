package hibernatecrudoperation;
import hibernate.beans.OrderTable;
import hibernate.beans.TableNo;

import org.hibernate.cfg.Configuration;
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class OrderTableInsert {
    public static void main(String[] args) {
       
      SessionFactory sf=new Configuration().configure().buildSessionFactory();
        Session session =sf.openSession();
        
        Transaction tx=session.beginTransaction();//to take the permission
        Scanner sc=new Scanner(System.in);
         System.out.println("Enter your Contact Number");
        long cNo=sc.nextLong();
        System.out.println(" Enter Your Table number");
        int tableNo1=sc.nextInt();
        TableNo oTable=(TableNo)session.get(TableNo.class,tableNo1);
                if(oTable==null){
                    System.out.println("This table not Present here please Check the Table No!!");
                }
                else{
        System.out.println("Enter your Name");
        String cName=sc.next();
       
        System.out.println("Enter your Openion and Review");
        String reviw=sc.next();
        OrderTable order=new OrderTable(cNo,tableNo1, cName,reviw);
        session.save(order);// replacement of the insert query 
        
         System.out.println("Order Sucessfull  !!!!!!");
         //JOptionPane.showMessageDialog(null, "Thank You for your order!!! /n Have a nice day ");
         tx.commit();
        session.close();
                }
   }
}
