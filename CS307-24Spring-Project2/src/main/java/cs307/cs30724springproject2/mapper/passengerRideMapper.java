package cs307.cs30724springproject2.mapper;

import cs307.cs30724springproject2.entity.passengerRide;

public interface passengerRideMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table passenger_ride
     *
     * @mbg.generated Thu May 16 01:10:29 CST 2024
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table passenger_ride
     *
     * @mbg.generated Thu May 16 01:10:29 CST 2024
     */
    int insert(passengerRide row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table passenger_ride
     *
     * @mbg.generated Thu May 16 01:10:29 CST 2024
     */
    int insertSelective(passengerRide row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table passenger_ride
     *
     * @mbg.generated Thu May 16 01:10:29 CST 2024
     */
    passengerRide selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table passenger_ride
     *
     * @mbg.generated Thu May 16 01:10:29 CST 2024
     */
    int updateByPrimaryKeySelective(passengerRide row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table passenger_ride
     *
     * @mbg.generated Thu May 16 01:10:29 CST 2024
     */
    int updateByPrimaryKey(passengerRide row);
}