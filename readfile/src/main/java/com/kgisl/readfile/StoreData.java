package com.kgisl.readfile;


import java.util.List;

import org.hibernate.Session;  
import org.hibernate.SessionFactory;  
import org.hibernate.Transaction;  
import org.hibernate.boot.Metadata;  
import org.hibernate.boot.MetadataSources;  
import org.hibernate.boot.registry.StandardServiceRegistry;  
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;



/**
 * Hello world!
 *
 */
public class StoreData 
{
    public static void main( String[] args )
    {
       
        System.out.println( "Hello World!" );
       
       

        StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
        Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();  
      
    SessionFactory factory = meta.getSessionFactoryBuilder().build();  
    Session session = factory.openSession();  
    Transaction t = session.beginTransaction();  
      
     Employee e1=new Employee();    
        e1.setId(1);    
        e1.setFirstName("Gaurav");    
        e1.setLastName("Chawla");    
     
        session.save(e1);  
//display theemployee........................
    List<Employee> emps= session.createQuery("from Employee",Employee.class).list();
   
    emps.forEach(System.out::println);

//update............................
Employee s=session.get(Employee.class, 1);
s.setFirstName("helo");
session.save(s);


  //delete..................................
// Employee s=session.get(Employee.class, 1);
// session.delete(s);
// t.commit();
  




   t.commit();  
   System.out.println("successfully saved");    
    factory.close();  
    session.close();     

    }
    
    // public void deleteEmployee(Integer EmployeeID){
    //     StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
    //     Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();  
    //     SessionFactory factory = meta.getSessionFactoryBuilder().build(); 
    //     Session session = factory.openSession();
    //     Transaction tx = null;
    //     System.out.println("delete ");
    //     try {
    //        tx = session.beginTransaction();
    //        Employee employee = (Employee)session.get(Employee.class, EmployeeID); 
    //        session.delete(employee); 
    //        tx.commit();
    //     } catch (HibernateException e) {
    //        if (tx!=null) tx.rollback();
    //        e.printStackTrace(); 
    //     } finally {
    //        session.close(); 
    //     }
    //  }
}
