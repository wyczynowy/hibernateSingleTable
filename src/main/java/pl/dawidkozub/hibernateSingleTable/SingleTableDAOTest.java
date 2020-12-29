package pl.dawidkozub.hibernateSingleTable;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class SingleTableDAOTest {

    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("ProductsDB");
        EntityManager entityManager = factory.createEntityManager();

        entityManager.getTransaction().begin();

        Pen newPen = new Pen();
        newPen.setName("Clasic Pen");
        newPen.setColor("Red");

        entityManager.persist(newPen);

        entityManager.getTransaction().commit();

        entityManager.close();
        factory.close();
    }
}