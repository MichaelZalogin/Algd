package hibernate.runner;

import hibernate.entity.User;
import org.junit.jupiter.api.Test;

import javax.persistence.Column;
import javax.persistence.Table;
import java.lang.reflect.Field;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class HibernateRunnerTest {

    @Test
    void checkReflectionApi() {
        User user = User.builder()
                .username("ivan@gmail.com")
                .firstname("Ivan")
                .lastname("Ivanov")
                .birthDate(LocalDate.of(2000, 1, 19))
                .age(20)
                .build();
        String sql = """
                insert
                into
                %s
                (%s)
                values
                (%s)
                """;
        /** Первый заполнитель определяем по полям @Table Entity, если она существуюет.
         * Если нет, мапим имя класса
         */
        String tableName = Optional.ofNullable(user.getClass().getAnnotation(Table.class))
                .map(tableAnnotation -> tableAnnotation.schema() + "." + tableAnnotation.name())
                .orElse(user.getClass().getName());

        /** Второй заполнитель. Получаем поля в массиве. Имя полей получаем либо из
         * @Column по аргументу name, либо мапимся напрямую через имя поля
         */
        var columnNames = user.getClass().getDeclaredFields();
        Arrays.stream(columnNames)
                .map(field -> Optional.ofNullable(field.getAnnotation(Column.class))
                        .map(Column::name)
                        .orElse(field.getName()))
                .collect(Collectors.joining(", "));

        var columnValues = Arrays.stream(columnNames).map(field -> "?")
                .collect(Collectors.joining(", "));

        System.out.println(sql.formatted(tableName, columnNames, columnValues));

    }


}