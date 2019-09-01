package cn.emitor.chesspro.hero;

import cn.emitor.chesspro.Hero;
import cn.emitor.chesspro.buff.FaShi;
import cn.emitor.chesspro.buff.XuKong;
import cn.emitor.chesspro.enums.HeroEnum;

public class KaSaDing extends Hero {
    private XuKong xuKong;
    private FaShi faShi;

    public KaSaDing() {
        super();
    }

    @Override
    public void setHeroBuff() {
        this.faShi = new FaShi();
        this.xuKong = new XuKong();

        this.buffs.add(xuKong);
        this.buffs.add(faShi);

    }

    @Override
    public void setterHeroEnum() {
        this.heroEnum = HeroEnum.KA_SA_DING;
    }
}
