package cn.emitor.chesspro.hero;

import cn.emitor.chesspro.Hero;
import cn.emitor.chesspro.buff.JiDi;
import cn.emitor.chesspro.buff.YuanSuShi;
import cn.emitor.chesspro.enums.HeroEnum;

public class BingNv extends Hero {
    private JiDi jiDi;
    private YuanSuShi yuanSuShi;

    public BingNv() {
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
        this.heroEnum = HeroEnum.BING_NV;
    }
}
