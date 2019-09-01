package cn.emitor.chesspro.hero;

import cn.emitor.chesspro.Hero;
import cn.emitor.chesspro.buff.GuiZu;
import cn.emitor.chesspro.buff.HuWei;
import cn.emitor.chesspro.enums.HeroEnum;

public class RiNv extends Hero {
    private GuiZu guiZu;
    private HuWei huWei;

    public RiNv() {
        super();
    }

    @Override
    public void setHeroBuff() {
        this.guiZu = new GuiZu();
        this.huWei = new HuWei();

        this.buffs.add(huWei);
        this.buffs.add(guiZu);
    }

    @Override
    public void setterHeroEnum() {
        this.heroEnum = HeroEnum.RI_NV;
    }
}
