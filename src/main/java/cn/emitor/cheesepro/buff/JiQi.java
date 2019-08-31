package cn.emitor.cheesepro.buff;

import cn.emitor.cheesepro.Buff;
import cn.emitor.cheesepro.enums.BuffEnum;

/**
 * @author Emitor
 * on 2019/8/31.
 */
public class JiQi implements Buff {
    @Override
    public String name() {
        return BuffEnum.JI_QI_REN.name;
    }

    @Override
    public int[] levels() {
        return BuffEnum.JI_QI_REN.levels;
    }

    @Override
    public String descriptions() {
        return BuffEnum.JI_QI_REN.description;
    }

    @Override
    public BuffEnum getBuffEnum() {
        return BuffEnum.JI_QI_REN;
    }
}
