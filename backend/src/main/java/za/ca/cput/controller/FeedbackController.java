package za.ca.cput.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ca.cput.domain.Feedback;
import za.ca.cput.service.FeedbackService;

import java.util.List;

@RestController
@RequestMapping("/feedback")
public class FeedbackController {

    private final FeedbackService feedbackService;
    @Autowired
    public FeedbackController(FeedbackService feedbackService) {
        this.feedbackService = feedbackService;
    }

    @PostMapping("/create")
    public Feedback create(@RequestBody Feedback feedback){
        return feedbackService.create(feedback);
    }
    @GetMapping("/read/{Id}")
    public Feedback read(@PathVariable Long Id) {
        return feedbackService.read(Id);
    }

    @PutMapping("/update")
    public Feedback update(@RequestBody Feedback feedback) {
        return feedbackService.update(feedback);
    }

    @DeleteMapping("/delete/{feedbackId}")
    public void delete(@PathVariable Long feedbackId) {
        feedbackService.delete(feedbackId);
    }

    @GetMapping("/getAll")
    public List<Feedback> getAll() {
        return feedbackService.getAll();
    }


}


