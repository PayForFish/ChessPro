package cn.emitor.cheesepro.hero;

import cn.emitor.cheesepro.Hero;
import cn.emitor.cheesepro.buff.FaShi;
import cn.emitor.cheesepro.buff.YueDeErRen;
import cn.emitor.cheesepro.enums.HeroEnum;

public class XiaoFa extends Hero {
    private FaShi faShi;
    private YueDeErRen yueDeErRen;

    public XiaoFa() {
        super();
    }

    @Override
    public void setHeroBuff() {
        this.faShi = new FaShi();
        this.yueDeErRen = new YueDeErRen();

        this.buffs.add(faShi);
        this.buffs.add(yueDeErRen);
    }

    @Override
    public void setterHeroEnum() {
        this.heroEnum = HeroEnum.XIAO_FA;
    }
}
