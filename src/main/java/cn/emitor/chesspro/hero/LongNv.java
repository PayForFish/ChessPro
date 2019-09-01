package cn.emitor.chesspro.hero;

import cn.emitor.chesspro.Hero;
import cn.emitor.chesspro.buff.Dragon;
import cn.emitor.chesspro.buff.HuanXinShi;
import cn.emitor.chesspro.enums.HeroEnum;

public class LongNv extends Hero {
    private HuanXinShi huanXinShi;
    private Dragon dragon;

    public LongNv() {
        super();
    }

    @Override
    public void setHeroBuff() {
        this.dragon = new Dragon();
        this.huanXinShi = new HuanXinShi();

        this.buffs.add(huanXinShi);
        this.buffs.add(dragon);
    }

    @Override
    public void setterHeroEnum() {
        this.heroEnum = HeroEnum.LONG_NV;
    }
}
