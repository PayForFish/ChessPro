package cn.emitor.chesspro.hero;

import cn.emitor.chesspro.Hero;
import cn.emitor.chesspro.buff.HaiDao;
import cn.emitor.chesspro.buff.JianShi;
import cn.emitor.chesspro.buff.QiangShou;
import cn.emitor.chesspro.enums.HeroEnum;

/**
 * @author Emitor
 * on 2019/8/31.
 */
public class ChuanZhang extends Hero {
    private QiangShou qiangShou;
    private HaiDao haiDao;
    private JianShi jianShi;

    public ChuanZhang() {
        super();
    }

    @Override
    public void setHeroBuff() {
        this.haiDao = new HaiDao();
        this.jianShi = new JianShi();
        this.qiangShou = new QiangShou();

        this.buffs.add(qiangShou);
        this.buffs.add(jianShi);
        this.buffs.add(haiDao);
    }

    @Override
    public void setterHeroEnum() {
        this.heroEnum = HeroEnum.CHUAN_ZHANG;
    }
}
