package cn.emitor.cheesepro.hero;

import cn.emitor.cheesepro.Hero;
import cn.emitor.cheesepro.buff.CiKe;
import cn.emitor.cheesepro.buff.DiGuo;
import cn.emitor.cheesepro.enums.HeroEnum;

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
