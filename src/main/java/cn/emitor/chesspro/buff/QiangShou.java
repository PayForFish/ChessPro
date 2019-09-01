package cn.emitor.chesspro.buff;

import cn.emitor.chesspro.BaseBuff;
import cn.emitor.chesspro.enums.BuffEnum;

/**
 * @author Emitor
 * on 2019/8/31.
 */
public class QiangShou extends BaseBuff {
    @Override
    public String name() {
        return BuffEnum.QIANG_SHOU.name;
    }

    @Override
    public int[] levels() {
        return BuffEnum.QIANG_SHOU.levels;
    }

    @Override
    public String descriptions() {
        return BuffEnum.QIANG_SHOU.description;
    }

    @Override
    public BuffEnum getBuffEnum() {
        return BuffEnum.QIANG_SHOU;
    }
}
