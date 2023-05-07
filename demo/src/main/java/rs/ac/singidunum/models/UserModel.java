package rs.ac.singidunum.models;


import com.fasterxml.jackson.annotation.JsonTypeId;

@Entity
@Table(name="users")
@Data
public class UserModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;

}
