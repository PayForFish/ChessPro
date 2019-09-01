package cn.emitor.chesspro.hero;

import cn.emitor.chesspro.Hero;
import cn.emitor.chesspro.buff.AnYin;
import cn.emitor.chesspro.buff.QiShi;
import cn.emitor.chesspro.enums.HeroEnum;

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
