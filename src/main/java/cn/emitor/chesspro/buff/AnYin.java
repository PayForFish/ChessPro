package cn.emitor.chesspro.buff;

import cn.emitor.chesspro.BaseBuff;
import cn.emitor.chesspro.enums.BuffEnum;

/**
 * @author Emitor
 * on 2019/8/31.
 */
public class AnYin extends BaseBuff {
    @Override
    public String name() {
        return BuffEnum.AN_YIN.name;
    }

    @Override
    public int[] levels() {
        return BuffEnum.AN_YIN.levels;
    }

    @Override
    public String descriptions() {
        return BuffEnum.AN_YIN.description;
    }

    @Override
    public BuffEnum getBuffEnum() {
        return BuffEnum.AN_YIN;
    }
}
