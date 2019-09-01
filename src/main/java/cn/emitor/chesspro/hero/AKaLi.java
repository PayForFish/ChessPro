package cn.emitor.chesspro.hero;

import cn.emitor.chesspro.Hero;
import cn.emitor.chesspro.buff.CiKe;
import cn.emitor.chesspro.buff.RenZhe;
import cn.emitor.chesspro.enums.HeroEnum;

/**
 * @author Emitor
 * on 2019/8/31.
 */
public class AKaLi extends Hero {
    private RenZhe renZhe;
    private CiKe ciKe;

    public AKaLi() {
     super();
    }

    @Override
    public void setHeroBuff() {
        this.ciKe = new CiKe();
        this.renZhe = new RenZhe();

        this.buffs.add(ciKe);
        this.buffs.add(renZhe);
    }

    @Override
    public void setterHeroEnum() {
        this.heroEnum = HeroEnum.A_KA_LI;
    }
}
