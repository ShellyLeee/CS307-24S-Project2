package cs307.cs30724springproject2.entity;

import jakarta.persistence.Column;
import java.time.LocalDateTime;

public class cardOnboard {
    private Integer id;

    @Column(name = "card_code")
    private String cardCode;

    @Column(name = "start_station")
    private String startStation;

    @Column(name = "start_time")
    private LocalDateTime startTime;

    private String type;

    public cardOnboard(Integer id, String cardCode, String startStation, LocalDateTime startTime, String type) {
        this.id = id;
        this.cardCode = cardCode;
        this.startStation = startStation;
        this.startTime = startTime;
        this.type = type;
    }

    public Integer getId() {return id;}

    public void setId(Integer id) {this.id = id;}

    public String getCardCode() {return cardCode;}

    public void setCardCode(String cardCode) {this.cardCode = cardCode;}

    public String getStartStation() {return startStation;}

    public void setStartStation(String startStation) {this.startStation = startStation;}

    public LocalDateTime getStartTime() {return startTime;}

    public void setStartTime(LocalDateTime startTime) {this.startTime = startTime;}

    public String getType() {return type;}

    public void setType(String type) {this.type = type;}
}
