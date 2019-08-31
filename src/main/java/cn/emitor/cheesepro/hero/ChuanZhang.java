package cn.emitor.cheesepro.hero;

import cn.emitor.cheesepro.Hero;
import cn.emitor.cheesepro.buff.HaiDao;
import cn.emitor.cheesepro.buff.JianShi;
import cn.emitor.cheesepro.buff.QiangShou;
import cn.emitor.cheesepro.enums.HeroEnum;

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
