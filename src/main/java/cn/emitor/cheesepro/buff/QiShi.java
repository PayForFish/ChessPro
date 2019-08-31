package cn.emitor.cheesepro.buff;

import cn.emitor.cheesepro.Buff;
import cn.emitor.cheesepro.enums.BuffEnum;

/**
 * @author Emitor
 * on 2019/8/31.
 */
public class QiShi implements Buff {
    @Override
    public String name() {
        return BuffEnum.QI_SHI.name;
    }

    @Override
    public int[] levels() {
        return BuffEnum.QI_SHI.levels;
    }

    @Override
    public String descriptions() {
        return BuffEnum.QI_SHI.description;
    }

    @Override
    public BuffEnum getBuffEnum() {
        return BuffEnum.QI_SHI;
    }
}
