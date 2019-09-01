package cn.emitor.chesspro.hero;

import cn.emitor.chesspro.Hero;
import cn.emitor.chesspro.buff.HaiKeSi;
import cn.emitor.chesspro.buff.JianShi;
import cn.emitor.chesspro.enums.HeroEnum;

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
