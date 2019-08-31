package cn.emitor.cheesepro.hero;

import cn.emitor.cheesepro.Hero;
import cn.emitor.cheesepro.buff.FaShi;
import cn.emitor.cheesepro.buff.XuKong;
import cn.emitor.cheesepro.enums.HeroEnum;

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
