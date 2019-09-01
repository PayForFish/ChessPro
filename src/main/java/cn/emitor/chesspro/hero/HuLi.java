package cn.emitor.chesspro.hero;

import cn.emitor.chesspro.Hero;
import cn.emitor.chesspro.buff.FaShi;
import cn.emitor.chesspro.buff.KuangYe;
import cn.emitor.chesspro.enums.HeroEnum;

/**
 * @author Emitor
 * on 2019/8/31.
 */
public class HuLi extends Hero {
    private KuangYe kuangYe;
    private FaShi faShi;

    public HuLi() {
        super();
    }

    @Override
    public void setHeroBuff() {
        this.faShi = new FaShi();
        this.kuangYe = new KuangYe();

        this.buffs.add(faShi);
        this.buffs.add(kuangYe);
    }

    @Override
    public void setterHeroEnum() {
        this.heroEnum = HeroEnum.HU_LI;
    }
}
