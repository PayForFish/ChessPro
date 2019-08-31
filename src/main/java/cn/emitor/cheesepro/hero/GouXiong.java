package cn.emitor.cheesepro.hero;

import cn.emitor.cheesepro.Hero;
import cn.emitor.cheesepro.buff.DouShi;
import cn.emitor.cheesepro.buff.JiDi;
import cn.emitor.cheesepro.enums.HeroEnum;

public class GouXiong extends Hero {
    private JiDi jiDi;
    private DouShi douShi;

    public GouXiong() {
        super();
    }

    @Override
    public void setHeroBuff() {
        this.douShi = new DouShi();
        this.jiDi = new JiDi();

        this.buffs.add(jiDi);
        this.buffs.add(douShi);
    }

    @Override
    public void setterHeroEnum() {
        this.heroEnum = HeroEnum.GOU_XIONG;
    }
}
