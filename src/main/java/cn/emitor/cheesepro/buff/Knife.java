package cn.emitor.cheesepro.buff;

import cn.emitor.cheesepro.Buff;
import cn.emitor.cheesepro.enums.BuffEnum;

public interface Knife extends Buff {

    @Override
    default String name() {
        return BuffEnum.JIAN_SHI.name;
    }

    @Override
    default int[] levels() {
        return BuffEnum.JIAN_SHI.levels;
    }

    @Override
    default String descriptions() {
        return BuffEnum.JIAN_SHI.description;
    }

    @Override
    default BuffEnum getBuffEnum() {
        return BuffEnum.JIAN_SHI;
    }
}
