package cn.emitor.cheesepro.hero;

import cn.emitor.cheesepro.Hero;
import cn.emitor.cheesepro.buff.Devil;
import cn.emitor.cheesepro.buff.Knife;
import cn.emitor.cheesepro.enums.HeroEnum;

public class JianMo extends Hero {

    private Devil devil;
    private Knife knife;

    public JianMo() {
        super();

    }

    @Override
    public void setHeroBuff() {
        devil = new Devil();
        knife = new Knife();

        buffs.add(devil);
        buffs.add(knife);
    }

    @Override
    public void setterHeroEnum() {
        this.heroEnum = HeroEnum.JIAN_MO;
    }
}
