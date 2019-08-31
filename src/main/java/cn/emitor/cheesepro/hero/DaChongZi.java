package cn.emitor.cheesepro.hero;

import cn.emitor.cheesepro.Hero;
import cn.emitor.cheesepro.buff.DouShi;
import cn.emitor.cheesepro.buff.KongXu;
import cn.emitor.cheesepro.enums.HeroEnum;

/**
 * @author Emitor
 * on 2019/8/31.
 */
public class DaChongZi extends Hero {
    private KongXu kongXu;
    private DouShi douShi;

    public DaChongZi() {
        super();
    }

    @Override
    public void setHeroBuff() {
        this.kongXu = new KongXu();
        this.douShi = new DouShi();

        this.buffs.add(douShi);
        this.buffs.add(kongXu);
    }

    @Override
    public void setterHeroEnum() {
        this.heroEnum = HeroEnum.DA_CHONG_ZI;
    }
}
