package cn.emitor.chesspro.buff;

import cn.emitor.chesspro.BaseBuff;
import cn.emitor.chesspro.enums.BuffEnum;

public class Dragon extends BaseBuff {
    @Override
    public String name() {
        return BuffEnum.LONG.name;
    }

    @Override
    public int[] levels() {
        return BuffEnum.LONG.levels;
    }

    @Override
    public String descriptions() {
        return BuffEnum.LONG.description;
    }

    @Override
    public BuffEnum getBuffEnum() {
        return BuffEnum.LONG;
    }
}
