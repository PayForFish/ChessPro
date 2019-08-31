package cn.emitor.cheesepro.hero;

import cn.emitor.cheesepro.Hero;
import cn.emitor.cheesepro.buff.AnYin;
import cn.emitor.cheesepro.buff.FaShi;
import cn.emitor.cheesepro.enums.HeroEnum;

/**
 * @author Emitor
 * on 2019/8/31.
 */
public class SiGe extends Hero {
    private AnYin anYin;
    private FaShi faShi;

    public SiGe() {
        super();
    }

    @Override
    public void setHeroBuff() {
        this.anYin = new AnYin();
        this.faShi = new FaShi();

        this.buffs.add(anYin);
        this.buffs.add(faShi);
    }

    @Override
    public void setterHeroEnum() {
        this.heroEnum = HeroEnum.SI_GE;
    }
}
