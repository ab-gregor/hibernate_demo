package hibernate_demo.hibernate_demo;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;

import hibernate_demo.hibernate_demo.Emp;
import hibernate_demo.hibernate_demo.EmpName;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	EmpName name = new EmpName();
    	name.setFname("Thoma");
    	name.setLname("ktm");
    	Emp emp = new Emp();
    	emp.setId(105);
    	emp.setCountry("IN");
    	emp.setName(name);
    	

    	
    	
    	Configuration config = new Configuration().configure().addAnnotatedClass(Emp.class);

    	
    	 SessionFactory factory = config.buildSessionFactory();
    	
    	Session session = factory.openSession();
    	Transaction tx = session.beginTransaction();
    	
    	 session.save(emp);

    	
    	tx.commit();
    	System.out.println(emp);
    }
}
