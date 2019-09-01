package cn.emitor.chesspro.hero;

import cn.emitor.chesspro.Hero;
import cn.emitor.chesspro.buff.CiKe;
import cn.emitor.chesspro.buff.Devil;
import cn.emitor.chesspro.enums.HeroEnum;

/**
 * @author Emitor
 * on 2019/8/31.
 */
public class GuaFu extends Hero {
    private CiKe ciKe;
    private Devil devil;

    public GuaFu() {
        super();
    }

    @Override
    public void setHeroBuff() {
        this.ciKe = new CiKe();
        this.devil = new Devil();

        this.buffs.add(ciKe);
        this.buffs.add(devil);
    }

    @Override
    public void setterHeroEnum() {
        this.heroEnum = HeroEnum.GUA_FU;
    }
}
