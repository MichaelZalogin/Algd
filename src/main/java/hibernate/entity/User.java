package hibernate.entity;

import hibernate.converter.BirthdayConverter;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@ToString
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
@Entity
@Table(name = "users", schema = "public")
public class User {
    @Id
    private String username;
    private String firstname;
    private String lastname;

    @Convert(converter = BirthdayConverter.class)
    @Column(name = "birth_date")
    private Birthday birthDate;

    @Enumerated(EnumType.STRING)
    private Role role;
}
