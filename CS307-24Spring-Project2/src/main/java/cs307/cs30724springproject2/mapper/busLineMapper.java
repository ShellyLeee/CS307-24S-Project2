package cs307.cs30724springproject2.mapper;

import cs307.cs30724springproject2.entity.busLineKey;

public interface busLineMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bus_line
     *
     * @mbg.generated Thu May 16 01:10:29 CST 2024
     */
    int deleteByPrimaryKey(busLineKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bus_line
     *
     * @mbg.generated Thu May 16 01:10:29 CST 2024
     */
    int insert(busLineKey row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bus_line
     *
     * @mbg.generated Thu May 16 01:10:29 CST 2024
     */
    int insertSelective(busLineKey row);
}