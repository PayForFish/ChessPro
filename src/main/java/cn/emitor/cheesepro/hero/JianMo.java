package cn.emitor.cheesepro.hero;

import cn.emitor.cheesepro.Hero;
import cn.emitor.cheesepro.buff.Devil;
import cn.emitor.cheesepro.buff.Knife;
import cn.emitor.cheesepro.buff.Shit;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashSet;

public class JianMo extends Hero {
    @Autowired
    private Shit shit;

    public JianMo() {
        super();
    }


    @Override
    public void setHeroBuff() {
        this.buffs = new HashSet<>();
        Devil devil = new Devil() {
        };
        buffs.add(devil);
        buffs.add(shit);
        Knife knife = new Knife() {
        };
        buffs.add(knife);
    }
}
