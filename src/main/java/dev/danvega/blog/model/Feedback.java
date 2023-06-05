package dev.danvega.blog.model;
import javax.persistence.*;

@Entity
@Table(name = "feedback")
public class Feedback {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "message", length = 1000)
    private String message;

    @Column(nullable = false)
    private String subject = "";

    public Feedback() {
    }

    public Feedback(String message, String subject) {
        this.message = message;
        this.subject = subject;
    }

    public int getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }

    public String getSubject() {
        return subject;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}