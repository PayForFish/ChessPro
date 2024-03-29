package cn.emitor.chesspro.buff;

import cn.emitor.chesspro.BaseBuff;
import cn.emitor.chesspro.enums.BuffEnum;

/**
 * @author Emitor
 * on 2019/8/31.
 */
public class HaiKeSi extends BaseBuff {
    @Override
    public String name() {
        return BuffEnum.HAI_KE_SI.name;
    }

    @Override
    public int[] levels() {
        return BuffEnum.HAI_KE_SI.levels;
    }

    @Override
    public String descriptions() {
        return BuffEnum.HAI_KE_SI.description;
    }

    @Override
    public BuffEnum getBuffEnum() {
        return BuffEnum.HAI_KE_SI;
    }
}
