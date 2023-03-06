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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @AttributeOverride(name = "birthDate", column = @Column(name = "birth_date"))
    private PersonalInfo personalInfo;

    @Column(unique = true)
    private String username;

    @Enumerated(EnumType.STRING)
    private Role role;

    @ManyToOne
    @JoinColumn(name = "company_id")
    private Company company;
//    @Type(type = "com.vladmihalcea.hibernate.type.json.JsonBinaryType")
//    @Type(type = "jsonb")
//    private String info;
}