package cn.emitor.chesspro.hero;

import cn.emitor.chesspro.Hero;
import cn.emitor.chesspro.buff.JiDi;
import cn.emitor.chesspro.buff.QiShi;
import cn.emitor.chesspro.enums.HeroEnum;

public class ZhuMei extends Hero {
    private JiDi jiDi;
    private QiShi qiShi;

    public ZhuMei() {
        super();
    }

    @Override
    public void setHeroBuff() {
        this.jiDi = new JiDi();
        this.qiShi = new QiShi();

        this.buffs.add(qiShi);
        this.buffs.add(jiDi);
    }

    @Override
    public void setterHeroEnum() {
        this.heroEnum = HeroEnum.ZHU_MEI;
    }
}
