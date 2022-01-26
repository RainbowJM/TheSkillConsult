package nl.hu.consultant.skilltree.persistence;

import nl.hu.consultant.skilltree.domain.Progress;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProgressRepository extends JpaRepository<Progress, Long> {
}
