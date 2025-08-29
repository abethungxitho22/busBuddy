package za.ca.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ca.cput.domain.Feedback;
import za.ca.cput.domain.Shuttle;

import java.util.List;

public interface FeedbackRepository extends JpaRepository<Feedback, Long> {

    List<Feedback> findByShuttle(Shuttle shuttle);
    List<Feedback> findByRating(int rating);
    List<Feedback> findByShuttleAndRating( Shuttle shuttle, int rating);


}
