package gr.aueb.cf.ch15.seminarish.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SeminarRoom {

    private Long id;
    private String alias;
    private String url;
    private List<gr.aueb.cf.ch15.seminarish.model.Seminar> seminars = new ArrayList<>();

    public SeminarRoom() {}

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getAlias() {
        return alias;
    }
    public void setAlias(String alias) {
        this.alias = alias;
    }
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    List<gr.aueb.cf.ch15.seminarish.model.Seminar> getSeminars() {
        return seminars;
    }
    public List<gr.aueb.cf.ch15.seminarish.model.Seminar> getAllSeminars(){
        return Collections.unmodifiableList(this.seminars);
    }
    public void setSeminars(List<Seminar> seminars) {
        this.seminars = seminars;
    }
}
