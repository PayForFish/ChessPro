package cn.emitor.chesspro.buff;

import cn.emitor.chesspro.BaseBuff;
import cn.emitor.chesspro.enums.BuffEnum;

/**
 * @author Emitor
 * on 2019/8/31.
 */
public class DouShi extends BaseBuff {
    @Override
    public String name() {
        return BuffEnum.DOU_SHI.name;
    }

    @Override
    public int[] levels() {
        return BuffEnum.DOU_SHI.levels;
    }

    @Override
    public String descriptions() {
        return BuffEnum.DOU_SHI.description;
    }

    @Override
    public BuffEnum getBuffEnum() {
        return BuffEnum.DOU_SHI;
    }
}
