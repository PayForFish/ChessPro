package cn.emitor.chesspro.hero;

import cn.emitor.chesspro.Hero;
import cn.emitor.chesspro.buff.DouShi;
import cn.emitor.chesspro.buff.JiQi;
import cn.emitor.chesspro.enums.HeroEnum;

/**
 * @author Emitor
 * on 2019/8/31.
 */
public class JiQiRen extends Hero {
    private DouShi douShi;
    private JiQi jiQi;

    public JiQiRen() {
        super();
    }

    @Override
    public void setHeroBuff() {
        this.douShi = new DouShi();
        this.jiQi = new JiQi();

        this.buffs.add(douShi);
        this.buffs.add(jiQi);
    }

    @Override
    public void setterHeroEnum() {
        this.heroEnum = HeroEnum.JI_QI_REN;
    }
}
