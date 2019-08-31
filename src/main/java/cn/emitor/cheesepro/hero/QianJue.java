package cn.emitor.cheesepro.hero;

import cn.emitor.cheesepro.Hero;
import cn.emitor.cheesepro.buff.AnYin;
import cn.emitor.cheesepro.buff.YouXia;
import cn.emitor.cheesepro.enums.HeroEnum;

public class QianJue extends Hero {
    private YouXia youXia;
    private AnYin anYin;

    public QianJue() {
        super();
    }

    @Override
    public void setHeroBuff() {
        this.anYin = new AnYin();
        this.youXia = new YouXia();

        this.buffs.add(anYin);
        this.buffs.add(youXia);
    }

    @Override
    public void setterHeroEnum() {
        this.heroEnum = HeroEnum.QIAN_JUE;
    }
}
