package cn.emitor.cheesepro;

import cn.emitor.cheesepro.enums.HeroEnum;

import java.util.Set;

public abstract class Hero implements HeroBuffSetter, HeroEnumSetter {
    protected HeroEnum heroEnum;
    protected Set<Buff> buffs;

    protected Hero() {
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
