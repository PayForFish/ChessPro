package cn.emitor.chesspro.hero;

import cn.emitor.chesspro.Hero;
import cn.emitor.chesspro.buff.QiShi;
import cn.emitor.chesspro.buff.YueDeErRen;
import cn.emitor.chesspro.enums.HeroEnum;

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
