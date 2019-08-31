package cn.emitor.cheesepro.hero;

import cn.emitor.cheesepro.Hero;
import cn.emitor.cheesepro.buff.JiDi;
import cn.emitor.cheesepro.buff.YuanSuShi;
import cn.emitor.cheesepro.enums.HeroEnum;

/**
 * @author Emitor
 * on 2019/8/31.
 */
public class FengHuang extends Hero {
    private JiDi jiDi;
    private YuanSuShi yuanSuShi;

    public FengHuang() {
        super();
    }

    @Override
    public void setHeroBuff() {
        this.jiDi = new JiDi();
        this.yuanSuShi = new YuanSuShi();

        this.buffs.add(jiDi);
        this.buffs.add(yuanSuShi);
    }

    @Override
    public void setterHeroEnum() {
        this.heroEnum = HeroEnum.FENG_HUANG;
    }
}
