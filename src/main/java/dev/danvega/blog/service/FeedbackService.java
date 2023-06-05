package dev.danvega.blog.service;

import dev.danvega.blog.model.Feedback;
import dev.danvega.blog.repository.FeedbackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FeedbackService {

    private final FeedbackRepository feedbackRepository;

    @Autowired
    public FeedbackService(FeedbackRepository feedbackRepository) {
        this.feedbackRepository = feedbackRepository;
    }

    public List<Feedback> getAllFeedbacks() {
        return (List<Feedback>) feedbackRepository.findAll();
    }

    public Feedback saveFeedback(Feedback feedback) {
        return feedbackRepository.save(feedback);
    }

    public Feedback getFeedbackById(Long id) throws Exception {
        Optional<Feedback> optionalFeedback = feedbackRepository.findById(Math.toIntExact(id));
        if (optionalFeedback.isPresent()) {
            return optionalFeedback.get();
        } else {
            throw new Exception("Feedback not found with id: " + id);
        }
    }

    public void deleteFeedback(Long id) {
        feedbackRepository.deleteById(Math.toIntExact(id));
    }

    public void updateFeedback(Long id, Feedback feedback) throws Exception {
        Optional<Feedback> optionalFeedback = feedbackRepository.findById(Math.toIntExact(id));
        if (optionalFeedback.isPresent()) {
            Feedback existingFeedback = optionalFeedback.get();
            existingFeedback.setMessage(feedback.getMessage());
            existingFeedback.setSubject(feedback.getSubject());
            feedbackRepository.save(existingFeedback);
        } else {
            throw new Exception("Feedback not found with id: " + id);
        }
    }
}

