package cn.emitor.cheesepro.buff;

import cn.emitor.cheesepro.Buff;
import cn.emitor.cheesepro.enums.BuffEnum;

/**
 * @author Emitor
 * on 2019/8/31.
 */
public class DiGuo implements Buff {
    @Override
    public String name() {
        return BuffEnum.DI_GUO.name;
    }

    @Override
    public int[] levels() {
        return BuffEnum.DI_GUO.levels;
    }

    @Override
    public String descriptions() {
        return BuffEnum.DI_GUO.description;
    }

    @Override
    public BuffEnum getBuffEnum() {
        return BuffEnum.DI_GUO;
    }
}
