package gr.aueb.cf.ch15.seminarish.model;

public class SeminarInvitation extends Message {
    private gr.aueb.cf.ch15.seminarish.model.Organizer organizer;
    private gr.aueb.cf.ch15.seminarish.model.SeminarInvitationType type;

    public SeminarInvitation () {}

    public gr.aueb.cf.ch15.seminarish.model.Organizer getOrganizer() {
        return organizer;
    }
    public void setOrganizer(Organizer organizer) {
        this.organizer = organizer;
    }
    public gr.aueb.cf.ch15.seminarish.model.SeminarInvitationType getType() {
        return type;
    }
    public void setType(SeminarInvitationType type) {
        this.type = type;
    }
}
