package hibernate.entity;

import hibernate.converter.BirthdayConverter;
import lombok.*;

import javax.persistence.*;

@ToString
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
@Embeddable
public class PersonalInfo {

    private String firstname;

    private String lastname;

    @Convert(converter = BirthdayConverter.class)
//    @Column(name = "birth_date")
    private Birthday birthDate;
}
