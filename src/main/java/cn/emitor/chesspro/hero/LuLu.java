package cn.emitor.chesspro.hero;

import cn.emitor.chesspro.Hero;
import cn.emitor.chesspro.buff.FaShi;
import cn.emitor.chesspro.buff.YueDeErRen;
import cn.emitor.chesspro.enums.HeroEnum;

public class LuLu extends Hero {
    private FaShi faShi;
    private YueDeErRen yueDeErRen;

    public LuLu() {
        super();
    }

    @Override
    public void setHeroBuff() {
        this.faShi = new FaShi();
        this.yueDeErRen = new YueDeErRen();

        this.buffs.add(yueDeErRen);
        this.buffs.add(faShi);
    }

    @Override
    public void setterHeroEnum() {
        this.heroEnum = HeroEnum.LU_LU;
    }
}
