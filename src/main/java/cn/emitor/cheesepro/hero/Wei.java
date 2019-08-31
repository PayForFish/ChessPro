package cn.emitor.cheesepro.hero;

import cn.emitor.cheesepro.Hero;
import cn.emitor.cheesepro.buff.DouShi;
import cn.emitor.cheesepro.buff.HaiKeSi;
import cn.emitor.cheesepro.enums.HeroEnum;

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
