package cn.emitor.cheesepro.hero;

import cn.emitor.cheesepro.Hero;
import cn.emitor.cheesepro.buff.HaiKeSi;
import cn.emitor.cheesepro.buff.JianShi;
import cn.emitor.cheesepro.enums.HeroEnum;

public class KaMiEr extends Hero {
    private JianShi jianShi;
    private HaiKeSi haiKeSi;

    public KaMiEr() {
        super();
    }

    @Override
    public void setHeroBuff() {
        this.haiKeSi = new HaiKeSi();
        this.jianShi = new JianShi();

        this.buffs.add(jianShi);
        this.buffs.add(haiKeSi);
    }

    @Override
    public void setterHeroEnum() {
        this.heroEnum = HeroEnum.KA_MI_ER;
    }
}
