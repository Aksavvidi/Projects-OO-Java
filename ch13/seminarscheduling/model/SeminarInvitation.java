package gr.aueb.cf.ch13.seminarscheduling.model;

public class SeminarInvitation {
    private Message message;
    private Organizer organizer;
    private SeminarInvitationType type;

    public SeminarInvitation () {}

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    public Organizer getOrganizer() {
        return organizer;
    }

    public void setOrganizer(Organizer organizer) {
        this.organizer = organizer;
    }

    public SeminarInvitationType getType() {
        return type;
    }

    public void setType(SeminarInvitationType type) {
        this.type = type;
    }
}
