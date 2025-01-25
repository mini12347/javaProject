package ENTITIES;

import java.sql.Time;
import java.time.LocalDate;

public class Seance {
    protected int id;
    protected LocalDate date;
    protected Time time;
   // protected Double price;
    public Seance(int id, LocalDate date, Time time, Double price) {
        this.id = id;
        this.date = date;
        this.time = time;
        this.price = price;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public LocalDate getDate() {
        return date;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }
    public Time getTime() {
        return time;
    }
    public void setTime(Time time) {
        this.time = time;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", date=" + date +
                ", time=" + time +
                ", price=" + price ;
    }
}
