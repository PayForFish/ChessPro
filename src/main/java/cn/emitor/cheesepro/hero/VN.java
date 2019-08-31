package cn.emitor.cheesepro.hero;

import cn.emitor.cheesepro.Hero;
import cn.emitor.cheesepro.buff.GuiZu;
import cn.emitor.cheesepro.buff.YouXia;
import cn.emitor.cheesepro.enums.HeroEnum;

public class VN extends Hero {
    private GuiZu guiZu;
    private YouXia youXia;

    public VN() {
        super();
    }

    @Override
    public void setHeroBuff() {
        this.guiZu = new GuiZu();
        this.youXia = new YouXia();

        this.buffs.add(youXia);
        this.buffs.add(guiZu);
    }

    @Override
    public void setterHeroEnum() {
        this.heroEnum = HeroEnum.WEI_EN;
    }
}
