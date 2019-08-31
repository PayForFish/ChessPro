package cn.emitor.cheesepro.hero;

import cn.emitor.cheesepro.Hero;
import cn.emitor.cheesepro.buff.FaShi;
import cn.emitor.cheesepro.buff.HaiDao;
import cn.emitor.cheesepro.enums.HeroEnum;

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
