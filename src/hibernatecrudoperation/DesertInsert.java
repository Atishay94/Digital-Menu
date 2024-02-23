package hibernatecrudoperation;
import hibernate.beans.Desert;

import org.hibernate.cfg.Configuration;
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;
//import java.util.Scanner;
import javax.swing.JOptionPane;

public class DesertInsert {
    public static void main(String[] args){
      SessionFactory sf=new Configuration().configure().buildSessionFactory();
        Session session =sf.openSession();
        
        Transaction tx=session.beginTransaction();//to take the permission
        /*Scanner sc=new Scanner(System.in);
        System.out.println(" Enter Category");
        String category=sc.next();
        System.out.println("Enter dish name");
        String dish=sc.next();
        System.out.println("Enter Main Ingredients name");
        String mainIngredients=sc.next();   
        System.out.println("Enter Dish Price");
        int price = sc.nextInt();
         Desert adl=new Desert(category, dish,mainIngredients,price);
         */
        JOptionPane.showMessageDialog(null,"Hi !! Welcome");
        String category=JOptionPane.showInputDialog("Enter Desert Category");
        String dishName=JOptionPane.showInputDialog("Enter Dish Name");
        String mainIngredients=JOptionPane.showInputDialog("Enter Main Ingredients");
        int price=Integer.parseInt(JOptionPane.showInputDialog("Enter Price"));
        Desert adl=new Desert(category,dishName,mainIngredients,price);
        session.save(adl);// replacement of the insert query 
        tx.commit();
        session.close();
        JOptionPane.showMessageDialog(null,"Data Insertes Sucessfully");
         System.out.println("inserted Data !!!!!!");
   }
}
//maida(Samosa),onion,chana masala(chole),chaat masala,red chili powder and poweders,red and green chatney, sev,yogurt