package hibernatecrudoperation;
import hibernate.beans.Staters;
import hibernate.beans.Drinks;
import hibernate.beans.Desert;
import hibernate.beans.MainCourse;

import org.hibernate.cfg.Configuration;
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;
import java.util.Scanner;

public class SearchDish {
    public static void main(String[] args) {
       // Configuration c1=new Configuration();
        //Configuration c2=c1.configure();// use to load configuaration file
        
      //  SessionFactory sf=c2.buildSessionFactory();// used to execute cfg file
      SessionFactory sf=new Configuration().configure().buildSessionFactory();
        Session session =sf.openSession();
        
        Transaction tx=session.beginTransaction();//to take the permission
        Scanner sc=new Scanner(System.in);
        //System.out.println("Enter Your Choice");
        System.out.println("---------Index----------");
        System.out.println("1. Category Name");
        System.out.println("2. Enter  Dish");
        System.out.println("3. EXIT");
        System.out.println("Enter Choice Number");
       byte choice=sc.nextByte();
        switch (choice) {
            case 1:
                System.out.println("Enter Category Name");
                String category=sc.next();
                 Staters sta=(Staters)session.get(Staters.class,category);
                 Drinks sta1=(Drinks)session.get(Drinks.class,category);
                 Desert sta2=(Desert)session.get(Desert.class,category);
                 MainCourse sta3=(MainCourse)session.get(MainCourse.class,category);
                 
                  if(sta==null || sta1==null || sta2==null || sta3==null){
                      
            System.out.println("No record To load to search");
        }
        else{
            System.out.println(sta.getDishName()+"  "+sta.getPrice());
            System.out.println(sta1.getDishName()+"  "+sta1.getPrice());
            System.out.println(sta2.getDishName()+"  "+sta2.getPrice());
            System.out.println(sta3.getDishName()+"  "+sta3.getPrice());
        }
              break;
              
        case 2:
                System.out.println("Enter Dish Name");
                String dishName =sc.next();
                 Staters st=(Staters)session.get(Staters.class,dishName);
                 Drinks st1=(Drinks)session.get(Drinks.class,dishName);
                 Desert st2=(Desert)session.get(Desert.class,dishName);
                 MainCourse st3=(MainCourse)session.get(MainCourse.class,dishName);
                 
                  if(st==null||st1==null||st2==null||st3==null){
            System.out.println("No record To load to search");
        }
        else{
            System.out.println(st.getCategory()+"     "+st.getDishName()+"     "+st.getMainIngredients()+"   "+st.getPrice());
            System.out.println(st1.getCategory()+"    "+st1.getDishName()+"    "+st1.getMainIngredients()+"   "+st1.getPrice());
            System.out.println(st2.getCategory()+"    "+st2.getDishName()+"    "+st2.getMainIngredients()+"   "+st2.getPrice());
            System.out.println(st3.getCategory()+"    "+st3.getDishName()+"    "+st3.getMainIngredients()+"   "+st3.getPrice());
        }
              break;
        case 3:
            System.exit(0);
              
            default:
                throw new AssertionError();
        }
   /*Staters sta=(Staters)session.get(Staters.class,cate);
     if(sta==null){
            System.out.println("No record To load to search");
        }
        else{
            System.out.println(sta.getloginId()+"  "+sta.getpassword());
        }*/
   tx.commit();
        session.close();
        }
}
