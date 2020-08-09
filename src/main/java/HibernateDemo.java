/*
 * This Java source file was generated by the Gradle 'init' task.
 */

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class HibernateDemo {

    public static void testAdd() {
        Configuration cfg = new Configuration();
        cfg.configure();

        SessionFactory sessionFactory = cfg.buildSessionFactory();

        Session session = sessionFactory.openSession();

        Transaction tx = session.beginTransaction();

        User user = new User();
        user.setUsername("ly");
        user.setPassword("290");
        user.setAddress("日本");
        session.save(user);

        tx.commit();

        session.close();
        sessionFactory.close();
    }

    public static void main(String args[]) {
        testAdd();
    }
}
