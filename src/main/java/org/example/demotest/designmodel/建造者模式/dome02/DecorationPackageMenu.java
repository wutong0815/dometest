package org.example.demotest.designmodel.建造者模式.dome02;

import org.example.demotest.designmodel.建造者模式.dome01.Matter;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class DecorationPackageMenu implements IMenu {

    private List<Matter> list = new ArrayList<Matter>();

    private BigDecimal price = BigDecimal.ZERO;

    private BigDecimal area;

    private String grade;

    public DecorationPackageMenu() {
    }

    public DecorationPackageMenu( BigDecimal area, String grade) {
        this.area = area;
        this.grade = grade;
    }


    @Override
    public IMenu appendCeiling(Matter matter) {
        list.add(matter);
        price = price.add(area.multiply(new BigDecimal("0.2")).multiply(matter.price()));
        return this;
    }

    @Override
    public IMenu appendCoat(Matter matter) {

        list.add(matter);
        price = price.add(area.multiply(new BigDecimal("1")).multiply(matter.price()));
        return this;
    }

    @Override
    public IMenu appendFloor(Matter matter) {
        return null;
    }

    @Override
    public IMenu appendTile(Matter matter) {
        return null;
    }

    @Override
    public String getDetail() {
        return null;
    }
}
