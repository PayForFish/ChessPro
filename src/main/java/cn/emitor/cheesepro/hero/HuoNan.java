package cn.emitor.cheesepro.hero;

import cn.emitor.cheesepro.Hero;
import cn.emitor.cheesepro.buff.Devil;
import cn.emitor.cheesepro.buff.YuanSuShi;
import cn.emitor.cheesepro.enums.HeroEnum;

/**
 * @author Emitor
 * on 2019/8/31.
 */
public class HuoNan extends Hero {
    private Devil devil;
    private YuanSuShi yuanSuShi;

    public HuoNan() {
        super();
    }

    @Override
    public void setHeroBuff() {
        this.devil = new Devil();
        this.yuanSuShi = new YuanSuShi();

        this.buffs.add(devil);
        this.buffs.add(yuanSuShi);
    }

    @Override
    public void setterHeroEnum() {
        this.heroEnum = HeroEnum.HUO_NAN;
    }
}