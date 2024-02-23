package hibernatecrudoperation;
import hibernate.beans.Staters;

import org.hibernate.cfg.Configuration;
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;
import java.util.Scanner;

public class StatersUpdateRecord {
    public static void main(String[] args) {
      SessionFactory sf=new Configuration().configure().buildSessionFactory();
        Session session =sf.openSession();
        
        Transaction tx=session.beginTransaction();//to take the permission
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter Dish Name  ");
        String dishName=sc.next();
        Staters adl=(Staters)session.get(Staters.class,dishName);
        if(adl==null){
            System.out.println("No record To load to search");
        }
        else{
            System.out.println(adl.getCategory()+" \n "+adl.getDishName()+"  "+adl.getMainIngredients()+"   "+adl.getPrice());
            System.out.println("----- INDEX ------");
            System.out.println("1. Dish");
            System.out.println("2. Main Ingredients");
            System.out.println("3. price");
            System.out.println("4. exit");
            byte choice=sc.nextByte();
            switch(choice)
            {
                case 1: {
                    System.out.println("Enter Update Dish name");
                    String dish=sc.next();
                    adl.setDishName(dish);
                    session.update(adl);
                    System.out.println("record updated  !!!!!");
              }
                    case 2: {
                    System.out.println("Enter Update  Main Ingredients name");
                    String mainIngredients=sc.next();
                    adl.setMainIngredients(mainIngredients);
                    session.update(adl);
                    System.out.println("record updated  !!!!!");
              }
                        case 3: {
                    System.out.println("Enter Update Price");
                    int price=sc.nextInt();
                    adl.setPrice(price);
                    session.update(adl);
                    System.out.println("record updated  !!!!!");
              }
                            case 4: {
                    System.exit(0);
              }
            }
        }
        session.close();
        }
}
