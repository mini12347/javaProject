package ENTITIES;

import java.sql.Time;
import java.time.DayOfWeek;
import java.time.LocalDate;

public class Horaire {
    private DayOfWeek startDay;//first day of the week
    private DayOfWeek endDay;//last day of the week
    private Time startHour;
    private Time endHour;
    public Horaire(DayOfWeek startDay, DayOfWeek endDay, Time startHour, Time endHour) {
        this.startDay = startDay;
        this.endDay = endDay;
        this.startHour = startHour;
        this.endHour = endHour;
    }
    public DayOfWeek getStartDay() {
        return startDay;
    }
    public void setStartDay(DayOfWeek startDay) {
        this.startDay = startDay;
    }
    public DayOfWeek getEndDay() {
        return endDay;
    }
    public void setEndDay(DayOfWeek endDay) {
        this.endDay = endDay;
    }
    public Time getStartHour() {
        return startHour;
    }
    public void setStartHour(Time startHour) {
        this.startHour = startHour;
    }
    public Time getEndHour() {
        return endHour;
    }
    public void setEndHour(Time endHour) {
        this.endHour = endHour;
    }

    @Override
    public String toString() {
        return "Availability During the week {" +
                "startDay=" + startDay +
                ", endDay=" + endDay +
                ", startHour=" + startHour +
                ", endHour=" + endHour +
                '}';
    }
}
