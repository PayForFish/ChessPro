package cn.emitor.cheesepro.hero;

import cn.emitor.cheesepro.Hero;
import cn.emitor.cheesepro.buff.JianShi;
import cn.emitor.cheesepro.buff.RenZhe;
import cn.emitor.cheesepro.enums.HeroEnum;

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
