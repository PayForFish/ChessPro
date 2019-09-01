package cn.emitor.chesspro.hero;

import cn.emitor.chesspro.Hero;
import cn.emitor.chesspro.buff.DiGuo;
import cn.emitor.chesspro.buff.JianShi;
import cn.emitor.chesspro.enums.HeroEnum;

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
