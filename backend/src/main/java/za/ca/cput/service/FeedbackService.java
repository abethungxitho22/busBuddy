package za.ca.cput.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ca.cput.domain.Feedback;
import za.ca.cput.repository.FeedbackRepository;

import java.util.List;

@Service
public class FeedbackService implements IFeedbackService {
    private final FeedbackRepository feedbackRepository;


    @Autowired
    public FeedbackService(FeedbackRepository feedbackRepository){
        this.feedbackRepository = feedbackRepository;
    }

    @Override
    public Feedback create(Feedback feedback) {
        return feedbackRepository.save(feedback);
    }

    @Override
    public Feedback read(Long Id) {
        return feedbackRepository.findById(Id).orElse(null);
    }

    @Override
    public Feedback update(Feedback feedback) {
        return feedbackRepository.save(feedback);
    }
   @Override
    public void delete(Long Id) {
        feedbackRepository.deleteById(Id);

    }


    @Override
    public List<Feedback> getAll() {
        return feedbackRepository.findAll();
    }

    public List<Feedback> findByShuttleId(Long shuttleId) {
        return feedbackRepository.findByShuttleId(shuttleId);
    }
}
