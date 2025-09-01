package za.ca.cput.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ca.cput.domain.Feedback;
import za.ca.cput.domain.Shuttle;
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
    public boolean delete(Long Id) {
         if(feedbackRepository.existsById(Id)){
              feedbackRepository.deleteById(Id);
              return true;
         }
         return false;

    }


    @Override
    public List<Feedback> getAll() {
        return feedbackRepository.findAll();
    }

    @Override
    public List<Feedback> findByShuttleId(Long shuttleId) {
        return List.of();
    }

    public List<Feedback> findByShuttleId(Shuttle shuttleId) {
        return feedbackRepository.findByShuttle(shuttleId);
    }
}
