package ru.javastudy.hibernate.main;

import org.hibernate.Session;
import ru.javastudy.hibernate.dao.ContactEntity;
import ru.javastudy.hibernate.utils.HibernateSessionFactory;

/**
 * Created by Nick on 05.09.2015.
 */
public class AppMain {

    public static void main(String[] args) {
        System.out.println("Hibernate tutorial");

        Session session = HibernateSessionFactory.getSessionFactory().openSession();

        session.beginTransaction();

        ContactEntity contactEntity = new ContactEntity();

        contactEntity.setBirthDate(new java.util.Date());
        contactEntity.setFirstName("Nick");
        contactEntity.setLastName("VN");

        session.save(contactEntity);
        session.getTransaction().commit();

        session.close();


    }
}
