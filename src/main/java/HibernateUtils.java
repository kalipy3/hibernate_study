import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/*
 * HibernateUtils.java
 * Copyright (C) 2020 kalipy <kalipy@debian>
 *
 * Distributed under terms of the MIT license.
 */

public class HibernateUtils
{
    static Configuration cfg = null;
    static SessionFactory sessionFactory = null;
    
    static {
        //加载核心配置文件
        cfg = new Configuration();
        cfg.configure();
        sessionFactory = cfg.buildSessionFactory();
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}

