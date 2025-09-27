package org.example.demotest.designmodel.建造者模式.dome02;

import org.example.demotest.designmodel.建造者模式.dome01.Matter;

public interface IMenu {

    IMenu appendCeiling(Matter matter);
    IMenu appendCoat(Matter matter);
    IMenu appendFloor(Matter matter);

    IMenu appendTile(Matter matter);

    /**
     * 详情
     */
    String getDetail();
}
