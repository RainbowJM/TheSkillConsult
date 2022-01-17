package nl.hu.consultant.skilltree.presentation;

import nl.hu.consultant.skilltree.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
