package cs307.cs30724springproject2.entity;

import java.util.Date;

public class cardOnboard {
    private Integer id;
    private String cardCode;
    private String startStation;
    private Date startTime;

    public Integer getId() {return id;}

    public void setId(Integer id) {this.id = id;}

    public String getCardCode() {return cardCode;}

    public void setCardCode(String cardCode) {this.cardCode = cardCode;}

    public String getStartStation() {return startStation;}

    public void setStartStation(String startStation) {this.startStation = startStation;}

    public Date getStartTime() {return startTime;}

    public void setStartTime(Date startTime) {this.startTime = startTime;}
}
