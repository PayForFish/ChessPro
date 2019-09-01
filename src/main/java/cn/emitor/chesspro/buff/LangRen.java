package cn.emitor.chesspro.buff;

import cn.emitor.chesspro.BaseBuff;
import cn.emitor.chesspro.enums.BuffEnum;

public class LangRen extends BaseBuff {
    @Override
    public String name() {
        return BuffEnum.LANG_REN.name;
    }

    @Override
    public int[] levels() {
        return BuffEnum.LANG_REN.levels;
    }

    @Override
    public String descriptions() {
        return BuffEnum.LANG_REN.description;
    }

    @Override
    public BuffEnum getBuffEnum() {
        return BuffEnum.LANG_REN;
    }
}
