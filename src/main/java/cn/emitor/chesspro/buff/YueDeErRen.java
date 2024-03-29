package cn.emitor.chesspro.buff;

import cn.emitor.chesspro.BaseBuff;
import cn.emitor.chesspro.enums.BuffEnum;

/**
 * @author Emitor
 * on 2019/8/31.
 */
public class YueDeErRen extends BaseBuff {
    @Override
    public String name() {
        return BuffEnum.YUE_DE_ER_REN.name;
    }

    @Override
    public int[] levels() {
        return BuffEnum.YUE_DE_ER_REN.levels;
    }

    @Override
    public String descriptions() {
        return BuffEnum.YUE_DE_ER_REN.description;
    }

    @Override
    public BuffEnum getBuffEnum() {
        return BuffEnum.YUE_DE_ER_REN;
    }
}
