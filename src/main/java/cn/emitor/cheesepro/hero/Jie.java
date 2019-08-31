package cn.emitor.cheesepro.hero;

import cn.emitor.cheesepro.Hero;
import cn.emitor.cheesepro.buff.CiKe;
import cn.emitor.cheesepro.buff.RenZhe;
import cn.emitor.cheesepro.enums.HeroEnum;

public class Jie extends Hero {
    private CiKe ciKe;
    private RenZhe renZhe;

    public Jie() {
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
        this.heroEnum = HeroEnum.JIE;
    }
}
