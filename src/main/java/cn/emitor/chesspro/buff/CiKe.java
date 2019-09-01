package cn.emitor.chesspro.buff;

import cn.emitor.chesspro.BaseBuff;
import cn.emitor.chesspro.enums.BuffEnum;

/**
 * @author Emitor
 * on 2019/8/31.
 */
public class CiKe extends BaseBuff {
    @Override
    public String name() {
        return BuffEnum.CI_KE.name;
    }

    @Override
    public int[] levels() {
        return BuffEnum.CI_KE.levels;
    }

    @Override
    public String descriptions() {
        return BuffEnum.CI_KE.description;
    }

    @Override
    public BuffEnum getBuffEnum() {
        return BuffEnum.CI_KE;
    }
}
