package cn.emitor.cheesepro.hero;

import cn.emitor.cheesepro.Hero;
import cn.emitor.cheesepro.buff.RenZhe;
import cn.emitor.cheesepro.buff.YuanSuShi;
import cn.emitor.cheesepro.buff.YueDeErRen;
import cn.emitor.cheesepro.enums.HeroEnum;

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
