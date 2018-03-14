package com.proyecto.discover.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

/**
*
* @author Antonio Santos
*/
public class HibernateUtils {
	

	// ----------------------------------------------------
    // MÉTODOS PARA TRABAJAR CON HIBERNATE
    // 
    // sessionFactory: devuelve un objeto para realizar conexiones
    // 
    // ----------------------------------------------------
	
	private static final SessionFactory sessionFactory;
   
    static {
        try {
        	Configuration configuration = new Configuration().configure();
    		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
    				.applySettings(configuration.getProperties());
    		sessionFactory = configuration.buildSessionFactory(builder.build());

        } catch (Exception ex) {
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
    
    
    public static Session getSession() {
    	return getSessionFactory().openSession();
    }
}
