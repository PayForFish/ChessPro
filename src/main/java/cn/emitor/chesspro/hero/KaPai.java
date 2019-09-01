package cn.emitor.chesspro.hero;

import cn.emitor.chesspro.Hero;
import cn.emitor.chesspro.buff.FaShi;
import cn.emitor.chesspro.buff.HaiDao;
import cn.emitor.chesspro.enums.HeroEnum;

public class KaPai extends Hero {
    private HaiDao haiDao;
    private FaShi faShi;

    public KaPai() {
        super();
    }

    @Override
    public void setHeroBuff() {
        this.faShi = new FaShi();
        this.haiDao = new HaiDao();

        this.buffs.add(faShi);
        this.buffs.add(haiDao);
    }

    @Override
    public void setterHeroEnum() {
        this.heroEnum = HeroEnum.KA_PAI;
    }
}
