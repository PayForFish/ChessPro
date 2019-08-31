package cn.emitor.cheesepro.hero;

import cn.emitor.cheesepro.Hero;
import cn.emitor.cheesepro.buff.JianShi;
import cn.emitor.cheesepro.buff.LangRen;
import cn.emitor.cheesepro.enums.HeroEnum;

public class YaSuo extends Hero {
    private LangRen langRen;
    private JianShi jianShi;

    public YaSuo() {
        super();
    }

    @Override
    public void setHeroBuff() {
        this.jianShi = new JianShi();
        this.langRen = new LangRen();

        this.buffs.add(langRen);
        this.buffs.add(jianShi);
    }

    @Override
    public void setterHeroEnum() {
        this.heroEnum = HeroEnum.YA_SUO;
    }
}
