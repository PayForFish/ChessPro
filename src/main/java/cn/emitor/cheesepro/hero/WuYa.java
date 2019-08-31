package cn.emitor.cheesepro.hero;

import cn.emitor.cheesepro.Hero;
import cn.emitor.cheesepro.buff.Devil;
import cn.emitor.cheesepro.buff.DiGuo;
import cn.emitor.cheesepro.buff.HuanXinShi;
import cn.emitor.cheesepro.enums.HeroEnum;

public class WuYa extends Hero {
    private Devil devil;
    private HuanXinShi huanXinShi;
    private DiGuo diGuo;

    public WuYa() {
        super();
    }

    @Override
    public void setHeroBuff() {
        this.devil = new Devil();
        this.diGuo = new DiGuo();
        this.huanXinShi = new HuanXinShi();

        this.buffs.add(devil);
        this.buffs.add(diGuo);
        this.buffs.add(huanXinShi);
    }

    @Override
    public void setterHeroEnum() {
        this.heroEnum = HeroEnum.WU_YA;
    }
}
