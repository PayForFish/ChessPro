package cn.emitor.chesspro.hero;

import cn.emitor.chesspro.Hero;
import cn.emitor.chesspro.buff.DouShi;
import cn.emitor.chesspro.buff.HaiKeSi;
import cn.emitor.chesspro.enums.HeroEnum;

public class Wei extends Hero {
    private DouShi douShi;
    private HaiKeSi haiKeSi;

    public Wei() {
        super();
    }

    @Override
    public void setHeroBuff() {
        this.douShi = new DouShi();
        this.haiKeSi = new HaiKeSi();

        this.buffs.add(haiKeSi);
        this.buffs.add(douShi);
    }

    @Override
    public void setterHeroEnum() {
        this.heroEnum = HeroEnum.WEI;
    }
}
