package cn.emitor.cheesepro.buff;

import cn.emitor.cheesepro.Buff;
import cn.emitor.cheesepro.enums.BuffEnum;

/**
 * @author Emitor
 * on 2019/8/31.
 */
public class HuWei implements Buff {
    @Override
    public String name() {
        return BuffEnum.HU_WEI.name;
    }

    @Override
    public int[] levels() {
        return BuffEnum.HU_WEI.levels;
    }

    @Override
    public String descriptions() {
        return BuffEnum.HU_WEI.description;
    }

    @Override
    public BuffEnum getBuffEnum() {
        return BuffEnum.HU_WEI;
    }
}
