package cn.emitor.chesspro.hero;

import cn.emitor.chesspro.Hero;
import cn.emitor.chesspro.buff.JiDi;
import cn.emitor.chesspro.buff.YouXia;
import cn.emitor.chesspro.enums.HeroEnum;

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
