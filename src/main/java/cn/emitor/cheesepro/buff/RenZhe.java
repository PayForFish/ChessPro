package cn.emitor.cheesepro.buff;

import cn.emitor.cheesepro.BaseBuff;
import cn.emitor.cheesepro.Buff;
import cn.emitor.cheesepro.enums.BuffEnum;

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
