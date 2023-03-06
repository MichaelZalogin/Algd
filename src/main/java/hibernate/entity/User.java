package hibernate.entity;

import hibernate.converter.BirthdayConverter;
import lombok.*;

import javax.persistence.*;

//@TypeDef(name = "ddd", typeClass = JsonBinaryType.class)
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

    @Embedded
    @AttributeOverride(name = "birthDate", column = @Column(name = "birth_date"))
    @AttributeOverride(name = "firstname", column = @Column(name = "firstname"))
    @AttributeOverride(name = "lastname", column = @Column(name = "lastname"))
    private PersonalInfo personalInfo;

    @Enumerated(EnumType.STRING)
    private Role role;

//    @Type(type = "com.vladmihalcea.hibernate.type.json.JsonBinaryType")
//    @Type(type = "jsonb")
//    private String info;
}