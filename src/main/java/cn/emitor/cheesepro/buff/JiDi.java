package cn.emitor.cheesepro.buff;

import cn.emitor.cheesepro.BaseBuff;
import cn.emitor.cheesepro.Buff;
import cn.emitor.cheesepro.enums.BuffEnum;

public class JiDi extends BaseBuff {
    @Override
    public String name() {
        return BuffEnum.JI_DI.name;
    }

    @Override
    public int[] levels() {
        return BuffEnum.JI_DI.levels;
    }

    @Override
    public String descriptions() {
        return BuffEnum.JI_DI.description;
    }

    @Override
    public BuffEnum getBuffEnum() {
        return BuffEnum.JI_DI;
    }
}
