package cn.emitor.chesspro.buff;

import cn.emitor.chesspro.BaseBuff;
import cn.emitor.chesspro.enums.BuffEnum;

/**
 * @author Emitor
 * on 2019/8/31.
 */
public class JianShi extends BaseBuff {
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
