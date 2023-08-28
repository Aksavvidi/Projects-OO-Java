package gr.aueb.cf.ch13.seminarscheduling.model;

import java.util.Date;

public class TimePeriod {
    private Long id;
    private Date start;
    private Date end;

    public TimePeriod() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getStart() {
        return new Date(this.start.getTime());
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getEnd() {
        return new Date(this.end.getTime());
    }

    public void setEnd(Date end) {
        this.end = end;
    }
}
