package cn.emitor.chesspro.buff;

import cn.emitor.chesspro.BaseBuff;
import cn.emitor.chesspro.enums.BuffEnum;

/**
 * @author Emitor
 * on 2019/8/31.
 */
public class RenZhe extends BaseBuff {
    @Override
    public String name() {
        return BuffEnum.REN_ZHE.name;
    }

    @Override
    public int[] levels() {
        return BuffEnum.REN_ZHE.levels;
    }

    @Override
    public String descriptions() {
        return BuffEnum.REN_ZHE.description;
    }

    @Override
    public BuffEnum getBuffEnum() {
        return BuffEnum.REN_ZHE;
    }
}
