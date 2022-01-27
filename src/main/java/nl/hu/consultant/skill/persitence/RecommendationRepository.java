package nl.hu.consultant.skill.persitence;

import nl.hu.consultant.skill.domain.Progress;
import nl.hu.consultant.skill.domain.Recommendation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RecommendationRepository extends JpaRepository<Recommendation, Long> {
    Optional<Progress> findById(int user_id);
}
