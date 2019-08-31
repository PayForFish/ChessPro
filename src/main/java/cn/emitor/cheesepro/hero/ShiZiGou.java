package cn.emitor.cheesepro.hero;

import cn.emitor.cheesepro.Hero;
import cn.emitor.cheesepro.buff.CiKe;
import cn.emitor.cheesepro.buff.KuangYe;
import cn.emitor.cheesepro.enums.HeroEnum;

public class ShiZiGou extends Hero {
    private CiKe ciKe;
    private KuangYe kuangYe;

    public ShiZiGou() {
        super();
    }

    @Override
    public void setHeroBuff() {
        this.ciKe = new CiKe();
        this.kuangYe = new KuangYe();

        this.buffs.add(ciKe);
        this.buffs.add(kuangYe);
    }

    @Override
    public void setterHeroEnum() {
        this.heroEnum = HeroEnum.SHI_ZI_GOU;
    }
}
