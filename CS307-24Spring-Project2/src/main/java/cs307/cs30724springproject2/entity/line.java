package cs307.cs30724springproject2.entity;


import java.time.LocalTime;
import java.time.LocalDate;

public class line {

    private String name;

    private LocalTime startTime;

    private LocalTime endTime;

    private String intro;

    private Double mileage;

    private String color;

    private LocalDate firstOpening;

    private String url;

    public line(String name, LocalTime startTime, LocalTime endTime, String intro,Double mileage, String color, LocalDate firstOpening, String url) {
        this.name = name;
        this.startTime = startTime;
        this.endTime = endTime;
        this.intro = intro;
        this.mileage = mileage;
        this.color = color;
        this.firstOpening = firstOpening;
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public Double getMileage() {
        return mileage;
    }

    public void setMileage(Double mileage) {
        this.mileage = mileage;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public LocalDate getFirstOpening() {
        return firstOpening;
    }

    public void setFirstOpening(LocalDate firstOpening) {
        this.firstOpening = firstOpening;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}