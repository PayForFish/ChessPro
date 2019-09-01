package cn.emitor.chesspro.hero;

import cn.emitor.chesspro.Hero;
import cn.emitor.chesspro.buff.DiGuo;
import cn.emitor.chesspro.buff.QiShi;
import cn.emitor.chesspro.enums.HeroEnum;

/**
 * @author Emitor
 * on 2019/8/31.
 */
public class NuoShou extends Hero {
    private QiShi qiShi;
    private DiGuo diGuo;

    public NuoShou() {
        super();
    }

    @Override
    public void setHeroBuff() {
        this.diGuo = new DiGuo();
        this.qiShi = new QiShi();

        this.buffs.add(diGuo);
        this.buffs.add(qiShi);
    }

    @Override
    public void setterHeroEnum() {
        this.heroEnum = HeroEnum.NUO_SHOU;
    }
}
