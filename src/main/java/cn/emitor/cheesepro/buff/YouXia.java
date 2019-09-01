package cn.emitor.cheesepro.buff;

import cn.emitor.cheesepro.BaseBuff;
import cn.emitor.cheesepro.Buff;
import cn.emitor.cheesepro.enums.BuffEnum;

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
