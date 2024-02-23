package hibernatecrudoperation;
import hibernate.beans.OrderTable;
import hibernate.beans.Staters;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.cfg.Configuration;
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

public class QueryShowAll1 {
    public static void main(String[] args) {
        Configuration c1=new Configuration();
        Configuration c2=c1.configure();// use to load configuaration file
        
        SessionFactory sf=c2.buildSessionFactory();// used to execute cfg file
        Session session =sf.openSession();
        
        Transaction tx=session.beginTransaction();//to take the permission
     // Query que=session.createQuery("from OrderTable");
     /*Criteria que=session.createCriteria(OrderTable.class);
      que.addOrder(Order.asc("tableNo"));
      que.addOrder(Order.desc("tableNo"));

     Criteria que=session.createCriteria(OrderTable.class);
     ProjectionList pl=Projections.projectionList();
     pl.add(Projections.property("contactNo"));
     pl.add(Projections.property("tableNo"));
     pl.add(Projections.property("customerName"));
     
     que.setProjection(pl);
      List<Object[]> data=que.list();
      for(Object record[]:data){
          System.out.println(record[0]+"   "+record[1]+"    "+record[2]);
          */
     Criteria q = session.createCriteria(OrderTable.class);
     ProjectionList pl=Projections.projectionList();
     pl.add(Projections.max("contactNo"));
     pl.add(Projections.min("contactNo"));
     pl.add(Projections.count("tableNo"));
     pl.add(Projections.countDistinct("tableNo"));
     q.setProjection(pl);
     List<Object[]>data= q.list();
     for(Object records:data){
       //  System.out.println(records[0]+"    "+records[1]+"    "+records[2]+"    "+records[3]);
     }
      }
   }

