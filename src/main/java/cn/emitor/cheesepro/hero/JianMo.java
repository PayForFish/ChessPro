package cn.emitor.cheesepro.hero;

import cn.emitor.cheesepro.Hero;
import cn.emitor.cheesepro.buff.Devil;
import cn.emitor.cheesepro.buff.Knife;

import java.util.HashSet;

public class JianMo extends Hero {
    public JianMo() {
        super();
    }


    @Override
    public void setHeroBuff() {
        this.buffs = new HashSet<>();
        Devil devil = new Devil() {
        };
        buffs.add(devil);
        Knife knife = new Knife() {
        };
        buffs.add(knife);
    }
}
