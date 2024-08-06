package d.dogs.api.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "teacher")
public class TeacherEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "first_name")
    private String first_name;

    @Column(name = "first_surname")
    private String first_surname;

    @Column(name = "second_surname")
    private String second_surname;

    @Column(name = "email")
    private String email;

    @Column(name = "years_experience")
    private Integer years_experience;

    @ManyToMany
    @JoinTable(
            name = "subject_class_teacher",
            joinColumns = @JoinColumn(name = "teacher_id"),
            inverseJoinColumns = {
                    @JoinColumn(name = "class_id"),
                    @JoinColumn(name = "subject_id")
            }
    )
    private Set<ClassEntity> classes;

    @ManyToMany
    @JoinTable(
            name = "subject_class_teacher",
            joinColumns = @JoinColumn(name = "teacher_id"),
            inverseJoinColumns = @JoinColumn(name = "subject_id")
    )
    private Set<SubjectEntity> subjects;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getFirst_surname() {
        return first_surname;
    }

    public void setFirst_surname(String first_surname) {
        this.first_surname = first_surname;
    }

    public String getSecond_surname() {
        return second_surname;
    }

    public void setSecond_surname(String second_surname) {
        this.second_surname = second_surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getYears_experience() {
        return years_experience;
    }

    public void setYears_experience(Integer years_experience) {
        this.years_experience = years_experience;
    }
}
