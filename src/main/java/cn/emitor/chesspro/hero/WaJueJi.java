package cn.emitor.chesspro.hero;

import cn.emitor.chesspro.Hero;
import cn.emitor.chesspro.buff.DouShi;
import cn.emitor.chesspro.buff.XuKong;
import cn.emitor.chesspro.enums.HeroEnum;

public class WaJueJi extends Hero {
    private DouShi douShi;
    private XuKong xuKong;

    @Override
    public void setHeroBuff() {
        this.douShi = new DouShi();
        this.xuKong = new XuKong();

        this.buffs.add(xuKong);
        this.buffs.add(douShi);
    }

    @Override
    public void setterHeroEnum() {
        this.heroEnum = HeroEnum.WA_JUE_JI;
    }
}
