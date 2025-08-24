package za.ca.cput.domain;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table( name = "feedback")
public class Feedback {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long feedbackId;
    private String comment;
    private int rating;
    private LocalDateTime feedbackTime;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn( name = "studentId", nullable = false)
    private Student student;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn( name = "shuttleId", nullable = false)
    private Shuttle shuttle;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn( name = "bookingId", nullable = false)
    private Booking booking;

    protected Feedback() {

    }

    public Feedback(Builder builder) {
        this.feedbackId = builder.feedbackId;
        this.comment = builder.comment;
        this.rating = builder.rating;
        this.feedbackTime = builder.feedbackTime;
        this.student = builder.student;
        this.shuttle = builder.shuttle;
        this.booking = builder.booking;
    }


    public Long getFeedbackId() {
        return feedbackId;
    }

    public String getComment() {
        return comment;
    }

    public int getRating() {
        return rating;
    }

    public LocalDateTime getFeedbackTime() {
        return feedbackTime;
    }

    public Student getStudent() {
        return student;
    }

    public Shuttle getShuttle() {
        return shuttle;
    }

    public Booking getBooking() {
        return booking;
    }

    @Override
    public String toString() {
        return "Feedback{" +
                "feedbackId=" + feedbackId +
                ", comment='" + comment + '\'' +
                ", rating=" + rating +
                ", feedbackTime=" + feedbackTime +
                ", student=" + student +
                ", shuttle=" + shuttle +
                ", booking=" + booking +
                '}';
    }
    public static class Builder {
        private Long feedbackId;
        private String comment;
        private int rating;
        private LocalDateTime feedbackTime;
        private Student student;
        private Shuttle shuttle;
        private Booking booking;

        public Builder setFeedbackId(Long feedbackId) {
            this.feedbackId = feedbackId;
            return this;
        }

        public Builder setComment(String comment) {
            this.comment = comment;
            return this;
        }

        public Builder setRating(int rating) {
            this.rating = rating;
            return this;
        }

        public Builder setFeedbackTime(LocalDateTime feedbackTime) {
            this.feedbackTime = feedbackTime;
            return this;
        }

        public Builder setStudent(Student student) {
            this.student = student;
            return this;
        }

        public Builder setShuttle(Shuttle shuttle) {
            this.shuttle = shuttle;
            return this;
        }

        public Builder setBooking(Booking booking) {
            this.booking = booking;
            return this;
        }

        public Builder copy(Feedback feedback) {
            this.feedbackId = feedback.feedbackId;
            this.comment = feedback.comment;
            this.rating = feedback.rating;
            this.feedbackTime = feedback.feedbackTime;
            this.student = feedback.student;
            this.shuttle = feedback.shuttle;
            this.booking = feedback.booking;
            return this;
        }

        public Feedback build() {
            return new Feedback(this);
        }
    }
}
