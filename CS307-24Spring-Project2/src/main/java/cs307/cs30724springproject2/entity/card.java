package cs307.cs30724springproject2.entity;

import java.util.Date;

public class card {

    private String code;

    private int money;

    private Date createTime;

    public card(String number, int i, Date date) {
        this.code = number;
        this.money = i;
        this.createTime = date;
    }


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public Date getCreateTime() {
        return createTime;
    }


    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}