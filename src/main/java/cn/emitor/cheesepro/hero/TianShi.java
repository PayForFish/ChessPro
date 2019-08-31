package cn.emitor.cheesepro.hero;

import cn.emitor.cheesepro.Hero;
import cn.emitor.cheesepro.buff.GuiZu;
import cn.emitor.cheesepro.buff.QiShi;
import cn.emitor.cheesepro.enums.HeroEnum;

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
