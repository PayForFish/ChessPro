package cn.emitor.cheesepro.hero;

import cn.emitor.cheesepro.Hero;
import cn.emitor.cheesepro.buff.JiDi;
import cn.emitor.cheesepro.buff.YouXia;
import cn.emitor.cheesepro.enums.HeroEnum;

/**
 * @author Emitor
 * on 2019/8/31.
 */
public class HanBing extends Hero {
    private JiDi jiDi;
    private YouXia youXia;

    public HanBing() {
        super();
    }

    @Override
    public void setHeroBuff() {
        this.jiDi = new JiDi();
        this.youXia = new YouXia();

        this.buffs.add(jiDi);
        this.buffs.add(youXia);
    }

    @Override
    public void setterHeroEnum() {
        this.heroEnum = HeroEnum.HAN_BING;
    }
}
