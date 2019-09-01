package cn.emitor.chesspro;

import cn.emitor.chesspro.enums.HeroEnum;

import java.util.HashSet;
import java.util.Set;

public abstract class Hero implements HeroBuffSetter, HeroEnumSetter {
    protected HeroEnum heroEnum;
    protected Set<Buff> buffs;

    protected Hero() {
        this.buffs = new HashSet<>();
        setHeroBuff();
        setterHeroEnum();
    }

    public HeroEnum getHeroEnum() {
        return this.heroEnum;
    }

    public Set<Buff> getBuffs() {
        return buffs;
    }

}
