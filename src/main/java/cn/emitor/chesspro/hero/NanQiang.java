package cn.emitor.chesspro.hero;

import cn.emitor.chesspro.Hero;
import cn.emitor.chesspro.buff.HaiDao;
import cn.emitor.chesspro.buff.QiangShou;
import cn.emitor.chesspro.enums.HeroEnum;

/**
 * @author Emitor
 * on 2019/8/31.
 */
public class NanQiang extends Hero {
    private QiangShou qiangShou;
    private HaiDao haiDao;

    public NanQiang() {
        super();
    }

    @Override
    public void setHeroBuff() {
        this.haiDao = new HaiDao();
        this.qiangShou = new QiangShou();

        this.buffs.add(qiangShou);
        this.buffs.add(haiDao);
    }

    @Override
    public void setterHeroEnum() {
        this.heroEnum = HeroEnum.NAN_QIANG;
    }
}
