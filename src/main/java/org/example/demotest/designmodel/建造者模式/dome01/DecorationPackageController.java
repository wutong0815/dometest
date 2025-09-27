package org.example.demotest.designmodel.建造者模式.dome01;

import org.example.demotest.designmodel.建造者模式.dome01.ceilling.LevelOneCeiling;
import org.example.demotest.designmodel.建造者模式.dome01.ceilling.LevelTwoCeiling;
import org.example.demotest.designmodel.建造者模式.dome01.coat.DuluxCoat;
import org.example.demotest.designmodel.建造者模式.dome01.coat.LiBangCoat;
import org.example.demotest.designmodel.建造者模式.dome01.floor.ShengXiangFloor;
import org.example.demotest.designmodel.建造者模式.dome01.tile.DongPengTile;
import org.example.demotest.designmodel.建造者模式.dome01.tile.MarcoPoloTile;

import javax.security.auth.spi.LoginModule;
import java.math.BigDecimal;
import java.util.List;
import java.util.ArrayList;

public class DecorationPackageController {
    public String getMatterList(BigDecimal area, Integer level) {
        List<Matter> list = new ArrayList<Matter>();
        BigDecimal price = BigDecimal.ZERO;

        if (level == 1) {

            LevelTwoCeiling levelTwoCeiling = new LevelTwoCeiling();

            DuluxCoat duluxCoat = new DuluxCoat();

             ShengXiangFloor shengXiangFloor = new ShengXiangFloor();

            list.add(new ShengXiangFloor());
            list.add(new MarcoPoloTile());
            list.add(new DuluxCoat());

            price = price.add(area.multiply(new BigDecimal("0.2")).multiply(levelTwoCeiling.price()));
            price = price.add(area.multiply(new BigDecimal("1.4")).multiply(duluxCoat.price()));
            price = price.add(area.multiply(shengXiangFloor.price()));

        }

        if (2 == level) {
            LevelTwoCeiling levelTwoCeiling = new LevelTwoCeiling();
            LiBangCoat liBangCoat = new LiBangCoat();
            MarcoPoloTile marcoPoloTile = new MarcoPoloTile();
            list.add(levelTwoCeiling);
            list.add(liBangCoat);
            list.add(marcoPoloTile);
            price = price.add(area.multiply(new
                    BigDecimal("0.2")).multiply(levelTwoCeiling.price()));
            price = price.add(area.multiply(new
                    BigDecimal("1.4")).multiply(liBangCoat.price()));
            price = price.add(area.multiply(marcoPoloTile.price()));
        }

        if (3 == level) {
            LevelOneCeiling levelOneCeiling = new LevelOneCeiling(); //
            LiBangCoat liBangCoat = new LiBangCoat(); //
            DongPengTile dongPengTile = new DongPengTile(); //
            list.add(levelOneCeiling);
            list.add(liBangCoat);
            list.add(dongPengTile);
            price = price.add(area.multiply(new
                    BigDecimal("0.2")).multiply(levelOneCeiling.price()));
            price = price.add(area.multiply(new
                    BigDecimal("1.4")).multiply(liBangCoat.price()));
            price = price.add(area.multiply(dongPengTile.price()));
        }

        StringBuilder detail = new StringBuilder("\n您选择的装修套餐为："
                + level + "级，套餐金额为：" + price + "元\n");

        for (Matter matter : list) {
            detail.append(matter.scene()).append("：").append(matter.brand()).append("、").append(matter.model()).append("、平米价格：").append(matter.price()).append("元\n");
        }

        return detail.toString();
    }
}
