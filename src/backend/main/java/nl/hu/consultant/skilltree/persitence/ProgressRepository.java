package nl.hu.consultant.skilltree.persitence;

import nl.hu.consultant.skilltree.domain.Progress;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProgressRepository extends JpaRepository<Progress, Long> {
    Optional<Progress> findById(int student_id);
}
