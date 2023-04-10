package jpa.mall;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class App{

    public static void main(String[] args){

    EntityManagerFactory f=Persistence.createEntityManagerFactory("shop");
    EntityManager m=f.createEntityManager();
    EntityTransaction t=m.getTransaction();
    t.begin();

    try {


        Order o = m.find(Order.class, 1L);
        Long id=o.getId();
    t.commit();
    }catch( Exception e){
    t.rollback();
    }finally{
    m.close();
    }
    f.close();

    }

}
