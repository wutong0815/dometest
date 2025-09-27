package org.example.demotest.designmodel.建造者模式.dome01.tile;

import org.example.demotest.designmodel.建造者模式.dome01.Matter;

import java.math.BigDecimal;
public class MarcoPoloTile implements Matter {
    @Override
    public String scene() {
        return "地砖";
    }

    @Override
    public String brand() {
        return "马可波罗";
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
        return "马可波罗A+地砖";
    }
}
