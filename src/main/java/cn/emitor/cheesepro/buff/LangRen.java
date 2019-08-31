package cn.emitor.cheesepro.buff;

import cn.emitor.cheesepro.Buff;
import cn.emitor.cheesepro.enums.BuffEnum;

public class LangRen implements Buff {
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
