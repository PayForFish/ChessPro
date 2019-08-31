package cn.emitor.cheesepro.hero;

import cn.emitor.cheesepro.Hero;
import cn.emitor.cheesepro.buff.QiangShou;
import cn.emitor.cheesepro.buff.YueDeErRen;
import cn.emitor.cheesepro.enums.HeroEnum;

public class XiaoPao extends Hero {
    private QiangShou qiangShou;
    private YueDeErRen yueDeErRen;

    public XiaoPao() {
        super();
    }

    @Override
    public void setHeroBuff() {
        this.qiangShou = new QiangShou();
        this.yueDeErRen = new YueDeErRen();

        this.buffs.add(qiangShou);
        this.buffs.add(yueDeErRen);
    }

    @Override
    public void setterHeroEnum() {
        this.heroEnum = HeroEnum.XIAO_PAO;
    }
}
