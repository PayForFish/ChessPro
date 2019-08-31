package cn.emitor.cheesepro.hero;

import cn.emitor.cheesepro.Hero;
import cn.emitor.cheesepro.buff.HaiKeSi;
import cn.emitor.cheesepro.buff.HuanXinShi;
import cn.emitor.cheesepro.enums.HeroEnum;

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
