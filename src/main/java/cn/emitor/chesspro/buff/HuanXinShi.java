package cn.emitor.chesspro.buff;

import cn.emitor.chesspro.BaseBuff;
import cn.emitor.chesspro.enums.BuffEnum;

/**
 * @author Emitor
 * on 2019/8/31.
 */
public class HuanXinShi extends BaseBuff {
    @Override
    public String name() {
        return BuffEnum.HUAN_XING_SHI.name;
    }

    @Override
    public int[] levels() {
        return BuffEnum.HUAN_XING_SHI.levels;
    }

    @Override
    public String descriptions() {
        return BuffEnum.HUAN_XING_SHI.description;
    }

    @Override
    public BuffEnum getBuffEnum() {
        return BuffEnum.HUAN_XING_SHI;
    }
}
