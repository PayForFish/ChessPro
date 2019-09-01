package cn.emitor.chesspro.hero;

import cn.emitor.chesspro.Hero;
import cn.emitor.chesspro.buff.CiKe;
import cn.emitor.chesspro.buff.KuangYe;
import cn.emitor.chesspro.enums.HeroEnum;

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
