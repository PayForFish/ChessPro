package cn.emitor.cheesepro.hero;

import cn.emitor.cheesepro.Hero;
import cn.emitor.cheesepro.buff.HuWei;
import cn.emitor.cheesepro.buff.JiDi;
import cn.emitor.cheesepro.enums.HeroEnum;

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
