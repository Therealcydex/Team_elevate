package esprit.tn.course.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Training {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long trainingId;

    private String title;
    private String category;
    private Integer durationHours;
    private String difficultyLevel;
    private Integer maxParticipants;
    private Date startDate;
    private Date endDate;
    private String status;

    /* @ManyToOne
     private Course course;

     @OneToMany(mappedBy = "training")
     private List<Enrollment> enrollments;*/
   @OneToMany(mappedBy = "training")
   private List<Course> courses;
    @OneToMany(mappedBy = "training")
    private List<Evaluation> evaluations;
}