package hibernate.runner;

import hibernate.entity.Birthday;
import hibernate.entity.Role;
import hibernate.entity.User;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import java.time.LocalDate;

public class HibernateRunner {
    public static void main(String[] args) {

        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        /** Парсинг имен полей */
//        configuration.setPhysicalNamingStrategy(new CamelCaseToUnderscoresNamingStrategy());
        /** Регистрация сущностей */
//        configuration.addAnnotatedClass(User.class);
        /** Конвентер User типов */
//        configuration.addAttributeConverter(User class, true);
        try (var sessionFactory = configuration.buildSessionFactory()) {
            Session session = sessionFactory.openSession();

            session.beginTransaction();

            User user = User.builder()
                    .username("ivan@gmail.com")
                    .firstname("Ivan")
                    .lastname("Ivanov")
                    .birthDate(new Birthday(LocalDate.of(2000, 1, 19)))
                    .role(Role.ADMIN)
                    .build();
            session.save(user);

            session.getTransaction().commit();
        }


    }
}
