package nl.hu.consultant.skilltree.presentation;

import nl.hu.consultant.skilltree.domain.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {
}
