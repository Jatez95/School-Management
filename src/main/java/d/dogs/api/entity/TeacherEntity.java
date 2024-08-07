package d.dogs.api.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Set;


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

    public TeacherEntity(Integer id, String first_name, String first_surname, String second_surname, String email, Integer years_experience, Set<ClassEntity> classes, Set<SubjectEntity> subjects) {
        this.id = id;
        this.first_name = first_name;
        this.first_surname = first_surname;
        this.second_surname = second_surname;
        this.email = email;
        this.years_experience = years_experience;
        this.classes = classes;
        this.subjects = subjects;
    }

    public TeacherEntity() {
    }

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

    public Set<ClassEntity> getClasses() {
        return classes;
    }

    public void setClasses(Set<ClassEntity> classes) {
        this.classes = classes;
    }

    public Set<SubjectEntity> getSubjects() {
        return subjects;
    }

    public void setSubjects(Set<SubjectEntity> subjects) {
        this.subjects = subjects;
    }

    @Override
    public String toString() {
        return "TeacherEntity{" +
                "id=" + id +
                ", first_name='" + first_name + '\'' +
                ", first_surname='" + first_surname + '\'' +
                ", second_surname='" + second_surname + '\'' +
                ", email='" + email + '\'' +
                ", years_experience=" + years_experience +
                ", classes=" + classes +
                ", subjects=" + subjects +
                '}';
    }


}
