package cs307.cs30724springproject2.entity;

import java.util.Date;

public class cardRide {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column card_ride.id
     *
     * @mbg.generated Thu May 16 01:10:29 CST 2024
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column card_ride.card_code
     *
     * @mbg.generated Thu May 16 01:10:29 CST 2024
     */
    private String cardCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column card_ride.start_station
     *
     * @mbg.generated Thu May 16 01:10:29 CST 2024
     */
    private String startStation;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column card_ride.end_station
     *
     * @mbg.generated Thu May 16 01:10:29 CST 2024
     */
    private String endStation;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column card_ride.price
     *
     * @mbg.generated Thu May 16 01:10:29 CST 2024
     */
    private Integer price;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column card_ride.start_time
     *
     * @mbg.generated Thu May 16 01:10:29 CST 2024
     */
    private Date startTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column card_ride.end_time
     *
     * @mbg.generated Thu May 16 01:10:29 CST 2024
     */
    private Date endTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column card_ride.id
     *
     * @return the value of card_ride.id
     *
     * @mbg.generated Thu May 16 01:10:29 CST 2024
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column card_ride.id
     *
     * @param id the value for card_ride.id
     *
     * @mbg.generated Thu May 16 01:10:29 CST 2024
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column card_ride.card_code
     *
     * @return the value of card_ride.card_code
     *
     * @mbg.generated Thu May 16 01:10:29 CST 2024
     */
    public String getCardCode() {
        return cardCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column card_ride.card_code
     *
     * @param cardCode the value for card_ride.card_code
     *
     * @mbg.generated Thu May 16 01:10:29 CST 2024
     */
    public void setCardCode(String cardCode) {
        this.cardCode = cardCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column card_ride.start_station
     *
     * @return the value of card_ride.start_station
     *
     * @mbg.generated Thu May 16 01:10:29 CST 2024
     */
    public String getStartStation() {
        return startStation;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column card_ride.start_station
     *
     * @param startStation the value for card_ride.start_station
     *
     * @mbg.generated Thu May 16 01:10:29 CST 2024
     */
    public void setStartStation(String startStation) {
        this.startStation = startStation;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column card_ride.end_station
     *
     * @return the value of card_ride.end_station
     *
     * @mbg.generated Thu May 16 01:10:29 CST 2024
     */
    public String getEndStation() {
        return endStation;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column card_ride.end_station
     *
     * @param endStation the value for card_ride.end_station
     *
     * @mbg.generated Thu May 16 01:10:29 CST 2024
     */
    public void setEndStation(String endStation) {
        this.endStation = endStation;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column card_ride.price
     *
     * @return the value of card_ride.price
     *
     * @mbg.generated Thu May 16 01:10:29 CST 2024
     */
    public Integer getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column card_ride.price
     *
     * @param price the value for card_ride.price
     *
     * @mbg.generated Thu May 16 01:10:29 CST 2024
     */
    public void setPrice(Integer price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column card_ride.start_time
     *
     * @return the value of card_ride.start_time
     *
     * @mbg.generated Thu May 16 01:10:29 CST 2024
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column card_ride.start_time
     *
     * @param startTime the value for card_ride.start_time
     *
     * @mbg.generated Thu May 16 01:10:29 CST 2024
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column card_ride.end_time
     *
     * @return the value of card_ride.end_time
     *
     * @mbg.generated Thu May 16 01:10:29 CST 2024
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column card_ride.end_time
     *
     * @param endTime the value for card_ride.end_time
     *
     * @mbg.generated Thu May 16 01:10:29 CST 2024
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
}