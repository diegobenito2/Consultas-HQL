import com.world.HibernateUtil;
import com.world.model.Continent;
import com.world.model.Country;
import org.hibernate.Session;
import org.junit.jupiter.api.Test;

import java.util.List;

public class Consultas {

    // 1️⃣ Consultas Sencillas

    @Test
    public void consulta1() {
        System.out.println("Consulta 1.1 - Obtén todos los países de la base de datos:");
        Session s = HibernateUtil.getSessionFactory().openSession();
        System.out.println("Paises:");
        List<Country> listaPaises =
                s.createQuery("FROM Country", Country.class).list();

        int i = 1;
        for (Country c : listaPaises) {
            System.out.println(i + " " + c);
            i++;
        }

        s.close();
    }

    @Test
    public void consulta2() {
        Session s = HibernateUtil.getSessionFactory().openSession();
        System.out.println("Consulta 1.2 - Muestra los nombres y continentes de todos los países:");
        List<Object[]> listaNombres =
                s.createQuery("SELECT c.name, c.continent FROM Country c ORDER BY c.continent ASC",
                        Object[].class).getResultList();

        int i = 1;
        for (Object[] o : listaNombres) {
            String nombre = (String) o[0];
            Continent continente = (Continent) o[1];
            System.out.println(i + " País: " + nombre + " Continente: " + continente);
            i++;
        }
        s.close();
    }

    @Test
    public void consulta3() {
        Session s = HibernateUtil.getSessionFactory().openSession();
        System.out.println("Consulta 1.3 - Lista todas las ciudades que pertenecen a España:");
        System.out.println("Ciudades de España:");

        // Obtener el código del país España
        String codigoPais = (String) s.createQuery("select co.code from Country co where co.localName = :localName")
                .setParameter("localName", "España")
                .uniqueResult();

        if (codigoPais != null) {
            // Ahora obtener las ciudades relacionadas con ese país
            List<String> listaNombresCiudades = s.createQuery(
                            "select c.name FROM City c WHERE c.country.code = :codigoPais", String.class)
                    .setParameter("codigoPais", codigoPais)
                    .list();

            int i = 1;
            for (String c : listaNombresCiudades) {
                System.out.println(i + " " + c);
                i++;
            }
        } else {
            System.out.println("No se encontró el país España.");
        }
        s.close();
    }

    @Test
    public void consulta4() {
        Session s = HibernateUtil.getSessionFactory().openSession();
        System.out.println("Consulta 1.4 - Obtén los idiomas hablados en Francia:");
        System.out.println("Idiomas hablados en Francia:");
        String codigoFrancia=(String) s.createQuery("select co.code from Country co where co.name = :name")
                .setParameter("name", "France")
                .uniqueResult();
        if (codigoFrancia != null) {
            // Ahora obtener las ciudades relacionadas con ese país
            List<String> listaIdiomas = s.createQuery(
                    "select cl.language FROM CountryLanguage cl  WHERE cl.id.countryCode = :codigoFrancia", String.class).setParameter("codigoFrancia",codigoFrancia).list();


            int i = 1;
            for (String c : listaIdiomas) {
                System.out.println("Idioma "+i + ": " + c);
                i++;
            }
        } else {
            System.out.println("No se encontró el país Francia.");
        }
        s.close();
    }

    // 2️⃣ Consultas con JOIN

    @Test
    public void consulta5() {
        Session s = HibernateUtil.getSessionFactory().openSession();
        System.out.println("Consulta 2.1 - Muestra el nombre de cada ciudad junto con el nombre de su país:");
        
        s.close();
    }

    @Test
    public void consulta6() {
        Session s = HibernateUtil.getSessionFactory().openSession();
        System.out.println("Consulta 2.2 - Obtén los países junto con su idioma oficial:");
        // Tu lógica aquí
        s.close();
    }

    @Test
    public void consulta7() {
        Session s = HibernateUtil.getSessionFactory().openSession();
        System.out.println("Consulta 2.3 - Lista las ciudades de Europa con más de 1 millón de habitantes:");
        // Tu lógica aquí
        s.close();
    }

    @Test
    public void consulta8() {
        Session s = HibernateUtil.getSessionFactory().openSession();
        System.out.println("Consulta 2.4 - Muestra los países junto con su idioma y su población total:");
        // Tu lógica aquí
        s.close();
    }

    // 3️⃣ Consultas con Funciones de Agregación y Agrupación

    @Test
    public void consulta9() {
        Session s = HibernateUtil.getSessionFactory().openSession();
        System.out.println("Consulta 3.1 - Calcula la población total de todos los países:");
        // Tu lógica aquí
        s.close();
    }

    @Test
    public void consulta10() {
        Session s = HibernateUtil.getSessionFactory().openSession();
        System.out.println("Consulta 3.2 - Muestra el número total de ciudades registradas en la base de datos:");
        // Tu lógica aquí
        s.close();
    }

    @Test
    public void consulta11() {
        Session s = HibernateUtil.getSessionFactory().openSession();
        System.out.println("Consulta 3.3 - Obtén el país con la mayor población:");
        // Tu lógica aquí
        s.close();
    }

    @Test
    public void consulta12() {
        Session s = HibernateUtil.getSessionFactory().openSession();
        System.out.println("Consulta 3.4 - Lista el número de idiomas hablados en cada continente:");
        // Tu lógica aquí
        s.close();
    }

    @Test
    public void consulta13() {
        Session s = HibernateUtil.getSessionFactory().openSession();
        System.out.println("Consulta 3.5 - Muestra la población media de las ciudades de cada país:");
        // Tu lógica aquí
        s.close();
    }

    // 4️⃣ Consultas con Subconsultas

    @Test
    public void consulta14() {
        Session s = HibernateUtil.getSessionFactory().openSession();
        System.out.println("Consulta 4.1 - Encuentra los países cuya población es mayor que la población media de todos los países:");
        // Tu lógica aquí
        s.close();
    }

    @Test
    public void consulta15() {
        Session s = HibernateUtil.getSessionFactory().openSession();
        System.out.println("Consulta 4.2 - Lista las ciudades cuya población es mayor que la capital de su país:");
        // Tu lógica aquí
        s.close();
    }

    @Test
    public void consulta16() {
        Session s = HibernateUtil.getSessionFactory().openSession();
        System.out.println("Consulta 4.3 - Obtén los países que tienen más de un idioma oficial:");
        // Tu lógica aquí
        s.close();
    }

    // 5️⃣ Consultas con Ordenación y Paginación

    @Test
    public void consulta17() {
        Session s = HibernateUtil.getSessionFactory().openSession();
        System.out.println("Consulta 5.1 - Muestra los 10 países más poblados, ordenados de mayor a menor población:");
        // Tu lógica aquí
        s.close();
    }

    @Test
    public void consulta18() {
        Session s = HibernateUtil.getSessionFactory().openSession();
        System.out.println("Consulta 5.2 - Obtén las 5 ciudades más pobladas de Asia:");
        // Tu lógica aquí
        s.close();
    }

    @Test
    public void consulta19() {
        Session s = HibernateUtil.getSessionFactory().openSession();
        System.out.println("Consulta 5.3 - Lista los idiomas más hablados en el mundo, ordenados de mayor a menor número de hablantes:");
        // Tu lógica aquí
        s.close();
    }

    // 6️⃣ Consultas con Parámetros

    @Test
    public void consulta20() {
        Session s = HibernateUtil.getSessionFactory().openSession();
        System.out.println("Consulta 6.1 - Crea una consulta que permita buscar ciudades de un país específico utilizando un parámetro:");
        // Tu lógica aquí
        s.close();
    }

    @Test
    public void consulta21() {
        Session s = HibernateUtil.getSessionFactory().openSession();
        System.out.println("Consulta 6.2 - Desarrolla una consulta parametrizada para obtener los países de un continente determinado:");
        // Tu lógica aquí
        s.close();
    }

    @Test
    public void consulta22() {
        Session s = HibernateUtil.getSessionFactory().openSession();
        System.out.println("Consulta 6.3 - Encuentra las ciudades con más habitantes que un número dado como parámetro:");
        // Tu lógica aquí
        s.close();
    }



}
