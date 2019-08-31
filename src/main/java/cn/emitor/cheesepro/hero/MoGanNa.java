package cn.emitor.cheesepro.hero;

import cn.emitor.cheesepro.Hero;
import cn.emitor.cheesepro.buff.Devil;
import cn.emitor.cheesepro.buff.FaShi;
import cn.emitor.cheesepro.enums.HeroEnum;

public class MoGanNa extends Hero {
    private FaShi faShi;
    private Devil devil;

    public MoGanNa() {
        super();
    }

    @Override
    public void setHeroBuff() {
        this.devil = new Devil();
        this.faShi = new FaShi();

        this.buffs.add(faShi);
        this.buffs.add(devil);
    }

    @Override
    public void setterHeroEnum() {
        this.heroEnum = HeroEnum.MO_GAN_NA;
    }
}
