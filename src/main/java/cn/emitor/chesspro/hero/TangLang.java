package cn.emitor.chesspro.hero;

import cn.emitor.chesspro.Hero;
import cn.emitor.chesspro.buff.CiKe;
import cn.emitor.chesspro.buff.XuKong;
import cn.emitor.chesspro.enums.HeroEnum;

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
