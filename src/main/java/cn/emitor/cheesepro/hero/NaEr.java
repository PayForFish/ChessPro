package cn.emitor.cheesepro.hero;

import cn.emitor.cheesepro.Hero;
import cn.emitor.cheesepro.buff.HuanXinShi;
import cn.emitor.cheesepro.buff.KuangYe;
import cn.emitor.cheesepro.buff.YueDeErRen;
import cn.emitor.cheesepro.enums.HeroEnum;

/**
 * @author Emitor
 * on 2019/8/31.
 */
public class NaEr extends Hero {
    private HuanXinShi huanXinShi;
    private KuangYe kuangYe;
    private YueDeErRen yueDeErRen;

    public NaEr() {
        super();
    }

    @Override
    public void setHeroBuff() {
        this.yueDeErRen = new YueDeErRen();
        this.huanXinShi = new HuanXinShi();
        this.kuangYe = new KuangYe();

        this.buffs.add(kuangYe);
        this.buffs.add(yueDeErRen);
        this.buffs.add(huanXinShi);
    }

    @Override
    public void setterHeroEnum() {
        this.heroEnum = HeroEnum.NA_ER;
    }
}
