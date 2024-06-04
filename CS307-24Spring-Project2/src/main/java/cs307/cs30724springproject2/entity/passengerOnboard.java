package cs307.cs30724springproject2.entity;

import jakarta.persistence.Column;
import java.time.LocalDateTime;
import java.util.Date;

public class passengerOnboard {
    private Integer id;

    @Column(name = "passenger_id")
    private String passengerId;

    @Column(name = "start_station")
    private String startStation;

    @Column(name = "start_time")
    private LocalDateTime startTime;

    private String type;

    public passengerOnboard(Integer id, String passengerId, String startStation, LocalDateTime startTime, String type) {
        this.id = id;
        this.passengerId = passengerId;
        this.startStation = startStation;
        this.startTime = startTime;
        this.type = type;
    }

    public Integer getId() { return id; }

    public void setId(Integer id) { this.id = id; }

    public String getPassengerId() { return passengerId;}

    public void setPassengerId(String passengerId) { this.passengerId = passengerId; }

    public String getStartStation() { return startStation; }

    public void setStartStation(String startStation) { this.startStation = startStation; }

    public LocalDateTime getStartTime() { return startTime; }

    public void setStartTime(LocalDateTime startTime) { this.startTime = startTime; }

    public String getType() {return type;}

    public void setType(String type) {this.type = type;}
}
