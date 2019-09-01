package cn.emitor.chesspro.hero;

import cn.emitor.chesspro.Hero;
import cn.emitor.chesspro.buff.HaiDao;
import cn.emitor.chesspro.buff.QiangShou;
import cn.emitor.chesspro.enums.HeroEnum;

public class NvQiang extends Hero {
    private QiangShou qiangShou;
    private HaiDao haiDao;

    public NvQiang() {
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
        this.heroEnum = HeroEnum.NV_QIANG;
    }
}
