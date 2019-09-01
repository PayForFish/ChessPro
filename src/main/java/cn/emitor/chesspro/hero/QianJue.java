package cn.emitor.chesspro.hero;

import cn.emitor.chesspro.Hero;
import cn.emitor.chesspro.buff.AnYin;
import cn.emitor.chesspro.buff.YouXia;
import cn.emitor.chesspro.enums.HeroEnum;

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
