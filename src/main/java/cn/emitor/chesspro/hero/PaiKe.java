package cn.emitor.chesspro.hero;

import cn.emitor.chesspro.Hero;
import cn.emitor.chesspro.buff.CiKe;
import cn.emitor.chesspro.buff.HaiDao;
import cn.emitor.chesspro.enums.HeroEnum;

public class PaiKe extends Hero {
    private CiKe ciKe;
    private HaiDao haiDao;

    @Override
    public void setHeroBuff() {
        this.ciKe = new CiKe();
        this.haiDao = new HaiDao();

        this.buffs.add(haiDao);
        this.buffs.add(ciKe);
    }

    @Override
    public void setterHeroEnum() {
        this.heroEnum = HeroEnum.PAI_KE;
    }
}
