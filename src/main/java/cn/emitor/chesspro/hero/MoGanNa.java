package cn.emitor.chesspro.hero;

import cn.emitor.chesspro.Hero;
import cn.emitor.chesspro.buff.Devil;
import cn.emitor.chesspro.buff.FaShi;
import cn.emitor.chesspro.enums.HeroEnum;

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
