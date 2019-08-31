package cn.emitor.cheesepro.hero;

import cn.emitor.cheesepro.Hero;
import cn.emitor.cheesepro.buff.CiKe;
import cn.emitor.cheesepro.buff.RenZhe;
import cn.emitor.cheesepro.enums.HeroEnum;

/**
 * @author Emitor
 * on 2019/8/31.
 */
public class AKaLi extends Hero {
    private RenZhe renZhe;
    private CiKe ciKel;

    public AKaLi() {
     super();
    }

    @Override
    public void setHeroBuff() {
        this.ciKel = new CiKe();
        this.renZhe = new RenZhe();

        this.buffs.add(ciKel);
        this.buffs.add(renZhe);
    }

    @Override
    public void setterHeroEnum() {
        this.heroEnum = HeroEnum.A_KA_LI;
    }
}
