package cn.emitor.chesspro.buff;

import cn.emitor.chesspro.BaseBuff;
import cn.emitor.chesspro.enums.BuffEnum;

/**
 * @author Emitor
 * on 2019/8/31.
 */
public class FaShi extends BaseBuff {
    @Override
    public String name() {
        return BuffEnum.FA_SHI.name;
    }

    @Override
    public int[] levels() {
        return BuffEnum.FA_SHI.levels;
    }

    @Override
    public String descriptions() {
        return BuffEnum.FA_SHI.description;
    }

    @Override
    public BuffEnum getBuffEnum() {
        return BuffEnum.FA_SHI;
    }
}
