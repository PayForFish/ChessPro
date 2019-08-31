package cn.emitor.cheesepro.hero;

import cn.emitor.cheesepro.Hero;
import cn.emitor.cheesepro.buff.Devil;
import cn.emitor.cheesepro.buff.HuanXinShi;
import cn.emitor.cheesepro.enums.HeroEnum;

/**
 * @author Emitor
 * on 2019/8/31.
 */
public class ZhiZhu extends Hero {
    private Devil devil;
    private HuanXinShi huanXinShi;

    public ZhiZhu() {
        super();
    }

    @Override
    public void setHeroBuff() {
        this.devil = new Devil();
        this.huanXinShi = new HuanXinShi();

        this.buffs.add(devil);
        this.buffs.add(huanXinShi);
    }

    @Override
    public void setterHeroEnum() {
        this.heroEnum = HeroEnum.ZHI_ZHU;
    }
}
