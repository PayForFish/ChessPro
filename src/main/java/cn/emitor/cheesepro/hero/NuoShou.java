package cn.emitor.cheesepro.hero;

import cn.emitor.cheesepro.Hero;
import cn.emitor.cheesepro.buff.DiGuo;
import cn.emitor.cheesepro.buff.QiShi;
import cn.emitor.cheesepro.enums.HeroEnum;

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
