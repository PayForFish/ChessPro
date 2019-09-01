package cn.emitor.chesspro.hero;

import cn.emitor.chesspro.Hero;
import cn.emitor.chesspro.buff.Devil;
import cn.emitor.chesspro.buff.YouXia;
import cn.emitor.chesspro.enums.HeroEnum;

public class WeiLuSi extends Hero {
    private YouXia youXia;
    private Devil devil;

    public WeiLuSi() {
        super();
    }

    @Override
    public void setHeroBuff() {
        this.devil = new Devil();
        this.youXia = new YouXia();

        this.buffs.add(youXia);
        this.buffs.add(devil);
    }

    @Override
    public void setterHeroEnum() {
        this.heroEnum = HeroEnum.WEI_LU_SI;
    }
}
