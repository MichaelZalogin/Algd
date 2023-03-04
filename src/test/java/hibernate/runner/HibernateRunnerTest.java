package hibernate.runner;

import hibernate.entity.User;
import org.junit.jupiter.api.Test;

import javax.persistence.Column;
import javax.persistence.Table;
import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Collectors;

class HibernateRunnerTest {

    @Test
    void checkReflectionApi() throws SQLException, IllegalAccessException {
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
        /** Первый заполнитель определяем по полям @Table Entity, если они существуют.
         * Если нет, мапим имя класса.
         */
        String tableName = Optional.ofNullable(user.getClass().getAnnotation(Table.class))
                .map(tableAnnotation -> tableAnnotation.schema() + "." + tableAnnotation.name())
                .orElse(user.getClass().getName());

        /** Второй заполнитель. Получаем поля в массиве. Имя полей получаем либо из
         * @Column по аргументу name, либо мапимся напрямую через имя поля.
         */
        Field[] declaredFields = user.getClass().getDeclaredFields();
        String columnNames = Arrays.stream(declaredFields)
                .map(field -> Optional.ofNullable(field.getAnnotation(Column.class))
                        .map(Column::name)
                        .orElse(field.getName()))
                .collect(Collectors.joining(", "));

        /** Третий заполнитель. Каждое поле из массива полей преобразовываем в "?" для
         * использования в PrepareStatement.
         */
        String columnValues = Arrays.stream(declaredFields).map(field -> "?")
                .collect(Collectors.joining(", "));

        String sqlQuery = sql.formatted(tableName, columnNames, columnValues);
        System.out.println(sqlQuery);

//        Connection connection = null;
//        PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
//        for (Field declaredField : declaredFields) {
//            declaredField.setAccessible(true);
//            preparedStatement.setObject(1, declaredField.get(user));
//        }
    }
}