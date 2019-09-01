package cn.emitor.cheesepro.hero;

import cn.emitor.cheesepro.Hero;
import cn.emitor.cheesepro.buff.DiGuo;
import cn.emitor.cheesepro.buff.JianShi;
import cn.emitor.cheesepro.enums.HeroEnum;

/**
 * @author Emitor
 * on 2019/8/31.
 */
public class DeLaiWen extends Hero {
    private DiGuo diGuo;
    private JianShi jianShi;

    public DeLaiWen() {
        super();
    }

    @Override
    public void setHeroBuff() {
        this.diGuo = new DiGuo();
        this.jianShi = new JianShi();

        this.buffs.add(jianShi);
        this.buffs.add(diGuo);
    }

    @Override
    public void setterHeroEnum() {
        this.heroEnum = HeroEnum.DE_LAI_WEN;
    }
}
