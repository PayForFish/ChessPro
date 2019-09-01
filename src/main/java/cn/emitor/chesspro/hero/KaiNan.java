package cn.emitor.chesspro.hero;

import cn.emitor.chesspro.Hero;
import cn.emitor.chesspro.buff.RenZhe;
import cn.emitor.chesspro.buff.YuanSuShi;
import cn.emitor.chesspro.buff.YueDeErRen;
import cn.emitor.chesspro.enums.HeroEnum;

public class KaiNan extends Hero {
    private RenZhe renZhe;
    private YueDeErRen yueDeErRen;
    private YuanSuShi yuanSuShi;


    public KaiNan() {
        super();
    }

    @Override
    public void setHeroBuff() {
        this.renZhe = new RenZhe();
        this.yuanSuShi = new YuanSuShi();
        this.yueDeErRen = new YueDeErRen();

        this.buffs.add(renZhe);
        this.buffs.add(yuanSuShi);
        this.buffs.add(yueDeErRen);
    }

    @Override
    public void setterHeroEnum() {
        this.heroEnum = HeroEnum.KAI_NAN;
    }
}
