package cn.emitor.chesspro.hero;

import cn.emitor.chesspro.Hero;
import cn.emitor.chesspro.buff.DouShi;
import cn.emitor.chesspro.buff.KuangYe;
import cn.emitor.chesspro.enums.HeroEnum;

public class Wolf extends Hero {
    private KuangYe kuangYe;
    private DouShi douShi;

    public Wolf() {
        super();
    }

    @Override
    public void setHeroBuff() {
        this.douShi = new DouShi();
        this.kuangYe = new KuangYe();

        this.buffs.add(douShi);
        this.buffs.add(kuangYe);
    }

    @Override
    public void setterHeroEnum() {
        this.heroEnum = HeroEnum.LANG_REN;
    }
}
