import org.example.HibernateUtil;
import org.hibernate.SessionFactory;
import org.junit.jupiter.api.Test;

public class Usatest {
 @Test
    public void prueba(){
     SessionFactory hibernateUtil=HibernateUtil.getSessionFactory();
 }
}
