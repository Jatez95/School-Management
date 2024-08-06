package d.dogs.api.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "subject_table")
public class SubjectEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "subject_name")
    private String subject_name;

    @ManyToMany(mappedBy = "subjects")
    private Set<StudentEntity> students;

    @ManyToMany(mappedBy = "subjects")
    private Set<TeacherEntity> teachers;

}
