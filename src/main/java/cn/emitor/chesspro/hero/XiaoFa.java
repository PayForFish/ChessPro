package cn.emitor.chesspro.hero;

import cn.emitor.chesspro.Hero;
import cn.emitor.chesspro.buff.FaShi;
import cn.emitor.chesspro.buff.YueDeErRen;
import cn.emitor.chesspro.enums.HeroEnum;

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
