package org.example.demotest.designmodel.shipeiqi.dome02;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

/**
 * 返利信息
 */
@Data
@ToString
@NoArgsConstructor
public class RebateInfo {

    /**
     * 用户id
     */
    private String userId;

    /**
     * 业务id
     */
    private String bizId;

    /**
     * 业务时间
     */
    private Date bizTime;

    /**
     * 业务描述
     */
    private String desc;

}
