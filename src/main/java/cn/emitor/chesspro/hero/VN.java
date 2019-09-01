package cn.emitor.chesspro.hero;

import cn.emitor.chesspro.Hero;
import cn.emitor.chesspro.buff.GuiZu;
import cn.emitor.chesspro.buff.YouXia;
import cn.emitor.chesspro.enums.HeroEnum;

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
