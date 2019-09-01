package cn.emitor.chesspro.hero;

import cn.emitor.chesspro.Hero;
import cn.emitor.chesspro.buff.JianShi;
import cn.emitor.chesspro.buff.RenZhe;
import cn.emitor.chesspro.enums.HeroEnum;

public class Shen extends Hero {
    private RenZhe renZhe;
    private JianShi jianShi;

    public Shen() {
        super();
    }

    @Override
    public void setHeroBuff() {
        this.jianShi = new JianShi();
        this.renZhe = new RenZhe();

        this.buffs.add(renZhe);
        this.buffs.add(jianShi);
    }

    @Override
    public void setterHeroEnum() {
        this.heroEnum = HeroEnum.SHEN;
    }
}
