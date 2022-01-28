package nl.hu.consultant.skill.persitence;

import nl.hu.consultant.skill.domain.Progress;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProgressRepository extends JpaRepository<Progress, Long> {
    Optional<Progress> findById(int student_id);
}
