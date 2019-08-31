package cn.emitor.cheesepro.hero;

import cn.emitor.cheesepro.Hero;
import cn.emitor.cheesepro.buff.GuiZu;
import cn.emitor.cheesepro.buff.QiangShou;
import cn.emitor.cheesepro.enums.HeroEnum;

public class AoBaMa extends Hero {
    private QiangShou qiangShou;
    private GuiZu guiZu;

    public AoBaMa() {
        super();
    }

    @Override
    public void setHeroBuff() {
        this.guiZu = new GuiZu();
        this.qiangShou = new QiangShou();

        this.buffs.add(guiZu);
        this.buffs.add(qiangShou);
    }

    @Override
    public void setterHeroEnum() {
        this.heroEnum = HeroEnum.AO_BA_MA;
    }
}
