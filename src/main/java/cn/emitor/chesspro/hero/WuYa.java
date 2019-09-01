package cn.emitor.chesspro.hero;

import cn.emitor.chesspro.Hero;
import cn.emitor.chesspro.buff.Devil;
import cn.emitor.chesspro.buff.DiGuo;
import cn.emitor.chesspro.buff.HuanXinShi;
import cn.emitor.chesspro.enums.HeroEnum;

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
