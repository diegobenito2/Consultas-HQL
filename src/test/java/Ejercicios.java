import org.example.HibernateUtil;
import org.example.Model.Country;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.jupiter.api.Test;

import jakarta.persistence.Query;

import java.util.List;

public class Ejercicios {
    //Consultas Sencillas
    @Test
    public void Consulta1() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Country> countryList = session.createQuery("FROM Country", Country.class).list();
        for (Country c : countryList){
            System.out.println(c);
        }
    }
    @Test
    public void Consulta2() {
        Session session = HibernateUtil.getSessionFactory().openSession();


    }
    @Test
    public void Consulta3() {
        Session session = HibernateUtil.getSessionFactory().openSession();


    }
    @Test
    public void Consulta4() {
        Session session = HibernateUtil.getSessionFactory().openSession();


    }
}