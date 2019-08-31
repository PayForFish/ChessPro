package cn.emitor.cheesepro.hero;

import cn.emitor.cheesepro.Hero;
import cn.emitor.cheesepro.buff.QiShi;
import cn.emitor.cheesepro.buff.YueDeErRen;
import cn.emitor.cheesepro.enums.HeroEnum;

public class BoBi extends Hero {
    private QiShi qiShi;
    private YueDeErRen yueDeErRen;

    public BoBi() {
        super();
    }

    @Override
    public void setHeroBuff() {
        this.qiShi = new QiShi();
        this.yueDeErRen = new YueDeErRen();

        this.buffs.add(yueDeErRen);
        this.buffs.add(qiShi);
    }

    @Override
    public void setterHeroEnum() {
        this.heroEnum = HeroEnum.BO_BI;
    }
}
