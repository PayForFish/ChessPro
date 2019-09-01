package cn.emitor.chesspro.hero;

import cn.emitor.chesspro.Hero;
import cn.emitor.chesspro.buff.GuiZu;
import cn.emitor.chesspro.buff.JianShi;
import cn.emitor.chesspro.enums.HeroEnum;

/**
 * @author Emitor
 * on 2019/8/31.
 */
public class JianJi extends Hero {
    private JianShi jianShi;
    private GuiZu guiZu;


    public JianJi() {
        super();
    }

    @Override
    public void setHeroBuff() {
        this.jianShi = new JianShi();
        this.guiZu = new GuiZu();

        this.buffs.add(jianShi);
        this.buffs.add(guiZu);
    }

    @Override
    public void setterHeroEnum() {
        this.heroEnum = HeroEnum.JIAN_JI;
    }
}
