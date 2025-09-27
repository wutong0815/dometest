package org.example.demotest.designmodel.建造者模式.dome01.floor;

import org.example.demotest.designmodel.建造者模式.dome01.Matter;

import java.math.BigDecimal;

public class DerFloor implements Matter {
    @Override
    public String scene() {
        return "地板";
    }

    @Override
    public String brand() {
        return "德尔";
    }

    @Override
    public String model() {
        return "A+";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(1200);
    }

    @Override
    public String desc() {
        return "德尔A+地板";
    }
}
