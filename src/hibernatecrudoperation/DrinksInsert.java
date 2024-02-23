package hibernatecrudoperation;
import hibernate.beans.Drinks;

import org.hibernate.cfg.Configuration;
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;
import java.util.Scanner;

public class DrinksInsert {
    public static void main(String[] args){
      SessionFactory sf=new Configuration().configure().buildSessionFactory();
        Session session =sf.openSession();
        
        Transaction tx=session.beginTransaction();//to take the permission
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter Category");
        String category=sc.next();
        System.out.println("Enter dish name");
        String dish=sc.next();
        System.out.println("Enter Main Ingredients name");
        String mainIngredients=sc.next();
        System.out.println("Enter Dish Price");
        int price = sc.nextInt();
         Drinks adl=new Drinks(category, dish,mainIngredients,price);
         
        session.save(adl);// replacement of the insert query 
        tx.commit();
        session.close();
         System.out.println("inserted Data !!!!!!");
   }
}
//maida(Samosa),onion,chana masala(chole),chaat masala,red chili powder and poweders,red and green chatney, sev,yogurt
//
//Exception in thread "main" org.hibernate.HibernateException: The database returned no natively generated identity value
//	at org.hibernate.id.IdentifierGeneratorFactory.getGeneratedIdentity(IdentifierGeneratorFactory.java:33)
//	at org.hibernate.id.IdentityGenerator$GetGeneratedKeysDelegate.executeAndExtract(IdentityGenerator.java:74)