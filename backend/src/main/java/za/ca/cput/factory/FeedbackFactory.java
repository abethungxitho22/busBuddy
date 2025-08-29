package za.ca.cput.factory;


import za.ca.cput.domain.Booking;
import za.ca.cput.domain.Feedback;
import za.ca.cput.domain.Shuttle;
import za.ca.cput.domain.Student;
import za.ca.cput.util.Helper;
import java.time.LocalDateTime;

public class FeedbackFactory {

    public static Feedback createFeedback(String comment, int rating, LocalDateTime feedbackTime
    , Student student, Shuttle shuttle, Booking booking) {

        if((rating < 1) || (rating > 5) || Helper.isNullOrEmpty(comment)) {
            return null;
        }

        return new Feedback.Builder()
                .setStudent(student)
                .setShuttle(shuttle)
                .setBooking(booking)
                .setComment(comment)
                .setRating(rating)
                .setFeedbackTime(feedbackTime)
                .build();
    }
}
