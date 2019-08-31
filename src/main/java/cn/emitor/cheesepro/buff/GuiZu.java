package cn.emitor.cheesepro.buff;

import cn.emitor.cheesepro.Buff;
import cn.emitor.cheesepro.enums.BuffEnum;

/**
 * @author Emitor
 * on 2019/8/31.
 */
public class GuiZu implements Buff {
    @Override
    public String name() {
        return BuffEnum.GUI_ZU.name;
    }

    @Override
    public int[] levels() {
        return BuffEnum.GUI_ZU.levels;
    }

    @Override
    public String descriptions() {
        return BuffEnum.GUI_ZU.description;
    }

    @Override
    public BuffEnum getBuffEnum() {
        return BuffEnum.GUI_ZU;
    }
}
