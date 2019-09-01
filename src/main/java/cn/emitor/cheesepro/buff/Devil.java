package cn.emitor.cheesepro.buff;

import cn.emitor.cheesepro.BaseBuff;
import cn.emitor.cheesepro.enums.BuffEnum;

public class Devil extends BaseBuff {
    @Override
    public String name() {
        return BuffEnum.E_MO.name;
    }

    @Override
    public int[] levels() {
        return BuffEnum.E_MO.levels;
    }

    @Override
    public String descriptions() {
        return BuffEnum.E_MO.description;
    }

    @Override
    public BuffEnum getBuffEnum() {
        return BuffEnum.E_MO;
    }
}
