package hibernate.runner;

import hibernate.entity.User;
import hibernate.util.HibernateUtil;
import org.hibernate.Session;

public class HibernateRunner {
    public static void main(String[] args) {
        /** Transient по отношению к любой сессии */
        User user = User.builder()
                .username("ivan@gmail.com")
                .lastname("Ivanov")
                .firstname("Ivan")
                .build();

        try (var sessionFactory = HibernateUtil.buildSessionFactory()) {

            try (Session session1 = sessionFactory.openSession()) {
                session1.beginTransaction();
                /** Persistent по отношению к session1 и Transient по
                 * отношению к session2 */
                session1.saveOrUpdate(user);

                /** user в Detached состоянии по отношению к session1 и Transient по
                 * отношению к session2 */
                session1.getTransaction().commit();
            }

            try (Session session2 = sessionFactory.openSession()) {
                session2.beginTransaction();

                /** Сначала произойдет get() чтобы сущность была в состоянии
                 * Persistent, а затем будет переход в состояние Removed.
                 * Метод delete не переводит сущность из Transient в Persistent */
//                session2.delete(user);

                /** Синхронизирующие методы */
                session2.refresh(user);
                session2.merge(user);

                session2.getTransaction().commit();
            }
        }
    }
}
