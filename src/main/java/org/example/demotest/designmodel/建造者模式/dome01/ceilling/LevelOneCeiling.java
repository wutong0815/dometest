package org.example.demotest.designmodel.建造者模式.dome01.ceilling;

import org.example.demotest.designmodel.建造者模式.dome01.Matter;

import java.math.BigDecimal;

public class LevelOneCeiling implements Matter {
    @Override
    public String scene() {
        return "吊顶";
    }

    @Override
    public String brand() {
        return "装修公司";
    }

    @Override
    public String model() {
        return "一级吊顶";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(260);
    }

    @Override
    public String desc() {
        return "一级吊顶，装修公司标准";
    }
}
