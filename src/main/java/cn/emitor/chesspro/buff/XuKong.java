package cn.emitor.chesspro.buff;

import cn.emitor.chesspro.BaseBuff;
import cn.emitor.chesspro.enums.BuffEnum;

/**
 * @author Emitor
 * on 2019/8/31.
 */
public class XuKong extends BaseBuff {
    @Override
    public String name() {
        return BuffEnum.KONG_XU.name;
    }

    @Override
    public int[] levels() {
        return BuffEnum.KONG_XU.levels;
    }

    @Override
    public String descriptions() {
        return BuffEnum.KONG_XU.description;
    }

    @Override
    public BuffEnum getBuffEnum() {
        return BuffEnum.KONG_XU;
    }
}
