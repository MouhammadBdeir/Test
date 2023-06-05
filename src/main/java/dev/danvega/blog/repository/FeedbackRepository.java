package dev.danvega.blog.repository;


import dev.danvega.blog.model.Feedback;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

// DAO class
@Repository
public interface FeedbackRepository extends CrudRepository<Feedback, Integer> {
    @Query("SELECT * FROM POST WHERE author = :id")
    Optional<Feedback> findById(Integer id);
}
