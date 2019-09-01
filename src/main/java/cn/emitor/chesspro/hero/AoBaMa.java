package cn.emitor.chesspro.hero;

import cn.emitor.chesspro.Hero;
import cn.emitor.chesspro.buff.GuiZu;
import cn.emitor.chesspro.buff.QiangShou;
import cn.emitor.chesspro.enums.HeroEnum;

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
