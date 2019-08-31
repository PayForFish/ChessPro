package cn.emitor.cheesepro.hero;

import cn.emitor.cheesepro.Hero;
import cn.emitor.cheesepro.buff.Devil;
import cn.emitor.cheesepro.buff.YouXia;
import cn.emitor.cheesepro.enums.HeroEnum;

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
