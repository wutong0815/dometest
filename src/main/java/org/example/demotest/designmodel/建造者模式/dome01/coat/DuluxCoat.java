package org.example.demotest.designmodel.建造者模式.dome01.coat;

import org.example.demotest.designmodel.建造者模式.dome01.Matter;

import java.math.BigDecimal;

public class DuluxCoat implements Matter {
    @Override
    public String scene() {
        return "涂料";
    }

    @Override
    public String brand() {
        return " Dulux";
    }

    @Override
    public String model() {
        return "第二代";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(1200);
    }

    @Override
    public String desc() {
        return "Dulux 第二代涂料";
    }
}
