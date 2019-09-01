package cn.emitor.chesspro.hero;

import cn.emitor.chesspro.Hero;
import cn.emitor.chesspro.buff.JianShi;
import cn.emitor.chesspro.buff.LangRen;
import cn.emitor.chesspro.enums.HeroEnum;

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
