package cn.emitor.chesspro.hero;

import cn.emitor.chesspro.Hero;
import cn.emitor.chesspro.buff.DouShi;
import cn.emitor.chesspro.buff.XuKong;
import cn.emitor.chesspro.enums.HeroEnum;

/**
 * @author Emitor
 * on 2019/8/31.
 */
public class DaChongZi extends Hero {
    private XuKong xuKong;
    private DouShi douShi;

    public DaChongZi() {
        super();
    }

    @Override
    public void setHeroBuff() {
        this.xuKong = new XuKong();
        this.douShi = new DouShi();

        this.buffs.add(douShi);
        this.buffs.add(xuKong);
    }

    @Override
    public void setterHeroEnum() {
        this.heroEnum = HeroEnum.DA_CHONG_ZI;
    }
}
