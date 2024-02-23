package hibernatecrudoperation;
import hibernate.beans.OrderTable;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.cfg.Configuration;
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;
import org.hibernate.criterion.Order;

public class QueryShowAll {
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
*/
     Criteria que=session.createCriteria(OrderTable.class);
     que.setFirstResult(1);
     que.setMaxResults(4);
      List<OrderTable> data=que.list();
      for(OrderTable record:data){
          System.out.println(record.getTableNo()+"   "+record.getCustomerName()+"    "+record.getContactNo()+"     "+record.getReview());
          
      }
   }
}
