package cn.emitor.cheesepro.buff;

import cn.emitor.cheesepro.Buff;
import cn.emitor.cheesepro.enums.BuffEnum;

/**
 * @author Emitor
 * on 2019/8/31.
 */
public class AnYin implements Buff {
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
