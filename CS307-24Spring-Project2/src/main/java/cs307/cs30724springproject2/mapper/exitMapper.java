package cs307.cs30724springproject2.mapper;

import cs307.cs30724springproject2.entity.exit;

public interface exitMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exit
     *
     * @mbg.generated Thu May 16 01:10:29 CST 2024
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exit
     *
     * @mbg.generated Thu May 16 01:10:29 CST 2024
     */
    int insert(exit row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exit
     *
     * @mbg.generated Thu May 16 01:10:29 CST 2024
     */
    int insertSelective(exit row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exit
     *
     * @mbg.generated Thu May 16 01:10:29 CST 2024
     */
    exit selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exit
     *
     * @mbg.generated Thu May 16 01:10:29 CST 2024
     */
    int updateByPrimaryKeySelective(exit row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exit
     *
     * @mbg.generated Thu May 16 01:10:29 CST 2024
     */
    int updateByPrimaryKey(exit row);
}