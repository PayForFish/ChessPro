package cn.emitor.chesspro.hero;

import cn.emitor.chesspro.Hero;
import cn.emitor.chesspro.buff.HuWei;
import cn.emitor.chesspro.buff.JiDi;
import cn.emitor.chesspro.enums.HeroEnum;

/**
 * @author Emitor
 * on 2019/8/31.
 */
public class BuLong extends Hero {
    private JiDi jiDi;
    private HuWei huWei;

    public BuLong() {
        super();
    }

    @Override
    public void setHeroBuff() {
        this.huWei = new HuWei();
        this.jiDi = new JiDi();

        this.buffs.add(jiDi);
        this.buffs.add(huWei);
    }

    @Override
    public void setterHeroEnum() {
        this.heroEnum = HeroEnum.BU_LONG;
    }
}
