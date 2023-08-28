package gr.aueb.cf.ch17.Knight.runna;

public interface IMission {
    MissionStatus getStatus();
    void setStatus(MissionStatus missionStatus);
    void embark();
}
