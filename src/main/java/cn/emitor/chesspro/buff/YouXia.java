package cn.emitor.chesspro.buff;

import cn.emitor.chesspro.BaseBuff;
import cn.emitor.chesspro.enums.BuffEnum;

/**
 * @author Emitor
 * on 2019/8/31.
 */
public class YouXia extends BaseBuff {
    @Override
    public String name() {
        return BuffEnum.YOU_XIA.name;
    }

    @Override
    public int[] levels() {
        return BuffEnum.YOU_XIA.levels;
    }

    @Override
    public String descriptions() {
        return BuffEnum.YOU_XIA.description;
    }

    @Override
    public BuffEnum getBuffEnum() {
        return BuffEnum.YOU_XIA;
    }
}
