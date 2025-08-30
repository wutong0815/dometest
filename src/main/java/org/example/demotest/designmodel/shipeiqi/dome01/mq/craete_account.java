package org.example.demotest.designmodel.shipeiqi.dome01.mq;

import lombok.Data;
import lombok.ToString;

import java.util.Date;


/**
 * 账户创建消息
 */
@Data
@ToString
public class craete_account {

    /**
     * 开户编号
     */
    private  String number;
    /**
     * 开户地址
     */
    private  String address;
    /**
     * 开户日期
     */
    private Date accountDate;
    /**
     * 开户描述
     */
    private String desc;

}
