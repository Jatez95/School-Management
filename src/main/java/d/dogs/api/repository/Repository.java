package d.dogs.api.repository;

import d.dogs.api.entity.TeacherEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository<TeacherEntity, Integer> {
}
