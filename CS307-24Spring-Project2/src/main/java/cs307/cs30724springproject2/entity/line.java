package cs307.cs30724springproject2.entity;


import java.time.LocalDateTime;

public class line {

    private String name;

    private LocalDateTime startTime;

    private LocalDateTime endTime;

    private String intro;

    private Double mileage;

    private String color;

    private LocalDateTime firstOpening;

    private String url;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
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

    public LocalDateTime getFirstOpening() {
        return firstOpening;
    }

    public void setFirstOpening(LocalDateTime firstOpening) {
        this.firstOpening = firstOpening;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}