package nl.hu.consultant.skilltree.persitence;

import nl.hu.consultant.skilltree.domain.Progress;
import nl.hu.consultant.skilltree.domain.Recommendation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RecommendationRepository extends JpaRepository<Recommendation, Long> {
    Optional<Progress> findById(int user_id);
}
