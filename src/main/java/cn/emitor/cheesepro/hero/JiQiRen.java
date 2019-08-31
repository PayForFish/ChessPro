package cn.emitor.cheesepro.hero;

import cn.emitor.cheesepro.Hero;
import cn.emitor.cheesepro.buff.DouShi;
import cn.emitor.cheesepro.buff.JiQi;
import cn.emitor.cheesepro.enums.HeroEnum;

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
