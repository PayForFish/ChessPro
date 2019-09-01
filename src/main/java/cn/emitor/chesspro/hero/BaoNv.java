package cn.emitor.chesspro.hero;

import cn.emitor.chesspro.Hero;
import cn.emitor.chesspro.buff.HuanXinShi;
import cn.emitor.chesspro.buff.KuangYe;
import cn.emitor.chesspro.enums.HeroEnum;

public class BaoNv extends Hero {
    private HuanXinShi huanXinShi;
    private KuangYe kuangYe;

    public BaoNv() {
        super();
    }

    @Override
    public void setHeroBuff() {
        this.huanXinShi = new HuanXinShi();
        this.kuangYe = new KuangYe();

        this.buffs.add(huanXinShi);
        this.buffs.add(kuangYe);
    }

    @Override
    public void setterHeroEnum() {
        this.heroEnum = HeroEnum.BAO_NV;
    }
}
