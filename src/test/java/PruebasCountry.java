import com.world.HibernateUtil;
import com.world.model.City;
import com.world.model.Country;
import com.world.model.CountryLanguage;
import com.world.model.CountryLanguageId;
import org.junit.jupiter.api.Test;
import org.hibernate.Session;

public class PruebasCountry {

    @Test
    public void prueba1() {
        Session s = HibernateUtil.getSessionFactory().openSession();

        Country country = s.find(Country.class, "ESP");
        City city = s.find(City.class, 123);

        System.out.println(country);
        System.out.println(city);

        s.close();

    }

    @Test
    public void prueba2(){
        Session s = HibernateUtil.getSessionFactory().openSession();

        CountryLanguage cl = s.find(CountryLanguage.class, new CountryLanguageId("ESP", "Spanish"));

        System.out.println(cl);
    }
    // Obtén todos los países de la base de datos.

}
