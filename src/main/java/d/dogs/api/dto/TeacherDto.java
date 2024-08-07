package d.dogs.api.dto;


import d.dogs.api.entity.ClassEntity;
import d.dogs.api.entity.SubjectEntity;
import d.dogs.api.entity.TeacherEntity;
import jakarta.annotation.Nullable;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.*;

import java.util.ArrayList;
import java.util.Set;


public class TeacherDto {

    @Positive
    private Integer id;
    @NotBlank
    private String first_name;
    @NotBlank
    private String first_surname;

    private String second_surname;
    @Email
    @NotBlank
    private String email;
    @Nullable
    private Integer years_experience;

    private Set<ClassEntity> class_entities;

    private Set<SubjectEntity> subject_entity;

    public static TeacherEntity to_entity(TeacherDto dto) {
        return new TeacherEntity(
                dto.getId(),
                dto.getFirst_name(),
                dto.getFirst_surname(),
                dto.getSecond_surname(),
                dto.getEmail(),
                dto.getYears_experience(),
                dto.getClass_entities(),
                dto.getSubject_entity()
        );
    }

    public static TeacherDto to_dto(TeacherEntity teacher_entity) {
        return new TeacherDto(
                teacher_entity.getId(),
                teacher_entity.getFirst_name(),
                teacher_entity.getFirst_surname(),
                teacher_entity.getSecond_surname(),
                teacher_entity.getEmail(),
                teacher_entity.getYears_experience(),
                teacher_entity.getClasses(),
                teacher_entity.getSubjects()
                );
    }

    public TeacherDto(
            Integer id,
            String first_name,
            String first_surname,
            String second_surname,
            String email,
            @Nullable Integer years_experience,
            Set<ClassEntity> class_entities,
            Set<SubjectEntity> subject_entity
    ) {
        this.id = id;
        this.first_name = first_name;
        this.first_surname = first_surname;
        this.second_surname = second_surname;
        this.email = email;
        this.years_experience = years_experience;
        this.class_entities = class_entities;
        this.subject_entity = subject_entity;
    }

    public TeacherDto() {
    }

    public @Positive Integer getId() {
        return id;
    }

    public void setId(@Positive Integer id) {
        this.id = id;
    }

    public @NotBlank String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(@NotBlank String first_name) {
        this.first_name = first_name;
    }

    public @NotBlank String getFirst_surname() {
        return first_surname;
    }

    public void setFirst_surname(@NotBlank String first_surname) {
        this.first_surname = first_surname;
    }

    public String getSecond_surname() {
        return second_surname;
    }

    public void setSecond_surname(String second_surname) {
        this.second_surname = second_surname;
    }

    public @Email @NotBlank String getEmail() {
        return email;
    }

    public void setEmail(@Email @NotBlank String email) {
        this.email = email;
    }

    @Nullable
    public Integer getYears_experience() {
        return years_experience;
    }

    public void setYears_experience(@Nullable Integer years_experience) {
        this.years_experience = years_experience;
    }

    public Set<ClassEntity> getClass_entities() {
        return class_entities;
    }

    public void setClass_entities(Set<ClassEntity> class_entities) {
        this.class_entities = class_entities;
    }

    public Set<SubjectEntity> getSubject_entity() {
        return subject_entity;
    }

    public void setSubject_entity(Set<SubjectEntity> subject_entity) {
        this.subject_entity = subject_entity;
    }
}
