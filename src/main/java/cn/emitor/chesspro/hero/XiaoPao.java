package cn.emitor.chesspro.hero;

import cn.emitor.chesspro.Hero;
import cn.emitor.chesspro.buff.QiangShou;
import cn.emitor.chesspro.buff.YueDeErRen;
import cn.emitor.chesspro.enums.HeroEnum;

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
