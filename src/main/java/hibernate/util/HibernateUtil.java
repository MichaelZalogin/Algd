package hibernate.util;

import lombok.experimental.UtilityClass;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

@UtilityClass
public class HibernateUtil {

    public static SessionFactory buildSessionFactory() {
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        /** Парсинг имен полей */
//        configuration.setPhysicalNamingStrategy(new CamelCaseToUnderscoresNamingStrategy());
        /** Регистрация сущностей */
//        configuration.addAnnotatedClass(User.class);
        /** Конвентер User типов */
//        configuration.addAttributeConverter(User class, true);
        /** Регистрация User типа */
//        configuration.registerTypeOverride(new JsonBinaryType());
        return configuration.buildSessionFactory();
    }
}