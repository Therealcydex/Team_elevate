package esprit.tn.course.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Evaluation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long evaluationId;

    private String title;
    private String description;
    private String evaluationType;

    @ManyToOne
    private Course course;
    @ManyToOne
    private User user;
    @ManyToOne
    private Training training;
}