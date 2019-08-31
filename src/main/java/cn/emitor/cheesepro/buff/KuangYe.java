package cn.emitor.cheesepro.buff;

import cn.emitor.cheesepro.Buff;
import cn.emitor.cheesepro.enums.BuffEnum;

/**
 * @author Emitor
 * on 2019/8/31.
 */
public class KuangYe implements Buff {
    @Override
    public String name() {
        return BuffEnum.KUANG_YE.name;
    }

    @Override
    public int[] levels() {
        return BuffEnum.KUANG_YE.levels;
    }

    @Override
    public String descriptions() {
        return BuffEnum.KUANG_YE.description;
    }

    @Override
    public BuffEnum getBuffEnum() {
        return BuffEnum.KUANG_YE;
    }
}
