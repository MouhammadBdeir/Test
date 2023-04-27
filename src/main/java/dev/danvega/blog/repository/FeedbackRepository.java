package dev.danvega.blog.repository;


import dev.danvega.blog.model.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// DAO class
@Repository
public interface FeedbackRepository extends JpaRepository<Feedback, Long> {
}
