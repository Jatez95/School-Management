package d.dogs.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Teacher_Entity {
    private Integer id;
    private String first_name;
    private String first_surname;
    private String second_surname;
    private String email;
    private Integer years_experience;
}
