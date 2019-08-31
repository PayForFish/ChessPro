package cn.emitor.cheesepro.hero;

import cn.emitor.cheesepro.Hero;
import cn.emitor.cheesepro.buff.FaShi;
import cn.emitor.cheesepro.buff.Dragon;
import cn.emitor.cheesepro.enums.HeroEnum;

/**
 * @author Emitor
 * on 2019/8/31.
 */
public class LongWang extends Hero {
    private Dragon dragon;
    private FaShi faShi;

    public LongWang() {
        super();
    }

    @Override
    public void setHeroBuff() {
        this.dragon = new Dragon();
        this.faShi = new FaShi();

        this.buffs.add(dragon);
        this.buffs.add(faShi);
    }

    @Override
    public void setterHeroEnum() {
        this.heroEnum = HeroEnum.LONG_WANG_;
    }
}
