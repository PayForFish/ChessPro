package cn.emitor.cheesepro.hero;

import cn.emitor.cheesepro.Hero;
import cn.emitor.cheesepro.buff.CiKe;
import cn.emitor.cheesepro.buff.HaiDao;
import cn.emitor.cheesepro.enums.HeroEnum;

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
