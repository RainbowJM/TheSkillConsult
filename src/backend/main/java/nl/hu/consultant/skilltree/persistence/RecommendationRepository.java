package nl.hu.consultant.skilltree.persistence;

import nl.hu.consultant.skilltree.domain.Recommendation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecommendationRepository extends JpaRepository<Recommendation, Long> {
}
