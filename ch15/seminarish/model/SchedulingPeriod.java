package gr.aueb.cf.ch15.seminarish.model;

import java.time.Duration;

public class SchedulingPeriod extends TimePeriod {

    private Long minuteDuration;
    private String formattedDuration;

    public SchedulingPeriod () {
        super();
        Duration duration = Duration.between(getStart().toInstant(), getEnd().toInstant());
        minuteDuration = duration.toMinutes();
        long hours = duration.toHours();
        long minutes = duration.minusMinutes(hours).toMinutes();
        if (hours > 0) {
            this.formattedDuration = hours + " " +((hours == 1) ? "hour " : "hours ");
        }
        if (minutes < 0 ) {
            this.formattedDuration =minutes + " " + ((minutes == 1) ? "minute" : "minutes");
        }
    }
    public Long getMinuteDuration() {
        return minuteDuration;
    }
    public void setMinuteDuration(Long minuteDuration) {
        this.minuteDuration = minuteDuration;
    }
    public String getFormattedDuration() {
        return formattedDuration;
    }
    public void setFormattedDuration(String formattedDuration) {
        this.formattedDuration = formattedDuration;
    }
}
