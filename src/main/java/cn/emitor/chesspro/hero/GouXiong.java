package cn.emitor.chesspro.hero;

import cn.emitor.chesspro.Hero;
import cn.emitor.chesspro.buff.DouShi;
import cn.emitor.chesspro.buff.JiDi;
import cn.emitor.chesspro.enums.HeroEnum;

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
