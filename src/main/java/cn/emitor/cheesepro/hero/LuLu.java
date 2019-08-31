package cn.emitor.cheesepro.hero;

import cn.emitor.cheesepro.Hero;
import cn.emitor.cheesepro.buff.FaShi;
import cn.emitor.cheesepro.buff.YueDeErRen;
import cn.emitor.cheesepro.enums.HeroEnum;

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
