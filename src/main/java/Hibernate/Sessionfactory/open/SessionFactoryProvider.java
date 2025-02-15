package Hibernate.Sessionfactory.open;

import org.hibernate.SessionFactory;
 public final class SessionFactoryProvider{
	 
 private static final SessionFactory sessionFactory;
 static{
	 sessionFactory =HibernateUtil.getSessionFactory();
 }
 public static SessionFactory getSessionFactory() {
 return sessionFactory;
 }
 private SessionFactoryProvider() {
 }
 }