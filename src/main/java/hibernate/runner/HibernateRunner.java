package hibernate.runner;

import hibernate.entity.Birthday;
import hibernate.entity.Company;
import hibernate.entity.PersonalInfo;
import hibernate.entity.User;
import hibernate.util.HibernateUtil;
import org.hibernate.Session;

import java.time.LocalDate;

public class HibernateRunner {
    public static void main(String[] args) {
        Company company = Company.builder()
                .name("Google")
                .build();
        User user = User.builder()
                .username("petr123@gmail.com")
                .personalInfo(PersonalInfo.builder()
                        .lastname("Petrov")
                        .firstname("Petr")
                        .birthDate(new Birthday(LocalDate.of(2000, 1, 2)))
                        .build())
                .company(company)
                .build();

        try (var sessionFactory = HibernateUtil.buildSessionFactory()) {

            try (Session session1 = sessionFactory.openSession()) {
                session1.beginTransaction();

                User user1 = session1.get(User.class, 2L);
//                session1.save(company);
//                session1.save(user);

                session1.getTransaction().commit();
            }

            try (Session session2 = sessionFactory.openSession()) {
                session2.beginTransaction();


                session2.getTransaction().commit();
            }
        }
    }
}
