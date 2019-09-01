package cn.emitor.chesspro.hero;

import cn.emitor.chesspro.Hero;
import cn.emitor.chesspro.buff.GuiZu;
import cn.emitor.chesspro.buff.QiShi;
import cn.emitor.chesspro.enums.HeroEnum;

/**
 * @author Emitor
 * on 2019/8/31.
 */
public class GaiLun extends Hero {
    private GuiZu guiZu;
    private QiShi qiShi;

    public GaiLun() {
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
        this.heroEnum = HeroEnum.GAI_LUN;
    }
}
