package cn.emitor.chesspro.buff;

import cn.emitor.chesspro.BaseBuff;
import cn.emitor.chesspro.enums.BuffEnum;

/**
 * @author Emitor
 * on 2019/8/31.
 */
public class GuiZu extends BaseBuff {
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
