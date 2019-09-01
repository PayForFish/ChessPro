package cn.emitor.cheesepro.buff;

import cn.emitor.cheesepro.BaseBuff;
import cn.emitor.cheesepro.Buff;
import cn.emitor.cheesepro.enums.BuffEnum;

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
