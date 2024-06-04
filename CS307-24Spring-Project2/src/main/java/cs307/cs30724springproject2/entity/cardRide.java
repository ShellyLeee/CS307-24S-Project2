package cs307.cs30724springproject2.entity;


import java.time.LocalDateTime;


public class cardRide {

    private Integer id;

    private String cardCode;

    private String startStation;

    private String endStation;

    private Integer price;

    private LocalDateTime startTime;

    private LocalDateTime endTime;

    public cardRide(Integer id, String cardCode, String startStation, String endStation, Integer price, LocalDateTime startTime, LocalDateTime endTime) {
        this.id = id;
        this.cardCode = cardCode;
        this.startStation = startStation;
        this.endStation = endStation;
        this.price = price;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        return "CardRide{" +
                "cardCode='" + cardCode + '\'' +
                ", startStation='" + startStation + '\'' +
                ", endStation='" + endStation + '\'' +
                ", price=" + price +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCardCode() {
        return cardCode;
    }

    public void setCardCode(String cardCode) {
        this.cardCode = cardCode;
    }

    public String getStartStation() {
        return startStation;
    }

    public void setStartStation(String startStation) {
        this.startStation = startStation;
    }

    public String getEndStation() {
        return endStation;
    }

    public void setEndStation(String endStation) {
        this.endStation = endStation;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
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
}