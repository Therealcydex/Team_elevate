package esprit.tn.course.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;

    protected String username;
    protected String firstName;
    protected String lastName;
    protected String email;
    protected String password;
    protected String passwordVerif;
    protected String address;
    protected Integer phoneNumber;

    @OneToMany(mappedBy = "user")
    private List<Course> courses;
    @OneToMany(mappedBy = "user")
    private List<Evaluation> evaluations;

}