package cn.emitor.cheesepro.hero;

import cn.emitor.cheesepro.Hero;
import cn.emitor.cheesepro.buff.Devil;
import cn.emitor.cheesepro.buff.JianShi;
import cn.emitor.cheesepro.enums.HeroEnum;

public class JianMo extends Hero {

    private Devil devil;
    private JianShi jianShi;

    public JianMo() {
        super();
    }

    @Override
    public void setHeroBuff() {
        devil = new Devil();
        jianShi = new JianShi();

        buffs.add(devil);
        buffs.add(jianShi);
    }

    @Override
    public void setterHeroEnum() {
        this.heroEnum = HeroEnum.JIAN_MO;
    }
}
