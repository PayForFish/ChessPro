package cn.emitor.cheesepro.hero;

import cn.emitor.cheesepro.Hero;
import cn.emitor.cheesepro.buff.Dragon;
import cn.emitor.cheesepro.buff.HuanXinShi;
import cn.emitor.cheesepro.enums.HeroEnum;

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
