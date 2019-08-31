package cn.emitor.cheesepro.hero;

import cn.emitor.cheesepro.Hero;
import cn.emitor.cheesepro.buff.FaShi;
import cn.emitor.cheesepro.buff.Long;
import cn.emitor.cheesepro.enums.HeroEnum;

/**
 * @author Emitor
 * on 2019/8/31.
 */
public class LongWang extends Hero {
    private Long ilong;
    private FaShi faShi;

    public LongWang() {
        super();
    }

    @Override
    public void setHeroBuff() {
        this.ilong = new Long();
        this.faShi = new FaShi();

        this.buffs.add(ilong);
        this.buffs.add(faShi);
    }

    @Override
    public void setterHeroEnum() {
        this.heroEnum = HeroEnum.LONG_WANG_;
    }
}
