package cn.emitor.cheesepro.buff;

import cn.emitor.cheesepro.Buff;
import cn.emitor.cheesepro.enums.BuffEnum;

public class Knife implements Buff {
    @Override
    public String name() {
        return BuffEnum.JIAN_SHI.name;
    }

    @Override
    public int[] levels() {
        return BuffEnum.JIAN_SHI.levels;
    }

    @Override
    public String descriptions() {
        return BuffEnum.JIAN_SHI.description;
    }

    @Override
    public BuffEnum getBuffEnum() {
        return BuffEnum.JIAN_SHI;
    }
}
