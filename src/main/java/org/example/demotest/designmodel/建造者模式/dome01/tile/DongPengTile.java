package org.example.demotest.designmodel.建造者模式.dome01.tile;

import org.example.demotest.designmodel.建造者模式.dome01.Matter;

import java.math.BigDecimal;

public class DongPengTile implements Matter {
    @Override
    public String scene() {
        return "地砖";
    }

    @Override
    public String brand() {
        return "东鹏";
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
        return "东鹏A+地砖";
    }
}
