package cn.emitor.cheesepro.hero;

import cn.emitor.cheesepro.Hero;
import cn.emitor.cheesepro.buff.DouShi;
import cn.emitor.cheesepro.buff.XuKong;
import cn.emitor.cheesepro.enums.HeroEnum;

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
