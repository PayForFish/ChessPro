package cn.emitor.chesspro.hero;

import cn.emitor.chesspro.Hero;
import cn.emitor.chesspro.buff.Devil;
import cn.emitor.chesspro.buff.JianShi;
import cn.emitor.chesspro.enums.HeroEnum;

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
