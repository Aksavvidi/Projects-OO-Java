package gr.aueb.cf.ch13.seminarscheduling.model;

import java.time.Duration;

public class SchedulingPeriod {
    private TimePeriod timePeriod;
    private Long minuteDuration;
    private String formattedDuration;

    public SchedulingPeriod (TimePeriod timePeriod) {
        this.timePeriod = timePeriod;
        Duration duration = Duration.between(timePeriod.getStart().toInstant(), timePeriod.getEnd().toInstant());
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

    public TimePeriod getTimePeriod() {
        return timePeriod;
    }

    public void setTimePeriod(TimePeriod timePeriod) {
        this.timePeriod = timePeriod;
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
