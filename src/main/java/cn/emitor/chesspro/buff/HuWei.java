package cn.emitor.chesspro.buff;

import cn.emitor.chesspro.BaseBuff;
import cn.emitor.chesspro.enums.BuffEnum;

/**
 * @author Emitor
 * on 2019/8/31.
 */
public class HuWei extends BaseBuff {
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
