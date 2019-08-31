package cn.emitor.cheesepro.buff;

import cn.emitor.cheesepro.Buff;
import cn.emitor.cheesepro.enums.BuffEnum;

/**
 * @author Emitor
 * on 2019/8/31.
 */
public class CiKe implements Buff {
    @Override
    public String name() {
        return null;
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
