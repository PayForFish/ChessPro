package cn.emitor.chesspro.hero;

import cn.emitor.chesspro.Hero;
import cn.emitor.chesspro.buff.GuiZu;
import cn.emitor.chesspro.buff.QiShi;
import cn.emitor.chesspro.enums.HeroEnum;

public class TianShi extends Hero {
    private GuiZu guiZu;
    private QiShi qiShi;

    public TianShi() {
        super();
    }

    @Override
    public void setHeroBuff() {
        this.guiZu = new GuiZu();
        this.qiShi = new QiShi();

        this.buffs.add(qiShi);
        this.buffs.add(guiZu);
    }

    @Override
    public void setterHeroEnum() {
        this.heroEnum = HeroEnum.TIAN_SHI;
    }
}
