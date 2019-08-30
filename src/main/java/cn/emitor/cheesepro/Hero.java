package cn.emitor.cheesepro;

import java.util.Set;

public abstract class Hero implements HeroBuffSetter {
    protected Set<Buff> buffs;

    protected Hero(){
        setHeroBuff();
    }

    public Set<Buff> getBuffs() {
        return buffs;
    }
}
