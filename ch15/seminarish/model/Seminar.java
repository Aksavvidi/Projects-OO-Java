package gr.aueb.cf.ch15.seminarish.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Seminar extends IdentifiableEntity {


    private String title;
    private String description;
    private gr.aueb.cf.ch15.seminarish.model.Organizer organizer;
    private List<gr.aueb.cf.ch15.seminarish.model.Participant> participants = new ArrayList<>();
    private SeminarRoom seminarRoom;
    private SchedulingPeriod schedulingePeriod;

    public Seminar () {}
        public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public gr.aueb.cf.ch15.seminarish.model.Organizer getOrganizer() {
        return organizer;
    }
    public void setOrganizer(Organizer organizer) {
        this.organizer = organizer;
    }

    List<gr.aueb.cf.ch15.seminarish.model.Participant> getParticipants() {
        return participants;
    }

    public void setParticipants(List<gr.aueb.cf.ch15.seminarish.model.Participant> participants) {
        this.participants = participants;
    }

    public List<gr.aueb.cf.ch15.seminarish.model.Participant> getAllParticipants(){
        return Collections.unmodifiableList(this.participants);
    }

    public SeminarRoom getSeminarRoom() {
        return seminarRoom;
    }

    public void setSeminarRoom(SeminarRoom seminarRoom) {
        this.seminarRoom = seminarRoom;
    }

    public SchedulingPeriod getSchedulingPeriod() {
        return schedulingePeriod;
    }

    public void setSchedulingPeriod(SchedulingPeriod schedulingePeriod) {
        this.schedulingePeriod = schedulingePeriod;
    }

    public boolean addParticipant(Participant participant){
        if (participant == null) return false;
        for (Seminar seminar : participant.getSeminars()) {
            if (seminar == this){
                return false;
            }
        }
        this.participants.add(participant);
        participant.getSeminars().add(this);
        return true;
    }
    public boolean addSeminarRoom(SeminarRoom seminarRoom){
        if (seminarRoom == null) return false;
        for (Seminar seminar : seminarRoom.getSeminars()){
            if (seminar == this){
                return false;
            }
        }
        this.seminarRoom = seminarRoom;
        seminarRoom.getSeminars().add(this);
        return true;
    }
}
