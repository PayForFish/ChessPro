package cn.emitor.cheesepro.hero;

import cn.emitor.cheesepro.Hero;
import cn.emitor.cheesepro.buff.GuiZu;
import cn.emitor.cheesepro.buff.HuWei;
import cn.emitor.cheesepro.enums.HeroEnum;

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
