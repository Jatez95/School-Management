package d.dogs.api.repository;

import d.dogs.api.models.TeacherModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository<TeacherModel, Integer> {
}
