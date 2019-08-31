package cn.emitor.cheesepro.hero;

import cn.emitor.cheesepro.Hero;
import cn.emitor.cheesepro.buff.AnYin;
import cn.emitor.cheesepro.buff.QiShi;
import cn.emitor.cheesepro.enums.HeroEnum;

public class TieNan extends Hero {
    private QiShi qiShi;
    private AnYin anYin;

    public TieNan() {
        super();
    }

    @Override
    public void setHeroBuff() {
        this.anYin = new AnYin();
        this.qiShi = new QiShi();

        this.buffs.add(qiShi);
        this.buffs.add(anYin);
    }

    @Override
    public void setterHeroEnum() {
        this.heroEnum = HeroEnum.TIE_NAN;
    }
}
