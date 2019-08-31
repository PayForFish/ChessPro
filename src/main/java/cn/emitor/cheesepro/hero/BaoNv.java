package cn.emitor.cheesepro.hero;

import cn.emitor.cheesepro.Hero;
import cn.emitor.cheesepro.buff.HuanXinShi;
import cn.emitor.cheesepro.buff.KuangYe;
import cn.emitor.cheesepro.enums.HeroEnum;

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
