package cn.emitor.chesspro.buff;

import cn.emitor.chesspro.BaseBuff;
import cn.emitor.chesspro.enums.BuffEnum;

/**
 * @author Emitor
 * on 2019/8/31.
 */
public class DiGuo extends BaseBuff {
    @Override
    public String name() {
        return BuffEnum.DI_GUO.name;
    }

    @Override
    public int[] levels() {
        return BuffEnum.DI_GUO.levels;
    }

    @Override
    public String descriptions() {
        return BuffEnum.DI_GUO.description;
    }

    @Override
    public BuffEnum getBuffEnum() {
        return BuffEnum.DI_GUO;
    }
}
