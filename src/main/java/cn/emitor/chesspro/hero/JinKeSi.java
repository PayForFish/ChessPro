package cn.emitor.chesspro.hero;

import cn.emitor.chesspro.Hero;
import cn.emitor.chesspro.buff.HaiKeSi;
import cn.emitor.chesspro.buff.QiangShou;
import cn.emitor.chesspro.enums.HeroEnum;

public class JinKeSi extends Hero {
    private HaiKeSi haiKeSi;
    private QiangShou qiangShou;

    public JinKeSi() {
        super();
    }

    @Override
    public void setHeroBuff() {
        this.haiKeSi = new HaiKeSi();
        this.qiangShou = new QiangShou();

        this.buffs.add(haiKeSi);
        this.buffs.add(qiangShou);
    }

    @Override
    public void setterHeroEnum() {
        this.heroEnum = HeroEnum.JIN_KE_SI;
    }
}
