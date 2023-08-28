package gr.aueb.cf.ch15.seminarish.model;

public class SeminarResponse extends Message {
    private gr.aueb.cf.ch15.seminarish.model.Participant sender;

    public SeminarResponse () {}

    public gr.aueb.cf.ch15.seminarish.model.Participant getSender() {
        return sender;
    }
    public void setSender(Participant sender) {
        this.sender = sender;
    }
}
