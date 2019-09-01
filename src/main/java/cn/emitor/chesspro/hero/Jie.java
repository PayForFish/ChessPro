package cn.emitor.chesspro.hero;

import cn.emitor.chesspro.Hero;
import cn.emitor.chesspro.buff.CiKe;
import cn.emitor.chesspro.buff.RenZhe;
import cn.emitor.chesspro.enums.HeroEnum;

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
