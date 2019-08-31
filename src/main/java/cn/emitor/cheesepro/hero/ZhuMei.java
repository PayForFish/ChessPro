package cn.emitor.cheesepro.hero;

import cn.emitor.cheesepro.Hero;
import cn.emitor.cheesepro.buff.JiDi;
import cn.emitor.cheesepro.buff.QiShi;
import cn.emitor.cheesepro.enums.HeroEnum;

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
