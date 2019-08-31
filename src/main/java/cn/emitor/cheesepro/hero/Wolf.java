package cn.emitor.cheesepro.hero;

import cn.emitor.cheesepro.Hero;
import cn.emitor.cheesepro.buff.DouShi;
import cn.emitor.cheesepro.buff.KuangYe;
import cn.emitor.cheesepro.enums.HeroEnum;

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
