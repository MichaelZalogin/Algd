package hibernate.runner;

import hibernate.entity.User;
import org.hibernate.Session;

import org.hibernate.cfg.Configuration;

import java.time.LocalDate;

public class HibernateRunner {
    public static void main(String[] args) {

        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
//        configuration.addAnnotatedClass(User.class);
        try (var sessionFactory = configuration.buildSessionFactory()) {
            Session session = sessionFactory.openSession();

            session.beginTransaction();

            User user = User.builder()
                    .username("ivan@gmail.com")
                    .firstname("Ivan")
                    .lastname("Ivanov")
                    .birthDate(LocalDate.of(2000, 1, 19))
                    .age(20)
                    .build();
            session.save(user);

            session.getTransaction().commit();
        }


    }
}
