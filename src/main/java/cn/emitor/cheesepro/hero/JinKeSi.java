package cn.emitor.cheesepro.hero;

import cn.emitor.cheesepro.Hero;
import cn.emitor.cheesepro.buff.HaiKeSi;
import cn.emitor.cheesepro.buff.QiangShou;
import cn.emitor.cheesepro.enums.HeroEnum;

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
