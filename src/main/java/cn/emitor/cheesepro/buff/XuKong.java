package cn.emitor.cheesepro.buff;

import cn.emitor.cheesepro.Buff;
import cn.emitor.cheesepro.enums.BuffEnum;

/**
 * @author Emitor
 * on 2019/8/31.
 */
public class XuKong implements Buff {
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
