package cn.emitor.chesspro.hero;

import cn.emitor.chesspro.Hero;
import cn.emitor.chesspro.buff.CiKe;
import cn.emitor.chesspro.buff.DiGuo;
import cn.emitor.chesspro.enums.HeroEnum;

public class KaTe extends Hero {
    private CiKe ciKe;
    private DiGuo diGuo;

    public KaTe() {
        super();
    }

    @Override
    public void setHeroBuff() {
        this.ciKe = new CiKe();
        this.diGuo = new DiGuo();

        this.buffs.add(ciKe);
        this.buffs.add(diGuo);
    }

    @Override
    public void setterHeroEnum() {
        this.heroEnum = HeroEnum.KA_TE;
    }
}
