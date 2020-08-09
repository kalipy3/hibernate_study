/*
 * This Java source file was generated by the Gradle 'init' task.
 *
 */

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class HibernateDemo {

    public static void testGet() {
        SessionFactory sessionFactory = null;
        Session session = null;
        Transaction tx = null;

        try {
            sessionFactory = HibernateUtils.getSessionFactory();
            //与本地线程绑定的session
            session = HibernateUtils.getSessionObject();
            //开启事务
            tx = session.beginTransaction();
           
            //criteria对象
            Criteria criteria = session.createCriteria(User.class);
            List<User> list = criteria.list();
            for (User user : list) {
                System.out.println(user);
            }

            tx.commit();

        } catch(Exception e) {
            e.printStackTrace();
            //回滚事务
            tx.rollback();
        } finally {
            session.close();
            sessionFactory.close();
        }

    }

    public static void main(String args[]) {
        testGet();
    }
}
