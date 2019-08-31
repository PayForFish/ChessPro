package cn.emitor.cheesepro.hero;

import cn.emitor.cheesepro.Hero;
import cn.emitor.cheesepro.buff.CiKe;
import cn.emitor.cheesepro.buff.XuKong;
import cn.emitor.cheesepro.enums.HeroEnum;

public class TangLang extends Hero {
    private CiKe ciKe;
    private XuKong xuKong;

    public TangLang() {
        super();
    }

    @Override
    public void setHeroBuff() {
        this.ciKe = new CiKe();
        this.xuKong = new XuKong();

        this.buffs.add(xuKong);
        this.buffs.add(ciKe);
    }

    @Override
    public void setterHeroEnum() {
        this.heroEnum = HeroEnum.TANG_LANG;
    }
}
