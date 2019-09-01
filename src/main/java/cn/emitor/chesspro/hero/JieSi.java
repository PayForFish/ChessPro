package cn.emitor.chesspro.hero;

import cn.emitor.chesspro.Hero;
import cn.emitor.chesspro.buff.HaiKeSi;
import cn.emitor.chesspro.buff.HuanXinShi;
import cn.emitor.chesspro.enums.HeroEnum;

public class JieSi extends Hero {
    private HaiKeSi haiKeSi;
    private HuanXinShi huanXinShi;

    public JieSi() {
        super();
    }

    @Override
    public void setHeroBuff() {
        this.haiKeSi = new HaiKeSi();
        this.huanXinShi = new HuanXinShi();

        this.buffs.add(haiKeSi);
        this.buffs.add(huanXinShi);
    }

    @Override
    public void setterHeroEnum() {
        this.heroEnum = HeroEnum.JIE_SI;
    }
}
