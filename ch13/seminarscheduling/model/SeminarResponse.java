package gr.aueb.cf.ch13.seminarscheduling.model;

public class SeminarResponse {
    private  Message message;
    private Participant sender;

    public SeminarResponse () {}

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    public Participant getSender() {
        return sender;
    }

    public void setSender(Participant sender) {
        this.sender = sender;
    }
}
